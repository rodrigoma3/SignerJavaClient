/*
 * Lacuna.Signer.Site API
 * <!--------------------------------------------------------------------------------------------------------------------->  <h2>Authentication</h2>  <p>  In order to call this APIs, you will need an <strong>API key</strong>. Set the API key in the header <span class=\"code\">X-Api-Key</span>: </p>  <pre>X-Api-Key: your-app|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</pre>  <!---------------------------------------------------------------------------------------------------------------------> <br />  <h2>HTTP Codes</h2>  <p>   The APIs will return the following HTTP codes:  </p>  <table>  <thead>   <tr>     <th>Code</th>     <th>Description</th>    </tr>  </thead>  <tbody>    <tr>     <td><strong class=\"model-title\">200 (OK)</strong></td>     <td>Request processed successfully. The response is different for each API, please refer to the operation's documentation</td>    </tr>    <tr>     <td><strong class=\"model-title\">400 (Bad Request)</strong></td>     <td>Syntax error. For instance, when a required field was not provided</td>    </tr>    <tr>     <td><strong class=\"model-title\">401 (Unauthorized)</strong></td>     <td>API key not provided or invalid</td>    </tr>    <tr>     <td><strong class=\"model-title\">403 (Forbidden)</strong></td>     <td>API key is valid, but the application has insufficient permissions to complete the requested operation</td>    </tr>    <tr>     <td><strong class=\"model-title\">422 (Unprocessable Entity)</strong></td>     <td>API error. The response is as defined in <a href=\"#model-Lacuna.Signer.Api.ErrorModel\">Lacuna.Signer.Api.ErrorModel</a></td>    </tr>   </tbody> </table>  <br />  <h3>Error Codes</h3>  <p>Some of the error codes returned in a 422 response are provided bellow*:</p>  <ul>  <li>CertificateNotFound</li>  <li>DocumentNotFound</li>  <li>FolderNotFound</li>  <li>CpfMismatch</li>  <li>CpfNotExpected</li>  <li>InvalidFlowAction</li>  <li>DocumentInvalidKey</li> </ul>  <p style=\"font-size: 0.9em\">  *The codes shown above are the main error codes. Nonetheless, this list is not comprehensive. New codes may be added anytime without previous warning. </p>  <!--------------------------------------------------------------------------------------------------------------------->  <br />  <h2>Webhooks</h2>  <p>   It is recomended to subscribe to Webhook events <strong>instead</strong> of polling APIs. To do so, enable webhooks and register an URL that will receive a POST request   whenever one of the events bellow occur.  </p> <p>   All requests have the format described in <a href=\"#model-Lacuna.Signer.Api.Webhooks.WebhookModel\">WebhookModel</a>.   The data field varies according to the webhook event type:  </p>   <table>   <thead>    <tr>     <th>Event type</th>     <th>Description</th>     <th>Payload</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">DocumentConcluded</strong></td>     <td>Triggered when the flow of a document is concluded.</td>     <td><a href=\"#model-Lacuna.Signer.Api.Webhooks.DocumentConcludedModel\">DocumentConcludedModel</a></td>    </tr>   </tbody>  </table>  <p>  To register your application URL and enable Webhooks, access the integrations section in your <a href=\"/private/organizations\" target=\"_blank\">organization's details page</a>. </p>
 *
 * OpenAPI spec version: 0.40.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.lacunasoftware.signer;


import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;


/**
 * Model used to set the position of a document mark before it&#x27;s associated flow action is completed.
 */
@Schema(description = "Model used to set the position of a document mark before it's associated flow action is completed.")
class LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel {
	/**
	 * Gets or Sets type
	 */
	@JsonAdapter(TypeEnum.Adapter.class)
	public enum TypeEnum {
		SIGNATUREVISUALREPRESENTATION("SignatureVisualRepresentation"),
		SIGNATUREINITIALS("SignatureInitials"),
		AUTHENTICATIONSTAMP("AuthenticationStamp");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}

		public static class Adapter extends TypeAdapter<TypeEnum> {
			@Override
			public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
				jsonWriter.value(enumeration.getValue());
			}

			@Override
			public TypeEnum read(final JsonReader jsonReader) throws IOException {
				String value = jsonReader.nextString();
				return TypeEnum.fromValue(String.valueOf(value));
			}
		}
	}

	@SerializedName("type")
	private TypeEnum type = null;

	@SerializedName("topLeftX")
	private Double topLeftX = null;

	@SerializedName("topLeftY")
	private Double topLeftY = null;

	@SerializedName("width")
	private Double width = null;

	@SerializedName("height")
	private Double height = null;

	@SerializedName("pageNumber")
	private Integer pageNumber = null;

	public LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel type(TypeEnum type) {
		this.type = type;
		return this;
	}


	/**
	 * Get type
	 *
	 * @return type
	 **/
	@Schema(description = "")
	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel topLeftX(Double topLeftX) {
		this.topLeftX = topLeftX;
		return this;
	}


	/**
	 * X position of the top left point of the mark (in PDF points).
	 *
	 * @return topLeftX
	 **/
	@Schema(description = "X position of the top left point of the mark (in PDF points).")
	public Double getTopLeftX() {
		return topLeftX;
	}

	public void setTopLeftX(Double topLeftX) {
		this.topLeftX = topLeftX;
	}

	public LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel topLeftY(Double topLeftY) {
		this.topLeftY = topLeftY;
		return this;
	}


	/**
	 * Y position of the top left point of the mark (in PDF points).
	 *
	 * @return topLeftY
	 **/
	@Schema(description = "Y position of the top left point of the mark (in PDF points).")
	public Double getTopLeftY() {
		return topLeftY;
	}

	public void setTopLeftY(Double topLeftY) {
		this.topLeftY = topLeftY;
	}

	public LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel width(Double width) {
		this.width = width;
		return this;
	}


	/**
	 * Width of the mark (in PDF points).
	 *
	 * @return width
	 **/
	@Schema(description = "Width of the mark (in PDF points).")
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel height(Double height) {
		this.height = height;
		return this;
	}


	/**
	 * Height of the mark (in PDF points).
	 *
	 * @return height
	 **/
	@Schema(description = "Height of the mark (in PDF points).")
	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel pageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		return this;
	}


	/**
	 * The page number of the mark.
	 *
	 * @return pageNumber
	 **/
	@Schema(description = "The page number of the mark.")
	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel lacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel = (LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel) o;
		return Objects.equals(this.type, lacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel.type) &&
			Objects.equals(this.topLeftX, lacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel.topLeftX) &&
			Objects.equals(this.topLeftY, lacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel.topLeftY) &&
			Objects.equals(this.width, lacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel.width) &&
			Objects.equals(this.height, lacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel.height) &&
			Objects.equals(this.pageNumber, lacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel.pageNumber);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(type, topLeftX, topLeftY, width, height, pageNumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LacunaSignerApiDocumentMarkPrePositionedDocumentMarkModel {\n");

		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    topLeftX: ").append(toIndentedString(topLeftX)).append("\n");
		sb.append("    topLeftY: ").append(toIndentedString(topLeftY)).append("\n");
		sb.append("    width: ").append(toIndentedString(width)).append("\n");
		sb.append("    height: ").append(toIndentedString(height)).append("\n");
		sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}

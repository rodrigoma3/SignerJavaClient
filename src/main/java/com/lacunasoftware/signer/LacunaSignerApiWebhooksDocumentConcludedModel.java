/*
 * Lacuna.Signer.Site API
 * <!--------------------------------------------------------------------------------------------------------------------->    <h2>Authentication</h2>    <p>   In order to call this APIs, you will need an <strong>API key</strong>. Set the API key in the header <span class=\"code\">X-Api-Key</span>:  </p>    <pre>X-Api-Key: your-app|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</pre>    <!--------------------------------------------------------------------------------------------------------------------->  <br />    <h2>HTTP Codes</h2>    <p>   The APIs will return the following HTTP codes:  </p>    <table>   <thead>    <tr>     <th>Code</th>     <th>Description</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">200 (OK)</strong></td>     <td>Request processed successfully. The response is different for each API, please refer to the operation's documentation</td>    </tr>    <tr>     <td><strong class=\"model-title\">400 (Bad Request)</strong></td>     <td>Syntax error. For instance, when a required field was not provided</td>    </tr>    <tr>     <td><strong class=\"model-title\">401 (Unauthorized)</strong></td>     <td>API key not provided or invalid</td>    </tr>    <tr>     <td><strong class=\"model-title\">403 (Forbidden)</strong></td>     <td>API key is valid, but the application has insufficient permissions to complete the requested operation</td>    </tr>    <tr>     <td><strong class=\"model-title\">422 (Unprocessable Entity)</strong></td>     <td>API error. The response is as defined in <a href=\"#model-Lacuna.Signer.Api.ErrorModel\">Lacuna.Signer.Api.ErrorModel</a></td>    </tr>   </tbody>  </table>    <br />    <h3>Error Codes</h3>    <p>Some of the error codes returned in a 422 response are provided bellow*:</p>    <ul>   <li>CertificateNotFound</li>   <li>DocumentNotFound</li>   <li>FolderNotFound</li>   <li>CpfMismatch</li>   <li>CpfNotExpected</li>   <li>InvalidFlowAction</li>   <li>DocumentInvalidKey</li>  </ul>    <p style=\"font-size: 0.9em\">   *The codes shown above are the main error codes. Nonetheless, this list is not comprehensive. New codes may be added anytime without previous warning.  </p>    <!--------------------------------------------------------------------------------------------------------------------->    <br />    <h2>Webhooks</h2>    <p>   It is recomended to subscribe to Webhook events <strong>instead</strong> of polling APIs. To do so, enable webhooks and register an URL that will receive a POST request   whenever one of the events bellow occur.  </p>  <p>   All requests have the format described in <a href=\"#model-Lacuna.Signer.Api.Webhooks.WebhookModel\">WebhookModel</a>.   The data field varies according to the webhook event type:  </p>      <table>   <thead>    <tr>     <th>Event type</th>     <th>Description</th>     <th>Payload</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">DocumentConcluded</strong></td>     <td>Triggered when the flow of a document is concluded.</td>     <td><a href=\"#model-Lacuna.Signer.Api.Webhooks.DocumentConcludedModel\">DocumentConcludedModel</a></td>    </tr>   </tbody>  </table>    <p>   To register your application URL and enable Webhooks, access the integrations section in your <a href=\"/private/organizations\" target=\"_blank\">organization's details page</a>.  </p>
 *
 * OpenAPI spec version: 0.44.0
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
import com.lacunasoftware.signer.LacunaSignerApiDocumentsCreatorModel;
import com.lacunasoftware.signer.LacunaSignerApiFoldersFolderInfoModel;
import com.lacunasoftware.signer.LacunaSignerApiOrganizationsOrganizationInfoModel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.UUID;



/**
 * LacunaSignerApiWebhooksDocumentConcludedModel
 */

class LacunaSignerApiWebhooksDocumentConcludedModel {

	@SerializedName("id")
	private UUID id = null;

	@SerializedName("name")
	private String name = null;

	@SerializedName("creationDate")
	private Date creationDate = null;

	@SerializedName("updateDate")
	private Date updateDate = null;

	@SerializedName("folder")
	private LacunaSignerApiFoldersFolderInfoModel folder = null;

	@SerializedName("organization")
	private LacunaSignerApiOrganizationsOrganizationInfoModel organization = null;

	@SerializedName("createdBy")
	private LacunaSignerApiDocumentsCreatorModel createdBy = null;

	public LacunaSignerApiWebhooksDocumentConcludedModel id(UUID id) {
		this.id = id;
		return this;
	}


	/**
	 * The document&#x27;s id
	 *
	 * @return id
	 **/
	@Schema(description = "The document's id")
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LacunaSignerApiWebhooksDocumentConcludedModel name(String name) {
		this.name = name;
		return this;
	}


	/**
	 * The document&#x27;s name
	 *
	 * @return name
	 **/
	@Schema(description = "The document's name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LacunaSignerApiWebhooksDocumentConcludedModel creationDate(Date creationDate) {
		this.creationDate = creationDate;
		return this;
	}


	/**
	 * The date the document was created.
	 *
	 * @return creationDate
	 **/
	@Schema(description = "The date the document was created.")
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public LacunaSignerApiWebhooksDocumentConcludedModel updateDate(Date updateDate) {
		this.updateDate = updateDate;
		return this;
	}


	/**
	 * The date of the last update to the document.
	 *
	 * @return updateDate
	 **/
	@Schema(description = "The date of the last update to the document.")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public LacunaSignerApiWebhooksDocumentConcludedModel folder(LacunaSignerApiFoldersFolderInfoModel folder) {
		this.folder = folder;
		return this;
	}


	/**
	 * Get folder
	 *
	 * @return folder
	 **/
	@Schema(description = "")
	public LacunaSignerApiFoldersFolderInfoModel getFolder() {
		return folder;
	}

	public void setFolder(LacunaSignerApiFoldersFolderInfoModel folder) {
		this.folder = folder;
	}

	public LacunaSignerApiWebhooksDocumentConcludedModel organization(LacunaSignerApiOrganizationsOrganizationInfoModel organization) {
		this.organization = organization;
		return this;
	}


	/**
	 * Get organization
	 *
	 * @return organization
	 **/
	@Schema(description = "")
	public LacunaSignerApiOrganizationsOrganizationInfoModel getOrganization() {
		return organization;
	}

	public void setOrganization(LacunaSignerApiOrganizationsOrganizationInfoModel organization) {
		this.organization = organization;
	}

	public LacunaSignerApiWebhooksDocumentConcludedModel createdBy(LacunaSignerApiDocumentsCreatorModel createdBy) {
		this.createdBy = createdBy;
		return this;
	}


	/**
	 * Get createdBy
	 *
	 * @return createdBy
	 **/
	@Schema(description = "")
	public LacunaSignerApiDocumentsCreatorModel getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(LacunaSignerApiDocumentsCreatorModel createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LacunaSignerApiWebhooksDocumentConcludedModel lacunaSignerApiWebhooksDocumentConcludedModel = (LacunaSignerApiWebhooksDocumentConcludedModel) o;
		return Objects.equals(this.id, lacunaSignerApiWebhooksDocumentConcludedModel.id) &&
			Objects.equals(this.name, lacunaSignerApiWebhooksDocumentConcludedModel.name) &&
			Objects.equals(this.creationDate, lacunaSignerApiWebhooksDocumentConcludedModel.creationDate) &&
			Objects.equals(this.updateDate, lacunaSignerApiWebhooksDocumentConcludedModel.updateDate) &&
			Objects.equals(this.folder, lacunaSignerApiWebhooksDocumentConcludedModel.folder) &&
			Objects.equals(this.organization, lacunaSignerApiWebhooksDocumentConcludedModel.organization) &&
			Objects.equals(this.createdBy, lacunaSignerApiWebhooksDocumentConcludedModel.createdBy);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(id, name, creationDate, updateDate, folder, organization, createdBy);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LacunaSignerApiWebhooksDocumentConcludedModel {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
		sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
		sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
		sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
		sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

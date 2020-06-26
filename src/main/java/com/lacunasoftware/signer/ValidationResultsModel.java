/*
 * Dropsigner (HML)
 * <!--------------------------------------------------------------------------------------------------------------------->    <h2>Authentication</h2>    <p>   In order to call this APIs, you will need an <strong>API key</strong>. Set the API key in the header <span class=\"code\">X-Api-Key</span>:  </p>    <pre>X-Api-Key: your-app|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</pre>    <!--------------------------------------------------------------------------------------------------------------------->  <br />    <h2>HTTP Codes</h2>    <p>   The APIs will return the following HTTP codes:  </p>    <table>   <thead>    <tr>     <th>Code</th>     <th>Description</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">200 (OK)</strong></td>     <td>Request processed successfully. The response is different for each API, please refer to the operation's documentation</td>    </tr>    <tr>     <td><strong class=\"model-title\">400 (Bad Request)</strong></td>     <td>Syntax error. For instance, when a required field was not provided</td>    </tr>    <tr>     <td><strong class=\"model-title\">401 (Unauthorized)</strong></td>     <td>API key not provided or invalid</td>    </tr>    <tr>     <td><strong class=\"model-title\">403 (Forbidden)</strong></td>     <td>API key is valid, but the application has insufficient permissions to complete the requested operation</td>    </tr>    <tr>     <td><strong class=\"model-title\">422 (Unprocessable Entity)</strong></td>     <td>API error. The response is as defined in <a href=\"#model-ErrorModel\">ErrorModel</a></td>    </tr>   </tbody>  </table>    <br />    <h3>Error Codes</h3>    <p>Some of the error codes returned in a 422 response are provided bellow*:</p>    <ul>   <li>CertificateNotFound</li>   <li>DocumentNotFound</li>   <li>FolderNotFound</li>   <li>CpfMismatch</li>   <li>CpfNotExpected</li>   <li>InvalidFlowAction</li>   <li>DocumentInvalidKey</li>  </ul>    <p style=\"font-size: 0.9em\">   *The codes shown above are the main error codes. Nonetheless, this list is not comprehensive. New codes may be added anytime without previous warning.  </p>    <!--------------------------------------------------------------------------------------------------------------------->    <br />    <h2>Webhooks</h2>    <p>   It is recomended to subscribe to Webhook events <strong>instead</strong> of polling APIs. To do so, enable webhooks and register an URL that will receive a POST request   whenever one of the events bellow occur.  </p>  <p>   All requests have the format described in <a href=\"#model-WebhookModel\">WebhookModel</a>.   The data field varies according to the webhook event type:  </p>      <table>   <thead>    <tr>     <th>Event type</th>     <th>Description</th>     <th>Payload</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">DocumentConcluded</strong></td>     <td>Triggered when the flow of a document is concluded.</td>     <td><a href=\"#model-DocumentConcludedModel\">DocumentConcludedModel</a></td>    </tr>   </tbody>  </table>    <p>   To register your application URL and enable Webhooks, access the integrations section in your <a href=\"/private/organizations\" target=\"_blank\">organization's details page</a>.  </p>  
 *
 * OpenAPI spec version: 1.6.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ValidationItemModel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ValidationResultsModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-06-26T20:34:53.137Z[GMT]")
public class ValidationResultsModel {
  @SerializedName("passedChecks")
  private List<ValidationItemModel> passedChecks = null;

  @SerializedName("errors")
  private List<ValidationItemModel> errors = null;

  @SerializedName("warnings")
  private List<ValidationItemModel> warnings = null;

  @SerializedName("isValid")
  private Boolean isValid = null;

  public ValidationResultsModel passedChecks(List<ValidationItemModel> passedChecks) {
    this.passedChecks = passedChecks;
    return this;
  }

  public ValidationResultsModel addPassedChecksItem(ValidationItemModel passedChecksItem) {
    if (this.passedChecks == null) {
      this.passedChecks = new ArrayList<ValidationItemModel>();
    }
    this.passedChecks.add(passedChecksItem);
    return this;
  }

   /**
   * Get passedChecks
   * @return passedChecks
  **/
  @Schema(description = "")
  public List<ValidationItemModel> getPassedChecks() {
    return passedChecks;
  }

  public void setPassedChecks(List<ValidationItemModel> passedChecks) {
    this.passedChecks = passedChecks;
  }

  public ValidationResultsModel errors(List<ValidationItemModel> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationResultsModel addErrorsItem(ValidationItemModel errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ValidationItemModel>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(description = "")
  public List<ValidationItemModel> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationItemModel> errors) {
    this.errors = errors;
  }

  public ValidationResultsModel warnings(List<ValidationItemModel> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ValidationResultsModel addWarningsItem(ValidationItemModel warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<ValidationItemModel>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @Schema(description = "")
  public List<ValidationItemModel> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ValidationItemModel> warnings) {
    this.warnings = warnings;
  }

   /**
   * Get isValid
   * @return isValid
  **/
  @Schema(description = "")
  public Boolean isIsValid() {
    return isValid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResultsModel validationResultsModel = (ValidationResultsModel) o;
    return Objects.equals(this.passedChecks, validationResultsModel.passedChecks) &&
        Objects.equals(this.errors, validationResultsModel.errors) &&
        Objects.equals(this.warnings, validationResultsModel.warnings) &&
        Objects.equals(this.isValid, validationResultsModel.isValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passedChecks, errors, warnings, isValid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResultsModel {\n");
    
    sb.append("    passedChecks: ").append(toIndentedString(passedChecks)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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

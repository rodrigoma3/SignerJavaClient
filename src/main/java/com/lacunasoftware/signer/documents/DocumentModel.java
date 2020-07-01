/*
 * Dropsigner (HML)
 * <!--------------------------------------------------------------------------------------------------------------------->    <h2>Authentication</h2>    <p>   In order to call this APIs, you will need an <strong>API key</strong>. Set the API key in the header <span class=\"code\">X-Api-Key</span>:  </p>    <pre>X-Api-Key: your-app|xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</pre>    <!--------------------------------------------------------------------------------------------------------------------->  <br />    <h2>HTTP Codes</h2>    <p>   The APIs will return the following HTTP codes:  </p>    <table>   <thead>    <tr>     <th>Code</th>     <th>Description</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">200 (OK)</strong></td>     <td>Request processed successfully. The response is different for each API, please refer to the operation's documentation</td>    </tr>    <tr>     <td><strong class=\"model-title\">400 (Bad Request)</strong></td>     <td>Syntax error. For instance, when a required field was not provided</td>    </tr>    <tr>     <td><strong class=\"model-title\">401 (Unauthorized)</strong></td>     <td>API key not provided or invalid</td>    </tr>    <tr>     <td><strong class=\"model-title\">403 (Forbidden)</strong></td>     <td>API key is valid, but the application has insufficient permissions to complete the requested operation</td>    </tr>    <tr>     <td><strong class=\"model-title\">422 (Unprocessable Entity)</strong></td>     <td>API error. The response is as defined in <a href=\"#model-ErrorModel\">ErrorModel</a></td>    </tr>   </tbody>  </table>    <br />    <h3>Error Codes</h3>    <p>Some of the error codes returned in a 422 response are provided bellow*:</p>    <ul>   <li>CertificateNotFound</li>   <li>DocumentNotFound</li>   <li>FolderNotFound</li>   <li>CpfMismatch</li>   <li>CpfNotExpected</li>   <li>InvalidFlowAction</li>   <li>DocumentInvalidKey</li>  </ul>    <p style=\"font-size: 0.9em\">   *The codes shown above are the main error codes. Nonetheless, this list is not comprehensive. New codes may be added anytime without previous warning.  </p>    <!--------------------------------------------------------------------------------------------------------------------->    <br />    <h2>Webhooks</h2>    <p>   It is recomended to subscribe to Webhook events <strong>instead</strong> of polling APIs. To do so, enable webhooks and register an URL that will receive a POST request   whenever one of the events bellow occur.  </p>  <p>   All requests have the format described in <a href=\"#model-Webhooks.WebhookModel\">Webhooks.WebhookModel</a>.   The data field varies according to the webhook event type:  </p>      <table>   <thead>    <tr>     <th>Event type</th>     <th>Description</th>     <th>Payload</th>    </tr>   </thead>   <tbody>    <tr>     <td><strong class=\"model-title\">DocumentConcluded</strong></td>     <td>Triggered when the flow of a document is concluded.</td>     <td><a href=\"#model-Webhooks.DocumentConcludedModel\">Webhooks.DocumentConcludedModel</a></td>    </tr>   </tbody>  </table>    <p>   To register your application URL and enable Webhooks, access the integrations section in your <a href=\"/private/organizations\" target=\"_blank\">organization's details page</a>.  </p>  
 *
 * OpenAPI spec version: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.lacunasoftware.signer.documents;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lacunasoftware.signer.documents.CreatorModel;
import com.lacunasoftware.signer.documents.DocumentPermissionsModel;
import com.lacunasoftware.signer.flowactions.FlowActionModel;
import com.lacunasoftware.signer.folders.FolderInfoModel;
import com.lacunasoftware.signer.observers.ObserverModel;
import com.lacunasoftware.signer.organizations.OrganizationInfoModel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.time.OffsetDateTime;
/**
 * DocumentModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-07-01T17:50:57.027-03:00[America/Sao_Paulo]")
public class DocumentModel {
  @SerializedName("checksumMd5")
  private String checksumMd5 = null;

  @SerializedName("isDeleted")
  private Boolean isDeleted = null;

  @SerializedName("flowActions")
  private List<FlowActionModel> flowActions = null;

  @SerializedName("observers")
  private List<ObserverModel> observers = null;

  @SerializedName("permissions")
  private DocumentPermissionsModel permissions = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("fileSize")
  private Long fileSize = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("hasSignature")
  private Boolean hasSignature = null;

  @SerializedName("isConcluded")
  private Boolean isConcluded = null;

  @SerializedName("folder")
  private FolderInfoModel folder = null;

  @SerializedName("organization")
  private OrganizationInfoModel organization = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("updateDate")
  private OffsetDateTime updateDate = null;

  @SerializedName("createdBy")
  private CreatorModel createdBy = null;

  @SerializedName("forceCadesSignature")
  private Boolean forceCadesSignature = null;

  @SerializedName("isScanned")
  private Boolean isScanned = null;

  public DocumentModel checksumMd5(String checksumMd5) {
    this.checksumMd5 = checksumMd5;
    return this;
  }

   /**
   * MD5 checksum of the document&#x27;s file.
   * @return checksumMd5
  **/
  @Schema(description = "MD5 checksum of the document's file.")
  public String getChecksumMd5() {
    return checksumMd5;
  }

  public void setChecksumMd5(String checksumMd5) {
    this.checksumMd5 = checksumMd5;
  }

  public DocumentModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * True if the document is deleted.
   * @return isDeleted
  **/
  @Schema(description = "True if the document is deleted.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public DocumentModel flowActions(List<FlowActionModel> flowActions) {
    this.flowActions = flowActions;
    return this;
  }

  public DocumentModel addFlowActionsItem(FlowActionModel flowActionsItem) {
    if (this.flowActions == null) {
      this.flowActions = new ArrayList<FlowActionModel>();
    }
    this.flowActions.add(flowActionsItem);
    return this;
  }

   /**
   * Signers and approvers of the document.
   * @return flowActions
  **/
  @Schema(description = "Signers and approvers of the document.")
  public List<FlowActionModel> getFlowActions() {
    return flowActions;
  }

  public void setFlowActions(List<FlowActionModel> flowActions) {
    this.flowActions = flowActions;
  }

  public DocumentModel observers(List<ObserverModel> observers) {
    this.observers = observers;
    return this;
  }

  public DocumentModel addObserversItem(ObserverModel observersItem) {
    if (this.observers == null) {
      this.observers = new ArrayList<ObserverModel>();
    }
    this.observers.add(observersItem);
    return this;
  }

   /**
   * Observers of the document.
   * @return observers
  **/
  @Schema(description = "Observers of the document.")
  public List<ObserverModel> getObservers() {
    return observers;
  }

  public void setObservers(List<ObserverModel> observers) {
    this.observers = observers;
  }

  public DocumentModel permissions(DocumentPermissionsModel permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public DocumentPermissionsModel getPermissions() {
    return permissions;
  }

  public void setPermissions(DocumentPermissionsModel permissions) {
    this.permissions = permissions;
  }

  public DocumentModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DocumentModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentModel filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The document&#x27;s file name.
   * @return filename
  **/
  @Schema(description = "The document's file name.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public DocumentModel fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The document&#x27;s file size in bytes.
   * @return fileSize
  **/
  @Schema(description = "The document's file size in bytes.")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public DocumentModel mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The document&#x27;s file mime type.
   * @return mimeType
  **/
  @Schema(description = "The document's file mime type.")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public DocumentModel hasSignature(Boolean hasSignature) {
    this.hasSignature = hasSignature;
    return this;
  }

   /**
   * True if the document was already signed once.
   * @return hasSignature
  **/
  @Schema(description = "True if the document was already signed once.")
  public Boolean isHasSignature() {
    return hasSignature;
  }

  public void setHasSignature(Boolean hasSignature) {
    this.hasSignature = hasSignature;
  }

  public DocumentModel isConcluded(Boolean isConcluded) {
    this.isConcluded = isConcluded;
    return this;
  }

   /**
   * True if all actions requested in the document are concluded.
   * @return isConcluded
  **/
  @Schema(description = "True if all actions requested in the document are concluded.")
  public Boolean isIsConcluded() {
    return isConcluded;
  }

  public void setIsConcluded(Boolean isConcluded) {
    this.isConcluded = isConcluded;
  }

  public DocumentModel folder(FolderInfoModel folder) {
    this.folder = folder;
    return this;
  }

   /**
   * Get folder
   * @return folder
  **/
  @Schema(description = "")
  public FolderInfoModel getFolder() {
    return folder;
  }

  public void setFolder(FolderInfoModel folder) {
    this.folder = folder;
  }

  public DocumentModel organization(OrganizationInfoModel organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @Schema(description = "")
  public OrganizationInfoModel getOrganization() {
    return organization;
  }

  public void setOrganization(OrganizationInfoModel organization) {
    this.organization = organization;
  }

  public DocumentModel creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date the document was created.
   * @return creationDate
  **/
  @Schema(description = "The date the document was created.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public DocumentModel updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

   /**
   * The date of the last update to the document. This includes the following actions: moving to folder, signing, approving, deleting and editing the flow.
   * @return updateDate
  **/
  @Schema(description = "The date of the last update to the document. This includes the following actions: moving to folder, signing, approving, deleting and editing the flow.")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public DocumentModel createdBy(CreatorModel createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public CreatorModel getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(CreatorModel createdBy) {
    this.createdBy = createdBy;
  }

  public DocumentModel forceCadesSignature(Boolean forceCadesSignature) {
    this.forceCadesSignature = forceCadesSignature;
    return this;
  }

   /**
   * Get forceCadesSignature
   * @return forceCadesSignature
  **/
  @Schema(description = "")
  public Boolean isForceCadesSignature() {
    return forceCadesSignature;
  }

  public void setForceCadesSignature(Boolean forceCadesSignature) {
    this.forceCadesSignature = forceCadesSignature;
  }

  public DocumentModel isScanned(Boolean isScanned) {
    this.isScanned = isScanned;
    return this;
  }

   /**
   * True if the document source was a scanning process.
   * @return isScanned
  **/
  @Schema(description = "True if the document source was a scanning process.")
  public Boolean isIsScanned() {
    return isScanned;
  }

  public void setIsScanned(Boolean isScanned) {
    this.isScanned = isScanned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentModel documentsDocumentModel = (DocumentModel) o;
    return Objects.equals(this.checksumMd5, documentsDocumentModel.checksumMd5) &&
        Objects.equals(this.isDeleted, documentsDocumentModel.isDeleted) &&
        Objects.equals(this.flowActions, documentsDocumentModel.flowActions) &&
        Objects.equals(this.observers, documentsDocumentModel.observers) &&
        Objects.equals(this.permissions, documentsDocumentModel.permissions) &&
        Objects.equals(this.id, documentsDocumentModel.id) &&
        Objects.equals(this.name, documentsDocumentModel.name) &&
        Objects.equals(this.filename, documentsDocumentModel.filename) &&
        Objects.equals(this.fileSize, documentsDocumentModel.fileSize) &&
        Objects.equals(this.mimeType, documentsDocumentModel.mimeType) &&
        Objects.equals(this.hasSignature, documentsDocumentModel.hasSignature) &&
        Objects.equals(this.isConcluded, documentsDocumentModel.isConcluded) &&
        Objects.equals(this.folder, documentsDocumentModel.folder) &&
        Objects.equals(this.organization, documentsDocumentModel.organization) &&
        Objects.equals(this.creationDate, documentsDocumentModel.creationDate) &&
        Objects.equals(this.updateDate, documentsDocumentModel.updateDate) &&
        Objects.equals(this.createdBy, documentsDocumentModel.createdBy) &&
        Objects.equals(this.forceCadesSignature, documentsDocumentModel.forceCadesSignature) &&
        Objects.equals(this.isScanned, documentsDocumentModel.isScanned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksumMd5, isDeleted, flowActions, observers, permissions, id, name, filename, fileSize, mimeType, hasSignature, isConcluded, folder, organization, creationDate, updateDate, createdBy, forceCadesSignature, isScanned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentModel {\n");
    
    sb.append("    checksumMd5: ").append(toIndentedString(checksumMd5)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    flowActions: ").append(toIndentedString(flowActions)).append("\n");
    sb.append("    observers: ").append(toIndentedString(observers)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    hasSignature: ").append(toIndentedString(hasSignature)).append("\n");
    sb.append("    isConcluded: ").append(toIndentedString(isConcluded)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    forceCadesSignature: ").append(toIndentedString(forceCadesSignature)).append("\n");
    sb.append("    isScanned: ").append(toIndentedString(isScanned)).append("\n");
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

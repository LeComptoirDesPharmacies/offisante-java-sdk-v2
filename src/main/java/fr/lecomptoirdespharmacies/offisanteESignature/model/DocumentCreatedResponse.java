/*
 * OffiSanté ESignature API
 * OffiSanté Electronic Signature API Documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: backoffice@offisante.fr
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.lecomptoirdespharmacies.offisanteESignature.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Document created
 */
@JsonPropertyOrder({
  DocumentCreatedResponse.JSON_PROPERTY_ID,
  DocumentCreatedResponse.JSON_PROPERTY_DOCUMENT_URL,
  DocumentCreatedResponse.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class DocumentCreatedResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DOCUMENT_URL = "document_url";
  private String documentUrl;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public DocumentCreatedResponse() {
  }

  public DocumentCreatedResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Document ID
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public DocumentCreatedResponse documentUrl(String documentUrl) {
    
    this.documentUrl = documentUrl;
    return this;
  }

   /**
   * URL to sign the document
   * @return documentUrl
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentUrl() {
    return documentUrl;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }


  public DocumentCreatedResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentCreatedResponse documentCreatedResponse = (DocumentCreatedResponse) o;
    return Objects.equals(this.id, documentCreatedResponse.id) &&
        Objects.equals(this.documentUrl, documentCreatedResponse.documentUrl) &&
        Objects.equals(this.message, documentCreatedResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentUrl, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentCreatedResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

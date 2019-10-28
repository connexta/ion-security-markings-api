package com.connexta.security.markings.api.rest.models;

import java.util.Objects;
import com.connexta.security.markings.api.rest.models.ISM;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ISM security markings and reason for invalidation.
 */
@ApiModel(description = "ISM security markings and reason for invalidation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-10T09:16:03.838443600-07:00[America/Phoenix]")

public class InvalidISM   {
  @JsonProperty("ISM")
  private ISM ISM;

  @JsonProperty("reasonForInvalidation")
  private String reasonForInvalidation;

  public InvalidISM ISM(ISM ISM) {
    this.ISM = ISM;
    return this;
  }

  /**
   * Get ISM
   * @return ISM
  */
  @ApiModelProperty(value = "")

  @Valid

  public ISM getISM() {
    return ISM;
  }

  public void setISM(ISM ISM) {
    this.ISM = ISM;
  }

  public InvalidISM reasonForInvalidation(String reasonForInvalidation) {
    this.reasonForInvalidation = reasonForInvalidation;
    return this;
  }

  /**
   * High level explanation of why the provided markings were deemed invalid.
   * @return reasonForInvalidation
  */
  @ApiModelProperty(example = "Given classification is above the system high classification", value = "High level explanation of why the provided markings were deemed invalid.")


  public String getReasonForInvalidation() {
    return reasonForInvalidation;
  }

  public void setReasonForInvalidation(String reasonForInvalidation) {
    this.reasonForInvalidation = reasonForInvalidation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidISM invalidISM = (InvalidISM) o;
    return Objects.equals(this.ISM, invalidISM.ISM) &&
        Objects.equals(this.reasonForInvalidation, invalidISM.reasonForInvalidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ISM, reasonForInvalidation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidISM {\n");
    
    sb.append("    ISM: ").append(toIndentedString(ISM)).append("\n");
    sb.append("    reasonForInvalidation: ").append(toIndentedString(reasonForInvalidation)).append("\n");
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


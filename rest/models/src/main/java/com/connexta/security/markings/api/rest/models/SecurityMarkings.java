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
 * Security markings.
 */
@ApiModel(description = "Security markings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-10T09:16:03.838443600-07:00[America/Phoenix]")

public class SecurityMarkings   {
  @JsonProperty("ISM")
  private ISM ISM;

  public SecurityMarkings ISM(ISM ISM) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMarkings securityMarkings = (SecurityMarkings) o;
    return Objects.equals(this.ISM, securityMarkings.ISM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ISM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMarkings {\n");
    
    sb.append("    ISM: ").append(toIndentedString(ISM)).append("\n");
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


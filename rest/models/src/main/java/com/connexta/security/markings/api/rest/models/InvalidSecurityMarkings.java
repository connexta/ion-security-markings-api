package com.connexta.security.markings.api.rest.models;

import java.util.Objects;
import com.connexta.security.markings.api.rest.models.InvalidISM;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Security markings found to be invalid and reason for invalidation.
 */
@ApiModel(description = "Security markings found to be invalid and reason for invalidation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-10T09:16:03.838443600-07:00[America/Phoenix]")

public class InvalidSecurityMarkings   {
  @JsonProperty("invalidISM")
  private InvalidISM invalidISM;

  public InvalidSecurityMarkings invalidISM(InvalidISM invalidISM) {
    this.invalidISM = invalidISM;
    return this;
  }

  /**
   * Get invalidISM
   * @return invalidISM
  */
  @ApiModelProperty(value = "")

  @Valid

  public InvalidISM getInvalidISM() {
    return invalidISM;
  }

  public void setInvalidISM(InvalidISM invalidISM) {
    this.invalidISM = invalidISM;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvalidSecurityMarkings invalidSecurityMarkings = (InvalidSecurityMarkings) o;
    return Objects.equals(this.invalidISM, invalidSecurityMarkings.invalidISM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidISM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvalidSecurityMarkings {\n");
    
    sb.append("    invalidISM: ").append(toIndentedString(invalidISM)).append("\n");
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


package com.connexta.security.markings.api.rest.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ISM security markings.
 */
@ApiModel(description = "ISM security markings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-10T09:16:03.838443600-07:00[America/Phoenix]")

public class ISM   {
  @JsonProperty("atomicEnergyMarkings")
  private String atomicEnergyMarkings;

  @JsonProperty("classification")
  private String classification;

  @JsonProperty("classificationReason")
  private String classificationReason;

  @JsonProperty("classifiedBy")
  private String classifiedBy;

  @JsonProperty("compilationReason")
  private String compilationReason;

  @JsonProperty("compliesWith")
  private String compliesWith;

  @JsonProperty("createDate")
  private String createDate;

  @JsonProperty("declassDate")
  private String declassDate;

  @JsonProperty("declassEvent")
  private String declassEvent;

  @JsonProperty("declassException")
  private String declassException;

  @JsonProperty("derivativelyClassifiedBy")
  private String derivativelyClassifiedBy;

  @JsonProperty("derivedFrom")
  private String derivedFrom;

  @JsonProperty("DESVersion")
  private String deSVersion;

  @JsonProperty("displayOnlyTo")
  private String displayOnlyTo;

  @JsonProperty("disseminationControls")
  private String disseminationControls;

  @JsonProperty("excludeFromRollup")
  private Boolean excludeFromRollup;

  @JsonProperty("exemptFrom")
  private String exemptFrom;

  @JsonProperty("externalNotice")
  private Boolean externalNotice;

  @JsonProperty("FGIsourceOpen")
  private String fgIsourceOpen;

  @JsonProperty("FGIsourceProtected")
  private String fgIsourceProtected;

  @JsonProperty("hasApproximateMarkings")
  private Boolean hasApproximateMarkings;

  @JsonProperty("id")
  private String id;

  @JsonProperty("IDReference")
  private String idReference;

  @JsonProperty("ISMCATCESVersion")
  private String isMCATCESVersion;

  @JsonProperty("noAggregation")
  private Boolean noAggregation;

  @JsonProperty("nonICmarkings")
  private String nonICmarkings;

  @JsonProperty("nonUSControls")
  private String nonUSControls;

  @JsonProperty("noticeDate")
  private String noticeDate;

  @JsonProperty("noticeReason")
  private String noticeReason;

  @JsonProperty("noticeType")
  private String noticeType;

  @JsonProperty("ownerProducer")
  private String ownerProducer;

  @JsonProperty("joint")
  private Boolean joint;

  @JsonProperty("pocType")
  private String pocType;

  @JsonProperty("qualifier")
  private String qualifier;

  @JsonProperty("releasableTo")
  private String releasableTo;

  @JsonProperty("resourceElement")
  private Boolean resourceElement;

  @JsonProperty("SARIdentifier")
  private String saRIdentifier;

  @JsonProperty("SCIControls")
  private String scIControls;

  @JsonProperty("typeOfExemptedSource")
  private String typeOfExemptedSource;

  @JsonProperty("unregisteredNoticeType")
  private String unregisteredNoticeType;

  public ISM atomicEnergyMarkings(String atomicEnergyMarkings) {
    this.atomicEnergyMarkings = atomicEnergyMarkings;
    return this;
  }

  /**
   * Applicable atomic energy information markings for a document or portion 
   * @return atomicEnergyMarkings
  */
  @ApiModelProperty(example = "RD", value = "Applicable atomic energy information markings for a document or portion ")


  public String getAtomicEnergyMarkings() {
    return atomicEnergyMarkings;
  }

  public void setAtomicEnergyMarkings(String atomicEnergyMarkings) {
    this.atomicEnergyMarkings = atomicEnergyMarkings;
  }

  public ISM classification(String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * The highest level of classification applicable to the containing document or portion 
   * @return classification
  */
  @ApiModelProperty(example = "U", value = "The highest level of classification applicable to the containing document or portion ")


  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public ISM classificationReason(String classificationReason) {
    this.classificationReason = classificationReason;
    return this;
  }

  /**
   * One or more reason indicators or explanatory text describing the basis for an original classification decision 
   * @return classificationReason
  */
  @ApiModelProperty(example = "Sensitive information crucial for victory", value = "One or more reason indicators or explanatory text describing the basis for an original classification decision ")


  public String getClassificationReason() {
    return classificationReason;
  }

  public void setClassificationReason(String classificationReason) {
    this.classificationReason = classificationReason;
  }

  public ISM classifiedBy(String classifiedBy) {
    this.classifiedBy = classifiedBy;
    return this;
  }

  /**
   * The identity, by name or personal identifier and position title, of the original classification authority for a document 
   * @return classifiedBy
  */
  @ApiModelProperty(example = "Colonel Sanders", value = "The identity, by name or personal identifier and position title, of the original classification authority for a document ")


  public String getClassifiedBy() {
    return classifiedBy;
  }

  public void setClassifiedBy(String classifiedBy) {
    this.classifiedBy = classifiedBy;
  }

  public ISM compilationReason(String compilationReason) {
    this.compilationReason = compilationReason;
    return this;
  }

  /**
   * The reason that the classification of the document is more restrictive than the simple roll-up of the marked portions of the document 
   * @return compilationReason
  */
  @ApiModelProperty(example = "TODO", value = "The reason that the classification of the document is more restrictive than the simple roll-up of the marked portions of the document ")


  public String getCompilationReason() {
    return compilationReason;
  }

  public void setCompilationReason(String compilationReason) {
    this.compilationReason = compilationReason;
  }

  public ISM compliesWith(String compliesWith) {
    this.compliesWith = compliesWith;
    return this;
  }

  /**
   * The ISM rule sets a document complies with 
   * @return compliesWith
  */
  @ApiModelProperty(example = "USGov", value = "The ISM rule sets a document complies with ")


  public String getCompliesWith() {
    return compliesWith;
  }

  public void setCompliesWith(String compliesWith) {
    this.compliesWith = compliesWith;
  }

  public ISM createDate(String createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * The date when ISM metadata was added or updated 
   * @return createDate
  */
  @ApiModelProperty(example = "20041117", value = "The date when ISM metadata was added or updated ")


  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }

  public ISM declassDate(String declassDate) {
    this.declassDate = declassDate;
    return this;
  }

  /**
   * The specific date when the resource is subject to automatic declassification procedures if not properly exempted from automatic declassification 
   * @return declassDate
  */
  @ApiModelProperty(example = "19960131", value = "The specific date when the resource is subject to automatic declassification procedures if not properly exempted from automatic declassification ")


  public String getDeclassDate() {
    return declassDate;
  }

  public void setDeclassDate(String declassDate) {
    this.declassDate = declassDate;
  }

  public ISM declassEvent(String declassEvent) {
    this.declassEvent = declassEvent;
    return this;
  }

  /**
   * A description of an event upon which the information shall be subject to automatic declassification procedures if not properly exempted from automatic declassification A description of an event upon which the information shall be automatically declassified if not properly exempted from automatic declassification. 
   * @return declassEvent
  */
  @ApiModelProperty(example = "End of conflict", value = "A description of an event upon which the information shall be subject to automatic declassification procedures if not properly exempted from automatic declassification A description of an event upon which the information shall be automatically declassified if not properly exempted from automatic declassification. ")


  public String getDeclassEvent() {
    return declassEvent;
  }

  public void setDeclassEvent(String declassEvent) {
    this.declassEvent = declassEvent;
  }

  public ISM declassException(String declassException) {
    this.declassException = declassException;
    return this;
  }

  /**
   * The exemption from automatic declassification that is claimed for a document 
   * @return declassException
  */
  @ApiModelProperty(example = "AEA", value = "The exemption from automatic declassification that is claimed for a document ")


  public String getDeclassException() {
    return declassException;
  }

  public void setDeclassException(String declassException) {
    this.declassException = declassException;
  }

  public ISM derivativelyClassifiedBy(String derivativelyClassifiedBy) {
    this.derivativelyClassifiedBy = derivativelyClassifiedBy;
    return this;
  }

  /**
   * The identity, by name or personal identifier, of the derivative classification authority 
   * @return derivativelyClassifiedBy
  */
  @ApiModelProperty(example = "The power rule derivatively classifies x^2", value = "The identity, by name or personal identifier, of the derivative classification authority ")


  public String getDerivativelyClassifiedBy() {
    return derivativelyClassifiedBy;
  }

  public void setDerivativelyClassifiedBy(String derivativelyClassifiedBy) {
    this.derivativelyClassifiedBy = derivativelyClassifiedBy;
  }

  public ISM derivedFrom(String derivedFrom) {
    this.derivedFrom = derivedFrom;
    return this;
  }

  /**
   * A citation of the authoritative source or sources of the classification markings used in a derivative classification decision for a classified document 
   * @return derivedFrom
  */
  @ApiModelProperty(example = "2x is derived from x^2", value = "A citation of the authoritative source or sources of the classification markings used in a derivative classification decision for a classified document ")


  public String getDerivedFrom() {
    return derivedFrom;
  }

  public void setDerivedFrom(String derivedFrom) {
    this.derivedFrom = derivedFrom;
  }

  public ISM deSVersion(String deSVersion) {
    this.deSVersion = deSVersion;
    return this;
  }

  /**
   * The version number of the specification. This attribute is intended for processing systems to determine the appropriate versions of Schema, Schematron, and CVE values for validation and interpretation of an instance document. 
   * @return deSVersion
  */
  @ApiModelProperty(example = "TODO", value = "The version number of the specification. This attribute is intended for processing systems to determine the appropriate versions of Schema, Schematron, and CVE values for validation and interpretation of an instance document. ")


  public String getDeSVersion() {
    return deSVersion;
  }

  public void setDeSVersion(String deSVersion) {
    this.deSVersion = deSVersion;
  }

  public ISM displayOnlyTo(String displayOnlyTo) {
    this.displayOnlyTo = displayOnlyTo;
    return this;
  }

  /**
   * The set of countries and/or international organizations associated with a “Display Only To” marking 
   * @return displayOnlyTo
  */
  @ApiModelProperty(example = "USA", value = "The set of countries and/or international organizations associated with a “Display Only To” marking ")


  public String getDisplayOnlyTo() {
    return displayOnlyTo;
  }

  public void setDisplayOnlyTo(String displayOnlyTo) {
    this.displayOnlyTo = displayOnlyTo;
  }

  public ISM disseminationControls(String disseminationControls) {
    this.disseminationControls = disseminationControls;
    return this;
  }

  /**
   * Applicable dissemination control markings for a document or portion 
   * @return disseminationControls
  */
  @ApiModelProperty(example = "FOUO", value = "Applicable dissemination control markings for a document or portion ")


  public String getDisseminationControls() {
    return disseminationControls;
  }

  public void setDisseminationControls(String disseminationControls) {
    this.disseminationControls = disseminationControls;
  }

  public ISM excludeFromRollup(Boolean excludeFromRollup) {
    this.excludeFromRollup = excludeFromRollup;
    return this;
  }

  /**
   * An indicator that an element’s ISM attributes do not contribute to the “rollup” classification of the document 
   * @return excludeFromRollup
  */
  @ApiModelProperty(example = "false", value = "An indicator that an element’s ISM attributes do not contribute to the “rollup” classification of the document ")


  public Boolean isExcludeFromRollup() {
    return excludeFromRollup;
  }

  public void setExcludeFromRollup(Boolean excludeFromRollup) {
    this.excludeFromRollup = excludeFromRollup;
  }

  public ISM exemptFrom(String exemptFrom) {
    this.exemptFrom = exemptFrom;
    return this;
  }

  /**
   * Specific exemptions within an ISM rule set that are claimed for a document 
   * @return exemptFrom
  */
  @ApiModelProperty(example = "DOD_DISTRO_STATEMENT", value = "Specific exemptions within an ISM rule set that are claimed for a document ")


  public String getExemptFrom() {
    return exemptFrom;
  }

  public void setExemptFrom(String exemptFrom) {
    this.exemptFrom = exemptFrom;
  }

  public ISM externalNotice(Boolean externalNotice) {
    this.externalNotice = externalNotice;
    return this;
  }

  /**
   * An indicator that an element contains a security-related notice for information NOT contained in document 
   * @return externalNotice
  */
  @ApiModelProperty(example = "false", value = "An indicator that an element contains a security-related notice for information NOT contained in document ")


  public Boolean isExternalNotice() {
    return externalNotice;
  }

  public void setExternalNotice(Boolean externalNotice) {
    this.externalNotice = externalNotice;
  }

  public ISM fgIsourceOpen(String fgIsourceOpen) {
    this.fgIsourceOpen = fgIsourceOpen;
    return this;
  }

  /**
   * The set of countries and/or international organizations whose information is derivatively sourced in a document when the source of the information is not concealed (also used for cases when the source is unknown) 
   * @return fgIsourceOpen
  */
  @ApiModelProperty(example = "ABW", value = "The set of countries and/or international organizations whose information is derivatively sourced in a document when the source of the information is not concealed (also used for cases when the source is unknown) ")


  public String getFgIsourceOpen() {
    return fgIsourceOpen;
  }

  public void setFgIsourceOpen(String fgIsourceOpen) {
    this.fgIsourceOpen = fgIsourceOpen;
  }

  public ISM fgIsourceProtected(String fgIsourceProtected) {
    this.fgIsourceProtected = fgIsourceProtected;
    return this;
  }

  /**
   * The set of countries and/or international organizations whose information is derivatively sourced in a document when the source of the information must be concealed 
   * @return fgIsourceProtected
  */
  @ApiModelProperty(example = "FGI", value = "The set of countries and/or international organizations whose information is derivatively sourced in a document when the source of the information must be concealed ")


  public String getFgIsourceProtected() {
    return fgIsourceProtected;
  }

  public void setFgIsourceProtected(String fgIsourceProtected) {
    this.fgIsourceProtected = fgIsourceProtected;
  }

  public ISM hasApproximateMarkings(Boolean hasApproximateMarkings) {
    this.hasApproximateMarkings = hasApproximateMarkings;
    return this;
  }

  /**
   * When true, indicates the ISM markings specified are estimated (e.g. system high). 
   * @return hasApproximateMarkings
  */
  @ApiModelProperty(example = "true", value = "When true, indicates the ISM markings specified are estimated (e.g. system high). ")


  public Boolean isHasApproximateMarkings() {
    return hasApproximateMarkings;
  }

  public void setHasApproximateMarkings(Boolean hasApproximateMarkings) {
    this.hasApproximateMarkings = hasApproximateMarkings;
  }

  public ISM id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique XML identifier used to assign an XML unique identifier to an element, such as a paragraph, note or table. 
   * @return id
  */
  @ApiModelProperty(example = "TODO", value = "A unique XML identifier used to assign an XML unique identifier to an element, such as a paragraph, note or table. ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ISM idReference(String idReference) {
    this.idReference = idReference;
    return this;
  }

  /**
   * A cross-reference to a unique identifier used to point from one element to one or more other elements. The value of the attribute must be one or more XML unique identifiers that are the value(s) of id attribute(s) elsewhere in the document. 
   * @return idReference
  */
  @ApiModelProperty(example = "TODO", value = "A cross-reference to a unique identifier used to point from one element to one or more other elements. The value of the attribute must be one or more XML unique identifiers that are the value(s) of id attribute(s) elsewhere in the document. ")


  public String getIdReference() {
    return idReference;
  }

  public void setIdReference(String idReference) {
    this.idReference = idReference;
  }

  public ISM isMCATCESVersion(String isMCATCESVersion) {
    this.isMCATCESVersion = isMCATCESVersion;
    return this;
  }

  /**
   * The version number of the ISMCAT CES used in the document 
   * @return isMCATCESVersion
  */
  @ApiModelProperty(example = "TODO", value = "The version number of the ISMCAT CES used in the document ")


  public String getIsMCATCESVersion() {
    return isMCATCESVersion;
  }

  public void setIsMCATCESVersion(String isMCATCESVersion) {
    this.isMCATCESVersion = isMCATCESVersion;
  }

  public ISM noAggregation(Boolean noAggregation) {
    this.noAggregation = noAggregation;
    return this;
  }

  /**
   * When true, an indicator that there is no classification by compilation across any combination of portions extracted from the document. 
   * @return noAggregation
  */
  @ApiModelProperty(example = "true", value = "When true, an indicator that there is no classification by compilation across any combination of portions extracted from the document. ")


  public Boolean isNoAggregation() {
    return noAggregation;
  }

  public void setNoAggregation(Boolean noAggregation) {
    this.noAggregation = noAggregation;
  }

  public ISM nonICmarkings(String nonICmarkings) {
    this.nonICmarkings = nonICmarkings;
    return this;
  }

  /**
   * One or more indicators of an expansion or limitation on the distribution of a document or portion originating from non-intelligence components 
   * @return nonICmarkings
  */
  @ApiModelProperty(example = "DS", value = "One or more indicators of an expansion or limitation on the distribution of a document or portion originating from non-intelligence components ")


  public String getNonICmarkings() {
    return nonICmarkings;
  }

  public void setNonICmarkings(String nonICmarkings) {
    this.nonICmarkings = nonICmarkings;
  }

  public ISM nonUSControls(String nonUSControls) {
    this.nonUSControls = nonUSControls;
    return this;
  }

  /**
   * One or more indicators of an expansion or limitation on the distribution of a document or portion originating from non-US components (foreign government or international organization). 
   * @return nonUSControls
  */
  @ApiModelProperty(example = "ATOMAL", value = "One or more indicators of an expansion or limitation on the distribution of a document or portion originating from non-US components (foreign government or international organization). ")


  public String getNonUSControls() {
    return nonUSControls;
  }

  public void setNonUSControls(String nonUSControls) {
    this.nonUSControls = nonUSControls;
  }

  public ISM noticeDate(String noticeDate) {
    this.noticeDate = noticeDate;
    return this;
  }

  /**
   * A date associated with a notice (for example, the DoD Distribution notice date) 
   * @return noticeDate
  */
  @ApiModelProperty(example = "19480108", value = "A date associated with a notice (for example, the DoD Distribution notice date) ")


  public String getNoticeDate() {
    return noticeDate;
  }

  public void setNoticeDate(String noticeDate) {
    this.noticeDate = noticeDate;
  }

  public ISM noticeReason(String noticeReason) {
    this.noticeReason = noticeReason;
    return this;
  }

  /**
   * A reason associated with a notice (for example, the DoD Distribution reason) 
   * @return noticeReason
  */
  @ApiModelProperty(example = "TODO", value = "A reason associated with a notice (for example, the DoD Distribution reason) ")


  public String getNoticeReason() {
    return noticeReason;
  }

  public void setNoticeReason(String noticeReason) {
    this.noticeReason = noticeReason;
  }

  public ISM noticeType(String noticeType) {
    this.noticeType = noticeType;
    return this;
  }

  /**
   * An indicator that the containing element contains a security-related notice. This attribute is used to categorize which of the required notices is specified in the element. These categories include those described in the Intelligence Community Markings System Register and Manual, as well as additional well-defined and formally recognized security notice types described in other directives, such as US-Person and DoD Distribution. The element could contain any structure that the implementing schema defines, and rendering details are relegated to the implementing schema. The permissible values for this attribute are defined in the ISM Notice CVE: CVEnumISMNotice.xml 
   * @return noticeType
  */
  @ApiModelProperty(example = "FISA", value = "An indicator that the containing element contains a security-related notice. This attribute is used to categorize which of the required notices is specified in the element. These categories include those described in the Intelligence Community Markings System Register and Manual, as well as additional well-defined and formally recognized security notice types described in other directives, such as US-Person and DoD Distribution. The element could contain any structure that the implementing schema defines, and rendering details are relegated to the implementing schema. The permissible values for this attribute are defined in the ISM Notice CVE: CVEnumISMNotice.xml ")


  public String getNoticeType() {
    return noticeType;
  }

  public void setNoticeType(String noticeType) {
    this.noticeType = noticeType;
  }

  public ISM ownerProducer(String ownerProducer) {
    this.ownerProducer = ownerProducer;
    return this;
  }

  /**
   * The set of national governments and/or international organizations that have purview over the containing classification marking. 
   * @return ownerProducer
  */
  @ApiModelProperty(example = "USA", value = "The set of national governments and/or international organizations that have purview over the containing classification marking. ")


  public String getOwnerProducer() {
    return ownerProducer;
  }

  public void setOwnerProducer(String ownerProducer) {
    this.ownerProducer = ownerProducer;
  }

  public ISM joint(Boolean joint) {
    this.joint = joint;
    return this;
  }

  /**
   * When true, an indicator that entities in the @ism:ownerProducer attribute are JOINT owners of the resource 
   * @return joint
  */
  @ApiModelProperty(example = "false", value = "When true, an indicator that entities in the @ism:ownerProducer attribute are JOINT owners of the resource ")


  public Boolean isJoint() {
    return joint;
  }

  public void setJoint(Boolean joint) {
    this.joint = joint;
  }

  public ISM pocType(String pocType) {
    this.pocType = pocType;
    return this;
  }

  /**
   * Indicates that the element specifies a point-of-contact (POC) and the methods with which to contact that individual. As certain POCs are required for different reasons (ICD-710 compliance, DoD Distribution statements, etc), the values for this attribute specify the reason(s) why the POC is provided. 
   * @return pocType
  */
  @ApiModelProperty(example = "ICD-710", value = "Indicates that the element specifies a point-of-contact (POC) and the methods with which to contact that individual. As certain POCs are required for different reasons (ICD-710 compliance, DoD Distribution statements, etc), the values for this attribute specify the reason(s) why the POC is provided. ")


  public String getPocType() {
    return pocType;
  }

  public void setPocType(String pocType) {
    this.pocType = pocType;
  }

  public ISM qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  /**
   * A user-defined property used to provide contextual meaning to the AccessProfileValue 
   * @return qualifier
  */
  @ApiModelProperty(example = "Nintendogs", value = "A user-defined property used to provide contextual meaning to the AccessProfileValue ")


  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public ISM releasableTo(String releasableTo) {
    this.releasableTo = releasableTo;
    return this;
  }

  /**
   * This attribute is used at both the resource and the portion levels. One or more indicators identifying the country or countries and/or international organization(s) to which classified information may be released based on the determination of an originator in accordance with established foreign disclosure procedures. This element is used in conjunction with the Dissemination Controls element. It is manifested in portion marks and security banners. PERMISSIBLE VALUES The permissible values for this attribute are defined in the Controlled Value Enumeration: CVEnumISMRelTo.xml 
   * @return releasableTo
  */
  @ApiModelProperty(example = "USA", value = "This attribute is used at both the resource and the portion levels. One or more indicators identifying the country or countries and/or international organization(s) to which classified information may be released based on the determination of an originator in accordance with established foreign disclosure procedures. This element is used in conjunction with the Dissemination Controls element. It is manifested in portion marks and security banners. PERMISSIBLE VALUES The permissible values for this attribute are defined in the Controlled Value Enumeration: CVEnumISMRelTo.xml ")


  public String getReleasableTo() {
    return releasableTo;
  }

  public void setReleasableTo(String releasableTo) {
    this.releasableTo = releasableTo;
  }

  public ISM resourceElement(Boolean resourceElement) {
    this.resourceElement = resourceElement;
    return this;
  }

  /**
   * This attribute is used to designate which element has the ISM attributes representing the classification for the entire resource. Every document must have at least one element with this indicator as true. It should be rare that a document has more than one. Mainly this would occur in some sort of aggregation schema. In the aggregation case, the first @resourceElement attribute in XML document order is the one used for all constraint rules. 
   * @return resourceElement
  */
  @ApiModelProperty(example = "true", value = "This attribute is used to designate which element has the ISM attributes representing the classification for the entire resource. Every document must have at least one element with this indicator as true. It should be rare that a document has more than one. Mainly this would occur in some sort of aggregation schema. In the aggregation case, the first @resourceElement attribute in XML document order is the one used for all constraint rules. ")


  public Boolean isResourceElement() {
    return resourceElement;
  }

  public void setResourceElement(Boolean resourceElement) {
    this.resourceElement = resourceElement;
  }

  public ISM saRIdentifier(String saRIdentifier) {
    this.saRIdentifier = saRIdentifier;
    return this;
  }

  /**
   * This attribute is used at both the resource and the portion levels. One or more indicators identifying the defense or intelligence programs for which special access is required. It is manifested in portion marks and security banners. PERMISSIBLE VALUES The permissible values for this attribute are defined in the Controlled Value Enumeration: CVEnumISMSAR.xml 
   * @return saRIdentifier
  */
  @ApiModelProperty(example = "SAR-E for not thinking of a better example", value = "This attribute is used at both the resource and the portion levels. One or more indicators identifying the defense or intelligence programs for which special access is required. It is manifested in portion marks and security banners. PERMISSIBLE VALUES The permissible values for this attribute are defined in the Controlled Value Enumeration: CVEnumISMSAR.xml ")


  public String getSaRIdentifier() {
    return saRIdentifier;
  }

  public void setSaRIdentifier(String saRIdentifier) {
    this.saRIdentifier = saRIdentifier;
  }

  public ISM scIControls(String scIControls) {
    this.scIControls = scIControls;
    return this;
  }

  /**
   * This attribute is used at both the resource and the portion levels. One or more indicators identifying sensitive compartmented information control system(s). It is manifested in portion marks and security banners. PERMISSIBLE VALUES The permissible values for this attribute are defined in the Controlled Value Enumeration: CVEnumISMSCIControls.xml 
   * @return scIControls
  */
  @ApiModelProperty(example = "BUR", value = "This attribute is used at both the resource and the portion levels. One or more indicators identifying sensitive compartmented information control system(s). It is manifested in portion marks and security banners. PERMISSIBLE VALUES The permissible values for this attribute are defined in the Controlled Value Enumeration: CVEnumISMSCIControls.xml ")


  public String getScIControls() {
    return scIControls;
  }

  public void setScIControls(String scIControls) {
    this.scIControls = scIControls;
  }

  public ISM typeOfExemptedSource(String typeOfExemptedSource) {
    this.typeOfExemptedSource = typeOfExemptedSource;
    return this;
  }

  /**
   * This attribute is used primarily at the resource level. A declassification marking of a source document that causes the current, derivative document to be exempted from automatic declassification. This element is always used in conjunction with the Date Of Exempted Source element. It is manifested only in the 'Declassify On' line of a document's classification/declassification block. This element is defined as NMTOKENS but ISOO has stated it should be a SINGLE value giving the longest protection. PERMISSIBLE VALUE The permissible value for this attribute is defined in the Implementation Profile Supplement: Value Enumerations in the value set: Source Document Declassification Instruction Marking 
   * @return typeOfExemptedSource
  */
  @ApiModelProperty(example = "Document", value = "This attribute is used primarily at the resource level. A declassification marking of a source document that causes the current, derivative document to be exempted from automatic declassification. This element is always used in conjunction with the Date Of Exempted Source element. It is manifested only in the 'Declassify On' line of a document's classification/declassification block. This element is defined as NMTOKENS but ISOO has stated it should be a SINGLE value giving the longest protection. PERMISSIBLE VALUE The permissible value for this attribute is defined in the Implementation Profile Supplement: Value Enumerations in the value set: Source Document Declassification Instruction Marking ")


  public String getTypeOfExemptedSource() {
    return typeOfExemptedSource;
  }

  public void setTypeOfExemptedSource(String typeOfExemptedSource) {
    this.typeOfExemptedSource = typeOfExemptedSource;
  }

  public ISM unregisteredNoticeType(String unregisteredNoticeType) {
    this.unregisteredNoticeType = unregisteredNoticeType;
    return this;
  }

  /**
   * A notice that is of a category that is not described in the Intelligence Community Markings System Register and Manual and/or is not sufficiently defined to be represented in the Controlled Value Enumeration CVEnumISMNotice.xml. This attribute can be used by specifications that import ISM to represent a wider variety of security-related notices. 
   * @return unregisteredNoticeType
  */
  @ApiModelProperty(example = "TODO", value = "A notice that is of a category that is not described in the Intelligence Community Markings System Register and Manual and/or is not sufficiently defined to be represented in the Controlled Value Enumeration CVEnumISMNotice.xml. This attribute can be used by specifications that import ISM to represent a wider variety of security-related notices. ")


  public String getUnregisteredNoticeType() {
    return unregisteredNoticeType;
  }

  public void setUnregisteredNoticeType(String unregisteredNoticeType) {
    this.unregisteredNoticeType = unregisteredNoticeType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ISM ISM = (ISM) o;
    return Objects.equals(this.atomicEnergyMarkings, ISM.atomicEnergyMarkings) &&
        Objects.equals(this.classification, ISM.classification) &&
        Objects.equals(this.classificationReason, ISM.classificationReason) &&
        Objects.equals(this.classifiedBy, ISM.classifiedBy) &&
        Objects.equals(this.compilationReason, ISM.compilationReason) &&
        Objects.equals(this.compliesWith, ISM.compliesWith) &&
        Objects.equals(this.createDate, ISM.createDate) &&
        Objects.equals(this.declassDate, ISM.declassDate) &&
        Objects.equals(this.declassEvent, ISM.declassEvent) &&
        Objects.equals(this.declassException, ISM.declassException) &&
        Objects.equals(this.derivativelyClassifiedBy, ISM.derivativelyClassifiedBy) &&
        Objects.equals(this.derivedFrom, ISM.derivedFrom) &&
        Objects.equals(this.deSVersion, ISM.deSVersion) &&
        Objects.equals(this.displayOnlyTo, ISM.displayOnlyTo) &&
        Objects.equals(this.disseminationControls, ISM.disseminationControls) &&
        Objects.equals(this.excludeFromRollup, ISM.excludeFromRollup) &&
        Objects.equals(this.exemptFrom, ISM.exemptFrom) &&
        Objects.equals(this.externalNotice, ISM.externalNotice) &&
        Objects.equals(this.fgIsourceOpen, ISM.fgIsourceOpen) &&
        Objects.equals(this.fgIsourceProtected, ISM.fgIsourceProtected) &&
        Objects.equals(this.hasApproximateMarkings, ISM.hasApproximateMarkings) &&
        Objects.equals(this.id, ISM.id) &&
        Objects.equals(this.idReference, ISM.idReference) &&
        Objects.equals(this.isMCATCESVersion, ISM.isMCATCESVersion) &&
        Objects.equals(this.noAggregation, ISM.noAggregation) &&
        Objects.equals(this.nonICmarkings, ISM.nonICmarkings) &&
        Objects.equals(this.nonUSControls, ISM.nonUSControls) &&
        Objects.equals(this.noticeDate, ISM.noticeDate) &&
        Objects.equals(this.noticeReason, ISM.noticeReason) &&
        Objects.equals(this.noticeType, ISM.noticeType) &&
        Objects.equals(this.ownerProducer, ISM.ownerProducer) &&
        Objects.equals(this.joint, ISM.joint) &&
        Objects.equals(this.pocType, ISM.pocType) &&
        Objects.equals(this.qualifier, ISM.qualifier) &&
        Objects.equals(this.releasableTo, ISM.releasableTo) &&
        Objects.equals(this.resourceElement, ISM.resourceElement) &&
        Objects.equals(this.saRIdentifier, ISM.saRIdentifier) &&
        Objects.equals(this.scIControls, ISM.scIControls) &&
        Objects.equals(this.typeOfExemptedSource, ISM.typeOfExemptedSource) &&
        Objects.equals(this.unregisteredNoticeType, ISM.unregisteredNoticeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atomicEnergyMarkings, classification, classificationReason, classifiedBy, compilationReason, compliesWith, createDate, declassDate, declassEvent, declassException, derivativelyClassifiedBy, derivedFrom, deSVersion, displayOnlyTo, disseminationControls, excludeFromRollup, exemptFrom, externalNotice, fgIsourceOpen, fgIsourceProtected, hasApproximateMarkings, id, idReference, isMCATCESVersion, noAggregation, nonICmarkings, nonUSControls, noticeDate, noticeReason, noticeType, ownerProducer, joint, pocType, qualifier, releasableTo, resourceElement, saRIdentifier, scIControls, typeOfExemptedSource, unregisteredNoticeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ISM {\n");
    
    sb.append("    atomicEnergyMarkings: ").append(toIndentedString(atomicEnergyMarkings)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    classificationReason: ").append(toIndentedString(classificationReason)).append("\n");
    sb.append("    classifiedBy: ").append(toIndentedString(classifiedBy)).append("\n");
    sb.append("    compilationReason: ").append(toIndentedString(compilationReason)).append("\n");
    sb.append("    compliesWith: ").append(toIndentedString(compliesWith)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    declassDate: ").append(toIndentedString(declassDate)).append("\n");
    sb.append("    declassEvent: ").append(toIndentedString(declassEvent)).append("\n");
    sb.append("    declassException: ").append(toIndentedString(declassException)).append("\n");
    sb.append("    derivativelyClassifiedBy: ").append(toIndentedString(derivativelyClassifiedBy)).append("\n");
    sb.append("    derivedFrom: ").append(toIndentedString(derivedFrom)).append("\n");
    sb.append("    deSVersion: ").append(toIndentedString(deSVersion)).append("\n");
    sb.append("    displayOnlyTo: ").append(toIndentedString(displayOnlyTo)).append("\n");
    sb.append("    disseminationControls: ").append(toIndentedString(disseminationControls)).append("\n");
    sb.append("    excludeFromRollup: ").append(toIndentedString(excludeFromRollup)).append("\n");
    sb.append("    exemptFrom: ").append(toIndentedString(exemptFrom)).append("\n");
    sb.append("    externalNotice: ").append(toIndentedString(externalNotice)).append("\n");
    sb.append("    fgIsourceOpen: ").append(toIndentedString(fgIsourceOpen)).append("\n");
    sb.append("    fgIsourceProtected: ").append(toIndentedString(fgIsourceProtected)).append("\n");
    sb.append("    hasApproximateMarkings: ").append(toIndentedString(hasApproximateMarkings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idReference: ").append(toIndentedString(idReference)).append("\n");
    sb.append("    isMCATCESVersion: ").append(toIndentedString(isMCATCESVersion)).append("\n");
    sb.append("    noAggregation: ").append(toIndentedString(noAggregation)).append("\n");
    sb.append("    nonICmarkings: ").append(toIndentedString(nonICmarkings)).append("\n");
    sb.append("    nonUSControls: ").append(toIndentedString(nonUSControls)).append("\n");
    sb.append("    noticeDate: ").append(toIndentedString(noticeDate)).append("\n");
    sb.append("    noticeReason: ").append(toIndentedString(noticeReason)).append("\n");
    sb.append("    noticeType: ").append(toIndentedString(noticeType)).append("\n");
    sb.append("    ownerProducer: ").append(toIndentedString(ownerProducer)).append("\n");
    sb.append("    joint: ").append(toIndentedString(joint)).append("\n");
    sb.append("    pocType: ").append(toIndentedString(pocType)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    releasableTo: ").append(toIndentedString(releasableTo)).append("\n");
    sb.append("    resourceElement: ").append(toIndentedString(resourceElement)).append("\n");
    sb.append("    saRIdentifier: ").append(toIndentedString(saRIdentifier)).append("\n");
    sb.append("    scIControls: ").append(toIndentedString(scIControls)).append("\n");
    sb.append("    typeOfExemptedSource: ").append(toIndentedString(typeOfExemptedSource)).append("\n");
    sb.append("    unregisteredNoticeType: ").append(toIndentedString(unregisteredNoticeType)).append("\n");
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


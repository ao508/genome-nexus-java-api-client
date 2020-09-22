/*
 * Genome Nexus API
 * This page shows how to use HTTP requests to access the Genome Nexus API. There are more high level clients available in Python, R, JavaScript, TypeScript and various other languages as well as a command line client to annotate MAF and VCF. See https://docs.genomenexus.org/api.  Aside from programmatic clients there are web based tools to annotate variants, see https://docs.genomenexus.org/tools.   We currently only provide long-term support for the '/annotation' endpoint. The other endpoints might change.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.genome_nexus.client;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.genome_nexus.client.CountByTumorType;

/**
 * SignalMutation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:48:04.268-04:00")
public class SignalMutation {
  @SerializedName("biallelicCountsByTumorType")
  private List<CountByTumorType> biallelicCountsByTumorType = null;

  @SerializedName("chromosome")
  private String chromosome = null;

  @SerializedName("countsByTumorType")
  private List<CountByTumorType> countsByTumorType = null;

  @SerializedName("endPosition")
  private Long endPosition = null;

  @SerializedName("hugoGeneSymbol")
  private String hugoGeneSymbol = null;

  @SerializedName("mutationStatus")
  private String mutationStatus = null;

  @SerializedName("pathogenic")
  private String pathogenic = null;

  @SerializedName("penetrance")
  private String penetrance = null;

  @SerializedName("qcPassCountsByTumorType")
  private List<CountByTumorType> qcPassCountsByTumorType = null;

  @SerializedName("referenceAllele")
  private String referenceAllele = null;

  @SerializedName("startPosition")
  private Long startPosition = null;

  @SerializedName("variantAllele")
  private String variantAllele = null;

  public SignalMutation biallelicCountsByTumorType(List<CountByTumorType> biallelicCountsByTumorType) {
    this.biallelicCountsByTumorType = biallelicCountsByTumorType;
    return this;
  }

  public SignalMutation addBiallelicCountsByTumorTypeItem(CountByTumorType biallelicCountsByTumorTypeItem) {
    if (this.biallelicCountsByTumorType == null) {
      this.biallelicCountsByTumorType = new ArrayList<CountByTumorType>();
    }
    this.biallelicCountsByTumorType.add(biallelicCountsByTumorTypeItem);
    return this;
  }

   /**
   * Biallelic Counts by Tumor Type
   * @return biallelicCountsByTumorType
  **/
  @ApiModelProperty(value = "Biallelic Counts by Tumor Type")
  public List<CountByTumorType> getBiallelicCountsByTumorType() {
    return biallelicCountsByTumorType;
  }

  public void setBiallelicCountsByTumorType(List<CountByTumorType> biallelicCountsByTumorType) {
    this.biallelicCountsByTumorType = biallelicCountsByTumorType;
  }

  public SignalMutation chromosome(String chromosome) {
    this.chromosome = chromosome;
    return this;
  }

   /**
   * Chromosome
   * @return chromosome
  **/
  @ApiModelProperty(value = "Chromosome")
  public String getChromosome() {
    return chromosome;
  }

  public void setChromosome(String chromosome) {
    this.chromosome = chromosome;
  }

  public SignalMutation countsByTumorType(List<CountByTumorType> countsByTumorType) {
    this.countsByTumorType = countsByTumorType;
    return this;
  }

  public SignalMutation addCountsByTumorTypeItem(CountByTumorType countsByTumorTypeItem) {
    if (this.countsByTumorType == null) {
      this.countsByTumorType = new ArrayList<CountByTumorType>();
    }
    this.countsByTumorType.add(countsByTumorTypeItem);
    return this;
  }

   /**
   * Counts by Tumor Type
   * @return countsByTumorType
  **/
  @ApiModelProperty(value = "Counts by Tumor Type")
  public List<CountByTumorType> getCountsByTumorType() {
    return countsByTumorType;
  }

  public void setCountsByTumorType(List<CountByTumorType> countsByTumorType) {
    this.countsByTumorType = countsByTumorType;
  }

  public SignalMutation endPosition(Long endPosition) {
    this.endPosition = endPosition;
    return this;
  }

   /**
   * End Position
   * @return endPosition
  **/
  @ApiModelProperty(value = "End Position")
  public Long getEndPosition() {
    return endPosition;
  }

  public void setEndPosition(Long endPosition) {
    this.endPosition = endPosition;
  }

  public SignalMutation hugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
    return this;
  }

   /**
   * Hugo Gene Symbol
   * @return hugoGeneSymbol
  **/
  @ApiModelProperty(value = "Hugo Gene Symbol")
  public String getHugoGeneSymbol() {
    return hugoGeneSymbol;
  }

  public void setHugoGeneSymbol(String hugoGeneSymbol) {
    this.hugoGeneSymbol = hugoGeneSymbol;
  }

  public SignalMutation mutationStatus(String mutationStatus) {
    this.mutationStatus = mutationStatus;
    return this;
  }

   /**
   * Mutation Status
   * @return mutationStatus
  **/
  @ApiModelProperty(value = "Mutation Status")
  public String getMutationStatus() {
    return mutationStatus;
  }

  public void setMutationStatus(String mutationStatus) {
    this.mutationStatus = mutationStatus;
  }

  public SignalMutation pathogenic(String pathogenic) {
    this.pathogenic = pathogenic;
    return this;
  }

   /**
   * Pathogenic
   * @return pathogenic
  **/
  @ApiModelProperty(value = "Pathogenic")
  public String getPathogenic() {
    return pathogenic;
  }

  public void setPathogenic(String pathogenic) {
    this.pathogenic = pathogenic;
  }

  public SignalMutation penetrance(String penetrance) {
    this.penetrance = penetrance;
    return this;
  }

   /**
   * Penetrance
   * @return penetrance
  **/
  @ApiModelProperty(value = "Penetrance")
  public String getPenetrance() {
    return penetrance;
  }

  public void setPenetrance(String penetrance) {
    this.penetrance = penetrance;
  }

  public SignalMutation qcPassCountsByTumorType(List<CountByTumorType> qcPassCountsByTumorType) {
    this.qcPassCountsByTumorType = qcPassCountsByTumorType;
    return this;
  }

  public SignalMutation addQcPassCountsByTumorTypeItem(CountByTumorType qcPassCountsByTumorTypeItem) {
    if (this.qcPassCountsByTumorType == null) {
      this.qcPassCountsByTumorType = new ArrayList<CountByTumorType>();
    }
    this.qcPassCountsByTumorType.add(qcPassCountsByTumorTypeItem);
    return this;
  }

   /**
   * QC Pass Counts by Tumor Type
   * @return qcPassCountsByTumorType
  **/
  @ApiModelProperty(value = "QC Pass Counts by Tumor Type")
  public List<CountByTumorType> getQcPassCountsByTumorType() {
    return qcPassCountsByTumorType;
  }

  public void setQcPassCountsByTumorType(List<CountByTumorType> qcPassCountsByTumorType) {
    this.qcPassCountsByTumorType = qcPassCountsByTumorType;
  }

  public SignalMutation referenceAllele(String referenceAllele) {
    this.referenceAllele = referenceAllele;
    return this;
  }

   /**
   * Reference Allele
   * @return referenceAllele
  **/
  @ApiModelProperty(value = "Reference Allele")
  public String getReferenceAllele() {
    return referenceAllele;
  }

  public void setReferenceAllele(String referenceAllele) {
    this.referenceAllele = referenceAllele;
  }

  public SignalMutation startPosition(Long startPosition) {
    this.startPosition = startPosition;
    return this;
  }

   /**
   * Start Position
   * @return startPosition
  **/
  @ApiModelProperty(value = "Start Position")
  public Long getStartPosition() {
    return startPosition;
  }

  public void setStartPosition(Long startPosition) {
    this.startPosition = startPosition;
  }

  public SignalMutation variantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
    return this;
  }

   /**
   * Variant Allele
   * @return variantAllele
  **/
  @ApiModelProperty(value = "Variant Allele")
  public String getVariantAllele() {
    return variantAllele;
  }

  public void setVariantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalMutation signalMutation = (SignalMutation) o;
    return Objects.equals(this.biallelicCountsByTumorType, signalMutation.biallelicCountsByTumorType) &&
        Objects.equals(this.chromosome, signalMutation.chromosome) &&
        Objects.equals(this.countsByTumorType, signalMutation.countsByTumorType) &&
        Objects.equals(this.endPosition, signalMutation.endPosition) &&
        Objects.equals(this.hugoGeneSymbol, signalMutation.hugoGeneSymbol) &&
        Objects.equals(this.mutationStatus, signalMutation.mutationStatus) &&
        Objects.equals(this.pathogenic, signalMutation.pathogenic) &&
        Objects.equals(this.penetrance, signalMutation.penetrance) &&
        Objects.equals(this.qcPassCountsByTumorType, signalMutation.qcPassCountsByTumorType) &&
        Objects.equals(this.referenceAllele, signalMutation.referenceAllele) &&
        Objects.equals(this.startPosition, signalMutation.startPosition) &&
        Objects.equals(this.variantAllele, signalMutation.variantAllele);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biallelicCountsByTumorType, chromosome, countsByTumorType, endPosition, hugoGeneSymbol, mutationStatus, pathogenic, penetrance, qcPassCountsByTumorType, referenceAllele, startPosition, variantAllele);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalMutation {\n");
    
    sb.append("    biallelicCountsByTumorType: ").append(toIndentedString(biallelicCountsByTumorType)).append("\n");
    sb.append("    chromosome: ").append(toIndentedString(chromosome)).append("\n");
    sb.append("    countsByTumorType: ").append(toIndentedString(countsByTumorType)).append("\n");
    sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
    sb.append("    hugoGeneSymbol: ").append(toIndentedString(hugoGeneSymbol)).append("\n");
    sb.append("    mutationStatus: ").append(toIndentedString(mutationStatus)).append("\n");
    sb.append("    pathogenic: ").append(toIndentedString(pathogenic)).append("\n");
    sb.append("    penetrance: ").append(toIndentedString(penetrance)).append("\n");
    sb.append("    qcPassCountsByTumorType: ").append(toIndentedString(qcPassCountsByTumorType)).append("\n");
    sb.append("    referenceAllele: ").append(toIndentedString(referenceAllele)).append("\n");
    sb.append("    startPosition: ").append(toIndentedString(startPosition)).append("\n");
    sb.append("    variantAllele: ").append(toIndentedString(variantAllele)).append("\n");
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


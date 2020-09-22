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

/**
 * AlleleFrequency
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:48:04.268-04:00")
public class AlleleFrequency {
  @SerializedName("af")
  private Double af = null;

  @SerializedName("af_afr")
  private Double afAfr = null;

  @SerializedName("af_amr")
  private Double afAmr = null;

  @SerializedName("af_asj")
  private Double afAsj = null;

  @SerializedName("af_eas")
  private Double afEas = null;

  @SerializedName("af_fin")
  private Double afFin = null;

  @SerializedName("af_nfe")
  private Double afNfe = null;

  @SerializedName("af_oth")
  private Double afOth = null;

  @SerializedName("af_sas")
  private Double afSas = null;

  public AlleleFrequency af(Double af) {
    this.af = af;
    return this;
  }

   /**
   * Get af
   * @return af
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAf() {
    return af;
  }

  public void setAf(Double af) {
    this.af = af;
  }

  public AlleleFrequency afAfr(Double afAfr) {
    this.afAfr = afAfr;
    return this;
  }

   /**
   * Get afAfr
   * @return afAfr
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfAfr() {
    return afAfr;
  }

  public void setAfAfr(Double afAfr) {
    this.afAfr = afAfr;
  }

  public AlleleFrequency afAmr(Double afAmr) {
    this.afAmr = afAmr;
    return this;
  }

   /**
   * Get afAmr
   * @return afAmr
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfAmr() {
    return afAmr;
  }

  public void setAfAmr(Double afAmr) {
    this.afAmr = afAmr;
  }

  public AlleleFrequency afAsj(Double afAsj) {
    this.afAsj = afAsj;
    return this;
  }

   /**
   * Get afAsj
   * @return afAsj
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfAsj() {
    return afAsj;
  }

  public void setAfAsj(Double afAsj) {
    this.afAsj = afAsj;
  }

  public AlleleFrequency afEas(Double afEas) {
    this.afEas = afEas;
    return this;
  }

   /**
   * Get afEas
   * @return afEas
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfEas() {
    return afEas;
  }

  public void setAfEas(Double afEas) {
    this.afEas = afEas;
  }

  public AlleleFrequency afFin(Double afFin) {
    this.afFin = afFin;
    return this;
  }

   /**
   * Get afFin
   * @return afFin
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfFin() {
    return afFin;
  }

  public void setAfFin(Double afFin) {
    this.afFin = afFin;
  }

  public AlleleFrequency afNfe(Double afNfe) {
    this.afNfe = afNfe;
    return this;
  }

   /**
   * Get afNfe
   * @return afNfe
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfNfe() {
    return afNfe;
  }

  public void setAfNfe(Double afNfe) {
    this.afNfe = afNfe;
  }

  public AlleleFrequency afOth(Double afOth) {
    this.afOth = afOth;
    return this;
  }

   /**
   * Get afOth
   * @return afOth
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfOth() {
    return afOth;
  }

  public void setAfOth(Double afOth) {
    this.afOth = afOth;
  }

  public AlleleFrequency afSas(Double afSas) {
    this.afSas = afSas;
    return this;
  }

   /**
   * Get afSas
   * @return afSas
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getAfSas() {
    return afSas;
  }

  public void setAfSas(Double afSas) {
    this.afSas = afSas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlleleFrequency alleleFrequency = (AlleleFrequency) o;
    return Objects.equals(this.af, alleleFrequency.af) &&
        Objects.equals(this.afAfr, alleleFrequency.afAfr) &&
        Objects.equals(this.afAmr, alleleFrequency.afAmr) &&
        Objects.equals(this.afAsj, alleleFrequency.afAsj) &&
        Objects.equals(this.afEas, alleleFrequency.afEas) &&
        Objects.equals(this.afFin, alleleFrequency.afFin) &&
        Objects.equals(this.afNfe, alleleFrequency.afNfe) &&
        Objects.equals(this.afOth, alleleFrequency.afOth) &&
        Objects.equals(this.afSas, alleleFrequency.afSas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(af, afAfr, afAmr, afAsj, afEas, afFin, afNfe, afOth, afSas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlleleFrequency {\n");
    
    sb.append("    af: ").append(toIndentedString(af)).append("\n");
    sb.append("    afAfr: ").append(toIndentedString(afAfr)).append("\n");
    sb.append("    afAmr: ").append(toIndentedString(afAmr)).append("\n");
    sb.append("    afAsj: ").append(toIndentedString(afAsj)).append("\n");
    sb.append("    afEas: ").append(toIndentedString(afEas)).append("\n");
    sb.append("    afFin: ").append(toIndentedString(afFin)).append("\n");
    sb.append("    afNfe: ").append(toIndentedString(afNfe)).append("\n");
    sb.append("    afOth: ").append(toIndentedString(afOth)).append("\n");
    sb.append("    afSas: ").append(toIndentedString(afSas)).append("\n");
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


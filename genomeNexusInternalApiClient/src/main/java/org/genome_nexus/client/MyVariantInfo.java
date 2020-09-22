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
import org.genome_nexus.client.ClinVar;
import org.genome_nexus.client.Cosmic;
import org.genome_nexus.client.Dbsnp;
import org.genome_nexus.client.Gnomad;
import org.genome_nexus.client.Mutdb;
import org.genome_nexus.client.Snpeff;
import org.genome_nexus.client.Vcf;

/**
 * MyVariantInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:48:04.268-04:00")
public class MyVariantInfo {
  @SerializedName("clinVar")
  private ClinVar clinVar = null;

  @SerializedName("cosmic")
  private Cosmic cosmic = null;

  @SerializedName("dbsnp")
  private Dbsnp dbsnp = null;

  @SerializedName("gnomadExome")
  private Gnomad gnomadExome = null;

  @SerializedName("gnomadGenome")
  private Gnomad gnomadGenome = null;

  @SerializedName("hgvs")
  private String hgvs = null;

  @SerializedName("mutdb")
  private Mutdb mutdb = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("snpeff")
  private Snpeff snpeff = null;

  @SerializedName("variant")
  private String variant = null;

  @SerializedName("vcf")
  private Vcf vcf = null;

  @SerializedName("version")
  private Integer version = null;

  public MyVariantInfo clinVar(ClinVar clinVar) {
    this.clinVar = clinVar;
    return this;
  }

   /**
   * clinvar
   * @return clinVar
  **/
  @ApiModelProperty(value = "clinvar")
  public ClinVar getClinVar() {
    return clinVar;
  }

  public void setClinVar(ClinVar clinVar) {
    this.clinVar = clinVar;
  }

  public MyVariantInfo cosmic(Cosmic cosmic) {
    this.cosmic = cosmic;
    return this;
  }

   /**
   * cosmic
   * @return cosmic
  **/
  @ApiModelProperty(value = "cosmic")
  public Cosmic getCosmic() {
    return cosmic;
  }

  public void setCosmic(Cosmic cosmic) {
    this.cosmic = cosmic;
  }

  public MyVariantInfo dbsnp(Dbsnp dbsnp) {
    this.dbsnp = dbsnp;
    return this;
  }

   /**
   * dbsnp
   * @return dbsnp
  **/
  @ApiModelProperty(value = "dbsnp")
  public Dbsnp getDbsnp() {
    return dbsnp;
  }

  public void setDbsnp(Dbsnp dbsnp) {
    this.dbsnp = dbsnp;
  }

  public MyVariantInfo gnomadExome(Gnomad gnomadExome) {
    this.gnomadExome = gnomadExome;
    return this;
  }

   /**
   * gnomad_exome
   * @return gnomadExome
  **/
  @ApiModelProperty(value = "gnomad_exome")
  public Gnomad getGnomadExome() {
    return gnomadExome;
  }

  public void setGnomadExome(Gnomad gnomadExome) {
    this.gnomadExome = gnomadExome;
  }

  public MyVariantInfo gnomadGenome(Gnomad gnomadGenome) {
    this.gnomadGenome = gnomadGenome;
    return this;
  }

   /**
   * gnomad_genome
   * @return gnomadGenome
  **/
  @ApiModelProperty(value = "gnomad_genome")
  public Gnomad getGnomadGenome() {
    return gnomadGenome;
  }

  public void setGnomadGenome(Gnomad gnomadGenome) {
    this.gnomadGenome = gnomadGenome;
  }

  public MyVariantInfo hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * hgvs
   * @return hgvs
  **/
  @ApiModelProperty(value = "hgvs")
  public String getHgvs() {
    return hgvs;
  }

  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }

  public MyVariantInfo mutdb(Mutdb mutdb) {
    this.mutdb = mutdb;
    return this;
  }

   /**
   * Get mutdb
   * @return mutdb
  **/
  @ApiModelProperty(value = "")
  public Mutdb getMutdb() {
    return mutdb;
  }

  public void setMutdb(Mutdb mutdb) {
    this.mutdb = mutdb;
  }

  public MyVariantInfo query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public MyVariantInfo snpeff(Snpeff snpeff) {
    this.snpeff = snpeff;
    return this;
  }

   /**
   * snpeff
   * @return snpeff
  **/
  @ApiModelProperty(value = "snpeff")
  public Snpeff getSnpeff() {
    return snpeff;
  }

  public void setSnpeff(Snpeff snpeff) {
    this.snpeff = snpeff;
  }

  public MyVariantInfo variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * variant
   * @return variant
  **/
  @ApiModelProperty(value = "variant")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public MyVariantInfo vcf(Vcf vcf) {
    this.vcf = vcf;
    return this;
  }

   /**
   * vcf
   * @return vcf
  **/
  @ApiModelProperty(value = "vcf")
  public Vcf getVcf() {
    return vcf;
  }

  public void setVcf(Vcf vcf) {
    this.vcf = vcf;
  }

  public MyVariantInfo version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * version
   * @return version
  **/
  @ApiModelProperty(value = "version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyVariantInfo myVariantInfo = (MyVariantInfo) o;
    return Objects.equals(this.clinVar, myVariantInfo.clinVar) &&
        Objects.equals(this.cosmic, myVariantInfo.cosmic) &&
        Objects.equals(this.dbsnp, myVariantInfo.dbsnp) &&
        Objects.equals(this.gnomadExome, myVariantInfo.gnomadExome) &&
        Objects.equals(this.gnomadGenome, myVariantInfo.gnomadGenome) &&
        Objects.equals(this.hgvs, myVariantInfo.hgvs) &&
        Objects.equals(this.mutdb, myVariantInfo.mutdb) &&
        Objects.equals(this.query, myVariantInfo.query) &&
        Objects.equals(this.snpeff, myVariantInfo.snpeff) &&
        Objects.equals(this.variant, myVariantInfo.variant) &&
        Objects.equals(this.vcf, myVariantInfo.vcf) &&
        Objects.equals(this.version, myVariantInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clinVar, cosmic, dbsnp, gnomadExome, gnomadGenome, hgvs, mutdb, query, snpeff, variant, vcf, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MyVariantInfo {\n");
    
    sb.append("    clinVar: ").append(toIndentedString(clinVar)).append("\n");
    sb.append("    cosmic: ").append(toIndentedString(cosmic)).append("\n");
    sb.append("    dbsnp: ").append(toIndentedString(dbsnp)).append("\n");
    sb.append("    gnomadExome: ").append(toIndentedString(gnomadExome)).append("\n");
    sb.append("    gnomadGenome: ").append(toIndentedString(gnomadGenome)).append("\n");
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    mutdb: ").append(toIndentedString(mutdb)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    snpeff: ").append(toIndentedString(snpeff)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    vcf: ").append(toIndentedString(vcf)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


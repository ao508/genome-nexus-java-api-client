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
 * NucleotideContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-15T14:02:07.104-04:00")
public class NucleotideContext {
  @SerializedName("hgvs")
  private String hgvs = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("molecule")
  private String molecule = null;

  @SerializedName("query")
  private String query = null;

  @SerializedName("seq")
  private String seq = null;

  public NucleotideContext hgvs(String hgvs) {
    this.hgvs = hgvs;
    return this;
  }

   /**
   * Get hgvs
   * @return hgvs
  **/
  @ApiModelProperty(value = "")
  public String getHgvs() {
    return hgvs;
  }

  public void setHgvs(String hgvs) {
    this.hgvs = hgvs;
  }

  public NucleotideContext id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NucleotideContext molecule(String molecule) {
    this.molecule = molecule;
    return this;
  }

   /**
   * Get molecule
   * @return molecule
  **/
  @ApiModelProperty(value = "")
  public String getMolecule() {
    return molecule;
  }

  public void setMolecule(String molecule) {
    this.molecule = molecule;
  }

  public NucleotideContext query(String query) {
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

  public NucleotideContext seq(String seq) {
    this.seq = seq;
    return this;
  }

   /**
   * Nucleotide context sequence
   * @return seq
  **/
  @ApiModelProperty(required = true, value = "Nucleotide context sequence")
  public String getSeq() {
    return seq;
  }

  public void setSeq(String seq) {
    this.seq = seq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NucleotideContext nucleotideContext = (NucleotideContext) o;
    return Objects.equals(this.hgvs, nucleotideContext.hgvs) &&
        Objects.equals(this.id, nucleotideContext.id) &&
        Objects.equals(this.molecule, nucleotideContext.molecule) &&
        Objects.equals(this.query, nucleotideContext.query) &&
        Objects.equals(this.seq, nucleotideContext.seq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hgvs, id, molecule, query, seq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NucleotideContext {\n");
    
    sb.append("    hgvs: ").append(toIndentedString(hgvs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    molecule: ").append(toIndentedString(molecule)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
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


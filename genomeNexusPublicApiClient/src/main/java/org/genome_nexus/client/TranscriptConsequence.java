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

/**
 * TranscriptConsequence
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T17:47:55.205-04:00")
public class TranscriptConsequence {
  @SerializedName("amino_acids")
  private String aminoAcids = null;

  @SerializedName("canonical")
  private String canonical = null;

  @SerializedName("codons")
  private String codons = null;

  @SerializedName("consequence_terms")
  private List<String> consequenceTerms = null;

  @SerializedName("exon")
  private String exon = null;

  @SerializedName("gene_id")
  private String geneId = null;

  @SerializedName("gene_symbol")
  private String geneSymbol = null;

  @SerializedName("hgnc_id")
  private String hgncId = null;

  @SerializedName("hgvsc")
  private String hgvsc = null;

  @SerializedName("hgvsg")
  private String hgvsg = null;

  @SerializedName("hgvsp")
  private String hgvsp = null;

  @SerializedName("polyphen_prediction")
  private String polyphenPrediction = null;

  @SerializedName("polyphen_score")
  private Double polyphenScore = null;

  @SerializedName("protein_end")
  private Integer proteinEnd = null;

  @SerializedName("protein_id")
  private String proteinId = null;

  @SerializedName("protein_start")
  private Integer proteinStart = null;

  @SerializedName("refseq_transcript_ids")
  private List<String> refseqTranscriptIds = null;

  @SerializedName("sift_prediction")
  private String siftPrediction = null;

  @SerializedName("sift_score")
  private Double siftScore = null;

  @SerializedName("transcript_id")
  private String transcriptId = null;

  @SerializedName("variant_allele")
  private String variantAllele = null;

  public TranscriptConsequence aminoAcids(String aminoAcids) {
    this.aminoAcids = aminoAcids;
    return this;
  }

   /**
   * Amino acids
   * @return aminoAcids
  **/
  @ApiModelProperty(value = "Amino acids")
  public String getAminoAcids() {
    return aminoAcids;
  }

  public void setAminoAcids(String aminoAcids) {
    this.aminoAcids = aminoAcids;
  }

  public TranscriptConsequence canonical(String canonical) {
    this.canonical = canonical;
    return this;
  }

   /**
   * Canonical transcript indicator
   * @return canonical
  **/
  @ApiModelProperty(value = "Canonical transcript indicator")
  public String getCanonical() {
    return canonical;
  }

  public void setCanonical(String canonical) {
    this.canonical = canonical;
  }

  public TranscriptConsequence codons(String codons) {
    this.codons = codons;
    return this;
  }

   /**
   * Codons
   * @return codons
  **/
  @ApiModelProperty(value = "Codons")
  public String getCodons() {
    return codons;
  }

  public void setCodons(String codons) {
    this.codons = codons;
  }

  public TranscriptConsequence consequenceTerms(List<String> consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
    return this;
  }

  public TranscriptConsequence addConsequenceTermsItem(String consequenceTermsItem) {
    if (this.consequenceTerms == null) {
      this.consequenceTerms = new ArrayList<String>();
    }
    this.consequenceTerms.add(consequenceTermsItem);
    return this;
  }

   /**
   * List of consequence terms
   * @return consequenceTerms
  **/
  @ApiModelProperty(value = "List of consequence terms")
  public List<String> getConsequenceTerms() {
    return consequenceTerms;
  }

  public void setConsequenceTerms(List<String> consequenceTerms) {
    this.consequenceTerms = consequenceTerms;
  }

  public TranscriptConsequence exon(String exon) {
    this.exon = exon;
    return this;
  }

   /**
   * Get exon
   * @return exon
  **/
  @ApiModelProperty(value = "")
  public String getExon() {
    return exon;
  }

  public void setExon(String exon) {
    this.exon = exon;
  }

  public TranscriptConsequence geneId(String geneId) {
    this.geneId = geneId;
    return this;
  }

   /**
   * Ensembl gene id
   * @return geneId
  **/
  @ApiModelProperty(value = "Ensembl gene id")
  public String getGeneId() {
    return geneId;
  }

  public void setGeneId(String geneId) {
    this.geneId = geneId;
  }

  public TranscriptConsequence geneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
    return this;
  }

   /**
   * Hugo gene symbol
   * @return geneSymbol
  **/
  @ApiModelProperty(value = "Hugo gene symbol")
  public String getGeneSymbol() {
    return geneSymbol;
  }

  public void setGeneSymbol(String geneSymbol) {
    this.geneSymbol = geneSymbol;
  }

  public TranscriptConsequence hgncId(String hgncId) {
    this.hgncId = hgncId;
    return this;
  }

   /**
   * HGNC id
   * @return hgncId
  **/
  @ApiModelProperty(value = "HGNC id")
  public String getHgncId() {
    return hgncId;
  }

  public void setHgncId(String hgncId) {
    this.hgncId = hgncId;
  }

  public TranscriptConsequence hgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
    return this;
  }

   /**
   * HGVSc
   * @return hgvsc
  **/
  @ApiModelProperty(value = "HGVSc")
  public String getHgvsc() {
    return hgvsc;
  }

  public void setHgvsc(String hgvsc) {
    this.hgvsc = hgvsc;
  }

  public TranscriptConsequence hgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
    return this;
  }

   /**
   * HGVSg
   * @return hgvsg
  **/
  @ApiModelProperty(value = "HGVSg")
  public String getHgvsg() {
    return hgvsg;
  }

  public void setHgvsg(String hgvsg) {
    this.hgvsg = hgvsg;
  }

  public TranscriptConsequence hgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
    return this;
  }

   /**
   * HGVSp
   * @return hgvsp
  **/
  @ApiModelProperty(value = "HGVSp")
  public String getHgvsp() {
    return hgvsp;
  }

  public void setHgvsp(String hgvsp) {
    this.hgvsp = hgvsp;
  }

  public TranscriptConsequence polyphenPrediction(String polyphenPrediction) {
    this.polyphenPrediction = polyphenPrediction;
    return this;
  }

   /**
   * Polyphen Prediction
   * @return polyphenPrediction
  **/
  @ApiModelProperty(value = "Polyphen Prediction")
  public String getPolyphenPrediction() {
    return polyphenPrediction;
  }

  public void setPolyphenPrediction(String polyphenPrediction) {
    this.polyphenPrediction = polyphenPrediction;
  }

  public TranscriptConsequence polyphenScore(Double polyphenScore) {
    this.polyphenScore = polyphenScore;
    return this;
  }

   /**
   * Polyphen Score
   * @return polyphenScore
  **/
  @ApiModelProperty(value = "Polyphen Score")
  public Double getPolyphenScore() {
    return polyphenScore;
  }

  public void setPolyphenScore(Double polyphenScore) {
    this.polyphenScore = polyphenScore;
  }

  public TranscriptConsequence proteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
    return this;
  }

   /**
   * Protein end position
   * @return proteinEnd
  **/
  @ApiModelProperty(value = "Protein end position")
  public Integer getProteinEnd() {
    return proteinEnd;
  }

  public void setProteinEnd(Integer proteinEnd) {
    this.proteinEnd = proteinEnd;
  }

  public TranscriptConsequence proteinId(String proteinId) {
    this.proteinId = proteinId;
    return this;
  }

   /**
   * Ensembl protein id
   * @return proteinId
  **/
  @ApiModelProperty(value = "Ensembl protein id")
  public String getProteinId() {
    return proteinId;
  }

  public void setProteinId(String proteinId) {
    this.proteinId = proteinId;
  }

  public TranscriptConsequence proteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
    return this;
  }

   /**
   * Protein start position
   * @return proteinStart
  **/
  @ApiModelProperty(value = "Protein start position")
  public Integer getProteinStart() {
    return proteinStart;
  }

  public void setProteinStart(Integer proteinStart) {
    this.proteinStart = proteinStart;
  }

  public TranscriptConsequence refseqTranscriptIds(List<String> refseqTranscriptIds) {
    this.refseqTranscriptIds = refseqTranscriptIds;
    return this;
  }

  public TranscriptConsequence addRefseqTranscriptIdsItem(String refseqTranscriptIdsItem) {
    if (this.refseqTranscriptIds == null) {
      this.refseqTranscriptIds = new ArrayList<String>();
    }
    this.refseqTranscriptIds.add(refseqTranscriptIdsItem);
    return this;
  }

   /**
   * List of RefSeq transcript ids
   * @return refseqTranscriptIds
  **/
  @ApiModelProperty(value = "List of RefSeq transcript ids")
  public List<String> getRefseqTranscriptIds() {
    return refseqTranscriptIds;
  }

  public void setRefseqTranscriptIds(List<String> refseqTranscriptIds) {
    this.refseqTranscriptIds = refseqTranscriptIds;
  }

  public TranscriptConsequence siftPrediction(String siftPrediction) {
    this.siftPrediction = siftPrediction;
    return this;
  }

   /**
   * Sift Prediction
   * @return siftPrediction
  **/
  @ApiModelProperty(value = "Sift Prediction")
  public String getSiftPrediction() {
    return siftPrediction;
  }

  public void setSiftPrediction(String siftPrediction) {
    this.siftPrediction = siftPrediction;
  }

  public TranscriptConsequence siftScore(Double siftScore) {
    this.siftScore = siftScore;
    return this;
  }

   /**
   * Sift Score
   * @return siftScore
  **/
  @ApiModelProperty(value = "Sift Score")
  public Double getSiftScore() {
    return siftScore;
  }

  public void setSiftScore(Double siftScore) {
    this.siftScore = siftScore;
  }

  public TranscriptConsequence transcriptId(String transcriptId) {
    this.transcriptId = transcriptId;
    return this;
  }

   /**
   * Ensembl transcript id
   * @return transcriptId
  **/
  @ApiModelProperty(required = true, value = "Ensembl transcript id")
  public String getTranscriptId() {
    return transcriptId;
  }

  public void setTranscriptId(String transcriptId) {
    this.transcriptId = transcriptId;
  }

  public TranscriptConsequence variantAllele(String variantAllele) {
    this.variantAllele = variantAllele;
    return this;
  }

   /**
   * Variant allele
   * @return variantAllele
  **/
  @ApiModelProperty(value = "Variant allele")
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
    TranscriptConsequence transcriptConsequence = (TranscriptConsequence) o;
    return Objects.equals(this.aminoAcids, transcriptConsequence.aminoAcids) &&
        Objects.equals(this.canonical, transcriptConsequence.canonical) &&
        Objects.equals(this.codons, transcriptConsequence.codons) &&
        Objects.equals(this.consequenceTerms, transcriptConsequence.consequenceTerms) &&
        Objects.equals(this.exon, transcriptConsequence.exon) &&
        Objects.equals(this.geneId, transcriptConsequence.geneId) &&
        Objects.equals(this.geneSymbol, transcriptConsequence.geneSymbol) &&
        Objects.equals(this.hgncId, transcriptConsequence.hgncId) &&
        Objects.equals(this.hgvsc, transcriptConsequence.hgvsc) &&
        Objects.equals(this.hgvsg, transcriptConsequence.hgvsg) &&
        Objects.equals(this.hgvsp, transcriptConsequence.hgvsp) &&
        Objects.equals(this.polyphenPrediction, transcriptConsequence.polyphenPrediction) &&
        Objects.equals(this.polyphenScore, transcriptConsequence.polyphenScore) &&
        Objects.equals(this.proteinEnd, transcriptConsequence.proteinEnd) &&
        Objects.equals(this.proteinId, transcriptConsequence.proteinId) &&
        Objects.equals(this.proteinStart, transcriptConsequence.proteinStart) &&
        Objects.equals(this.refseqTranscriptIds, transcriptConsequence.refseqTranscriptIds) &&
        Objects.equals(this.siftPrediction, transcriptConsequence.siftPrediction) &&
        Objects.equals(this.siftScore, transcriptConsequence.siftScore) &&
        Objects.equals(this.transcriptId, transcriptConsequence.transcriptId) &&
        Objects.equals(this.variantAllele, transcriptConsequence.variantAllele);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aminoAcids, canonical, codons, consequenceTerms, exon, geneId, geneSymbol, hgncId, hgvsc, hgvsg, hgvsp, polyphenPrediction, polyphenScore, proteinEnd, proteinId, proteinStart, refseqTranscriptIds, siftPrediction, siftScore, transcriptId, variantAllele);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptConsequence {\n");
    
    sb.append("    aminoAcids: ").append(toIndentedString(aminoAcids)).append("\n");
    sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
    sb.append("    codons: ").append(toIndentedString(codons)).append("\n");
    sb.append("    consequenceTerms: ").append(toIndentedString(consequenceTerms)).append("\n");
    sb.append("    exon: ").append(toIndentedString(exon)).append("\n");
    sb.append("    geneId: ").append(toIndentedString(geneId)).append("\n");
    sb.append("    geneSymbol: ").append(toIndentedString(geneSymbol)).append("\n");
    sb.append("    hgncId: ").append(toIndentedString(hgncId)).append("\n");
    sb.append("    hgvsc: ").append(toIndentedString(hgvsc)).append("\n");
    sb.append("    hgvsg: ").append(toIndentedString(hgvsg)).append("\n");
    sb.append("    hgvsp: ").append(toIndentedString(hgvsp)).append("\n");
    sb.append("    polyphenPrediction: ").append(toIndentedString(polyphenPrediction)).append("\n");
    sb.append("    polyphenScore: ").append(toIndentedString(polyphenScore)).append("\n");
    sb.append("    proteinEnd: ").append(toIndentedString(proteinEnd)).append("\n");
    sb.append("    proteinId: ").append(toIndentedString(proteinId)).append("\n");
    sb.append("    proteinStart: ").append(toIndentedString(proteinStart)).append("\n");
    sb.append("    refseqTranscriptIds: ").append(toIndentedString(refseqTranscriptIds)).append("\n");
    sb.append("    siftPrediction: ").append(toIndentedString(siftPrediction)).append("\n");
    sb.append("    siftScore: ").append(toIndentedString(siftScore)).append("\n");
    sb.append("    transcriptId: ").append(toIndentedString(transcriptId)).append("\n");
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


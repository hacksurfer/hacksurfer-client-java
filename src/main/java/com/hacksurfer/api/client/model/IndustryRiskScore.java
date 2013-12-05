package com.hacksurfer.api.client.model;

import javax.xml.bind.annotation.XmlElement;

public class IndustryRiskScore {

    @XmlElement(name="industry_id", nillable=true)
    private Integer industryId;
    @XmlElement(name="industry_description", nillable=true)
    private String industryDescription;
    @XmlElement(name="industry_gravity", nillable=true)
    private Integer industryGravity;
    @XmlElement(name="industry_momentum", nillable=true)
    private Float industryMomentum;
    @XmlElement(name="industry_risk", nillable=true)
    private Integer industryRisk;

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    public String getIndustryDescription() {
        return industryDescription;
    }

    public void setIndustryDescription(String industryDescription) {
        this.industryDescription = industryDescription;
    }

    public Integer getIndustryGravity() {
        return industryGravity;
    }

    public void setIndustryGravity(Integer industryGravity) {
        this.industryGravity = industryGravity;
    }

    public Float getIndustryMomentum() {
        return industryMomentum;
    }

    public void setIndustryMomentum(Float industryMomentum) {
        this.industryMomentum = industryMomentum;
    }

    public Integer getIndustryRisk() {
        return industryRisk;
    }

    public void setIndustryRisk(Integer industryRisk) {
        this.industryRisk = industryRisk;
    }

}

/**
 *
 * Copyright © 2013 Hacksurfer, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this Hacksurfer API client side source code and associated documentation
 * files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights, without royalty or payment
 * requirement, to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons
 * to whom the Software is furnished to do so, provided that by doing so,
 * the user/distributor thereof agrees to the following conditions:
 *
 * Use of the Application Program Interface with which the Software is
 * associated is subject to the terms and conditions of the API License,
 * which is linked here https://hacksurfer.3scale.net/termsofservice
 * and incorporated herein by reference.
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies and derivatives or substantial distributions of portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS” WITHOUT WARRANTY OF ANY KIND.
 * HACKSURFER DISCLAIMS ALL WARRANTIES, WHETHER EXPRESS, IMPLIED OR STATUTORY,
 * REGARDING THE SOFTWARE  INCLUDING WITHOUT LIMITATION ANY AND ALL IMPLIED
 * WARRANTIES OF MERCHANTABILITY, ACCURACY, RESULTS OF USE, RELIABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, TITLE, INTERFERENCE WITH QUIET ENJOYMENT,
 * NON-INFRINGEMENT OF THIRD-PARTY RIGHTS, ANY WARRANTIES OR CONDITIONS ARISING
 * OUT OF COURSE OF DEALING OR USAGE OF TRADE, AND ANY IMPLIED WARRANTIES
 * ARISING UNDER ANY UNIFORM COMPUTER INFORMATION TRANSACTIONS ACT. THERE IS
 * NO WARRANTY THAT THE SOFTWARE OR ANY INFORMATION, SOFTWARE, COMPUTER PROGRAM,
 * SERVICES, EFFORTS, OR ANY SERVICE OR FUNCTIONALITY PROVIDED BY THE SOFTWARE
 * WILL FULFILL ANY PARTICULAR PURPOSES OR NEEDS OF THE USER THEREOF OR ANY
 * AFFILIATED PERSON TO THE USER THEREOF. FURTHER, HACKSURFER DISCLAIMS ANY
 * WARRANTY THAT USE OF THE SOFTWARE WILL MEET ANY OR ALL OF THE REQUIREMENTS
 * OF THE USER THEREOF OR THAT SUCH USE WILL BE UNINTERRUPTED, ERROR-FREE,
 * VIRUS-FREE, OR SECURE.
 */
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

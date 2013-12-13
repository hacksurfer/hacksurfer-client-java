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
package com.hacksurfer.api.client;

import com.hacksurfer.api.client.model.IndustryRiskScore;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunIndustryRiskScoreExample {

    private static final String API_BASE_URL = "http://api.hacksurfer.com/v1";
    private static final String IRS_YESTERDAY_RESOURCE_PATH = "/industryRiskScores/yesterday";
    private static final Logger LOG = LoggerFactory.getLogger(RunIndustryRiskScoreExample.class);

    public static void main( String args[] ) throws Exception {
        
        LOG.info( "Running example HTTP GET against HackSurfer Industry Risk Scores /yesterday resource." );
        
        SimpleRestClient client = new SimpleRestClient();
        String response = client.httpGet( API_BASE_URL, IRS_YESTERDAY_RESOURCE_PATH );
        
        // print response
        LOG.info( "Response from /yesterday resource : {}", response );
        
        
        // do something useful with it
        GsonBuilder gb = new GsonBuilder();
        gb.setFieldNamingPolicy( FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES );
        Gson gson = gb.create();
        
        List<IndustryRiskScore> scores = gson.fromJson( response, new TypeToken<List<IndustryRiskScore>>(){}.getType() );
        LOG.info( "Found {} industry risk scores from yesterday.", scores.size() );
        for( IndustryRiskScore irs : scores ) {
            StringBuilder sb = new StringBuilder();
            sb.append( System.lineSeparator() );
            sb.append( "Industry : " );
            sb.append( irs.getIndustryDescription() );
            sb.append( System.lineSeparator() );
            sb.append( "  id : " );
            sb.append( irs.getIndustryId() );
            sb.append( System.lineSeparator() );
            sb.append( "  risk : " );
            sb.append( irs.getIndustryGravity() );
            sb.append( System.lineSeparator() );
            sb.append( "  gravity : " );
            sb.append( irs.getIndustryRisk() );
            sb.append( System.lineSeparator() );
            sb.append( "  momentum : " );
            sb.append( irs.getIndustryMomentum() );
            sb.append( System.lineSeparator() );
            
            System.out.println( sb.toString() );
        }
        
        LOG.info( "Well that was fun!" );
        
    }
}

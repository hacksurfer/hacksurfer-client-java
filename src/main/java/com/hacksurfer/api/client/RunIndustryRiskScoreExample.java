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

    private static final String API_BASE_URL = "http://api.hacksurfer.com/v0";
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

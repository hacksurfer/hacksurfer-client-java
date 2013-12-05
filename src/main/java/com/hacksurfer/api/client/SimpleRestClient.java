package com.hacksurfer.api.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleRestClient {

    private static final Logger LOG = LoggerFactory.getLogger(SimpleRestClient.class);

    public String httpGet( String host, String resourcePath ) {
                    
        Client restClient = ClientBuilder.newClient();  
        
        WebTarget target = restClient.target( host );  
        WebTarget resourceTarget = target.path( resourcePath );
            
        String response = resourceTarget
                .request( MediaType.APPLICATION_JSON )
                .get( String.class );
        
        return response;
    }
    
}

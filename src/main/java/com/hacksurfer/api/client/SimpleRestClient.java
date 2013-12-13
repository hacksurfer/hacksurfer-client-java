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

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleRestClient {

    private static final String ACCEPT = "accept";
    private static final String APP_ID = "app_id";
    private static final String APP_KEY = "app_key";
    private static final Logger LOG = LoggerFactory.getLogger(SimpleRestClient.class);

    public String httpGet( String host, String resourcePath ) {
                    
        Client restClient = ClientBuilder.newClient();  
        
        WebTarget target = restClient.target( host );  
        WebTarget resourceTarget = target.path( resourcePath );
        
        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        headers.add( ACCEPT, MediaType.APPLICATION_JSON);
        // replace string values with your app_id and app_key
        headers.add( APP_ID, "your app id" );
        headers.add( APP_KEY, "your app key" );
        
        LOG.info( "Request : GET, url : {}", host + resourcePath );
        String response = resourceTarget
                .request( MediaType.APPLICATION_JSON )
                .headers( headers )
                .get( String.class );
        
        return response;
    }
    
}

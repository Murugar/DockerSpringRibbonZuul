package com.iqmsoft.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.iqmsoft.rest.resource.HelloWorldResource;

@ApplicationPath(RestApplication.PATH)
@Component
public class RestApplication extends ResourceConfig {

    public static final String PATH = "/helloworld-service/rest";

    public RestApplication() {
        register(HelloWorldResource.class);
    }

}

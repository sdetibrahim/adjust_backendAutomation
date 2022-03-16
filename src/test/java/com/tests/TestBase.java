package com.tests;

import com.utilities.ReadProperties;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class TestBase {
    /**
     * <<<MANAGE THE ENVIRONMENT AND USER HERE>>>
     * To change environment need to change BASEURI; like test, staging, hotfix, prod
     *
     */
    public static String BASEURI =ReadProperties.getProperty("baseUrl");


    public RequestSpecification spec() {
        RequestSpecification spec = given().log().all()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON);
        return spec;
    }





}

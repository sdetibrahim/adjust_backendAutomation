package com.apiServices;

import com.tests.TestBase;
import com.utilities.Helpers;
import io.restassured.response.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class PetService extends TestBase{

    Helpers helpers=new Helpers();
    Response response;
    public static long petid;


        public Response CreatePetandGetId() throws IOException, ParseException {
            response = spec().log().all()
                    .body(helpers.readJsonFileMethod())
                    .when().post(BASEURI+"/pet/")
                    .then().log().all().extract().response();

            petid = response.path("id");
            return response;
        }

    public Response CallPetId(long petid){
        Response response=spec().log().all()
                .when()
                .get(BASEURI+"/pet/"+petid)
                .then().log().all().extract().response();
        return response;
    }

    public Response DeletePet(long petid){
        Response response=spec().log().all()
                .when()
                .delete(BASEURI+"/pet/"+petid)
                .then().log().all().extract().response();
        return response;
    }






}


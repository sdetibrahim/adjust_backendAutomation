package com.tests;

import com.apiServices.PetService;
import io.restassured.response.Response;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CallPetTest {

    PetService petService=new PetService();
    Response response;

    @DisplayName("Create Pet and extract Id ")
    @Test
    @Tag("smoke")

    public void CreatePetandGetIdTest() throws IOException, ParseException {
        response= petService.CreatePetandGetId();
        response=petService.CallPetId(PetService.petid);
        Assertions.assertTrue(response.statusCode() == 200);
    }

}

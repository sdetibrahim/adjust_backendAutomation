package com.tests;

import com.apiServices.PetService;
import io.restassured.response.Response;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DeletePetTest {

    PetService petService=new PetService();
    Response response;

    @DisplayName("Delete Pet ")
    @Test
    @Tag("smoke")

    public void DeletePetTest1() throws IOException, ParseException {
        response= petService.CreatePetandGetId();
        response=petService.DeletePet(PetService.petid);
        Assertions.assertTrue(response.statusCode() == 200);
    }

}

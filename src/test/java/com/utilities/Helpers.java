package com.utilities;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.io.FileReader;
import java.io.IOException;

public class Helpers {

    public JSONObject readJsonFileMethod() throws IOException, ParseException {

        JSONParser jsonParser=new JSONParser();
        FileReader reader=new FileReader("Pet.json");

        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject= (JSONObject) obj;
        return  jsonObject;

    }

}

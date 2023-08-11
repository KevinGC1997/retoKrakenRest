package io.swagger.petstore.test.steps;

import com.sqasa.rest.demo.utils.KrakenRest;
import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;
import java.util.Map;

import static io.swagger.petstore.test.utils.globalVarible.*;

public class CreateUserSteps {



    public void sendRequest(String url, Map<String, String> body){
        Map<String, String> headers = new HashMap<>();
        headers.put(headerName,headerValue);

        KrakenRest.inicializarRequest();
        KrakenRest.configurarCuerpo(body);
        KrakenRest.configurarHeaders(headers);
        KrakenRest.hacerPost(url);
    }

    public void validateStatus(int status){
        KrakenRest.compararStatus(status);
    }

    public void validateStructure(String pathStructure){
        KrakenRest.comparacionDeEstructurasREST(pathStructure, SerenityRest.lastResponse().asString());
    }

    public void validateType(String typeKey, String expectedType){
        KrakenRest.compararLlave(typeKey, expectedType);
    }

    public void validateMessage(String messageKey, String expectedMessage){
        KrakenRest.compararLlave(messageKey, expectedMessage);
    }
}

package org.example;

import static org.junit.jupiter.api.Assertions.*;

class HandlerClassTest {
    @org.junit.jupiter.api.Test
    void handleRequest() {
        HandlerClass handler = new HandlerClass();
        RequestClass request = new RequestClass();
        TestContext context = new TestContext();
        request.nome = "Vinicius";
        String response = handler.handleRequest(request, conassertEquals("{ \"numberOfCharacters\" : 8}", response);
    }
}
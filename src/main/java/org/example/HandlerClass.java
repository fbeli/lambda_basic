package org.example;

import com.amazonaws.lambda.thirdparty.org.json.JSONObject;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HandlerClass implements RequestHandler<RequestClass, String>{


    public String handleRequest(RequestClass request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Request:: " + request.toString());

        var json = new JSONObject(request);
        logger.log("Request with Body:: " + json.toString());

        ResponseClass response = new ResponseClass();
        response.numberOfCharacters = request.nome.length();
        logger.log("Response:: " + response.numberOfCharacters);
        return response.toString();
    }

}

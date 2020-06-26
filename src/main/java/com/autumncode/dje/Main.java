package com.autumncode.dje;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        var sample = new Request(1, 1, 1, 1, List.of(
                new CustomerSummaryRegistration(
                        "foo",
                        "bar",
                        "baz",
                        "quux",
                        "quorgle")
        ));
        System.out.println(new ObjectMapper()
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(sample));

        try(InputStream inputStream=Main.class.getResourceAsStream("/request.json")) {
            Request request=new ObjectMapper().readValue(inputStream, Request.class);
            System.out.println(request);
        }
    }
}

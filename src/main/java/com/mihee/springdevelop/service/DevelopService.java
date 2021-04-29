package com.mihee.springdevelop.service;

import org.springframework.http.HttpRequest;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.io.Writer;

public class DevelopService {
    public void service(HttpRequest req, HttpResponse res) throws IOException {
        System.out.println(res);

//        Writer writer = res.getWriter();
//        writer.write("Hello, ");
//        writer.write(req.getParameter("name"));
    }
}

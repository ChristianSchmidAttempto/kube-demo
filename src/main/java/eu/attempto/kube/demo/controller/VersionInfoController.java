package eu.attempto.kube.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionInfoController {
    private static final String template = "Hello, %s! this is version 1.0.0";

    @RequestMapping("/version")
    public String version(
            @RequestParam(value="name", defaultValue="unknown user") String name) {
        return  String.format(template, name);
    }
}

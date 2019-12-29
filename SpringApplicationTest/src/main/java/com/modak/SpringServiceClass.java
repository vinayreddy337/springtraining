package com.modak;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestController
public class SpringServiceClass {
    SpringServiceClass() {
        System.out.println("service class");
    }

    @CrossOrigin
    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = {"text/plain", "application/json", "application/javascript", "application/octet-stream"}, consumes = {"text/plain", "application/json"})
    public ResponseEntity<String> m1A(@RequestParam String key, @RequestBody String payload, HttpServletRequest req, HttpServletResponse res) {
        System.out.println(req.getHeaders(payload));
        System.out.println(key);

        System.out.println(payload);
        System.out.println("m1-a");
        System.out.println(ResponseEntity.status(HttpStatus.OK).header("accepted").body("m1a"));
        return ResponseEntity.status(HttpStatus.OK).body("m1a");
    }
}

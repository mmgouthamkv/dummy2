package com.example.serviceb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ServiceBController {
   @Autowired
   private RestTemplate restTemplate;
   @GetMapping("/service-b")
   public String callServiceA() {
       // Call to ServiceA
       String url = "http://localhost:8080/service-a";
       ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
       System.out.println("hello");
       return "Response from ServiceA: " + response.getBody();
   }
}

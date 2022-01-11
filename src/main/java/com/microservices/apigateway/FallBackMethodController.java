package com.microservices.apigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/ticketServiceFallBack")
    public String ticketServiceFallBackMethod(){
        return "Ticket Service is taking longer than expected. Please try again later";
    }

    @GetMapping("/autorizacionapuestasServiceFallBack")
    public String autorizacionapuestasServiceFallBackMethod(){
        return "Autorizacionapuestas Service is taking longer than expected. Please try again later";
    }
}

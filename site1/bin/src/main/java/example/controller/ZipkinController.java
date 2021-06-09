package example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ZipkinController{

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    Sampler defaultSampler() {
    	return Sampler.ALWAYS_SAMPLE;
    }

    private static Logger log = LoggerFactory.getLogger(ZipkinController.class);

    @GetMapping(value="/")
    public String zipkinService1()
    {
        log.info("Inside site1");

         return (String) restTemplate.exchange("http://site2:8081/",
                        HttpMethod.GET, null
                        , new ParameterizedTypeReference<String>() {}).getBody();
    }
}

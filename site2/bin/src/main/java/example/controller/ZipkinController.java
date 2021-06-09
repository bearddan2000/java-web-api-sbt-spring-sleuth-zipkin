package example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import brave.sampler.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipkinController{

    @Bean
    Sampler defaultSampler() {
    	return Sampler.ALWAYS_SAMPLE;
    }

    private static Logger log = LoggerFactory.getLogger(ZipkinController.class);

    @GetMapping(value="/")
    public String zipkinService1()
    {
        log.info("Inside site2");

         return "Hello\n";
    }
}

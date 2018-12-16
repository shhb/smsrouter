package com.rmj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Controller
@RequestMapping("/api")
public class CheckController {
 

	 @RequestMapping(value = "/status/", method = RequestMethod.GET) 
	    public @ResponseBody String getStatus() {
	    	try {
	     		   return "Hello World";
	 		  } catch (Exception e) {
	 		   	   return "Error" ;
	 		  }
	    }

    @RequestMapping(value = "/sendmsg/{sid}/{token}/{number}", method = RequestMethod.GET) 
    public @ResponseBody String sendsms(@PathVariable String sid, @PathVariable String token, @PathVariable String number) {
    	try {
    		Twilio.init(sid, token);
    		Message message = Message.creator(
    		    new PhoneNumber("+12225559999"),
    		    new PhoneNumber(number),
    		    "Sample Twilio SMS using Java")
    		.create();
     		   return "Hello SMS";
 		  } catch (Exception e) {
 		   	   return "Error" ;
 		  }
    }
    

}
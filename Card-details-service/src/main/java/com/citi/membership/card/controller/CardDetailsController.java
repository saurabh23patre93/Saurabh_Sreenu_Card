/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply.  
 * 
 * 
 */
package com.citi.membership.card.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.membership.card.model.CardDetails;
import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

/**
 * @author    ::asus
 * @Date      ::May 3, 2021
 * Description::
 */
@RestController
@RequestMapping(value = "/v1")
public class CardDetailsController {

	@RequestMapping(value = "/cards/{cardNum}",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public List<String> getCards(@PathVariable("cardNum") String cardNum,
			@RequestHeader(name="clientId",required = true) String clientId,
			@RequestHeader(name="requestId",required = true) String requestId,
			@RequestHeader(name="msgTs",required = true) String msgIs){

		//1.Get the request from consumer
		//2.Validate the reqeust
		//3.Prepare the request for service
		//4.Call service and get the service response
		//5.Handler the exception if any comes from service class
		//6.Prepare the controller response

		return null;
	}

	@RequestMapping(value ="/carddetails/{cardNum}",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public CardDetailsResponse getCardsDetails(@PathVariable("cardNum") String cardNum,
			@RequestHeader(name="clientId",required = true) String clientId,
			@RequestHeader(name="requestId",required = true) String requestId,
			@RequestHeader(name="msgTs",required = true) String msgIs){
		/*For Postman request uri
		 * http://localhost:8081/Card-details-service-war/v1/carddetails/0521140058239101
		 * clientId:456
		 * requestId:web
		 * msgTs:safa
		 * 
		 */
		System.out.println("CardDetailsController.getCardsDetails()");
		//1.Get the request from consumer
		//2.Validate the reqeust
		//3.Prepare the request for service
		//4.Call service and get the service response
		//5.Handler the exception if any comes from service class
		//6.Prepare the controller response
		List<CardDetails> cardDetailsList=new ArrayList<CardDetails>();
		CardDetails cardDetails1=new CardDetails();
		cardDetails1.setCardNum("0521140058239101");
		cardDetails1.setPrimary(true);
		cardDetails1.setPastDue(false);
		cardDetails1.setFname("sreenu");
		cardDetails1.setLname("tech");
		cardDetails1.setProductType("pa");
		cardDetails1.setStatus("active");

		CardDetails cardDetails2 = new CardDetails();
		cardDetails2.setCardNum("0521140058230022");
		cardDetails2.setPrimary(false);
		cardDetails2.setPastDue(false);
		cardDetails2.setFname("sreenu");
		cardDetails2.setLname("tech");
		cardDetails2.setProductType("pa");
		cardDetails2.setStatus("active");

		CardDetails cardDetails3  = new CardDetails();
		cardDetails3.setCardNum("0521140058230023");
		cardDetails3.setPrimary(false);
		cardDetails3.setPastDue(false);
		cardDetails3.setFname("sreenu");
		cardDetails3.setLname("tech");
		cardDetails3.setProductType("pa");
		cardDetails3.setStatus("active");


		cardDetailsList.add(cardDetails3);
		cardDetailsList.add(cardDetails2);
		cardDetailsList.add(cardDetails3);

		CardDetailsResponse cardDetailsResponse=new CardDetailsResponse();
		cardDetailsResponse.setCardDetails(cardDetailsList);
		
		return cardDetailsResponse;
	}

	@RequestMapping(value = "/allcards/{cardNum}",method = RequestMethod.POST,produces = "application/json",consumes = "application/json")
	@ResponseBody
	public CardDetailsResponse getAllCardsDetails(@RequestBody CardDetailsRequest cardDetailsRequest,
			@RequestHeader(name="clientId",required = true) String clientId,
			@RequestHeader(name="requestId",required = true) String requestId,
			@RequestHeader(name="msgTs",required = true) String msgIs){

		//1.Get the request from consumer
		//2.Validate the reqeust
		//3.Prepare the request for service
		//4.Call service and get the service response
		//5.Handler the exception if any comes from service class
		//6.Prepare the controller response

		return null;
	}

	@RequestMapping(value = "/health",method = RequestMethod.GET)
	@ResponseBody
	public String healthCheck() {
		System.out.println("CardDetailsController.healthCheck()");
		return "Service is up and running";
	}
}

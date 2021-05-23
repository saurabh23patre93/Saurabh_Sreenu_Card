/**@Copyright 2021. All rights are reserved,you should disclose the infromation,otherwise terms and conditions will apply. 
 *
 * 
 * 
 */
package com.citi.membership.card.cofiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author     ::asus
 * @Date       ::@May 19, 2021
 * @Description::CardDetailsConfiguration.java
 * @Tags       ::
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="com.citi.membership.card.controller")
public class CardDetailsConfiguration {

}

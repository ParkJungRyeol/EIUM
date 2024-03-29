package com.myspring.pro27;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * Handles requests for the application home page.
 */
/*
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
}
*/


@Controller
public class HomeController {
	@Autowired 
	SessionLocaleResolver localeResolver; 
	@Autowired 
	MessageSource messageSource;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "main";
	}
	@RequestMapping(value = "/p0001.do", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		
		return "p0001";
	}


	@RequestMapping(value = "/Login.do", method =  RequestMethod.GET)
	public String Loginform( Locale locale,HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		// RequestMapingHandler로 부터 받은 Locale 객체를 출력해 봅니다. 
		logger.info("Welcome i18n! The client locale is {}.", locale); 
		// localeResolver 로부터 Locale 을 출력해 봅니다. 
		logger.info("Session locale is {}.", localeResolver.resolveLocale(request));
		logger.info("site.count : {}", messageSource.getMessage("login", new String[] {"첫번째"}, "default text", locale)); 
		logger.info("not.exist : {}", messageSource.getMessage("findId", null, "default text", locale)); 
		//logger.info("not.exist 기본값 없음 : {}", messageSource.getMessage("not.exist", null, locale));


		
		return "Login";
	}
	
	@RequestMapping(value = "/departure.do", method =  RequestMethod.GET)
	public String departure(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "departure";
	}
	
}


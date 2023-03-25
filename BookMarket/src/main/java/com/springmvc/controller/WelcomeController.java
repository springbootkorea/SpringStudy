package com.springmvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("")
public class WelcomeController {

	@GetMapping("/home" )
	public ModelAndView home(Locale locale, Model model) {
		log.info("Welcome home! The client locale is {}.", locale);
		ModelAndView mv = new ModelAndView();
		model.addAttribute( "greeting", "도서몰 방문을 환영합니다." );
		mv.setViewName( "home" );
		return mv;
	}
	
}

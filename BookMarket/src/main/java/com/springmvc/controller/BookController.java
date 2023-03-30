package com.springmvc.controller;

import com.springmvc.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/books")
public class BookController {

	private final BookService bookService;


	@GetMapping( "/list")
	public ModelAndView getBookList() {
		ModelAndView mv = new ModelAndView();
		mv.addObject( "bookList", bookService.getAllBookList() );
		mv.setViewName( "/books/list" );
		log.info( "한글" );
		return mv;
	}
}

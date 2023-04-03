package com.springmvc.service;

import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

	private final BookRepository bookRepository;

	private final RestTemplate restTemplate;

	public List<Book> getAllBookList() {
		Book book = new Book();
		book.setBookId( "ISBN1234" );
		book.setAuthor("박용준");
		book.setUnitsInStock( 1000 );
		book.setReleaseDate( "2020-05-29" );
		book.setCategory( "IT전문서" );
		book.setPublisher( "길벗" );
		book.setDescription( "샘플입니다.1" );
		bookRepository.addBook( book );
		return bookRepository.getAllBookList();
	}
}

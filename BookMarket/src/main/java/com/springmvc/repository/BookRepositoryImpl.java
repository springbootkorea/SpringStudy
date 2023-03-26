package com.springmvc.repository;

import com.springmvc.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl implements BookRepository {

	private List<Book> listOfBooks = new ArrayList<Book>();

	public void addBook( Book book ) {
		listOfBooks.add( book );
	}

	@Override
	public List<Book> getAllBookList() {
		return listOfBooks;
	}
}

package com.springmvc.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults ( level = AccessLevel.PRIVATE )
public class Book {

	String bookId;

	String name;

	int unitPrice;

	String author;

	String description;

	String publisher;

	String category;

	long unitsInStock;

	String releaseDate;

	String condition;
}

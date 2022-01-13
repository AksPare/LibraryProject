package com.associates.Library.requests;

import com.associates.Library.models.Book;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class BookCreateRequest {
	
	private String name;
	private int cost;
	
	private String authorName;
	 
	public Book toBook() {
		return Book.builder()
				.cost(cost)
				.name(name)
				.isAvailable(true)
				.build();
	}

}

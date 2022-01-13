package com.associates.Library.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String country;
	private int age;
	
	@Column(unique = true, nullable = false )
	private String contact;
	
	@CreationTimestamp
	private Date registerdOn;
	
	@OneToMany
	private List<Book>  books;
	
	@OneToMany
	private List<Transactions> transaction;
	private int totalFine;
	
}

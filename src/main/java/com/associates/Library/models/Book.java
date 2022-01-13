package com.associates.Library.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;

@JoinColumn
@ManyToOne
private Author Author;


@JoinColumn
@ManyToOne
private Student student;

private String publisher;
private int cost;
private boolean isAvailable;

@CreationTimestamp
private Date addedOn;

	
}

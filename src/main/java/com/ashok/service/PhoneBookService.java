package com.ashok.service;

import java.util.List;

import com.ashok.entity.PhoneBook;

public interface PhoneBookService {
	
	public String savePhoneBook(PhoneBook book);
	public List<PhoneBook> getAllPhoneBook();
	public PhoneBook getPhoneBookById(Integer PhoneBookId);
	public String updatePhoneBook(PhoneBook book);
	public String deletePhoneBook(Integer phonebookId);
	

}

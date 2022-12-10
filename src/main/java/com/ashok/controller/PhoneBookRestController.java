package com.ashok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.entity.PhoneBook;
import com.ashok.service.PhoneBookService;

@RestController
public class PhoneBookRestController {
	@Autowired
	private PhoneBookService service;
	
	@PostMapping("/phonebook")
	public ResponseEntity<String>addPhoneBook(@RequestBody PhoneBook book){
		String msg =service.savePhoneBook(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	@GetMapping("/phonebooks")
	public ResponseEntity<List<PhoneBook>>getAllPhoneBook(){
		List<PhoneBook> allPhoneBook = service.getAllPhoneBook();
		return new ResponseEntity<>(allPhoneBook,HttpStatus.OK);
	}
	@PutMapping("/phonebook")
	public ResponseEntity<String> updatePhoneBook(@RequestBody PhoneBook book){
		String msg = service.updatePhoneBook(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}
	@GetMapping("/phoneBook/{phonebookId")
	public ResponseEntity<PhoneBook> getPhoneBookById( Integer PhoneBookId ){
		PhoneBook msg = service.getPhoneBookById(PhoneBookId);
		return new ResponseEntity<PhoneBook>(msg,HttpStatus.OK);
		
	}
	@DeleteMapping("/phoneBook/{phonebookId")
	public ResponseEntity<String>deletePhoneBook(Integer phonebookId){
		String msg = service.deletePhoneBook(phonebookId);
		return new ResponseEntity<>(msg,HttpStatus.OK);
		
	}	


}

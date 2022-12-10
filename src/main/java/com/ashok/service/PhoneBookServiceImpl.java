package com.ashok.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashok.entity.PhoneBook;
import com.ashok.repo.PhoneBookRepository;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {
	
	 @Autowired
	 PhoneBookRepository repository;
	 

	public String savePhoneBook(PhoneBook book) {
	   book = repository.save(book);
	   if (book.getContactId() !=null) {
		   return "PhoneBook saved";
	   }else {
		return "PhoneBook Failed to saved";
		 
	}
	}


	public List<PhoneBook> getAllPhoneBook() {
		return repository.findAll();
	}

	
	public String updatePhoneBook(PhoneBook book) {
		PhoneBook save =  repository.save(book);
		 if(book.getContactId()!=null ) {
			 return "Record inserted";
		 }
		 return "Record updated";
	}


	public String deletePhoneBook(Integer phonebookId) {
		if(repository.existsById(phonebookId)) {
			repository.deleteById(phonebookId);
			return "Record Deleted";
		}
		return "No Record Found";
		 
	}

	@Override
	public PhoneBook getPhoneBookById(Integer PhoneBookId) {
		Optional<PhoneBook> findById = repository.findById(PhoneBookId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}



	
	
	

}

package com.ashok.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashok.entity.PhoneBook;
@Repository
public interface PhoneBookRepository extends JpaRepository<PhoneBook, Serializable>{

	

}

//addressRepo.java
package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.address;
public interface addressrepo extends JpaRepository<address, Integer>{

}
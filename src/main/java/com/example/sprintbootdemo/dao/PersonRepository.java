package com.example.sprintbootdemo.dao;

import com.example.sprintbootdemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer>{
}

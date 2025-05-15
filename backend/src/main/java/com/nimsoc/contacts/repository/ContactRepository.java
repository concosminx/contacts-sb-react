package com.nimsoc.contacts.repository;

import com.nimsoc.contacts.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
  Optional<Contact> findById(String id);
}

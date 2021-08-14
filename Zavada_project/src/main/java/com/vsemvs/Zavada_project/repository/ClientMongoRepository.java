package com.vsemvs.Zavada_project.repository;

import com.vsemvs.Zavada_project.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/*
  @author   Vlad Zavada
  @project   Zavada_project
  @class  ClientMongoRepository
  @version  1.0.0 
  @since 7/30/2021 - 15.30
*/
public interface ClientMongoRepository extends MongoRepository<Client, String> {
    List<Client> findByName(String name);
}


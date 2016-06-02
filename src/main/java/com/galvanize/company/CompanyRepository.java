package com.galvanize.company;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by localadmin on 6/2/16.
 */
public interface CompanyRepository extends MongoRepository<Company, String> {
}

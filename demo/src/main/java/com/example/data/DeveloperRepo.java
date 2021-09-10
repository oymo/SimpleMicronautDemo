package com.example.data;

import com.example.model.Developer;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

@Repository("default")
@JdbcRepository(dialect = Dialect.POSTGRES)
public interface DeveloperRepo extends CrudRepository<Developer, Integer> {
}

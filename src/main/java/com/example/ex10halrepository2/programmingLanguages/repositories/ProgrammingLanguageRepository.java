package com.example.ex10halrepository2.programmingLanguages.repositories;

import com.example.ex10halrepository2.programmingLanguages.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-language", collectionResourceDescription = @Description("Repository for ProgrammingLanguage"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}

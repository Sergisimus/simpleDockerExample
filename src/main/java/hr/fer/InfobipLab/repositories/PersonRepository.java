package hr.fer.InfobipLab.repositories;

import hr.fer.InfobipLab.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository  extends JpaRepository<Person, Long> {
}

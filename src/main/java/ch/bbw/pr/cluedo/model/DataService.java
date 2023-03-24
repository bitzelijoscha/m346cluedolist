package ch.bbw.pr.cluedo.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * PunchListService
 *
 * @author bbwpr
 * @version 29.08.2022
 */
@Service
public class DataService {
   private List<Person> persons = List.of(
         new Person("Mustard", "Colonel"),
         new Person("Scarlett", "Miss")
   );

   public List<Person> getPersons() {
      return persons;
   }
}

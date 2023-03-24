package ch.bbw.pr.cluedo.model;

/**
 * A Person
 * @author Peter Rutschmann
 * @version 29.08.2022
 */
public class Person {
   private String name;
   private String formOfAdress;

   public Person(String name, String formOfAdress) {
      this.name = name;
      this.formOfAdress = formOfAdress;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getFormOfAdress() {
      return formOfAdress;
   }

   public void setFormOfAdress(String formOfAdress) {
      this.formOfAdress = formOfAdress;
   }

   @Override
   public String toString() {
      return "Person{" +
            "name='" + name + '\'' +
            ", formOfAdress='" + formOfAdress + '\'' +
            '}';
   }
}

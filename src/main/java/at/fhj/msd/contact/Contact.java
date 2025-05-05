package at.fhj.msd.contact;

public class Contact {
      protected String firstname;
      protected String lastname;

      public Contact(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
      }

      @Override
      public String toString() {
            return this.lastname +", " + this.firstname ;
      }

      public String getFirstname() {
            return firstname;
      }

      public String getLastname() {
            return lastname;
      }

}

package at.fhj.msd.contact;

import at.fhj.msd.adress.Address;

public class ContactWithAddress extends Contact {
      private final Address address;

      public ContactWithAddress(String firstname, String lastname, Address address) {
            super(firstname, lastname);
            this.address = address;
      }

      @Override
      public String toString() {
            return this.lastname +", " + this.firstname +", " + this.address + "\n" ;
      }
}

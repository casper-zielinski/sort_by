package at.fhj.msd.adress;

public class Address {
      private final String street;
      private final String place;
      private final int zipCode;

      public Address(String street, String place, int zipCode) {
            this.street = street;
            this.place = place;
            this.zipCode = zipCode;
      }

      @Override
      public String toString() {
            return this.street +", " + this.place +", " + this.zipCode ;
      }

      public String getStreet() {
            return street;
      }

      public String getPlace() {
            return place;
      }

      public int getZipCode() {
            return zipCode;
      }

}

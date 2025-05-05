package at.fhj.msd.contact;

import java.util.Comparator;

public class ContactByHouseNumberComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact o1, Contact o2) {
        Contact ctest = new Contact("test", "class");
        if (o1.getClass() == ctest.getClass() && o2.getClass() == ctest.getClass()) {
                  return o1.getFirstname().compareTo(o2.getFirstname());
            }
            if (o1.getClass() == ctest.getClass() && !(o2.getClass() == ctest.getClass())) {
                  return 1;
            }
            if (!(o1.getClass() == ctest.getClass()) && o2.getClass() == ctest.getClass()) {
                  return -1;
            }
            else 
            {
                  ContactWithAddress c1 = (ContactWithAddress) o1;
                  ContactWithAddress c2 = (ContactWithAddress) o2;
                  if (c1 == null || c2 == null) {
                        throw new NullPointerException("Contact is null");
                  }
                  
                  String[] address1 = c1.getAddress().getStreet().split(" ");
                  String[] address2 = c2.getAddress().getStreet().split(" ");
                  if (address1.length < 2 || address2.length < 2) {
                        throw new IllegalArgumentException("Invalid address format");
                  }
                  String houseNumber1 = address1[1];
                  String houseNumber2 = address2[1];

                  int number1 = Integer.parseInt(houseNumber1);
                  int number2 = Integer.parseInt(houseNumber2);
                  return Integer.compare(number1, number2);

            }
    }

}

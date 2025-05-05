package at.fhj.msd.contact;

import java.util.Comparator;

public class ContactByStreetComparator implements Comparator<Contact> {

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
            else {
                  ContactWithAddress c1 = (ContactWithAddress) o1;
                  ContactWithAddress c2 = (ContactWithAddress) o2;
                  if (c1 == null || c2 == null) {
                        throw new NullPointerException("Contact is null");
                  }
                  return c1.getAddress().getStreet().compareTo(c2.getAddress().getStreet());
            }
            
      }

}

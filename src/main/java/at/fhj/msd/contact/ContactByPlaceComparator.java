package at.fhj.msd.contact;

import java.util.Comparator;

public class ContactByPlaceComparator implements Comparator<Object>{

      @Override
      public int compare(Object o1, Object o2) {
            Contact ctest = new Contact("test", "class");
            Contact c1 = (Contact) o1;
            Contact c2 = (Contact) o2;

            if (o1.getClass() == ctest.getClass() && o2.getClass() == ctest.getClass()) {
                  return c1.getFirstname().compareTo(c2.getFirstname());
            }
            if (o1.getClass() == ctest.getClass() && !(o2.getClass() == ctest.getClass())) {
                  return 1;
            }
            if (!(o1.getClass() == ctest.getClass()) && o2.getClass() == ctest.getClass()) {
                  return -1;
            }
            else 
            {
                  if (c1 == null || c2 == null) {
                        throw new NullPointerException("Contact is null");
                  }
                  ContactWithAddress c1a = (ContactWithAddress) c1;
                  ContactWithAddress c2a = (ContactWithAddress) c2;
                  return c1a.getAddress().getPlace().compareTo(c2a.getAddress().getPlace());
            }
      }

      

}

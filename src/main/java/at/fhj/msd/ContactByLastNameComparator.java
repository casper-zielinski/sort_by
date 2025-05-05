package at.fhj.msd;

import java.util.Comparator;

import at.fhj.msd.contact.Contact;

public class ContactByLastNameComparator implements Comparator<Contact> {

      @Override
      public int compare(Contact o1, Contact o2) {
            return o1.getLastname().compareTo(o2.getLastname());
      }
      
      public int compare(Contact o1, Contact o2, boolean ignoreCase) {
            if (ignoreCase) {
                  return o1.getLastname().compareToIgnoreCase(o2.getLastname());
            }
        return o1.getLastname().compareTo(o2.getLastname());
      }

}

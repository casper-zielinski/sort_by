package at.fhj.msd.contact;

import java.util.Comparator;

public class ContactByFirstNameComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getFirstname().compareTo(o2.getFirstname());
    }

    public int compare(Contact o1, Contact o2, boolean ignoreCase) {
        if (ignoreCase) {
            return o1.getFirstname().compareToIgnoreCase(o2.getFirstname());
        }
        return o1.getFirstname().compareTo(o2.getFirstname());
    }

}

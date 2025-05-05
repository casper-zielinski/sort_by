package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

import at.fhj.msd.adress.Address;
import at.fhj.msd.contact.Contact;
import at.fhj.msd.contact.ContactByFirstNameComparator;
import at.fhj.msd.contact.ContactByLastNameComparator;
import at.fhj.msd.contact.ContactByStreetComparator;
import at.fhj.msd.contact.ContactWithAddress;
import at.fhj.msd.contact.ContactByHouseNumberComparator;
import at.fhj.msd.contact.ContactByPlaceComparator;
import at.fhj.msd.contact.ContactByZipComparator;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
contacts.add(new Contact("Alex", "Muster"));
contacts.add(new Contact("John", "Doe"));
contacts.add(new Contact("Jane", "Doe"));
contacts.add(new ContactWithAddress("Mary", "Sheep", new Address("Somestreet 12", "Otherplace", 12345)));
contacts.add(new ContactWithAddress("Harry", "Alberto", new Address("Nanoway 4", "Thisanto", 4432)));
contacts.add(new ContactWithAddress("Peter", "Parker", new Address("Spiderstreet 1", "New York", 10001)));
contacts.add(new ContactWithAddress("Clark", "Kent", new Address("Metropolis 1", "Metropolis", 54321)));
contacts.add(new ContactWithAddress("Bruce", "Wayne", new Address("Gotham 1", "Gotham", 98765)));
contacts.add(new ContactWithAddress("Dexter", "Morgan", new Address("Miami 1", "Miami", 54321)));


// for (Contact contact : contacts) {
//   System.out.println(contact);
// }

        // System.out.println("Sorting by first name:");
        // contacts.sort(new ContactByFirstNameComparator());
        // for (Contact contact : contacts) {
        //     System.out.println(contact);
        // }

        // System.out.println("Sorting by last name:");
        // contacts.sort(new ContactByLastNameComparator());
        // for (Contact contact : contacts) {
        //     System.out.println(contact);
        // }

        System.out.println("Sorting by street name:");
        contacts.sort(new ContactByStreetComparator());
        for (var contact : contacts) {
            System.out.println(contact);
        }

        System.out.println("Sorting by house number:");
        contacts.sort(new ContactByHouseNumberComparator());
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        System.out.println("Sorting by place name:");
        contacts.sort(new ContactByPlaceComparator());
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        System.out.println("Sorting by zip code:");
        contacts.sort(new ContactByZipComparator());
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }
}

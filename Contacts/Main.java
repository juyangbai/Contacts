```java
package JuyangBai.Java;


public class Main {

    public static void main(String[] args) {
   // write your code here
        Contacts contacts = new Contacts();

//        Contact contact0 = new Contact("John","17816118582","78599","5789","Friends");
//        Contact contact1 = new Contact("Alice","18743242290","69533","4312","Family");
//        Contact contact2 = new Contact("Mike","13903442390","49320","9043","Partner");
//
//        contacts.add(contact0);
//        contacts.add(contact1);
//        contacts.add(contact2);
//        contacts.print();
//        System.out.println();
//
////        contacts.remove(contact0);
////        contacts.print();
////        System.out.println();
//
//        contacts.getContact(0).print();
//        System.out.println();
//
//        System.out.println(contacts.find(contact1));
//
//        contacts.sort();
//        contacts.print();
//        System.out.println();
//
//        contacts.sortByGroup();
//        contacts.print();

        Contact contact0 = new Contact();
        Contact contact1 = new Contact();
        Contact contact2 = new Contact();

        System.out.println("PLease enter your contact information in the following format: name cellPhoneNumber homePhoneNumber officePhoneNumber group");
        contact0.input();
        contact1.input();
        contact2.input();

        contacts.add(contact0);
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.print();
        System.out.println();

        contacts.remove(contact0);
        contacts.print();
        System.out.println();

        contacts.add(contact0);
        contacts.getContact(0).print();
        System.out.println();

        System.out.println(contacts.find(contact1));

        contacts.sort();
        contacts.print();
        System.out.println();

        contacts.sortByGroup();
        contacts.print();
    }
}
```


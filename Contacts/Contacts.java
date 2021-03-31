class Contact
{
    String name;    //name of the contact
    String cellPhoneNumber;
    String homePhoneNumber;
    String officePhoneNumber;
    String group;
    Contact(String name,String cellPhoneNumber,String homePhoneNumber,String officePhoneNumber,String group)
    {
        //fill in your code here
        this.name = name;
        this.cellPhoneNumber = cellPhoneNumber;
        this.homePhoneNumber = homePhoneNumber;
        this.officePhoneNumber = officePhoneNumber;
        this.group = group;
    }
    void print()//print out the attributes
    {
        //fill in your code here
        System.out.printf("Name: %s, CellPhoneNumber: %s, HomePhoneNumber: %s, OfficePhoneNumber: %s, Group: %s%n",
                this.name, this.cellPhoneNumber, this.homePhoneNumber, this.officePhoneNumber, this.group);
    }
}

public class Contacts {
    ArrayList<Contact> book = new ArrayList<>();

    Contacts()
    {
        /* fill in code here */
    }

    void add(Contact contact)
    {
        //add a contact to the book;
        this.book.add(contact);
    }

    void remove(Contact contact)
    {
        //remove a contact from the book according to the name
        this.book.remove(contact);
    }

    Contact getContact(int i)
    {
        //return a contact at the position i of the book
        return this.book.get(i);
    }

    int find(Contact contact)
    {
        //find the contact in the book, return its position, if not found, return -1;
        if(this.book.contains(contact))
            return this.book.indexOf(contact);
        else
            return -1;
    }

    void print()
    {
        //print out all the entries in the book
        for(int i = 0; i < this.book.size(); i++)
            this.book.get(i).print();
    }

    /* The normal sort methods */
//    void sort()
//    {
//        /* sort the book with respect to contact names in ascending order */
//        book.sort(new Comparator<Contact>() {
//            @Override
//            public int compare(Contact o1, Contact o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//    }
//
//    void sortByGroup()
//    {
//        //sort the book with respect to contact groups in ascending order
//        book.sort(new Comparator<Contact>() {
//            @Override
//            public int compare(Contact o1, Contact o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
//    }

    /* Sorting using collections */
    class SortByName implements Comparator<Contact>
    {
        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    class SortByGroup implements Comparator<Contact>
    {

        @Override
        public int compare(Contact o1, Contact o2) {
            return o1.group.compareTo(o2.group);
        }
    }

    void sort()
    {
        Collections.sort(book, new SortByName());
    }

    void sortByGroup()
    {
        Collections.sort(book, new SortByGroup());
    }

}

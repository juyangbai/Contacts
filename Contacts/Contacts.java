package JuyangBai.Java;

```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
Class Contact is a definition for a contact person in your mobile phone book.
Class Contacts uses an ArrayList<Contact> object to store your contacts to form your actual phone book.
The class skeletons are given as follows (An IntelliJ IDEA project contained in Contacts.zip of the source code can be downloaded along with the exercise).
Complete their definitions and fulfill the bodies of methods according to the description given in the comments.
Test your implementation in method main. You may add any attributes and methods as needed based upon your own understanding of the problem.
 */


/*
Errors
E:\Java\jdk-15\bin\java.exe "-javaagent:E:\IntelliJ IDEA\IntelliJ IDEA Educational Edition 2020.3.3\lib\idea_rt.jar=55989:E:\IntelliJ IDEA\IntelliJ IDEA Educational Edition 2020.3.3\bin" -Dfile.encoding=UTF-8 -classpath D:\GPA\Java\Document\Contacts\out\production\Contacts edu.zstu.Jiang.Main
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.ArrayList.add(Object)" because "this.book" is null
   at edu.zstu.Jiang.Contacts.add(Contacts.java:51)
   at edu.zstu.Jiang.Main.main(Main.java:15)

Process finished with exit code

Solutions:
ArrayList<Contact> book
Add "= new ArrayList<>()"
The method of initialize an arraylist is: ArrayList<T> arraylist = new Arraylist<>();
 */

class Contact
{
    String name;    //name of the contact
    String cellPhoneNumber;
    String homePhoneNumber;
    String officePhoneNumber;
    String group;

    Contact()
    {

    }

    Contact(String name,String cellPhoneNumber,String homePhoneNumber,String officePhoneNumber,String group)
    {
        //fill in your code here
        this.name = name;
        this.cellPhoneNumber = cellPhoneNumber;
        this.homePhoneNumber = homePhoneNumber;
        this.officePhoneNumber = officePhoneNumber;
        this.group = group;
    }

    void input()
    {
        Scanner scanner = new Scanner(System.in);

        this.name = scanner.next();
        this.cellPhoneNumber = scanner.next();
        this.homePhoneNumber = scanner.next();
        this.officePhoneNumber = scanner.next();
        this.group = scanner.next();
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
        // fill in code here
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
```


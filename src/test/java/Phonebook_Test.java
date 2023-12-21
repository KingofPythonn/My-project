/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits and it will affect your score
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;



public class Phonebook_Test {  @Test
public void Persontest1(){
    Person person1=new Person("sina","0933078301");
    Phonebook phonebook=new Phonebook();
    phonebook.addContact(person1);

    assertEquals(null, phonebook.getPhoneNumber("sina"));

}  @Test
public void Persontest2(){
    Person person1=new Person("sina","09330783017");
    Phonebook phonebook=new Phonebook();
    phonebook.addContact(person1);

    assertEquals("09330783017", phonebook.getPhoneNumber("sina"));

}@Test
public void Persontest3(){
    Person person1=new Person("sina","09330783017");
    Person person2=new Person("sepehri","09330783011");
    Phonebook phonebook=new Phonebook();
    phonebook.addContact(person1);
    phonebook.addContact(person2);


    assertEquals("Contact Not Found", phonebook.getPhoneNumber("sepehr"));

}@Test
public void Persontest4() {

    Phonebook phonebook = new Phonebook();
    phonebook.addContact(null);
    assertEquals("Contact Not Found", phonebook.getPhoneNumber("sepehr"));


}@Test
public void Persontest5() {
    Person person1 = new Person("sina", "09330783017");
    Person person2 = new Person("sepehr", "09330783011");
    Phonebook phonebook = new Phonebook();
    phonebook.addContact(person1);
    phonebook.addContact(person2);


    assertEquals(1, phonebook.getContact("sepehr"));

}@Test
public void Persontest6() {

    Phonebook phonebook = new Phonebook();
    phonebook.addContact(null);


    assertEquals(0, phonebook.getContact("sepehr"));

}@Test
public void Persontest7() {
    Person person1 = new Person("sina", "09330783017");
    Person person2 = new Person("sepehr", "09330783011");
    Phonebook phonebook = new Phonebook();
    phonebook.addContact(person1);
    phonebook.addContact(person2);


    assertEquals(0, phonebook.getContact("ser"));

}@Test
public void Persontest8() {
    Person person1 = new Person("sina", "09330783017");
    Person person2 = new Person("sepehr", "09330783011");
    Phonebook phonebook = new Phonebook();
    phonebook.addContact(person1);
    phonebook.addContact(person2);


    assertEquals("Contact Not Found", phonebook.getPhoneNumber("ser"));

}
    @Test
    public void Persontest9() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(person1);
        phonebook.addContact(person2);


        assertEquals(1, phonebook.updateContactName("sina","aryan"));

    }
    @Test
    public void Persontest10() {

        Phonebook phonebook = new Phonebook();
        phonebook.addContact(null);


        assertEquals(0, phonebook.updateContactName("sepehr","sina"));

    }
    @Test
    public void Persontest11() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(person1);
        phonebook.addContact(person2);


        assertEquals(0, phonebook.updateContactName("rostam","aryan"));

    }
    @Test
    public void Persontest12() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(person1);
        phonebook.addContact(person2);


        assertEquals(1, phonebook.updateContactPhoneNumber("sina","09113561666"));

    }
    @Test
    public void Persontest13() {

        Phonebook phonebook = new Phonebook();
        phonebook.addContact(null);


        assertEquals(0, phonebook.updateContactPhoneNumber("sepehr","09330783017"));

    }
    @Test
    public void Persontest14() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(person1);
        phonebook.addContact(person2);


        assertEquals(0, phonebook.updateContactPhoneNumber("rostam","09330783018"));

    }@Test
    public void Persontest15() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(person1);
        phonebook.addContact(person2);


        assertEquals(1, phonebook.deleteContact("sina"));

    }
    @Test
    public void Persontest16() {

        Phonebook phonebook = new Phonebook();
        phonebook.addContact(null);


        assertEquals(0, phonebook.deleteContact("sepehr"));

    }
    @Test
    public void Persontest17() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();
        phonebook.addContact(person1);
        phonebook.addContact(person2);


        assertEquals(0, phonebook.deleteContact("rostam"));

    }
    @Test
    public void Persontest18() {

        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();

        ArrayList<String> contacts = new ArrayList<String>();
        phonebook.addContact(person1);

        phonebook.addContact(person2);
        contacts.add(String.valueOf(person1));
        contacts.add(String.valueOf(person2));



        assertEquals(contacts, phonebook.getAllContacts());

    }
    @Test
    public void Persontest19() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();
        Person person = new Person("sina","09113561665");
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        phonebook.setAllContactsHidden();
        phonebook.setAllContactsUnHidden();

        assertEquals(3, person.getId());


    }
    @Test
    public void Persontest21() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();


        phonebook.addContact(person1);
        phonebook.addContact(person2);
        phonebook.setAllContactsHidden();


        assertEquals(true, person1.isHidden());

    }
    @Test
    public void Persontest22() {
        Person person1 = new Person("sina", "09330783017");
        Person person2 = new Person("sepehr", "09330783011");
        Phonebook phonebook = new Phonebook();


        phonebook.addContact(person1);
        phonebook.addContact(person2);
        phonebook.setAllContactsHidden();
        phonebook.setAllContactsUnHidden();



        assertEquals(false, person2.isHidden());

    }





    }





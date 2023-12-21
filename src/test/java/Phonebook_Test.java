/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits and it will affect your score
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
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

}
}

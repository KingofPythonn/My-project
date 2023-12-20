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
public void Persontest(){
    Person person1=new Person("sina","0933078301");
    Phonebook phonebook=new Phonebook();
    phonebook.addContact(person1);

    assertEquals(null, phonebook.getPhoneNumber("sina"));

}  @Test
public void Persontes0t(){
    Person person1=new Person("sina","09330783017");
    Phonebook phonebook=new Phonebook();
    phonebook.addContact(person1);

    assertEquals("09330783017", phonebook.getPhoneNumber("sina"));

}




}

package miu.edu.cs489.contactor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import miu.edu.cs489.contactor.Model.Contact;
import miu.edu.cs489.contactor.Model.EmailAddress;
import miu.edu.cs489.contactor.Model.PhoneNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ContactorApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(ContactorApplication.class, args);
        List<Contact> contactList = prepareContactList();
        Collections.sort(contactList, Comparator.comparing(Contact::getLastName));

        contactList.forEach((Contact c) -> System.out.println(c));
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(contactList);
        System.out.println(jsonString);
    }

    private static List<Contact> prepareContactList() {
        List<Contact> contactList = new ArrayList<>();

        PhoneNumber p1 = new PhoneNumber("240-133-0011", "Home");
        PhoneNumber p2 = new PhoneNumber("240-112-0123", "Mobile");
        PhoneNumber p3 = new PhoneNumber("412-116-9988", "Mobile");

        EmailAddress ea1 = new EmailAddress("dave.sang@gmail.com", "Home");
        EmailAddress ea2 = new EmailAddress("dsanger@argos.com", "Work");
        EmailAddress ea3 = new EmailAddress("ali@bmi.com", "Work");

        contactList.add(new Contact("David", "Sanger", "Argos LLC", "Sales Manager", List.of(p1,p2), List.of(ea1, ea2)));
        contactList.add(new Contact("Carlos", "Jimenez", "", "", List.of(p3), null));
        contactList.add(new Contact("Ali", "Gafar", "BMI Services ", "HR Manager ", null, List.of(ea3)));


        return contactList;
    }

}

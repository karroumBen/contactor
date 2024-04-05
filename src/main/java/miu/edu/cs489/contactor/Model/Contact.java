package miu.edu.cs489.contactor.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("company")
    private String company;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("phoneNumberList")
    private List<PhoneNumber> phoneNumberList;
    @JsonProperty("emailAddressList")
    private List<EmailAddress> emailAddressList;
}

package miu.edu.cs489.contactor.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailAddress {
    @JsonProperty("email")
    private String email;
    @JsonProperty("label")
    private String label;
}

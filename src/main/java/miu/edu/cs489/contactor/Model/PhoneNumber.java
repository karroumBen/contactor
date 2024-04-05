package miu.edu.cs489.contactor.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {
    @JsonProperty("phoneNo")
    private String phoneNo;
    @JsonProperty("label")
    private String label;
}

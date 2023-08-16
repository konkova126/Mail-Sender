package springboot.tojava.ru.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class MailRequest implements Serializable {
    @JsonProperty("done")
    String done;
}

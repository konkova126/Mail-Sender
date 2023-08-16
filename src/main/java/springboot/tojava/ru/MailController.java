package springboot.tojava.ru;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import springboot.tojava.ru.model.MailRequest;
import springboot.tojava.ru.model.MailResponse;

@Slf4j
@RestController
@RequestMapping("/mail")
public class MailController {

    @PostMapping("/send")
    public MailRequest sendMail(@RequestBody MailResponse request) {
        log.info("Отправили сообщение пользователю {}.", request.getEmail());
        return MailRequest.builder()
                .done("Отправлено сообщение пользователю %s:\n%s"
                        .formatted(
                                request.getEmail(),
                                request.getMessage()))
                .build();
    }
}

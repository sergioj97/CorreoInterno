package es.urjccode.correointerno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

    @Autowired
    private JavaMailSender emailSender;

    public void enviarCorreo(String cuerpo, String destino, String asunto) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("elobispoderoma@vaticano.com");
        message.setTo(destino);
        message.setSubject(asunto);
        message.setText(cuerpo);

        emailSender.send(message);
    }
}

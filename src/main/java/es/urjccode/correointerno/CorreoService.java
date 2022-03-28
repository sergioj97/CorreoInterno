package es.urjccode.correointerno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoService {

    @Autowired
    private JavaMailSender emailSender;

    public void enviarCorreo(String cuerpo, String destino, String usuarioOrigen) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("sellhub@app.com");
        message.setTo(destino);
        message.setSubject("Mensaje de " + usuarioOrigen + " (SellHub)");
        message.setText(usuarioOrigen + ", otro usuario de Sellhub, te ha enviado el siguiente mensaje:\n\n\n" + cuerpo);

        emailSender.send(message);
    }
}

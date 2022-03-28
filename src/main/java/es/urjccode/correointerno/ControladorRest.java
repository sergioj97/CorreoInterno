package es.urjccode.correointerno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {


    @Autowired
    private CorreoService correoService;


    @PostMapping("/correo")
    public void postEnviarCorreo(@RequestParam("contenido") String contenido,
                                 @RequestParam("correo_destino") String correoDestino,
                                 @RequestParam("nombre_remitente") String nombreRemitente) {

        correoService.enviarCorreo(contenido, correoDestino, nombreRemitente);
    }
}

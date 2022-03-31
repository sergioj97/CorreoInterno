package es.urjccode.correointerno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {


    @Autowired
    private CorreoService correoService;


    @PostMapping("/correo")
    public void postEnviarCorreo(@RequestBody String cuerpo) {

        correoService.enviarCorreo(cuerpo, "serginmatonis@gmail.com", "asunto");
    }
}

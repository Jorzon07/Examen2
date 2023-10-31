package com.crud.examen2.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class LoginController {
    private boolean loggedIn;
    private boolean recoverSession;
    private boolean userwasLoged;
    private boolean tokenwassend;
    private Configuracion configuracion;

    @PostConstruct
    public void init() {
        loggedIn = false;
        recoverSession = false;
        userwasLoged = false;
        tokenwassend = false;
        configuracion = new Configuracion();


        JmoordbConnection jmc = new JmoordbConnection.Builder()
                .withSecurity(false)
                .withDatabase("crud")
                .withHost("")
                .withPort(0)
                .withUsername("")
                .withPassword("")
                .build();
    }
    private AuthenticationStatus continueAuthentication() {
        return securityContext.authenticate(
                (HttpServletRequest) externalContext.getRequest(),
                (HttpServletResponse) externalContext.getResponse(),
                AuthenticationParameters.withParams()
                        .credential(new UsernamePasswordCredential(username, password))
        );
    }
}

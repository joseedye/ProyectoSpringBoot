package com.spring.spring.controller;


import com.spring.spring.modelo.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

@RequestMapping(value = "usuario{id}")
public Usuario prueba (@PathVariable long id)
{
Usuario user = new Usuario();
    user.setNombre("lucas");
    user.setApellido("rozo");
    user.setEmail("lucas@rozo.com");
    user.setPasword("1234");
    user.setTelefono("1234");
    user.setId(id);
    return user;
}

    @RequestMapping(value = "usuarioa")
    public Usuario editar ()
    {
        Usuario user = new Usuario();
        user.setNombre("lucas");
        user.setApellido("rozo");
        user.setEmail("lucas@rozo.com");
        user.setPasword("1234");
        user.setTelefono("1234");
        return user;
    }

    @RequestMapping(value = "usuarios")
    public Usuario eliminar ()
    {
        Usuario user = new Usuario();
        user.setNombre("lucas");
        user.setApellido("rozo");
        user.setEmail("lucas@rozo.com");
        user.setPasword("1234");
        user.setTelefono("1234");
        return user;
    }

    @RequestMapping(value = "usuariod")
    public Usuario buscar ()
    {
        Usuario user = new Usuario();
        user.setNombre("lucas");
        user.setApellido("rozo");
        user.setEmail("lucas@rozo.com");
        user.setPasword("1234");
        user.setTelefono("1234");
        return user;
    }
}

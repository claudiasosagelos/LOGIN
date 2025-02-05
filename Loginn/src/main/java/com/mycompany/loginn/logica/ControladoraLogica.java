
package com.mycompany.loginn.logica;

import com.mycompany.loginn.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public ControladoraLogica() {
        controlPersis = new ControladoraPersistencia();
    }
    

    public String validarUsuario(String usuario, String contrasenia) {
        
        String mensaje ="";
        List<Usuario> listaUsuario = controlPersis.traerUsuario();

        for (Usuario usu : listaUsuario) {
            //probando
            System.out.println("Usuario: " + usu.getNombreUsuario());
            if (usu.getNombreUsuario().equals(usuario)) {
                System.out.println("Usuario: " + usu.getNombreUsuario());

                //probando
                System.out.println("Contraseña: " + usu.getContraseña());
                if (usu.getContraseña().equals(contrasenia)) {
                    System.out.println("Contraseña: " + usu.getContraseña());

                    mensaje = "Usuario y contraseña correctos.Bienvenido/a!";
                    return mensaje;

                } else {
                    mensaje = "Contraseña incorrecta!";
                    return mensaje;//de esta manera corta el forich

                }

            } else {
                mensaje = "Usuario no encontrado!";
                return mensaje;

            }

        }
        return mensaje;
    }
}

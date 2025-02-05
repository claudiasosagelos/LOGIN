
package com.mycompany.loginn.persistencia;

import com.mycompany.loginn.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuario() {
       
        return usuJpa.findUsuarioEntities(0, 0);
        
        
    }


}

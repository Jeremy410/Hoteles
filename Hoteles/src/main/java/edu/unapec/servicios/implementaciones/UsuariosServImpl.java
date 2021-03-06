package edu.unapec.servicios.implementaciones;

import edu.unapec.entidades.UsuariosEntity;
import edu.unapec.repositorios.interfaces.UsuariosRepIF;
import edu.unapec.servicios.interfaces.UsuariosServIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WillieManuel on 22/6/16.
 */
@Service("usuariosServImpl")
public class UsuariosServImpl implements UsuariosServIF {

    private UsuariosRepIF usuarioRep;

    public UsuariosServImpl(){}

    @Override
    public List<UsuariosEntity> obtenerUsuarios() {
        return usuarioRep.obtenerUsuarios();
    }

    @Override
    public boolean agregarUsuario(UsuariosEntity usuariosEntity) {
        return usuarioRep.agregarUsuario(usuariosEntity);
    }

    @Override
    public boolean EliminarUsuario(UsuariosEntity usuarioEntity) {
        return false;
    }

    @Override
    public boolean AgregarUsuario(UsuariosEntity usuarioEntity) {
        return false;
    }

    @Override
    public boolean ActualizarUsuario(UsuariosEntity usuarioEntity) {
        return false;
    }

    @Autowired
    public void setUsuarioRep(UsuariosRepIF usuariosRepImpl) {
        this.usuarioRep = usuariosRepImpl;
    }
}

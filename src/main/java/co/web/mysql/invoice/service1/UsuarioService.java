package co.web.mysql.invoice.service1;

import java.util.List;
import co.web.mysql.invoice.model.*;

//Metodos para el proyecto crud
public interface UsuarioService {
	public List <Usuario> getAllList();
    public Usuario getById(long id);
    Usuario add(Usuario p);
	Usuario edit(Usuario p);
	Usuario delete(long id);
}
package br.com.caelum.online.loja.controlador;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;

@Resource
public class IndexController {

	@Path("/")
	public void root() {
		System.out.println("Meu sistema com vraptor");
	}
	@Path("/ajuda")
	public void ajuda() {
		System.out.println("O método ajuda foi invocado");
	}
	@Path("/contato")
	public void contato(){
		System.out.println("O método contato foi invocado");
	}

}

package br.com.casadocodigo.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;
import br.com.casadocodigo.loja.models.TipoPreco;

@Controller
@RequestMapping("produtos")
public class ProdutosController {

	@Autowired //Essa Annotation injeta o produto DAO diretamente pra cá
	private ProdutoDAO produtoDao;

	@RequestMapping("/form")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("produtos/form");
		mv.addObject("tipos", TipoPreco.values());
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String gravar(Produto produto) {
		produtoDao.gravar(produto);
		return "produtos/ok";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		List<Produto> produtos = produtoDao.listar();
		ModelAndView mv = new ModelAndView("produtos/lista");
		mv.addObject("produtos", produtos);
		
		return mv;
	}
}

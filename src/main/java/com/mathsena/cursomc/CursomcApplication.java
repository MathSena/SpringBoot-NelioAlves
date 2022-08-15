package com.mathsena.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mathsena.cursomc.domain.Categoria;
import com.mathsena.cursomc.domain.Cidade;
import com.mathsena.cursomc.domain.Cliente;
import com.mathsena.cursomc.domain.Endereco;
import com.mathsena.cursomc.domain.Estado;
import com.mathsena.cursomc.domain.ItemPedido;
import com.mathsena.cursomc.domain.Pagamento;
import com.mathsena.cursomc.domain.PagamentoComBoleto;
import com.mathsena.cursomc.domain.PagamentoComCartao;
import com.mathsena.cursomc.domain.Pedido;
import com.mathsena.cursomc.domain.Produto;
import com.mathsena.cursomc.domain.enums.EstadoPagamento;
import com.mathsena.cursomc.domain.enums.TipoCliente;
import com.mathsena.cursomc.repositories.CategoriaRepository;
import com.mathsena.cursomc.repositories.CidadeRepository;
import com.mathsena.cursomc.repositories.ClienteRepository;
import com.mathsena.cursomc.repositories.EnderecoRepository;
import com.mathsena.cursomc.repositories.EstadoRepository;
import com.mathsena.cursomc.repositories.ItemPedidoRepository;
import com.mathsena.cursomc.repositories.PagamentoRepository;
import com.mathsena.cursomc.repositories.PedidoRepository;
import com.mathsena.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	


	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
	}

}

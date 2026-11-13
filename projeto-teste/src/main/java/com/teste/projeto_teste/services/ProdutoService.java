package com.teste.projeto_teste.services;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;
import com.teste.projeto_teste.repository.ProdutoRepository;



import com.teste.projeto_teste.model.Produto;




@Service 
public class ProdutoService {
    
    private final ProdutoRepository produtoRepository;

    ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

   /**
     * Metodo para Retornar uma lista de produtos
     * @return Lista de produtos
     */
    public List<Produto> obterTodos(){
        // Colocar regra caso tenha.
        return produtoRepository.obterTodos();
}

/**
     * Metodo que retorna o produto encontrado pelo Id.
     * @param id do produto que será localizado.
     * @return  Retorna um Produto caso tenha seja encontrado.
     */
    public Optional<Produto> obterPorId(Integer id){

        return produtoRepository.obterPorId(id);
}


/**
     * Metodo para adicionar produto na lista.
     * @param produto que será adicionado.
     * @return Retorna o produto que foi adicionado na lista.
     */
     public Produto adicionar(Produto produto){
        //Poderia ter alguma regra de negocio aqui para validar o produto.
        return produtoRepository.adicionar(produto);
}

/**
      * Metodo para deletar o produto por id.
      * @param id do produto a ser deletado.
      */
     public void deletar(Integer id){
        //Aqui poderia ter alguma logica de validação.
        produtoRepository.deletar(id);

    // O deletar ñ retorna nada, pois ele é void.
}



/**
      * Método para atualizar o produtona lista.
      * @param produto que será atualizado.
      * @param id do produto.
      * @return Retorna o produto após atualizar a lista.
      */
     public Produto atualizar(Integer id, Produto produto){

        // Ter alguma validação no ID.
            produto.setId(id);

        return produtoRepository.atualizar(produto);
}

}
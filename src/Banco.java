import java.util.HashSet;
import java.util.Set;
/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis Lima
 * @version 1.0
 * @project banco
 * @since 12/20/2023
 * <p>
 * Copyright (c) 2023 John Doe. All rights reserved.
 */
//composição: Só é permitido ter uma conta se estiver vinculada ao banco o objeto principal é importante
//agregação: O objeto principal não precisa existir para que os outros existam, ex: o obj vendas não precisa existir pra existir o produto ou o vendedor e etc
public class Banco {
    private String nomeBanco;
    private Set<Conta> contas;


    public Set<Conta> getContas() {
        return contas;
    }



    public Banco(String nomeBanco){
        this.nomeBanco = nomeBanco;
        this.contas = new HashSet<>();

    }
    public void add (Conta conta){
        this.contas.add(conta);
    }


    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}

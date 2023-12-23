/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis Lima
 * @version 1.0
 * @project banco
 * @since 12/19/2023
 * <p>
 * Copyright (c) 2023 John Doe. All rights reserved.
 */
public class ContaPoupanca extends Conta{

    //private Integer rendimentoDias;

    public ContaPoupanca(String nome, Integer conta, String cpf, Integer idade, Banco banco, Double saldo /*Integer rendimentoDias*/) {
        super(nome, conta, cpf, idade, banco, saldo);
        //this.rendimentoDias = rendimentoDias;
    }

    @Override
    public void saque(Double valor) {
        if (this.getSaldo()>= valor){
            System.out.println("Saque concluído, seu saldo é de: " + (this.getSaldo()- valor));
            setSaldo(this.getSaldo()-valor);
        }else System.out.println("Você não tem saldo para saque.");

    }
}


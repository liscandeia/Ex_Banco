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
public class ContaCorrente extends Conta {

    public ContaCorrente(String nome, Integer conta, String cpf, Integer idade, Banco banco, Double saldo) {
        super(nome, conta, cpf, idade, banco, saldo);
    }


    @Override
    public void saque(Double valor) {
        valor = valor + 6;
        if (this.getSaldo()>= valor){
            System.out.println("Saque concluído, seu saldo é de: " + (this.getSaldo()- valor));
            setSaldo(this.getSaldo()-valor);
        }else System.out.println("Você não tem saldo para saque.");
    }
}

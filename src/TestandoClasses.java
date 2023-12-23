/**
 * My Awesome Project
 * <p>
 * Description: This project does something amazing and solves a specific problem.
 *
 * @author Lis Lima
 * @version ${VERSION}
 * @project Default (Template) Project
 * @since ${DATA}
 * <p>
 * Copyright (c) 2023 John Doe. All rights reserved.
 */
public class TestandoClasses {
    public static void main(String[] args) {
        Banco banco = new Banco("Flor de Lis");
        ContaCorrente cc = new ContaCorrente("Lis", 99,"354544", 23,banco, 0.0);
        ContaPoupanca cc2 = new ContaPoupanca("Leo", 98,"98325098", 21, banco, 0.0);
        banco.add(cc);
        banco.add(cc2);
        cc.deposito(2000.00);
        cc.saque(500.00);
        cc.transeferencia(100.00);
        cc2.deposito(2000.00);
        cc2.saque(500.00);
        cc2.transeferencia(100.00);
        imprimir(cc);
        imprimir(cc2);
        for (Conta c : banco.getContas()){
            System.out.println(c.getNome());
        }
    }
    public static void imprimir (Conta conta){
        System.out.println("Você está no banco "+ conta.getBanco().getNomeBanco() + ". " + conta.getSaldo());

    }
}
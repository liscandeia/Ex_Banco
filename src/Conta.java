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
public abstract class Conta {
    private String nome;
    private Integer conta;
    private String cpf;
    private Integer idade;
    private Banco banco;
    private Double saldo;

    public Conta(String nome, Integer conta, String cpf, Integer idade, Banco banco, Double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.cpf = cpf;
        this.idade = idade;
        this.banco = banco;
        this.saldo = saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void saque(Double valor);

    public void deposito (Double valor){
        System.out.println("Depósito realizado, saldo é de: " +  (this.saldo += valor) );

    }
    public void transeferencia (Double valor){
        if (valor <= this.saldo){
            System.out.println("Transeferência realizada, seu novo saldo é de: " +  (this.saldo -= valor));
        }else System.out.println("Você não possui saldo para realizar a transferência");
    }

}

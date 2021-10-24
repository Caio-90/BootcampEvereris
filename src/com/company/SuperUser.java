package com.company;

public class SuperUser {
    private String login;
    private String senha;
    String nome;

    public SuperUser(String senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    protected String getSenha() {
        return senha;
    }
}

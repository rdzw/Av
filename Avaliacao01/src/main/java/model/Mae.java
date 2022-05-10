package model;

import java.util.ArrayList;

public class Mae {
    protected Filho filho;
    protected ArrayList<Filho> Filhos = new ArrayList<Filho>();
    protected String cpf;
    protected String nome;

    public boolean RegistrarFilho(String cpf, String cns, String nis){

        if (VerificarQtdFilhos() < 3) {

            filho = new Filho();
            filho.setCadastro(cpf, cns, nis);

            if (VerificarSeJaEstaCadastrado(cpf))
                return false;

            else {
                Filhos.add(filho);
                return true;
            }
        }

        else
            return false;
    }

    public int VerificarQtdFilhos() {

        return Filhos.size();
    }

    public boolean VerificarSeJaEstaCadastrado(String cpf) {
        for (Filho f : Filhos) {
            if (f.CPF.equals(cpf))
                return true;
        }
        return false;
    }

    public void RegistrarMae(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    protected class Filho {
        private String CPF;
        private String CNS;
        private String NIS;

        void setCadastro(String cpf, String cns, String nis){
            CPF = cpf;
            CNS = cns;
            NIS = nis;
        }
    }
}

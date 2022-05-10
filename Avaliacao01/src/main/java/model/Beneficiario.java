package model;

import java.util.ArrayList;
import java.util.Date;

public class Beneficiario {
    String cpf;
    String cns;
    String nis;
    String nome;
    Date dtNasc;
    String email;
    String nomeMae;
    String cpfMae;


    public boolean registrar(String cpf, String cns, String nis, String nome,
                             Date dtNasc, String email, String nomeMae, String cpfMae){

        //List<Beneficiario> beneficiario = new ArrayList<Beneficiario>();

        if(cpf!=null){
            setCpf(cpf);

        }else{
            return false;
        }

        if(cns!=null){
            setCns(cns);
        }else{
            return false;
        }

        if(nis!=null){
            setNis(nis);
        }else{
            return false;
        }

        if(nome!=null){
            setNome(nome);
        }else{
            return false;
        }

        if(dtNasc!=null){
            setDtNasc(dtNasc);
        }else{
            return false;
        }

        if(email!=null){
            setEmail(email);
        }else{
            return false;
        }

        if(nomeMae!=null){
            setNomeMae(nomeMae);
        }else{
            return false;
        }

        if(cpfMae!=null){
            setCpfMae(cpfMae);
        }else{
            return false;
        }

        //beneficiarios.add()
        return true;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }


    protected ArrayList<Integer> lista_consulta = new ArrayList();

    public boolean ConsultarPediatra(int mes) {
        if (VerificarSeJaEstaCadastrado(mes)) {
            return false;
        }
        else {
            lista_consulta.add(mes);
            return true;}
    }

    public boolean VerificarSeJaConsultou() {
        try {
            //System.out.println(lista_consulta.size());
            if (lista_consulta.size() > 0)
                return true;
            else
                return false;}
        catch(NullPointerException e) {
            return false;}
    }

    public boolean VerificarSeJaEstaCadastrado(int mes) {
        for (int i : lista_consulta) {
            if (i == mes)
                return true;
        }
        return false;
    }

    public boolean ReceberKit() {
        if (VerificarSeJaConsultou())
            return true;
        else
            return false;
    }

}



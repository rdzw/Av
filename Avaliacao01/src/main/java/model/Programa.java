package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programa {
    List<Beneficiario> beneficiarios = new ArrayList<Beneficiario>();
    Beneficiario beneficiario;

    public boolean RegistrarBeneficiario(String cpf, String cns, String nis, String nome,
                                         Date dtNasc, String email, String nomeMae, String cpfMae){
        beneficiario = new Beneficiario();
        if (VerificarSeRegistrado(cpf, cns, nis))
            return false;
        beneficiario.registrar(cpf, cns, nis, nome, dtNasc, email, nomeMae, cpfMae);
        beneficiarios.add(beneficiario);
        return true;
    }


    public boolean VerificarSeRegistrado(String cpf, String cns, String nis){
        for (Beneficiario b : beneficiarios){
            if (b.cpf.equals(cpf) || b.cns.equals(cns) || b.nis.equals(nis))
                return true;
        }
        return false;
    }
}

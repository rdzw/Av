import model.Programa;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OngNutri {
    @Test
    public static void main(String[] args) throws Exception{
        Programa prg = new Programa();
        String date = "25-3-2022";
        SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-YYYY");
        Date result = sdt.parse(date);
        System.out.println("Beneficiario registraado com sucesso !!!");
        System.out.println(prg.RegistrarBeneficiario("054.455.789.00", "05445578900", "05445578900", "Claudio", result,
                "rodrigo@gmail.com", "Rodrigo", "013.522.054.00"));
        System.out.println("Registrando um beneficiario sem algum dado informado");
        System.out.println(prg.RegistrarBeneficiario(null, "05445578900", "05445578900", "Claudio", result,
                "Maria@gmail.com", "Maria", "054.382.455-33"));

    }
}

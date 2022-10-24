package it.fi.itismeucci.sartorio;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        Alunno Riccardo = new Alunno("Riccardo", "Fantacci", new Date(29, 7, 2004));
        Alunno Flavio = new Alunno("Flavio", "Ndoja", new Date(31, 12, 2004));
        Alunno Lorenzo = new Alunno("Lorenzo", "Lotti", new Date(1, 9, 2004));
        Alunno Guido = new Alunno("Guido", "Lanzi", new Date(29, 3, 2004));
        Alunno Leonardo = new Alunno("Leonardo", "Pacini", new Date(19, 10, 2004));

        ArrayList<Alunno> Lista = new ArrayList<>();
        Lista.add(Riccardo);
        Lista.add(Flavio);
        Lista.add(Lorenzo);
        Lista.add(Guido);
        Lista.add(Leonardo);

        Classe classe = new Classe(5, "CIA", "LAI2 09-SE", Lista);


        XmlMapper xmlMapper = new XmlMapper();
        File file = new File("simple_bean.xml");

        xmlMapper.writeValue(file, classe);

    }
}

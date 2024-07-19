package designPattern.builder.problema;

import designPattern.builder.Pessoa;

import java.time.LocalDate;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas",
                "Dickmann",
                "123456789",
                "ldickmann_51@gmail.com",
                "Luks",
                LocalDate.of(1995, 8, 12));

        System.out.println(pessoa);
    }

}

// parei o video no minuto 16:26
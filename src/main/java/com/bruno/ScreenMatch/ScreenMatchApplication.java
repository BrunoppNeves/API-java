package com.bruno.ScreenMatch;

import com.bruno.ScreenMatch.model.DadosSerie;
import com.bruno.ScreenMatch.service.ConsumoApi;
import com.bruno.ScreenMatch.service.ConverteDados;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

    @Override
    public void run (String... args) throws Exception {
        var consumoApi = new ConsumoApi();
        var json = consumoApi.ObterDados("https://omdbapi.com/?t=gilmore+girls&apikey=e2502561");
        System.out.println(json);

        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}

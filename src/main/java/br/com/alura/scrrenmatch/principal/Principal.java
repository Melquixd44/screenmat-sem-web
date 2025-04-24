package br.com.alura.scrrenmatch.principal;

import br.com.alura.scrrenmatch.model.DadosEpisodio;
import br.com.alura.scrrenmatch.model.DadosSerie;
import br.com.alura.scrrenmatch.model.DadosTemporada;
import br.com.alura.scrrenmatch.service.ConsumoApi;
import br.com.alura.scrrenmatch.service.ConverteDados;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    // aqui estou declarando um scanner e usando o sysrem.in para receber os dados que vem do teclado
    private Scanner leitura = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();

    private ConverteDados conversor = new ConverteDados();
    //como estou declarando final, então por essa motivo já estou setando o valor fixo de cada atributo
    private final String ENDERECO = "https://www.omdbapi.com/?t=";

    private final String API_KEY = "&apikey=6585022c";

    public void ExibeMenu(){
//        System.out.println("Digite o nome da série para busca");
//        // para pegar uma String usamos o nextLine()
//        var nomeSerie = leitura.nextLine();
//        var json  = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
//        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
//        System.out.println(dados);
//
//        List<DadosTemporada> temporadas = new ArrayList<>();
//
//		for (int i = 1; i<=dados.totalTemporadas(); i++){
//			json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") +"&season=" + i + API_KEY);
//			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//			temporadas.add(dadosTemporada);
//		}
//		temporadas.forEach(System.out::println);

//        for(int i = 0; i < dados.totalTemporadas(); i++){
//            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
//            for(int j = 0; j < episodiosTemporada.size(); j++){
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }
        // Lambda faz a mesma coisa que o codigo comentado a cima
//        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<String> nomes = Arrays.asList("Jacque", "Iasmin", "Paulo", "Rodrigo", "Nico");

        nomes.stream()
                .sorted()//comando para ordenação de dados por ordem
                .limit(3) // limita a lista aos 3 primeiros na impressão
                .filter(n -> n.startsWith("N"))//aqui é um filtro aonde vai pegar o nome que comece com "N"
                .map(n -> n.toUpperCase()) // aqui ele vai tranformar o nome em letras maiúsculas
                .forEach(System.out::println);//comando para imprimir dados

    }
}

package com.estudo.poc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ManipuladorDeArquivo {

	public String criarArquivo() {

		// Cria o objeto File para representar o arquivo
		File arquivo = new File("meuarquivo.txt");

		try {
			// Cria o objeto PrintWriter para escrever no arquivo
			PrintWriter writer = new PrintWriter(arquivo);

			// Escreve algumas linhas no arquivo usando o método println
			writer.println("Linha 1");
			writer.println("Linha 2");
			writer.println("Linha 3");

			// Fecha o objeto PrintWriter para garantir que todos os dados sejam gravados no
			// arquivo
			writer.close();

			System.out.println("Arquivo criado e escrito com sucesso!");
			return "Arquivo criado e escrito com sucesso!";
		} catch (Exception e) {
			// Trata qualquer exceção que possa ocorrer
			System.out.println("Ocorreu um erro ao criar ou escrever no arquivo: " + e.getMessage());
			return "Ocoreu um problema";
		}
	}

	public String lerArquivo() {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader("meuarquivo.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			System.err.println("Erro ao ler arquivo: " + e);
		}
		return sb.toString();
	}
}

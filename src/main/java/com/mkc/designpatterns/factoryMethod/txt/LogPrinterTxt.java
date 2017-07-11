package com.mkc.designpatterns.factoryMethod.txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.mkc.designpatterns.factoryMethod.logger.LogPrinter;
import com.mkc.designpatterns.factoryMethod.utils.DateTimeUtils;

/**
 * Created by Marlon on 10/07/2017.
 */
public class LogPrinterTxt implements LogPrinter {

	private static final String caminhoArquivo = "/arquivoTexto.txt";

	public void print(String mensagem) {
		try {
			File arquivo = new File(caminhoArquivo);

			String textoAtual = getTextoAtual(arquivo);
			String dataHoraAtual = DateTimeUtils.dataHoraAtual();

			BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
			writer.append(textoAtual);
			writer.newLine();
			writer.append("LOG [" + dataHoraAtual + "]: " + mensagem);

			writer.flush();
			writer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private String getTextoAtual(File arquivo) throws Exception {
		StringBuilder sb = new StringBuilder();

		BufferedReader reader = new BufferedReader(new FileReader(arquivo));
		String linha = "";
		while (true) {
			if (linha != null) {
				sb.append(linha);
			} else {
				break;
			}
			linha = reader.readLine();
		}
		reader.close();

		return sb.toString();
	}
}

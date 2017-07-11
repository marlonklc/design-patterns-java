package com.mkc.designpatterns.factoryMethod.console;


import com.mkc.designpatterns.factoryMethod.logger.LogPrinter;
import com.mkc.designpatterns.factoryMethod.utils.DateTimeUtils;

/**
 * Created by Marlon on 10/07/2017.
 */
public class LogPrinterConsole implements LogPrinter {

	public void print(String mensagem) {
		String dataHoraAtual = DateTimeUtils.dataHoraAtual();
		System.err.println("LOG [" + dataHoraAtual + "]: " + mensagem);
	}
}

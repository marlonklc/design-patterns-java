package com.mkc.designpatterns.factoryMethod.logger;

/**
 * Created by Marlon on 10/07/2017.
 */
public abstract class Logger {

	protected abstract LogPrinter criaLogger();

	public void log(String mensagem) {
		criaLogger().print(mensagem);
	}
}

package com.mkc.designpatterns.factoryMethod.console;

import com.mkc.designpatterns.factoryMethod.logger.LogPrinter;
import com.mkc.designpatterns.factoryMethod.logger.Logger;

/**
 * Created by Marlon on 10/07/2017.
 */
public class LoggerConsole extends Logger {

	protected LogPrinter criaLogger() {
		return new LogPrinterConsole();
	}
}

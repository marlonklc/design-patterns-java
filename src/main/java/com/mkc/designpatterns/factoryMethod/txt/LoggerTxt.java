package com.mkc.designpatterns.factoryMethod.txt;

import com.mkc.designpatterns.factoryMethod.logger.LogPrinter;
import com.mkc.designpatterns.factoryMethod.logger.Logger;

/**
 * Created by Marlon on 10/07/2017.
 */
public class LoggerTxt extends Logger {

	protected LogPrinter criaLogger() {
		return new LogPrinterTxt();
	}
}

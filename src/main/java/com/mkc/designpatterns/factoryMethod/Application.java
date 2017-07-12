package com.mkc.designpatterns.factoryMethod;

import java.util.Scanner;
import com.mkc.designpatterns.factoryMethod.console.LoggerConsole;
import com.mkc.designpatterns.factoryMethod.logger.Logger;

public class Application {

	public static void main(String[] args) {

		Logger loggerConsole = new LoggerConsole();
		//Logger loggerTxt = new LoggerTxt();

		new Application().log(loggerConsole);
	}

	public void log(Logger logger) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String mensagem = scanner.nextLine();
			logger.log(mensagem);
		}
	}
}

package com.mkc.designpatterns.factoryMethod;

import java.util.Scanner;
import com.mkc.designpatterns.factoryMethod.console.LoggerConsole;
import com.mkc.designpatterns.factoryMethod.logger.Logger;
import com.mkc.designpatterns.factoryMethod.txt.LoggerTxt;

public class Application {

	public static void main(String[] args) {

		//Logger logger = new LoggerConsole();
		Logger logger = new LoggerTxt();

		new Application().log(logger);
	}

	public void log(Logger logger) {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String mensagem = scanner.nextLine();
			logger.log(mensagem);
		}
	}
}

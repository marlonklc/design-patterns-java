package com.mkc.designpatterns.factoryMethod;

import java.util.Scanner;
import com.mkc.designpatterns.factoryMethod.console.LoggerConsole;
import com.mkc.designpatterns.factoryMethod.logger.Logger;
import com.mkc.designpatterns.factoryMethod.txt.LoggerTxt;

public class Application {

	public static void main(String[] args) {

		new Application().testaConsole();
		//new Application().testaTxt();
	}

	public void testaConsole() {
		Logger logger = new LoggerConsole();

		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String mensagem = scanner.nextLine();
			logger.log(mensagem);
		}
	}

	public void testaTxt() {
		Logger logger = new LoggerTxt();

		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			String mensagem = scanner.next();
			logger.log(mensagem);
		}
	}


}

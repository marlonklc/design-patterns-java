package com.mkc.designpatterns.factoryMethod.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Marlon on 11/07/2017.
 */
public class DateTimeUtils {

	public static String dataHoraAtual() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	}
}

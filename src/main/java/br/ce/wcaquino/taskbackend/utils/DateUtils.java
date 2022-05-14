package br.ce.wcaquino.taskbackend.utils;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
@UtilityClass
public class DateUtils {

	public static boolean isEqualOrFutureDate(LocalDate date) {
		return date.isEqual(LocalDate.now()) || date.isAfter(LocalDate.now());
	}
}

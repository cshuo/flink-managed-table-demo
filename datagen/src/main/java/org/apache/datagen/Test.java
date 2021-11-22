package org.apache.datagen;

import org.apache.commons.lang3.time.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtils.addDays(new Date(), -1);
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(sdf.format(date));
		date.setHours(0);
		date.setMinutes(0);
		date.setSeconds(0);
		System.out.println(sdf.format(date));
	}
}

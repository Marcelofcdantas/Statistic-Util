package br.com.codenation;

import java.util.Arrays;

// Dica do sort vista no repositório do Gustavo Souza

public class StatisticUtil {

	public static int average(int[] elements) {
		int sum = 0;
		for (int index = 0; index < elements.length; index ++) {
			sum += elements[index];
		}
		int average = sum / elements.length;
		return average;
	}

	public static int mode(int[] elements) {
		int greater = 0;
		int repetition = 0;
		int mode = 0;
		for (int index = 0; index < elements.length; index ++) {
			for (int insideIndex = 0; insideIndex < elements.length; insideIndex ++) {
				if (elements[index] == elements[insideIndex]) {
					repetition += 1;
				}
			}
			if (repetition > greater) {
				greater = repetition;
				mode = elements[index];
			}
			repetition = 0;
		}
		return mode;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int median = 0;
		int arraySize = elements.length;
		int index = (int)Math.ceil(arraySize / 2);
		if (arraySize % 2 == 1) {
			median = elements[index];
		} else {
			median = (elements[index] + elements[index - 1]) / 2;
		}
		return median;
	}
}
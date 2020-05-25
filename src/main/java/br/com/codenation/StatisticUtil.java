package br.com.codenation;

import java.util.ArrayList;

import java.util.Collection;

import java.util.Collections;

import java.util.List;


public class StatisticUtil {


	public static int average(int[] elements) {
		int soma = 0;
		double media = 0;

		for(int elemento : elements){
			soma += elemento;
			media = soma / elements.length;
		}
		return (int)Math.round(media);
	}


	public static int mode(int[] elements) {

		List<Integer> listaNumeros = new ArrayList<>();

		for (int elemento : elements){
			listaNumeros.add(elemento);
		}

		int frequencia = Collections.frequency(listaNumeros, listaNumeros.get(0));
		int numMax = listaNumeros.get(0);
		int numRepeticoes = frequencia;


		for (int elemento : listaNumeros){
			frequencia = Collections.frequency(listaNumeros, elemento);


			if (frequencia > numRepeticoes) {
				numMax = elemento;
				//numRepeticoes = frequencia;


			}

		}
		return numMax;
	}


	public static int median(int[] elements) {

		List<Integer> listaNumeros = new ArrayList<>();

		for(int elemento : elements){
			listaNumeros.add(elemento);
		}

		Collections.sort(listaNumeros);

		double mediana;
		int verificaPar = listaNumeros.size() % 2;
		System.out.println(verificaPar);

		if (verificaPar == 0){
			mediana = ( listaNumeros.get(
					((listaNumeros.size() / 2) - 1))
					+ (listaNumeros.get(listaNumeros.size() /2))
			) / 2;
			System.out.println(listaNumeros.get(
					((listaNumeros.size() / 2))));
		}else {
			mediana = listaNumeros.get(listaNumeros.size() / 2);
		}
		return (int)mediana;
	}

	public static void main(String[] args) {
		int[] number = {1, 2, 4, 5, 6};

		System.out.println(median(number));

	}
	}

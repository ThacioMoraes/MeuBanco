package br.com.digitalhouse.meubanco;

import br.com.digitalhouse.meubanco.models.Cliente;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(10, "josé");

        double[] nums = new double[2];
        nums[0] = 1.0;
        nums [1] = 2.0;

        cliente.setNumeros(nums);

        System.out.println(nums[0]);
    }
}

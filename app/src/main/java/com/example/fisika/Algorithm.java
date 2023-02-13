package com.example.fisika;

public class Algorithm {
    private  final long g = (long) 3.721;
    public  Algorithm() {

    }
    public long absoluteWeightCalculation(String input) {
        if (input.contains(",")) {
            String inputMod = input.replace(",", ".");
            float inputFloat = Float.parseFloat(inputMod);
            return (long) (inputFloat * 100);
        }else {
            float inputFloat = Float.parseFloat(input);
            return (long) (inputFloat * 100);

        }
    }
}

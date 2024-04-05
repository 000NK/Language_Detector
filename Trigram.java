/*
 *Main
 *
 * 20.0.2
 *
 * Noa Kang
 *
 * Project 4 - Trigrams
 */

public class Trigram {

    private String sequence;
    private double frequency;

    //constructor method
    public Trigram(String sequence, int frequency) {
        this.sequence = sequence;
        this.frequency = frequency;
    }

    //getter / setter for the variable 'frequency'
    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    //getter / setter for the variable 'sequence'
    public String getSequence() {
        return sequence;
    }
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    //increments frequency
    public void incrementCount() {
        frequency++;
    }

    //check if parameter text equals to the sequence
    public boolean equals(String text) {
        return sequence.equals(text);
    }

    //output of the class whenever its being printed by System.out.print()/println()
    public String  toString() {
        return "\"" + sequence + "\""+ ": " + frequency;
    }

}//end class Trigram

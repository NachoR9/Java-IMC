package dev.nacho.imc.models;

public class CalculatorImc {

  private Person person;
  private double imc;

  public CalculatorImc(Person person, double imc) {
    this.person = person;
    this.imc = imc;
}

public void calculate() {
    imc = Math.rint((person.getWeight() / Math.pow(person.getHeight(),2))*100)/100;
  }

public Person getPerson() {
    return person;
}

public double getImc() {
    return imc;
}
}
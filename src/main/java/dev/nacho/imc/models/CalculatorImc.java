package dev.nacho.imc.models;

public class CalculatorImc {

  private Person person;
  private double imc;

  public CalculatorImc(Person person) {
    this.person = person;

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

public String classifyIMC() {
  if (imc < 16) {
      return "Severe Underweight";
  } else if (imc >= 16 && imc < 16.99) {
      return "Moderate Underweight";
  } else if (imc >= 17 && imc < 18.49) {
      return "Mild Underweight";
  } else if (imc >= 18.5 && imc < 24.99) {
      return "Normal weight";
  } else if (imc >= 25 && imc < 29.99) {
      return "Overweight";
  } else if (imc >= 30 && imc < 34.99) {
      return "Mild Obesity";
  } else if (imc >= 35 && imc < 39.99) {
      return "Moderate Obesity";
  } else {
      return "Morbid Obesity";
  }
}
}
package Forms;

public class Circle extends GeometricForm {
    double raio;

    public Circle(){};

    public Circle(double raio){};

    @Override
    public double AreaCalc() {
        return getRaio() * 2 * 3.14 ; //Calcular area circulo: A=PI * R*2 3.14 == PI
    }

    public String toString(){
        return "Área do Círculo:" + AreaCalc();
    };
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

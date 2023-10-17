package Forms;

public  class Rectangle extends GeometricForm {
    double width;
    double height;

    public Rectangle(){};
     Rectangle(double width, double height){}

    @Override
    public double AreaCalc() {
        return getWidth() * getHeight() ; // calcular area retangulo: Base * Altura
    }

    public String toString(){
         return "Área do Retangulo:" + AreaCalc();
    };

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

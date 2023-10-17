
import Forms.Circle;
import Forms.GeometricForm;
import Forms.Rectangle;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int opc =0;
        int opcForm = 0;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<GeometricForm> Forms = new ArrayList<>();


        while(opc != 3){
            System.out.println("Menu");
            System.out.println(
                            "1 – Inserir e calcular área\n" +
                            "2 – Mostrar todas as formas inseridas\n" +
                            "3 – Sair"
            );
            opc = keyboard.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Escolha a forma :");
                    System.out.println("1 - Circle  \n");
                    System.out.println("2 - Rectangle \n");

                    opcForm = keyboard.nextInt();

                    switch (opcForm){

                        case 1:
                            Circle Circle = new Circle();

                            System.out.println("Digite o raio do Cículo:");
                            Circle.setRaio(keyboard.nextInt());
                            Forms.add(Circle);
                            break;
                        case 2:
                            Rectangle Rectangle = new Rectangle();

                            System.out.println("Digíte a base do Retangulo:");
                            Rectangle.setWidth(keyboard.nextInt());
                            System.out.println("Digíte a altura do Retangulo:");
                            Rectangle.setHeight(keyboard.nextInt());
                            Forms.add(Rectangle);
                            break;
                        default:
                            System.out.println("Ta querendo quebrar o sistema neh campeão ;/");
                    }
                    break;
                case 2:
                    for (GeometricForm GF : Forms) {
                        System.out.println(GF.toString());
                    }
                    break;
                default:
                    System.out.println("Sistema Encerrado!");
            }
            }
        }

    }

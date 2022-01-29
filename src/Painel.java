import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class Painel extends JPanel {
    public void paintComponent(Graphics g){
        List<Circulo> luzesDeNatal = new ArrayList<>();
        Random rand = new Random();
        int i = 0;
        int j = 0;
        int mx = 0;
        int my = 0;
        int limite = 30;
        while(i<limite){
            j = 0;
            while(j<limite){
                mx = i * 30;
                my = j * 30;
                luzesDeNatal.add(new Circulo(mx, my, 10, 10));
                j++;
            }
            i++;
        }

    int count = 10;
    while(count > 0){

        for(int cont = 0; cont < limite * limite; cont++){
            int aleatorio = rand.nextInt(30);
            Color cor = null;
            if(aleatorio % 2 == 0){
                cor = Color.BLACK;
            }else{
                cor = Color.WHITE;
            }

            luzesDeNatal.get(cont).paintComponents(g, cor);
         }
        count--;
    }

    }



}

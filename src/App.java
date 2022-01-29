import javax.swing.*;

public class App {
    public static void main(String[] args) {

        JFrame janelaArvoreNatal = new JFrame("Minha primeira janela");
        janelaArvoreNatal.setBounds(200, 150, 0, 0);
        janelaArvoreNatal.setSize(900, 900);
        janelaArvoreNatal.setVisible(true);
        int limite = 200;
        Painel p = null;
        while(limite > 0){
             p = new Painel();
            janelaArvoreNatal.add(p);
            janelaArvoreNatal.setVisible(true);
            p.setVisible(true);
            sleep(1000);
            p.setVisible(false);
            janelaArvoreNatal.setVisible(false);
            janelaArvoreNatal.remove(p);
            limite--;
        }



    }

    private static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(Exception e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }

}

import java.util.Scanner;
public class Jogodavelha {
    

        public static void main (String[] arg){
            Scanner input = new Scanner(System.in);
            int jogador = 1;
            int linha = 0, coluna = 0;
            char[][] jogo = new char[3][3];
            boolean win = false;
            char esc;


            System.out.println("BEM VINDO AO JOGO DA VELHA");
            System.out.println("escolha sua opção");
            System.out.println("jogador 1 jogar com X, é jogador 2 jogar com O"); 
            while(!win){

                 if(jogador %2 == 1){
                    System.out.println("jogador 1, escolha sua linha e sua coluna entre 1, 2 ou 3");
                    esc = 'x';
                    
                }else{
                    System.out.println("jogador 2 escolha sua linha e coluna 1, 2 ou 3");
                    esc = 'o';
                }
                boolean linhav = false;
                while(!linhav){
                    System.out.println("digite sua linha");
                    linha = input.nextInt();
                    if(linha >=1 && linha <=3){
                        linhav = true;
                    }else{
                        System.out.println("entre com a linha correta");
                    }
                }
                boolean colunav = false;
                while (!colunav){
                    System.out.println("entre com a coluna 1,2 ou 3");
                    coluna = input.nextInt();
                    if (coluna >=1 && coluna <=3) {
                        colunav = true;
                        
                    }else{
                        System.out.println("entre com a coluna certa");
                    }
                }
                linha--;
                coluna--;
                if (jogo[linha][coluna] == 'x'|| jogo[linha][coluna] == 'o' ) {
                    System.out.println("escolha outra posição"); 
                }else {
                    jogo[linha][coluna] = esc;
                    jogador++;
                }
                for (int i = 0; i <jogo.length; i++) {
                    for (int j = 0; j <jogo[i].length; j++) {
                        System.out.print("[" + jogo[i][j] + "] ");
                        
                        
                    }
                    System.out.println();
                } 
                if((jogo[0] [0] == 'x' && jogo [0] [1] == 'x' && jogo [0] [2] == 'x') ||
                    (jogo[1] [0] == 'x' && jogo [1] [1] == 'x' && jogo [1] [2] == 'x') ||
                    (jogo[2] [0] == 'x' && jogo [2] [1] == 'x' && jogo [2] [2] == 'x') ||
                    (jogo[0] [0] == 'x' && jogo [1] [0] == 'x' && jogo [2] [0] == 'x') ||
                    (jogo[0] [1] == 'x' && jogo [1] [1] == 'x' && jogo [2] [1] == 'x') ||
                    (jogo[0] [2] == 'x' && jogo [1] [2] == 'x' && jogo [2] [2] == 'x') ||
                    (jogo[0] [0] == 'x' && jogo [1] [1] == 'x' && jogo [2] [2] == 'x')){
                win = true;
                System.out.println("parabens jogador UM");
                }else if ((jogo[0] [0] == 'o' && jogo [0] [1] == 'o' && jogo [0] [2] == 'o') ||
                        (jogo[1] [0] == 'o' && jogo [1] [1] == 'o' && jogo [1] [2] == 'o') ||
                        (jogo[2] [0] == 'o' && jogo [2] [1] == 'o' && jogo [2] [2] == 'o') ||
                        (jogo[0] [0] == 'o' && jogo [1] [0] == 'o' && jogo [2] [0] == 'o') ||
                        (jogo[0] [1] == 'o' && jogo [1] [1] == 'o' && jogo [2] [1] == 'o') ||
                        (jogo[0] [2] == 'o' && jogo [1] [2] == 'o' && jogo [2] [2] == 'o') ||
                        (jogo[0] [0] == 'o' && jogo [1] [1] == 'o' && jogo [2] [2] == 'o')) {
                win = true;
                System.out.println("parabens jogador 2");    
                }else if (jogador> 9){
                    win = true;
                    System.out.println("ninguem ganhou");
                    input.close();

                }
                
            }
            
        }
    }


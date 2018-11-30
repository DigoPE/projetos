package Elisa;

import jplay.Scene;
import jplay.URL;
import jplay.Window;

public class RostoElisa {

	private Window janela;
	private Scene cena;
	private Boca boca;
	private OlhoEsq olhoesqu;
	private OlhoDir olhodir;

        public RostoElisa(Window window){
        //public RostoElisa(){
		janela = window;
		cena = new Scene();
		//Carregar o arquivo de cenário.
		cena.loadFromFile(URL.scenario("Cenario1.scn"));
		//Passa as cordenadas inicial dele (x,y).
		boca = new Boca(265, 370);
		olhoesqu = new OlhoEsq(100, 60);
		olhodir = new OlhoDir(400, 60);
		//teclado = janela.getKeyboard();
		//O Jplay só aceita arquivos tipo .mid ou .wav
		//Som.play("TheWalkingDead.wav");
		run();
		
	}

    private void run() {
        while (true) {
            cena.draw();
            boca.draw();
            boca.mover();
            
            olhoesqu.draw();
            olhoesqu.mover();

            olhodir.draw();
            olhodir.mover();
            
            janela.update();

        }
    }
}

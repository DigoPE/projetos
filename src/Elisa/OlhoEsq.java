package Elisa;

import jplay.Sprite;
import jplay.URL;

public class OlhoEsq extends Sprite {

	private boolean movendo = true;
		
	//Informa a cordenada do personagem no cenário (x, y)
	public OlhoEsq(int x, int y){
		//Informa a imagem e o número de frame dela(20).
		//super(URL.sprite("jogador.png"), 20);
		super(URL.sprite("olho_esquerdo.png"), 2);
		this.x = x;
		this.y = y;
		this.setTotalDuration(200); //Tempo que ele vai trocar de frames na tela.
	}
	
	public void mover(){

		//If para mudar os frames para trocas as imagems e dar a impressão que os pés estão se mexendo.
		for(int i = 0; i < 100; i++){
			//movendo = true;
			if(movendo){
				update();
				//movendo = false;
			}
		}
		
	}
	
}

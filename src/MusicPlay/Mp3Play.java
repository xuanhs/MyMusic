package MusicPlay;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Mp3Play {
	private String fileName;
	private Player player;
	
	public Mp3Play(String fileName) {
		this.fileName=fileName;
	}
	
	public void play() {
		try {
			BufferedInputStream buff = new BufferedInputStream(new FileInputStream(fileName));
			player = new Player(buff);
			player.play();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

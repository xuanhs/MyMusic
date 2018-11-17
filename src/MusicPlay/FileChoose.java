package MusicPlay;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChoose {
	private static JFileChooser fileChooser = null;
	private static String fileName = null;
	private static FileReader fileReader = null;
	
	public void fileChoose() {
		fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
		FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("mp3","mp3");
		try {
			fileReader = new FileReader(fileChooser.getSelectedFile());
			fileName = fileChooser.getSelectedFile().toString();
			Mp3Play mp3Play = new Mp3Play(fileName);
			mp3Play.play();
			
			fileReader.close();
			JOptionPane.showMessageDialog(null, "Open Success", "Message", 1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("没有选择文件");
		}
		
	}
}

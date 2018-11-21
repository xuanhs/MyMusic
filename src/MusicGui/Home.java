package MusicGui;


/**
 * 主界面
 * 
 */
import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JFrame;

import Event.ChooseFile;

public class Home extends JFrame{
	
	private JFrame home;
	private Button chooseMusic;
	public Home() {
		//窗口
		 home = new JFrame();
		 home.setBounds(400, 200, 500, 300);
		 home.setLayout(null);
		 home.setVisible(true);
		 
		 //按钮
		 chooseMusic = new Button("选择音乐");
		 chooseMusic.setBounds(100, 50, 50, 20);
		 chooseMusic.addActionListener(new ChooseFile());
		 //chooseMusic.setVisible(true);
		 home.add(chooseMusic);
		 
		 
	}
}

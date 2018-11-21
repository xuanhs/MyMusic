package Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MusicPlay.FileChoose;

public class ChooseFile implements ActionListener{

	/**
	 * 选择播放文件响应事件
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("test actionListener");
		FileChoose fileChoose = new FileChoose();
		fileChoose.fileChoose();
	}

}

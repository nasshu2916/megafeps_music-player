

import java.io.File;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

public class PlayerSystem {
	protected Main main;
	protected MediaPlayer mediaPlayer;
	protected VBox panel = new VBox();
	protected int playerNumber;
	protected int playIndex = 0;

	protected File getfFileName() {
		return new File(main.schedules.get(playIndex).getDirectry() + "/"
				+ main.schedules.get(playIndex).getFileName());
	}

	protected static String getSuffix(String fileName) {
		if (fileName == null)
			return null;
		int point = fileName.lastIndexOf(".");
		if (point != -1) {
			return fileName.substring(point + 1);
		}
		return fileName;
	}

	protected void setBorderColor(Color color) {
		panel.setBorder(new Border(new BorderStroke(color,
				BorderStrokeStyle.SOLID, CornerRadii.EMPTY,
				new BorderWidths(10))));
	}

	protected void mediaPlay() {
		mediaPlayer.play();
		setBorderColor(Color.RED);
	}

	protected void mediaStop() {
		mediaPlayer.stop();
		setBorderColor(Color.BLUE);
	}

	protected void mediaPause() {
		mediaPlayer.pause();
		setBorderColor(Color.BLUE);
	}

	protected void setPlayIndex(int playIndex) {
		this.playIndex = playIndex;
	}
	
	protected int getPlayIndex() {
		return playIndex;
	}

}
package gameOfLive;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.util.RandomAccess;;

public class Simulation {
	Set<Bug> boardSet = new HashSet<Bug>();
	Set<Bug> toDraw = new HashSet<Bug>();
	Set<Bug> toDelete = new HashSet<Bug>();
	int xySize = 0;
	double tresholdValue = 0.5;

	public Simulation() {
		this.boardSet = boardSet;
		this.toDraw = toDraw;
		this.toDelete = toDelete;
	}

	void fillRandomCells() {
		xySize = MyInterface.inputNumber;
		Random randomValue = new Random();

		for (int i = 1; i < xySize + 1; i++) {
			for (int j = 1; j < xySize + 1; j++) {
				if (randomValue.nextDouble() > tresholdValue) {
					Bug bug = new Bug(i, j);
					boardSet.add(bug);
				}
			}
		}
	}

//	public Set<Bug> getBoardSet() {
//		return boardSet;
//	}
//
//	public void setBoardSet(Set<Bug> boardSet) {
//		this.boardSet = boardSet;
//	}


}

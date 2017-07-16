package gameOfLive;

import java.util.Set;
import java.util.HashSet;
import java.util.Random;
//import java.sql.Time;
//import java.util.Iterator;
//import java.util.RandomAccess;;

public class Simulation {
	private Set<Bug> boardSet = new HashSet<Bug>();
	private Set<Bug> toDraw = new HashSet<Bug>();
	private Set<Bug> toDelete = new HashSet<Bug>();
	// Set<Bug> pixels = new HashSet<Bug>();

	private int xySize;
	double tresholdValue = 0.4;

	public Simulation() {
		
		xySize = MyInterface.inputNumber;
//		Random randomValue = new Random();
		fillRandomCells();
		boardSet.addAll(toDraw);
		boardSet.removeAll(toDelete);
	}

	public Set<Bug> makeNewBoardSet(Set<Bug> boardSet, Set<Bug> toDraw, Set<Bug> toDelete) {
		boardSet.addAll(toDraw);
		boardSet.removeAll(toDelete);
		return boardSet;
	}

	private Set<Bug> fillRandomCells() {
//		Set<Bug> boardSet = new HashSet<Bug>();
		Random randomValue = new Random();
		for (int i = 1; i < xySize + 1; i++) {
			for (int j = 1; j < xySize + 1; j++) {
				if (randomValue.nextDouble() < tresholdValue) {
					Bug bug = new Bug(i, j);
					boardSet.add(bug);
				}
			}
		}
		return boardSet;
	}

	public Set<Bug> getBoardSet() {
		return boardSet;
	}

//	 public void setBoardSet(Set<Bug> boardSet) {
//	 this.boardSet = boardSet;
//	 }

}
// calculateBugsToDelete(xySize,boardSet,toDraw,toDelete);

// void fillRandomCells() {
//
// }

// public Set<Bug> getBoardSet() {
// return boardSet;
// }
//
// public void setBoardSet(Set<Bug> boardSet) {
// this.boardSet = boardSet;
// }

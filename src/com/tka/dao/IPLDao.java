package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class IPLDao {
	private List<Player> ipl_db= null;
	
	public List<Player> getAllPlayers(){
		
		ipl_db = new ArrayList<>();
		
		// RCB
		ipl_db.add(new Player(15, "Virat Kohli", 55, 5, "RCB"));
		ipl_db.add(new Player(16, "Phil Salt", 48, 4, "RCB"));
		ipl_db.add(new Player(17, "Rajat Patidar", 50, 4, "RCB"));
		ipl_db.add(new Player(18, "Liam Livingstone", 52, 3, "RCB"));
		ipl_db.add(new Player(19, "Jitesh Sharma", 45, 4, "RCB"));
		ipl_db.add(new Player(20, "Tim David", 46, 3, "RCB"));
		ipl_db.add(new Player(21, "Krunal Pandya", 40, 5, "RCB"));
		ipl_db.add(new Player(22, "Bhuvneshwar Kumar", 35, 8, "RCB"));
		ipl_db.add(new Player(23, "Josh Hazlewood", 38, 9, "RCB"));
		ipl_db.add(new Player(24, "Yash Dayal", 32, 7, "RCB"));
		ipl_db.add(new Player(25, "Suyash Sharma", 30, 7, "RCB"));

		// MI
		ipl_db.add(new Player(26, "Rohit Sharma", 54, 5, "MI"));
		ipl_db.add(new Player(27, "Ryan Rickelton", 47, 4, "MI"));
		ipl_db.add(new Player(28, "Suryakumar Yadav", 58, 5, "MI"));
		ipl_db.add(new Player(29, "Tilak Varma", 50, 4, "MI"));
		ipl_db.add(new Player(30, "Hardik Pandya", 49, 6, "MI"));
		ipl_db.add(new Player(31, "Naman Dhir", 42, 4, "MI"));
		ipl_db.add(new Player(32, "Mitchell Santner", 38, 7, "MI"));
		ipl_db.add(new Player(33, "Deepak Chahar", 36, 8, "MI"));
		ipl_db.add(new Player(34, "Trent Boult", 40, 9, "MI"));
		ipl_db.add(new Player(35, "Jasprit Bumrah", 45, 10, "MI"));
		ipl_db.add(new Player(36, "Ashwani Kumar", 28, 7, "MI"));

		// SRH
		ipl_db.add(new Player(37, "Abhishek Sharma", 56, 4, "SRH"));
		ipl_db.add(new Player(38, "Travis Head", 58, 4, "SRH"));
		ipl_db.add(new Player(39, "Ishan Kishan", 50, 4, "SRH"));
		ipl_db.add(new Player(40, "Nitish Kumar Reddy", 48, 5, "SRH"));
		ipl_db.add(new Player(41, "Heinrich Klaasen", 55, 4, "SRH"));
		ipl_db.add(new Player(42, "Aniket Verma", 40, 4, "SRH"));
		ipl_db.add(new Player(43, "Abhinav Manohar", 38, 4, "SRH"));
		ipl_db.add(new Player(44, "Pat Cummins", 42, 8, "SRH"));
		ipl_db.add(new Player(45, "Harshal Patel", 36, 8, "SRH"));
		ipl_db.add(new Player(46, "Mohammed Shami", 37, 8, "SRH"));
		ipl_db.add(new Player(47, "Rahul Chahar", 34, 7, "SRH"));
		
		return ipl_db;
	}

	
	
	
}

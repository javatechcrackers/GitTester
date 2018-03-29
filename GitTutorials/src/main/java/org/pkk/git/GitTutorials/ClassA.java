package org.pkk.git.GitTutorials;

public class ClassA {
	
	public void display(){
		new Thread(
				() -> {
					System.out.println("CLASS A");
				}
				).start();
			
		}
	
	

}

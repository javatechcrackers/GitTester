package org.pkk.git.GitTutorials;

public class ClassB {

	public void display(){
		new Thread(
				() -> {
					
					System.out.println("CLASS B-B");
				}
				).start();
			
		}
	
}

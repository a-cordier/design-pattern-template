package com.acordier.patterns;

/* Template design pattern: Defines a step by step
 * contract to implement a complex behavior 
 * (eg: moving data from a DBMS to another)
 */
public abstract class DbMigrationTemplate {
	
	/* Template contract must not be overridden
	 */
	public final void migrate(){
		dump();
		transform();
		load();
	}
	
	/* Note that any of this methods 
	 * could provide a default implementation 
	 * by being concretely defined
	 */
	public void dump(){ // Default implementation
		System.out.println("default implementation form dumping data: dumping MySQL data");
	}
	public abstract void transform();
	public abstract void load();
	
}

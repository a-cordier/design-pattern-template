package com.acordier.patterns;

public class MySqlToPostgreSqlMigration extends DbMigrationTemplate {

	public MySqlToPostgreSqlMigration() {
	}
	
	

	/* using default superclass default implementation for dumping data
	 * (definition is not mandatory but put for better clarity)  
	 */
	@Override
	public void dump() {
		super.dump();
	}


	@Override
	public void transform() {
		System.out.println("Migrating data from mySQL to postgresql: transforming data");
		/* specific implementation */
	}




	@Override
	public void load() {
		System.out.println("Migrating data from mySQL to postgresql: loading data");
		/* specific implementation */
	}

}

package com.acordier.patterns;

public class OrcaleDbToPostgreSqlMigration extends DbMigrationTemplate {

	public OrcaleDbToPostgreSqlMigration() {
	}
	
	

	@Override // overriding default superclass default implementation for dumping data
	public void dump() {
		System.out.println("Moving data from Oracle DB to PostgreSQL: dumping data");
		/* specific implementation */
	}



	@Override
	public void transform() {
		System.out.println("Moving data from Oracle DB to PostgreSQL: transforming data");
		/* specific implementation */
	}

	@Override
	public void load() {
		System.out.println("Moving data from Oracle DB to PostgreSQL: loading data");
		/* specific implementation */

	}

}

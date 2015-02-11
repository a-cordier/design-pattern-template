package com.acordier.patterns;

public class TemplateApp {



	public static void main(String[] args) {
		DbMigrationTemplate dbMigrationTemplate;
		System.out.println("Moving data from MySQL to PostgreSQL: ");
		dbMigrationTemplate = new MySqlToPostgreSqlMigration();
		dbMigrationTemplate.migrate();
		System.out.println("// Done.");
		System.out.println("Moving data from Oracle Db to PostgreSQL: ");
		dbMigrationTemplate = new OrcaleDbToPostgreSqlMigration();
		dbMigrationTemplate.migrate();
		System.out.println("// Done.");
		
	}

}

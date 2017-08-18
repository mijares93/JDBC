package db;

import db.beans.Admin;
import db.tables.AdminManager;
import util.InputHelper;

import java.sql.*;

/**
 * Created by mijares on 01/08/2017.
 */
public class Main {


	public static void main(String[] args) throws Exception {

		AdminManager.displayAllRows();

/*		//INSERT PART
		Admin bean = new Admin();
		bean.setUserName( InputHelper.getInput( "User Name" ) );
		bean.setPassword( InputHelper.getInput( "Password" ) );

		boolean result = AdminManager.insert( bean );

		if (result){
			System.out.print( "New row with primary key " + bean.getAdminId() + "was inserted!" );
		}

	}
*/
/*		UPDATE PART
		int adminId = InputHelper.getIntegerInput( "Select a row to update: " );

		Admin bean = AdminManager.getRow( adminId );
		if (bean == null) {
			System.err.println( "Row not found" );
			return;
		}

		String password = InputHelper.getInput( "Enter new Password" );
		bean.setPassword( password );
		if (AdminManager.update( bean )) {
			System.out.println( "Success!" );
		} else {
			System.err.println( "whoops" );
		}
		*/
	int adminId = InputHelper.getIntegerInput( "Select a row to delete: " );
	if(AdminManager.delete( adminId )){
		System.out.println("Success");
	}else {
		System.err.println("Nothing to delete");
	}

	}
}

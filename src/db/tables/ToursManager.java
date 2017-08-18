package db.tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

public class ToursManager {

    public static void displayData(ResultSet rs) throws SQLException {
        while(rs.next()){
            StringBuffer buffer = new StringBuffer();

            int idtours = rs.getObject( "idtours", Integer.class );
            String tourName = rs.getObject( "tourName", String.class );
            double price = rs.getObject( "Tour", Double.class );

            buffer.append("Tour " + idtours + ": ");
            buffer.append(tourName );
            NumberFormat nf = NumberFormat.getCurrencyInstance();
            String formattedPrice = nf.format(price);
            buffer.append("(" + formattedPrice + ")");
            System.out.println(buffer.toString());
        }
    }
}

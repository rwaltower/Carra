/*
 * GUI to display when a date is selected
 * If we implement this we could remove the "create event" button from the
 * main page, but I actually kind of like it there either way
 */
package scheduler;

import javax.swing.JTable;

/**
 *
 * @author Cliff
 */
public class DateSelected {

    public DateSelected(JTable tbl, int row, int col) {
        tbl.setVisible(false);
    }
    
}

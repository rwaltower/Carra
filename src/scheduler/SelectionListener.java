/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduler;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Ayomitunde
 */
class SelectionListener implements ListSelectionListener {

    JTable _table;
    EditUser _eu;

    SelectionListener(JTable table, EditUser eu) {
        this._table = table;
        this._eu = eu;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(e.getValueIsAdjusting()){
            _eu.getUser();
        }
    }
}

package UnidadDos.AbsteractTabletModels;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Familiadc
 */
public class TablaATM extends AbstractTableModel{
    int fila = 0;
    int columna = 0;
    public TablaATM(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }

    //filas
    @Override
    public int getRowCount() {
        return fila;
    }

    //columnas
    @Override
    public int getColumnCount() {
        return columna;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       int xi=0;
           xi = fila;
       switch (columnIndex){
           
           case 0:
               rowIndex = fila;
               
       }
        return null;
   
    }          
}

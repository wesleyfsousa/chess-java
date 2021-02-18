package boardgame;

public class Position {
    private int row;
    private int column;

    public Position (int row, int column)
    {
        this.row = row;
        this.column = column;
    }
    
    public int getRow()
    {
        //Retorna os valores da linha.
        return row;
    }
    
    public void setRow(int row)
    {
        this.row = row;
    }

    public int getColumn()
    {
        //Retorna os valores da coluna.
        return column;
    }

    public void setColumn(int column)
    {
        this.column = column;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
}

public class Cell{
    CellStatus state = CellStatus.EMPTY;

    public void setState(CellStatus state){
        this.state = state;
    }
    public CellStatus getState(){
        return state;   
    }
    public void setCell(Cell cll){
        this.state = cll.getState();
    }
}
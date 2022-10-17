public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime = 0;
        plane.trailWidth = 10;
        grid2Loops();
    }
    public void grid2Loops() {
        for (int y=0; y<7;y=y+1) {
            for (int x = 0; x < 10; x = x + 1) {
                plane.trailWidth = plane.random(2, 30);
                plane.setColor(200, y * 30, x + 20);
                plane.teleport(x * 100, y * 100);
                System.out.println(x);
                plane.square(100);
            }
        }

    }
    public void squareRow() {
        for(int x=0;x<5;x=x+1) {
            System.out.println(x);
            plane.square(100);

        }
    }
    public void grid(){
        for (int y=0;y<7;y=y+1) {
            squareRow();
            }
        }
    }

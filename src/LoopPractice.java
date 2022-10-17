public class LoopPractice extends World {


    public void go() {
        plane.pausetime=0;
        //create a for loop that draws 10 random shape in 10 random places
        for(int x=0;x<10;x=x+1) {
            System.out.println(x);
            plane.teleport(plane.random(0,1000),plane.random(0,800));
//            drawRandomShape();
//              square();
            plane.startingAngle(90);
            plane.isTrail = true;
            plane.trailWidth = ((int) (Math.random() * 255));
            for (int y = 0; y < 10; y = y + 1) {
                plane.turn(90);
                plane.move(100);
            }
        }
    }


    public void drawRandomShape(){
        int random = plane.random(0, 3);//either 0,1, or 2
        System.out.println("our random number is " + random);
        if (random == 0)
            for(int x=0;x<5;x=x+1)
                plane.square(100);
        if (random == 1) {
            for(int x=0;x<5;x=x+1)
                plane.house(100);
        }
        if (random == 2) {
            for (int x = 0; x < 5; x = x + 1)
                plane.fillCircle(100);
        }



    }
    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = ((int) (Math.random() * 255));
        for (int x = 0; x < 10; x = x + 1) {
            plane.turn(90);
            plane.move(100);
        }
    }
}

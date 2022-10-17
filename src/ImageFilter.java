public class ImageFilter extends World {
    public void go(){
        plane.pausetime=0;
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();
        System.out.println(plane.howMuchRed());
        square();

        int red = 0;
        int green = 0;
        int blue = 0;
        for (int row = 100; row < 500; row = row + 1) {
            for (int col = 300; col < 900; col++) {
                plane.teleport(col, row);



                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                System.out.println("more");
                if (red > 200 && green < 300 && blue < 70) {


//                plane.teleport(col, 488 - row);
                    if(col%3==0) {
                        plane.setPixelColor(0, 128, 0);
                    }
                    System.out.println("test");
                    plane.teleport(col+100,row);
                    plane.setPixelColor(222, 128, 0);

                }
            }
        }
        for (int row = 500; row < 700; row = row + 1) {
            for (int col = 400; col < 700; col++) {
                plane.teleport(col, row);


                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red > 200 && green > 130 && blue > 0) {


//                plane.teleport(col, 488 - row);
                    plane.setPixelColor(0, 100, 100);
                }
            }
        }
    }



    public void square() {
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.trailWidth = ((int) (Math.random() * 255));
        for (int x = 0; x < 10; x = x + 1) {
            plane.turn(90);
            plane.move(1000);
        }
    }
}

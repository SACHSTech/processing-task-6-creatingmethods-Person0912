import processing.core.PApplet;

public class Sketch extends PApplet {
	
  // Window size
  public void settings() {
    size(400, 400);
  }

  // Setup values
  public void setup() {
    background(173, 244, 255);
    textSize(20);
    textAlign(CENTER, CENTER);
  }

  // Images drawn to the screen
  public void draw() {
	  
    // Level 2 method
    drawFlower(100, 100, 50);
    drawFlower(200, 100, 50);
    drawFlower(300, 100, 50);

    // Level 3 method
    drawFace(100, 300, 100, 255, 206, 107, 255, 255, 255, 255, 255, 255);
    drawFace(200, 300, 100, 143, 255, 191, 64, 54, 255, 155, 54, 255);
    drawFace(300, 300, 100, 255, 125, 129, 0, 0, 0, 255, 248, 33);

    // Level 4 x and y coordinates of drawing
    text(drawFlower(100, 200, 50), 100, 200);
    text(drawFace(300, 200, 100, 
    255, 255, 255, 
    54, 31, 5, 
    255, 165, 156), 300, 200);
  }
  
  /**
   * Level 2 method that draws a flower
   * @param fltX The x coordinate
   * @param fltY The y coordinate
   * @param fltSize The size of each part of the flower
   * @return The string of the x and y coordinates
   */
  public String drawFlower(float fltX, float fltY, float fltSize){
    
    // Distance for flower petals
    float fltFlowerDist = fltSize * 5/12;

    // Flower petals
    noStroke();
    fill(250, 180, 180);;
    ellipse(fltX - fltFlowerDist, fltY - fltFlowerDist, fltSize, fltSize);
    ellipse(fltX + fltFlowerDist, fltY - fltFlowerDist, fltSize, fltSize);
    ellipse(fltX - fltFlowerDist, fltY + fltFlowerDist, fltSize, fltSize);
    ellipse(fltX + fltFlowerDist, fltY + fltFlowerDist, fltSize, fltSize);
    
    // Flower centre
    fill(240, 231, 163);
    ellipse(fltX, fltY, fltSize, fltSize);

    // Level 4 return statement for x and y coordinates
    fill(0, 45, 143);
    return fltX + ", " + fltY;
  }

  /**
   * Level 3 method that draws a face
   * @param fltX The x coordinate position
   * @param fltY The y coordinate position
   * @param fltSize The size of the head
   * @param fltHeadR The head's red value
   * @param fltHeadG The head's green value
   * @param fltHeadB The head's blue value
   * @param fltEyeR The eye's red value
   * @param fltEyeG The eye's green value
   * @param fltEyeB The eye's blue value
   * @param fltMouthR The mouth's red value
   * @param fltMouthG The mouth's green value
   * @param fltMouthB The mouth's blue value
   * @return A string of the x and y coordinates
   */
  public String drawFace
  (float fltX, float fltY, float fltSize, 
  float fltHeadR, float fltHeadG, float fltHeadB, 
  float fltEyeR, float fltEyeG, float fltEyeB,
  float fltMouthR, float fltMouthG, float fltMouthB){
    
    // Variables for eye distance and size
    float fltEyeDist = fltSize / 3;
    float fltEyeSize = fltSize / 10;

    // Variable for mouth size
    float fltMouthSize = fltSize / 4;
    
    // Head
    fill(fltHeadR, fltHeadG, fltHeadB);
    stroke(fltHeadR, fltHeadG, fltHeadB);
    ellipse(fltX, fltY, fltSize, fltSize);
    
    // Left and right eye
    fill(fltEyeR, fltEyeG, fltEyeB);
    ellipse(fltX - fltEyeDist, fltY, fltEyeSize, fltEyeSize);
    ellipse(fltX + fltEyeDist, fltY, fltEyeSize, fltEyeSize);

    // Mouth
    fill(fltMouthR, fltMouthG, fltMouthB);
    arc(fltX, fltY, fltMouthSize, fltMouthSize, 0, radians(180), CHORD);

    // Level 4 return statement for x and y coordinates
    fill(0, 45, 143);
    return fltX + ", " + fltY;
  }
}
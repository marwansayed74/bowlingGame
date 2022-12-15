public class Game {
    int []rolled=new int[22];
    private int currendBall=0;

    public void roll(int pins) {
        rolled[currendBall]=pins;
        currendBall++;
    }
    public int score() {
        int score=0;
        int thisBall=0;
        for(int i=0;i<10;i++)
        {
            if(rolled[thisBall]==10)
            {
                score+=10+rolled[thisBall+1]+rolled[thisBall+2];
                thisBall+=1;
            }
            else if(rolled[thisBall]+rolled[thisBall+1]==10)
            {
                score+=10+rolled[thisBall+2];
                thisBall+=2;
            }
            else
            {
                score += rolled[thisBall] + rolled[thisBall+1];
                thisBall+=2;
            }
        }
        return score;
    }
}

public class Lab2
{
    public static void cleanSquare()
    {
        Robot.load("square.txt");
        Robot.setDelay(0.1);
        clearRowTurn(); 
        clearRowTurn();
        clearRowTurn();
        clearRowTurn();

        //INSERT CODE HERE
    }

    public static void moveForwardClear()
    {
        Robot.move();
        Robot.makeLight();
        //pre: The Robot is facing a dark block
        //post: The Robot has moved forward one and stands on a light block

    }

    public static void clearRow()
    {
        moveForwardClear();
        moveForwardClear();
        moveForwardClear();
        moveForwardClear();
        moveForwardClear();
        Robot.move();
        //pre: Uncleared row in front of the Robot
        //post: Robot is at end of row facing the wall and the row is all light
    }

    public static void clearRowTurn()
    {
        clearRow();
        Robot.turnLeft(); 
        //Pre: Uncleared row in front of the Robot
        //post: Robot is at end of a all light row facing another uncleared row
    }

    public static void darkenComb()
    {
        Robot.load("comb.txt");
        Robot.setDelay(0.05);

        //INSERT CODE HERE
        darkenCombRowReturn();
        darkenNextRow();
        darkenNextRow();
        darkenNextRow();
        darkenNextRow();

    }

    public static void turnRight()
    {
        Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
        //Pre: Robot faces a direction
        //Post: Robot has rotated 90 degrees right
    }

    public static void moveForwardDark()
    {
        Robot.move();
        Robot.makeDark();
        //Pre: Robot faces a dark square
        //Post: Robot moves one square forward and darkens the square
    }

    public static void darkenCombRow()
    {
        moveForwardDark();
        moveForwardDark();
        moveForwardDark();
        moveForwardDark();
        moveForwardDark();
        moveForwardDark();
        //Pre: Robot faces a light row
        //Post: Robot is at the end of the row and the row is dark
    }

    public static void turnAround()
    {
        turnRight();
        turnRight();
        //Pre: Robot faces a direction
        //Post: Robot rotates 180 degrees
    }

    public static void moveRow()
    {
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        Robot.move();
        moveForwardDark();
        //Pre: Robot faces a darkened row that has the last square still light
        //Post: Robot moves to the end of the row and the row is darkened 
    }

    public static void darkenCombRowReturn()
    {
        turnRight();
        darkenCombRow();
        turnAround();
        moveRow();
        turnRight();
        //Pre: Robot faces a light row
        //Post: Robot back to original position facing north and the row it was facing is dark 
    }

    public static void darkenNextRow()
    {
        moveForwardDark();
        Robot.move();
        darkenCombRowReturn();
        //Pre: Robot faces north and next row is light
        //Post: Robot's position has move up 2 units and is facing north. The row it is next to is darkened. 
    }

    public static void makeCheckered()
    {
        Robot.load("blank.txt");
        Robot.setDelay(0.05);

        //INSERT CODE HERE
        checkerTwoColumns();
        checkerTwoColumns();
        checkerTwoColumns();
        checkerColumn();
        columnToRight();
        checkerColumn();
        Robot.makeDark();
    }

    public static void checkerSquare()
    {
        Robot.makeDark();
        Robot.move();
        Robot.move();
        //Pre: The Robot is on a light sqaure
        //Post: The light square is now darkened and the Robot has move up two units

    }

    public static void checkerColumn()
    {
        checkerSquare();
        checkerSquare();
        checkerSquare();
        //Pre: The Robot is at the start of a column
        //Post: The Robot has moved 7 units up and is on a light square. From its starting position, every other square has been darkened
    }

    public static void columnToRight()
    {
        Robot.makeDark();
        Robot.move();
        turnRight();
        Robot.move();
        turnRight();
        //Pre: The Robot is facing the last square of a column and is on a light square. 
        //Post: The Robot is at the beginning of the column one unit to the right of the robot facing rest of the column and the starting square is darkened
    }

    public static void columnToLeft()
    {
        Robot.makeDark();
        Robot.move();
        Robot.turnLeft();
        Robot.move();
        Robot.turnLeft();
        //Pre: The Robot is facing the last square of a column and is on a light square. 
        //Post: The Robot is at the beginning of the column one unit to the left of the robot facing rest of the column and the starting square is darkened
    }

    public static void checkerTwoColumns()
    {
        checkerColumn();
        columnToRight();
        checkerColumn();
        columnToLeft();
        //Pre: The Robot is facing a column that is all light
        //Post: The Robot has checkered the column it was originally on and the one next to it and has moved two units right facing north
    }
}

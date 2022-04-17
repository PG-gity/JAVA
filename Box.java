package com.company;

class Box{
    private int length,breadth,height;
    public void setDimension(int l,int b,int h){
        length = l;
        breadth = b;
        height = h;
    }
    public void showDimension(){
        System.out.println("L = "+ length);
        System.out.println("B = "+ breadth);
        System.out.println("H = "+ height);
        float area = 2*((length*breadth)+(breadth*height)+(height*length));
        float volume = length*breadth*height;
        System.out.println("Area = "+ area);
        System.out.println("Volume = "+ volume);

    }

}

class Example{
    public static void main(String[] args){
        Box smallBox = new Box();
        smallBox.setDimension(12,10,25);
        smallBox.showDimension();
        smallBox = new Box();
        smallBox.showDimension();
    }

}
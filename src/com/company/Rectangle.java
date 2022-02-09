package com.company;

//opretter ny klasse, som her definere en rektangle
  class Rectangle {
    int width; //hedder felter /klassevariabler
    int height;
    public Rectangle(int width, int height){ //konstruktør
      this.width = width;
      this.height = height;
    }

    int getArea(){
        return width * height;
    }
}

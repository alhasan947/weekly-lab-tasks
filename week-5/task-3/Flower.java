class Flower {
    String whatsYourName() {
        return "Flower";
    }
}
class Jasmine extends Flower {
    String whatsYourName() {
        return "Jasmine";
    }
}
class Lily extends Flower {
    String whatsYourName() {
        return "Lily";
    }
}
class Rose extends Flower {
    String whatsYourName() {
        return "Rose";
    }
}
class State {
    Flower yourNationalFlower() {
        return new Flower();
    }
}
class WestBengal extends State {
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}
class Karnataka extends State {
    Rose yourNationalFlower() {
        return new Rose();
    }
}
class AndhraPradesh extends State {
    Lily yourNationalFlower() {
        return new Lily();
    }
}




public class Solution {
    public static void main(String[] args) {
        State s1 = new AndhraPradesh();
        System.out.println(s1.yourNationalFlower().whatsYourName());

        State s2 = new WestBengal();
        System.out.println(s2.yourNationalFlower().whatsYourName());

        State s3 = new Karnataka();
        System.out.println(s3.yourNationalFlower().whatsYourName());
    }
}

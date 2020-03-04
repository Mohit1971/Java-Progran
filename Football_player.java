class Player{

String p="Player";

}

class Cricket_player extends Player
{

String c="Cricket_player";
}

class Hockey_player extends Player
{

String h="Hockey_player";
}

class Football_player extends Player
{

String f="Football_player";


public static void main(String args[])

{

Football_player r =new Football_player();

System.out.println(r.p);
System.out.println(r.f);



}




}



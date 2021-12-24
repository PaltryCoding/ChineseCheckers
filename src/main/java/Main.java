import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new MyFrame();
//            }
//        });
        new MyFrame();
        System.out.println(MyFrame.pawn2.getx());
        SetBoard board = new SetBoard();
        board.setBoardFor3();
//        System.out.println(board.boardField04.team);

    }

}

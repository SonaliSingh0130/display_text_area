import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
public class choicedisplaytextarea {
 JTextArea textarea;
 JButton button;
 JLabel label;
 
 public ta() {
     setLayout(new FlowLayout());
   textarea = new JTextArea("this is already in there", 16, 30 );
   add(textArea);
   
   button = new JButton("click here to put text into label");
   add(button);
   label = new JLabel("");
   add(label);
   event e = new event();
   button.addActionListener(e);
 }
 public class event implements ActionListener {
     public void actionPerFormed(ActionEvent e) {
         string text = textarea.getText();
         if(text != null ? "" == null: text.equals("")) {
            label.setText("please enter some text");
         } else {
             label,setText(text);
         }
     }
 }
 public static void main(string args[]) {
     ta gui = new ta();
     gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gui.setSize(400,200);
     gui.setvisible(true);
 }
}
 
 
 
 

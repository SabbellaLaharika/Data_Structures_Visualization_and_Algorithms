package linearDataStructures.linkedlists.doubleLinkedLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;

public class DeleteAtPosition  extends CommonCodes implements ActionListener {
    JButton backButton;
    ImageIcon imageLabel;
    JLabel label,algorithmLabel;
    public DeleteAtPosition(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        JLabel heading = headingLabelSetter("Delete At Position Operation", 280, 10, 450, 50);
        add(heading);
        String[] path = {"Images/Linear Data Structures/Linked Lists/Double LL/Delete At Position/17.png",
                        "Images/Linear Data Structures/Linked Lists/Double LL/Delete At Position/18.png",
                        "Images/Linear Data Structures/Linked Lists/Double LL/Delete At Position/19.png",
                        "Images/Linear Data Structures/Linked Lists/Double LL/Delete At Position/20.png"};
        cancelTask();
        label = imageSlider(path, 100,100, 750,200);
        add(label);
        algorithmLabel = algorithmSetter("Images/Linear Data Structures/Linked Lists/Double LL/Delete At Position/Algorithm.png", 150, 300, 750, 500);
        add(algorithmLabel);

    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new DoubleLinkedLists("Data Structures/Linear Data Structures/Linked Lists/Double Linked Lists");
        }  
        dispose();
    }
}


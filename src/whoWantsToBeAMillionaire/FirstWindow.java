package whoWantsToBeAMillionaire;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstWindow extends JFrame
{
    private String buttonAns;

    public void setButtonNull()
    {
        buttonAns = null;
    }
   
    public String firstWindow(String question)
    {
        setTitle("Who Wants To Be A Millionaire");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        String s = question;
        
        JPanel panel = new JPanel();
        JPanel panel3 = new JPanel(new GridBagLayout());
        JPanel lifeLines = new JPanel(new GridBagLayout());

        JButton button = new JButton("A");
        JButton button2 = new JButton("B");
        JButton button3 = new JButton("C");
        JButton button4 = new JButton("D");
        JButton fifty = new JButton("50/50");
        JButton audience = new JButton("Ask the Audience");
        JButton phone = new JButton("Phone a Friend");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        lifeLines.add(fifty);
        lifeLines.add(audience);
        lifeLines.add(phone);

        JLabel label = new JLabel(s);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel3.add(label, gbc);
        
        add(panel, BorderLayout.SOUTH);
        add(panel3, BorderLayout.CENTER);
        add(lifeLines, BorderLayout.NORTH);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                buttonAns = "a";
            }
        });

        button2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                buttonAns = "b";
            }
        });

        button3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                buttonAns = "c";
            }
        });

        button4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                buttonAns = "d";
            }
        });

        fifty.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                buttonAns = "e";
            }
        });

        phone.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                buttonAns = "f";
            }
        });

        audience.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                buttonAns = "g";
            }
        });
        
        return buttonAns;
    }

    
    
}

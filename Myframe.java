import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
	

public class Myframe extends JFrame{
	
	Calendar calender;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(400,250);
        this.setResizable(true);
        
        getContentPane().setBackground(Color.black);
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        
        timeLabel = new JLabel();   
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
        timeLabel.setForeground(new Color(0xFF69B4));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        
        dayLabel = new JLabel();   
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN,35));
        dayLabel.setForeground(new Color(0xFF69B4));
        
        dateLabel = new JLabel();   
        dateLabel.setFont(new Font("Ink Free", Font.PLAIN,35));
        dateLabel.setForeground(new Color(0xFF69B4));
       
        
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        setTime();        
        }
    
	    public Void setTime() {
	    	while (true) {
	    	 time = timeFormat.format(Calendar.getInstance().getTime());
	         timeLabel.setText(time);
	         
	         day = dayFormat.format(Calendar.getInstance().getTime());
	         dayLabel.setText(day);
	         
	         date = dateFormat.format(Calendar.getInstance().getTime());
	         dateLabel.setText(date);
	         
			         try {
						Thread.sleep(1000);
					} 
			         catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    	}
	    }
    

    
}
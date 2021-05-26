package Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class MainFrame extends JFrame {
	private JPanel p1, p2, p3;
	private ImageIcon bg;
	private ImageIcon pt1, pt2, pt3, pt4, pt5, prev1, prev2, next1, next2, logo, user;
	private JButton btnPrev, btnNext;
	private Container c;
	private JLabel lblBg, lblLogo;
	private JButton btnUser;
	private JPanel p4;
	
	public MainFrame(String title, int width, int height) {
	setTitle(title);
	setSize(width, height);
	//setLocation(500, 300);
	setLocationRelativeTo(this);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	c = getContentPane();
	c.setLayout(new BorderLayout());
	
	p4 = new JPanel();
	p4.setLayout(null);
	
    bg = new ImageIcon("image/mainbg.jpg");
    lblBg = new JLabel(bg);
    lblBg.setBounds(0, 0, 1400, 700);
    p4.add(lblBg);
	
	p1 = new JPanel();
	p1.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 100));
	p1.setBackground(Color.BLACK);
	pt1 = new ImageIcon("image/j1.jpg");
	pt2 = new ImageIcon("image/j2.jpg");
	pt3 = new ImageIcon("image/j3.jpg");
	pt4 = new ImageIcon("image/j4.jpg");
	pt5 = new ImageIcon("image/j5.png");
	

	JLabel lblPt1 = new JLabel(pt1);
	JLabel lblPt2 = new JLabel(pt2);
	JLabel lblPt3 = new JLabel(pt3);
	JLabel lblPt4 = new JLabel(pt4);
	JLabel lblPt5 = new JLabel(pt5);
	
//	lblPt1.setBounds(40, 150, 230, 327);
//	lblPt2.setBounds(40, 150, 230, 327);
//	lblPt3.setBounds(40, 150, 230, 327);
//	lblPt4.setBounds(40, 150, 230, 327);
//	lblPt5.setBounds(40, 150, 230, 327);
	p1.add(lblPt1);
	p1.add(lblPt2);
	p1.add(lblPt3);
	p1.add(lblPt4);
	p1.add(lblPt5);
	
	c.add(BorderLayout.CENTER, p1);
	
	p2 = new JPanel();
	p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20,50));
	p2.setBackground(Color.BLACK);
	prev1 = new ImageIcon("image/prev1.png");
	prev2 = new ImageIcon("image/prev2.png");
	next1 = new ImageIcon("image/next1.png");
	next2 = new ImageIcon("image/next2.png");
	
	btnPrev = new JButton(prev1);
	btnPrev.setVerticalTextPosition(SwingConstants.TOP); //JButton.TOPd이랑 똑같음
	btnPrev.setPressedIcon(prev2); //마우스가 올라갔을 때 클릭했을 때 모양이 바뀜
	btnPrev.setBorderPainted(false);
	btnPrev.setFocusPainted(false);
	btnPrev.setBackground(Color.BLACK);
	

	btnNext = new JButton(next1);
	btnNext.setVerticalTextPosition(SwingConstants.TOP); //JButton.TOPd이랑 똑같음
	btnNext.setPressedIcon(next2); //마우스가 올라갔을 때 클릭했을 때 모양이 바뀜
	btnNext.setBorderPainted(false);
	btnNext.setFocusPainted(false);
	btnNext.setBackground(Color.BLACK);
	
	
	
	p2.add(btnPrev);
	p2.add(btnNext);
	
	c.add(BorderLayout.SOUTH, p2);
	

	p3 = new JPanel();
	p3.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
	p3.setBackground(Color.BLACK);


	btnUser = new JButton();
	btnUser.setIcon(new ImageIcon("image/user.png"));
	btnUser.setBorderPainted(false);
	btnUser.setFocusPainted(false);
	btnUser.setBackground(Color.BLACK);
	
	p3.add(btnUser, BorderLayout.EAST);
	
	c.add(BorderLayout.NORTH, p3);
	
    
	
	setVisible(true);
}

	


public static void main(String[] args) {
	new MainFrame("Main", 1400, 700);
}

}

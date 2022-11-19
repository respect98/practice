package day08;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class MyLoginPanel extends JPanel {

	JTextField tfName;
	JPasswordField tfpwd;
	JButton btnLogin;
	//x,y좌표 지정해서 붙이려면 기본 레이아웃을 해제해야 한다.
	//대신 컴포넌트의 사이즈와 x,y좌표를 수동으로 지정해야 한다
	public MyLoginPanel() {
		this.setLayout(null);
		
		tfName=new JTextField(20);
		tfpwd=new JPasswordField(20);
		btnLogin=new JButton("Login");
		
		tfName.setSize(200,50);//w,h
		tfName.setLocation(90,100);//x,y
		
		tfpwd.setBounds(90,170,200,50);//x,y,w,h 
		
		btnLogin.setBounds(90,240,200,50);
		btnLogin.setBackground(new Color(123,123,200));//r,g,b
		btnLogin.setBorder(new LineBorder(Color.gray,3));
		
		tfName.setBorder(new TitledBorder("Name"));
		tfpwd.setBorder(new TitledBorder("PassWord"));
		
		this.add(tfName);
		this.add(tfpwd);
		this.add(btnLogin);
		
	}

}

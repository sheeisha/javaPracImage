
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class ImageDemo implements ItemListener {
	//constructor
	
	
	
	//Atomic Components 
	JLabel jl;
	JComboBox<String> cb; //COMBO BOX WILLHAVE STRING AND THERE IS A LABEL
	ImageIcon ic;
	//INTERMEDIATE
	JPanel p;
	
	//TOP LEVEL 
	JFrame f;
	ImageDemo(){
		//atomic
		cb = new JComboBox<String>(); //CREATING COMBOBOX
		cb.addItem("cat");
		cb.addItem("camel");
		cb.addItem("parrot");
		cb.addItemListener(this);
		jl = new JLabel("Testing");
		ic=new ImageIcon("C:\\Users\\XKC21\\Pictures\\background.png");
		jl.setIcon(ic);
		
		//intermediate
		p = new JPanel();
		p.add(cb);
		p.add(jl);
		
		//top level
		f = new JFrame();
		f.add(p);
		f.pack();
		f.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageDemo();

	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		ic=new ImageIcon("C:\\Users\\XKC21\\Pictures\\"+e.getItem().toString()+".jpg");
		
		jl.setIcon(ic);
	}

}

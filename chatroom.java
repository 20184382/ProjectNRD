 package project_NRD_DY;

 import javax.swing.*;
 import javax.swing.event.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 import java.net.*;
 import java.util.ArrayList;
 
 



 public class chatroom extends JFrame {
	  
	 	public JButton replyB, deleteB, emotionB, clipboardB, sendB, a1;
	 	public JTextArea area, area1, partList;
		public JTextField field;
		public JList<String> list2;
		public File file, folder;
		private BufferedReader br;
		private ArrayList<String> arr;
		public DefaultListModel<String> model;
		
		public chatroom() {
		replyB = new JButton("답장하기");
		deleteB = new JButton("삭제하기");
		emotionB = new JButton("감정표현");
		clipboardB = new JButton("클립보드");	
	       
	       //setResizable(false);
	       //setBounds(400, 200, 900, 600);
	       //setDefaultCloseOperation(EXIT_ON_CLOSE);
	       //Container c = getContentPane();
	       //c.setLayout(null);
	       
		replyB.setEnabled(true);
		deleteB.setEnabled(true);
		emotionB.setEnabled(true);
		clipboardB.setEnabled(true);	
	
		JPanel wpanel = new JPanel(new GridLayout(1, 5, 5, 0));
		wpanel.add(replyB);
		wpanel.add(deleteB);
		wpanel.add(emotionB);
		wpanel.add(clipboardB);
		
		JPanel wpanel1 = new JPanel();
		area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		area.setEditable(false);
		scroll.setPreferredSize(new Dimension(400, 435));
		wpanel1.add(scroll);
		
		JPanel totwpanel = new JPanel(new BorderLayout());
		totwpanel.add("North", wpanel);
		totwpanel.add("Center", wpanel1);
		
		JPanel epanel = new JPanel(new BorderLayout());
		JPanel p1 = new JPanel();
		JLabel user = new JLabel("참여 인원");
		p1.add(user);

		partList = new JTextArea();
		partList.setEditable(true);
		JScrollPane scroll1 = new JScrollPane(partList);
		scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		epanel.add("North", user);
		epanel.add("Center", scroll1);
		
		/* JPanel epanel1 = new JPanel(new BorderLayout());
		JPanel p2 = new JPanel();
		JLabel file = new JLabel("                               업로드한 파일");
		p2.add(file);
		
		list2 = new JList<String>(new DefaultListModel<String>());
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		model = (DefaultListModel<String>) list2.getModel();
		// list2.setSelectedIndex(0);
		JScrollPane scroll2 = new JScrollPane(list2);
		scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		epanel1.add("North", file);
		epanel1.add("Center", scroll2);

		JPanel epanel12 = new JPanel(new GridLayout(2, 1, 0, 10));
		epanel12.add(epanel);
		epanel12.add(epanel1);
*/
		JPanel epanel3 = new JPanel(new BorderLayout());
		
		JPanel p3 = new JPanel();
		JLabel chat = new JLabel(" 친구 목록  ");
		p3.add(chat); 
		area1 = new JTextArea();
	//	JScrollPane scroll3 = new JScrollPane(area1);
	//	scroll3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	//	scroll3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		area1.setEditable(false);
		epanel3.add("North", chat);
	//	epanel3.add("Center", scroll3);
	
		JPanel epanel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		field = new JTextField(18);
		sendB = new JButton(">");
		epanel4.add(field);
		epanel4.add(sendB);
		
		JPanel totepanel = new JPanel(new BorderLayout());
		//totepanel.add("North", epanel12);
		//totepanel.add("Center", epanel3);
		totepanel.add("South", epanel4);
		
		Container c = this.getContentPane();
		c.add("Center", totwpanel);
		c.add("East", totepanel);
		setTitle("NR:D");
	    setVisible(true);
		setResizable(false);
		setBounds(400, 200, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


		}
		public void reply() {
			
		}
		public void delete() {
			
		}
		public void emotion() {
			
		}
		public void clipboard() {
			
		}
		
	    public static void main(String[] args) {
	    	chatroom ch = new chatroom();
	    	
	    
	    	
	    }
	    

	  

	  
}
 

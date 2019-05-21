package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import Data.Person;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Composite;

public class firstGUIWindow {

	protected Shell shlFrWindow;
	private Text VornameTF;
	private Text TitelTF;
	private Text StrasseTF;
	private Text HausnummerTF;
	private Text PLZTF;
	private Text ortTF;
	private Text NachnameTF;
	private Label Vornameout;
	private Label Titelout;
	private Label Nachnameout;
	private Label Straﬂeout;
	private Label Hausnummerout;
	private Label Postleitzahlout;
	private Label ortout;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			firstGUIWindow window = new firstGUIWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrWindow.open();
		shlFrWindow.layout();
		while (!shlFrWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrWindow = new Shell();
		shlFrWindow.setBackgroundMode(SWT.INHERIT_FORCE);
		shlFrWindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		shlFrWindow.setSize(626, 588);
		shlFrWindow.setText("FR Window");
		
		Button btnUselessButton = new Button(shlFrWindow, SWT.CENTER);
		btnUselessButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Button has been pressed! All is lost. The world has gone dark.\t initiating dropoff sequence 3 2 1 \t touchdown");
			System.out.println(TitelTF.getText() + "\t" + VornameTF.getText() + "\t" + NachnameTF.getText() );
			System.out.println(StrasseTF.getText());
			System.out.println(HausnummerTF.getText());
			System.out.println(PLZTF.getText());
			System.out.println(ortTF.getText());
			getVornameout().setText(getVornameTF().getText());
			getTitelout().setText(getTitelTF().getText());
			getNachnameout().setText(getNachnameTF().getText());
			getStraﬂeout().setText(getStrasseTF().getText());
			getHausnummerout().setText(getHausnummerTF().getText());
			getPostleitzahlout().setText(getPLZTF().getText());
			getOrtout().setText(getOrtTF().getText());
			Person p1;
			p1 = new Person();
			p1.setVorname(getVornameTF().getText());
			p1.setNachname(getNachnameTF().getText());
			System.out.println(p1);
			Person.getListe().add(p1);
			System.out.println(Person.getListe());
			getVornameTF().setText("");
			getNachnameTF().setText("");
			getHausnummerTF().setText("");
			getOrtTF().setText("");
			getPLZTF().setText("");
			getStrasseTF().setText("");
			getTitelTF().setText("");
			}
		});
		btnUselessButton.setBounds(164, 97, 108, 35);
		btnUselessButton.setText("Useless Button");
		
		Label lblGlobalExtinction = new Label(shlFrWindow, SWT.NONE);
		lblGlobalExtinction.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		lblGlobalExtinction.setBounds(23, 104, 135, 23);
		lblGlobalExtinction.setText("Global Extinction");
		
		VornameTF = new Text(shlFrWindow, SWT.BORDER);
		VornameTF.setBounds(164, 185, 258, 26);
		
		Label VornameL = new Label(shlFrWindow, SWT.NONE);
		VornameL.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		VornameL.setBounds(23, 188, 70, 20);
		VornameL.setText("Vorname");
		
		Label NachnameL = new Label(shlFrWindow, SWT.NONE);
		NachnameL.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		NachnameL.setBounds(23, 220, 70, 20);
		NachnameL.setText("Nachname");
		
		Label TitelL = new Label(shlFrWindow, SWT.NONE);
		TitelL.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		TitelL.setBounds(23, 156, 70, 20);
		TitelL.setText("Titel");
		
		TitelTF = new Text(shlFrWindow, SWT.BORDER);
		TitelTF.setBounds(164, 153, 258, 26);
		
		Label StrasseL = new Label(shlFrWindow, SWT.NONE);
		StrasseL.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		StrasseL.setBounds(23, 253, 70, 20);
		StrasseL.setText("Stra\u00DFe");
		
		Label HausnummerL = new Label(shlFrWindow, SWT.NONE);
		HausnummerL.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		HausnummerL.setBounds(23, 284, 108, 20);
		HausnummerL.setText("Hausnummer");
		
		Label PLZL = new Label(shlFrWindow, SWT.NONE);
		PLZL.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		PLZL.setBounds(23, 316, 108, 20);
		PLZL.setText("Postleitzahl");
		
		Label ortL = new Label(shlFrWindow, SWT.NONE);
		ortL.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		ortL.setBounds(23, 348, 70, 20);
		ortL.setText("ort");
		
		StrasseTF = new Text(shlFrWindow, SWT.BORDER);
		StrasseTF.setBounds(164, 249, 258, 26);
		
		HausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		HausnummerTF.setBounds(164, 281, 258, 26);
		
		PLZTF = new Text(shlFrWindow, SWT.BORDER);
		PLZTF.setBounds(164, 313, 258, 26);
		
		ortTF = new Text(shlFrWindow, SWT.BORDER);
		ortTF.setBounds(164, 345, 258, 26);
		
		NachnameTF = new Text(shlFrWindow, SWT.BORDER);
		NachnameTF.setBounds(164, 217, 258, 26);
		
		Button btnDie = new Button(shlFrWindow, SWT.NONE);
		btnDie.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Thank you");
				System.exit(0);
			}
		});
		btnDie.setBounds(251, 431, 90, 30);
		btnDie.setText("Die");
		
		Composite composite = new Composite(shlFrWindow, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + " / " + me.y);
			}
		});
		composite.setBounds(502, 10, 64, 64);
		
		Vornameout = new Label(shlFrWindow, SWT.NONE);
		Vornameout.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		Vornameout.setBounds(428, 188, 123, 20);
		
		Titelout = new Label(shlFrWindow, SWT.NONE);
		Titelout.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		Titelout.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		Titelout.setBounds(428, 156, 123, 20);
		
		Nachnameout = new Label(shlFrWindow, SWT.NONE);
		Nachnameout.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		Nachnameout.setBounds(427, 220, 124, 20);
		
		Straﬂeout = new Label(shlFrWindow, SWT.NONE);
		Straﬂeout.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		Straﬂeout.setBounds(428, 253, 123, 20);
		
		Hausnummerout = new Label(shlFrWindow, SWT.NONE);
		Hausnummerout.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		Hausnummerout.setBounds(428, 284, 123, 20);
		
		Postleitzahlout = new Label(shlFrWindow, SWT.NONE);
		Postleitzahlout.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		Postleitzahlout.setBounds(428, 316, 123, 20);
		
		ortout = new Label(shlFrWindow, SWT.NONE);
		ortout.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
		ortout.setBounds(428, 348, 123, 20);
		shlFrWindow.setTabList(new Control[]{btnUselessButton, TitelTF, VornameTF, NachnameTF, StrasseTF, HausnummerTF, PLZTF, ortTF});

	}
	public Text getVornameTF() {
		return VornameTF;
	}
	public Text getTitelTF() {
		return TitelTF;
	}
	public Label getVornameout() {
		return Vornameout;
	}
	public Label getTitelout() {
		return Titelout;
	}
	public Label getNachnameout() {
		return Nachnameout;
	}
	public Label getStraﬂeout() {
		return Straﬂeout;
	}
	public Text getNachnameTF() {
		return NachnameTF;
	}
	public Text getStrasseTF() {
		return StrasseTF;
	}
	public Text getHausnummerTF() {
		return HausnummerTF;
	}
	public Text getPLZTF() {
		return PLZTF;
	}
	public Text getOrtTF() {
		return ortTF;
	}
	public Label getHausnummerout() {
		return Hausnummerout;
	}
	public Label getPostleitzahlout() {
		return Postleitzahlout;
	}
	public Label getOrtout() {
		return ortout;
	}
}

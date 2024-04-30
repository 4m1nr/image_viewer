import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;


public class ImageViewerGUI extends JFrame implements ActionListener{

    JButton selectFileButton;
    JButton showImageButton;
    JButton resizeButton;
    JButton grayscaleButton;
    JButton brightnessButton;
    JButton closeButton;
    JButton showResizeButton;
    JButton showBrightnessButton;
    JButton backButton = new JButton("Back");;

    JTextField widthTextField;
    JTextField heightTextField;
    JTextField brightnessTextField;
    String filePath = "/home/...";
    File file;
    JFileChooser fileChooser = new JFileChooser(filePath);
    int h = 900;
    int w = 1200;
    float brightenFactor = 1;



    ImageViewerGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Image Viewer");
        this.setSize(700, 300);
        this.setVisible(true);
        this.setResizable(true);

        this.setLayout(new CardLayout());

        mainPanel();
    }

    public void mainPanel(){
        // Create main panel for adding to Frame
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new CardLayout(150,90));

        // Create Grid panel for adding buttons to it, then add it all to main panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(3, 2,5,5));

        // TODO


        selectFileButton = new JButton("Choose Image");
        selectFileButton.addActionListener(this);

        showImageButton = new JButton("Show Image");
        showImageButton.addActionListener(this);

        brightnessButton = new JButton("Brightness");
        brightnessButton.addActionListener(this);

        grayscaleButton = new JButton("Gray Scale");
        grayscaleButton.addActionListener(this);

        resizeButton = new JButton("Resize");
        resizeButton.addActionListener(this);

        closeButton = new JButton("Exit");
        closeButton.addActionListener(this);

        //


        // Adding all buttons to Grid panel
        buttonsPanel.add(this.selectFileButton);
        buttonsPanel.add(this.showImageButton);
        buttonsPanel.add(this.brightnessButton);
        buttonsPanel.add(this.grayscaleButton);
        buttonsPanel.add(this.resizeButton);
        buttonsPanel.add(this.closeButton);

        // add Grid panel that contains 6 buttons to main panel
        mainPanel.add(buttonsPanel);

        // add main panel to our frame
        this.add(mainPanel);
        this.revalidate();
        this.repaint();
    }

    public void resizePanel(){
        JPanel resizePanel = new JPanel();
        resizePanel.setLayout(new GridLayout(3,1));

        // TODO

        heightTextField = new JTextField();
        heightTextField.setHorizontalAlignment(SwingConstants.CENTER);
        resizePanel.add(heightTextField);

        widthTextField = new JTextField();
        heightTextField.setHorizontalAlignment(SwingConstants.CENTER);
        resizePanel.add(widthTextField);

        showResizeButton = new JButton("Result");
        showResizeButton.addActionListener(this);
        resizePanel.add(showResizeButton);

        resizePanel.add(backButton);
        //

        this.add(resizePanel);
    }
    public void brightnessPanel(){
        JPanel brightnessPanel = new JPanel();
        brightnessPanel.setLayout(null);

        // TODO

        brightnessTextField = new JTextField();
        brightnessTextField.setHorizontalAlignment(SwingConstants.CENTER);
        brightnessPanel.add(brightnessTextField);

        showBrightnessButton = new JButton("Result");
        showBrightnessButton.addActionListener(this);
        brightnessPanel.add(showBrightnessButton);

        brightnessPanel.add(backButton);

        //

        this.add(brightnessPanel);
    }

    public void chooseFileImage(){

        fileChooser.showOpenDialog(null);
        file = fileChooser.getSelectedFile();
        // TODO

    }
    public void showOriginalImage(){
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();

        // TODO
        JLabel Image = new JLabel();
        Image.setSize(1800,1000);
        //

        tempPanel.setSize(1800, 1000);
        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);
        tempPanel.add(Image);
        tempFrame.add(tempPanel);
    }

    public void grayScaleImage(){
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();

        // TODO

        tempPanel.setSize(1800, 1000);
        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);
        tempFrame.add(tempPanel);
    }
    public void showResizeImage(int w, int h){
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();

        // TODO

        tempPanel.setSize(1800, 1000);
        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);
        tempFrame.add(tempPanel);
    }
    public void showBrightnessImage(float f){
        JFrame tempFrame = new JFrame();
        JPanel tempPanel = new JPanel();

        // TODO

        //


        tempPanel.setSize(1800, 1000);
        tempFrame.setTitle("Image Viewer");
        tempFrame.setSize(1800, 1000);
        tempFrame.setVisible(true);
        tempFrame.setResizable(true);
        tempFrame.add(tempPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==resizeButton){
            // TODO
            this.getContentPane().removeAll();
            this.resizePanel();
            this.revalidate();
            this.repaint();
            //

        }else if(e.getSource()== showImageButton){
            // TODO
            this.getContentPane().removeAll();
            showOriginalImage();
            this.revalidate();
            this.repaint();
            //

        }else if(e.getSource()==grayscaleButton){
            // TODO
            this.getContentPane().removeAll();
            grayScaleImage();
            this.revalidate();
            this.repaint();
            //

        }else if(e.getSource()== showResizeButton){
            // TODO
            this.getContentPane().removeAll();
            w = Integer.parseInt(widthTextField.getText());
            h = Integer.parseInt(heightTextField.getText());
            showResizeImage(w,h);
            this.revalidate();
            this.repaint();
            //

        }else if(e.getSource()==brightnessButton){
            // TODO
            this.getContentPane().removeAll();
            brightnessPanel();
            this.revalidate();
            this.repaint();
            //

        }else if(e.getSource()== showBrightnessButton){
            // TODO
            this.getContentPane().removeAll();
            brightenFactor = Float.parseFloat(brightnessTextField.getText());
            showBrightnessImage(brightenFactor);
            this.revalidate();
            this.repaint();
            //

        }else if(e.getSource()== selectFileButton){
            // TODO
            this.getContentPane().removeAll();
            chooseFileImage();
            mainPanel();
            this.revalidate();
            this.repaint();
            //

        }else if(e.getSource()==closeButton){
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
        else if(e.getSource()==backButton){
            this.getContentPane().removeAll();
            this.mainPanel();
            this.revalidate();
            this.repaint();
        }
    }
}
package Model;

import Design.Register;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterController implements MouseListener {
    
    private Register views;

    public RegisterController(Register views) {
        this.views = views;
        this.views.jLabelCloseRegister.addMouseListener(this);
        this.views.jLabelMinimizeRegister.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == views.jLabelCloseRegister) {
            views.PanelCloseRegister.setBackground(new Color(255, 153, 153));
        }else if(e.getSource() == views.jLabelMinimizeRegister) {
            views.PanelMinimizeRegister.setBackground(new Color(71,227,188));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == views.jLabelCloseRegister) {
            views.PanelCloseRegister.setBackground(new Color(89, 239, 202));
        }else if(e.getSource() == views.jLabelMinimizeRegister) {
            views.PanelMinimizeRegister.setBackground(new Color(89, 239, 202));
        }
    }

}


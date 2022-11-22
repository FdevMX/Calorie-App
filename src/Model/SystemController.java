package Model;

import Design.System;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SystemController implements MouseListener {
    
    private System views;

    public SystemController(System views) {
        this.views = views;
        this.views.jLabelCloseSystem.addMouseListener(this);
        this.views.jLabelMinimizeSystem.addMouseListener(this);
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
        if(e.getSource() == views.jLabelCloseSystem) {
            views.panelCloseSystem.setBackground(new Color(255, 153, 153));
        }else if(e.getSource() == views.jLabelMinimizeSystem) {
            views.panelMinimizeSystem.setBackground(new Color(154,194,236));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == views.jLabelCloseSystem) {
            views.panelCloseSystem.setBackground(new Color(186,217,250));
        }else if(e.getSource() == views.jLabelMinimizeSystem) {
            views.panelMinimizeSystem.setBackground(new Color(186,217,250));
        }
    }

}


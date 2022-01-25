package com.design.pattern.state;

import com.design.pattern.state.ui.Player;
import com.design.pattern.state.ui.Ui;

/**
 * Demo class. Everything comes together here.
 *
 * @author qilongxin
 */
public class StateDemo {
    public static void main(String[] args) {
        Player player = new Player();
        Ui ui = new Ui(player);
        ui.init();
    }
}

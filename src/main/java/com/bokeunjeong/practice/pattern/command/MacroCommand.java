package com.bokeunjeong.practice.pattern.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MacroCommand implements Command {

    Command[] commands;

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}

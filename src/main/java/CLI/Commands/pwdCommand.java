package CLI.Commands;

import CLI.CLIContext;

public class pwdCommand extends Command implements IExecuteArgs, IExecute, IHelp {
    public pwdCommand() {super();}
    public pwdCommand(CLIContext context) {
        super(context);
    }

    @Override
    public void execute() {
        String[] args = {};
        execute(args);
    }

    @Override
    public void execute(String[] args) {
        System.out.println(context.getCurrentDirectory());
    }

    @Override
    public void help() {
        System.out.println("Usage: pwd - prints current directory.");
    }
}

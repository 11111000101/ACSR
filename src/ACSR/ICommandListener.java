package ACSR;

import Command.ICommand;

public interface ICommandListener extends Runnable {
	public abstract ICommand getCommand();

	void register(IListener listener);
}

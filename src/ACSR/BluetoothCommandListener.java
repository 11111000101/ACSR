package ACSR;
import java.io.DataInputStream;

import Command.ICommand;
import lejos.nxt.comm.Bluetooth;
import lejos.nxt.comm.NXTConnection;

public class BluetoothCommandListener implements ICommandListener {

	private NXTConnection connection = null;

	boolean running = true;

	public void terminate() {
		running = false;
	}

	@Override
	public void run() {
		init();
		while (running == true) {
			DataInputStream stream = connection.openDataInputStream();
		}
	}

	private void init() {
		connection = Bluetooth.waitForConnection();
	}

	@Override
	public ICommand getCommand() {
		return null;
	}

	@Override
	public void register(IListener listener) {
		// TODO Auto-generated method stub
	}
}

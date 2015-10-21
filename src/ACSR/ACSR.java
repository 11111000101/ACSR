package ACSR;

public class ACSR implements IListener {
	private ICommandListener cmdListener = null;
	private static RobotControl robotControl = new RobotControl();

	public ICommandListener getCommandListener() {
		return this.cmdListener;
	}

	public void setCommandListener(ICommandListener l) {
		this.cmdListener = l;
		this.cmdListener.register(this);
	}

	public static void main(String[] args) {
		ACSR acsr = new ACSR();
		acsr.setCommandListener(new BluetoothCommandListener());
	}

	@Override
	public void update() {
		cmdListener.getCommand().execute(robotControl);
	}
}

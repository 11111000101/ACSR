package Command;
import java.io.Serializable;

import ACSR.RobotControl;

public interface ICommand extends Serializable {
	public void execute(RobotControl robotControl);
}

package Core;

public class YouHaveNoMoneyException extends Exception {
	private double extra;

	public YouHaveNoMoneyException(double extra_) {
		extra = extra_;
	}

	public double getExtra() {
		return extra;
	}
}

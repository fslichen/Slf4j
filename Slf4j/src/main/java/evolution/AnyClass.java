package evolution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnyClass {
	// Get the logger with the help of the logger factory.
	private final Logger logger = LoggerFactory.getLogger(AnyClass.class);
	
	public void anyMethod() {
		// By default, slf4j prints out logs with priority grater than or equal to info level.
		logger.trace("Trace");// The TRACE Level designates finer-grained informational events than the DEBUG.
		logger.debug("Debug");// The DEBUG Level designates fine-grained informational events that are most useful to debug an application.
		logger.info("Info");// The INFO level designates informational messages that highlight the progress of the application at coarse-grained level.
		logger.warn("Wanring");// The WARN level designates potentially harmful situations.
		logger.error("Error");// The ERROR level designates error events that might still allow the application to continue running.
	}
	
	public static void main(String[] args) {
		AnyClass anyClass = new AnyClass();
		anyClass.anyMethod();
	}
}

package org.vcssl.connect;

@SuppressWarnings("serial")
public class ConnectorImplementationException extends Exception {
	public ConnectorImplementationException(String errorMessage) {
		super(errorMessage);
	}
	public ConnectorImplementationException(String errorMessage, Exception causeException) {
		super(errorMessage, causeException);
	}
}

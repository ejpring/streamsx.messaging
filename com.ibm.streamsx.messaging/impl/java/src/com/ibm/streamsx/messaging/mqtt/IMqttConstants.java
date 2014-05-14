/*******************************************************************************
 * Licensed Materials - Property of IBM
 * Copyright IBM Corp. 2014
 * US Government Users Restricted Rights - Use, duplication or
 * disclosure restricted by GSA ADP Schedule Contract with
 * IBM Corp.
 *******************************************************************************/
package com.ibm.streamsx.messaging.mqtt;

public interface IMqttConstants {

	public static final String CONN_TRUSTSTORE = "connection.trustStore";
	public static final String CONN_KEYSTORE = "connection.keyStore";
	public static final String CONN_KEYSTORE_PASSWORD = "connection.keyStorePassword";
	public static final String CONN_SERVERURI = "connection.serverURI";
	public static final int DEFAULT_RECONNECTION_BOUND = 5;
	public static final long DEFAULT_RECONNECTION_PERIOD = 60000;
	
}

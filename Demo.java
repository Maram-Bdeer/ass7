package edu.najah.it.capp.asd;


import javax.sound.midi.MidiDevice.Info;

import edu.najah.it.capp.asd.constants.ConnectionType;
import edu.najah.it.capp.asd.impl.Ftp;
import edu.najah.it.capp.asd.intf.Protocol;
import edu.najah.it.capp.asd.service.Connection;
import edu.najah.it.capp.exception.ProtocolException;
import edu.najah.it.capp.logger.Logger;




public class Demo {

	public static void main(String[] args) throws ProtocolException{
		//Logger.getInstance().logInfo("This is a info message");
		//Logger.getInstance().logDebug("This is a debug message");
	//	Logger.getInstance().logWarning("This is a warning message");
	//	Logger.getInstance().logError("This is a error message");
		
		Protocol ssh = Connection.getInstance(ConnectionType.SSH);
		Protocol ssh2 = Connection.getInstance(ConnectionType.SSH);
		Protocol telnet = Connection.getInstance(ConnectionType.TELNET);
		Protocol scp = Connection.getInstance(ConnectionType.SCP);
		Protocol ftp = Connection.getInstance(ConnectionType.FTP);
		int num=5;
		while(num>5) {
		try {
		if(ssh == ssh2) {
			System.out.println(" ssh is equal to ssh2");
		}
		}
		catch (ProtocolException e ) {
			System.out.println("InvalidException:: " + e.getMessage());
			Logger.getInstance().logInfo("This is a info message");
			break;
		}
		
		catch(Exception e) {
		System.out.println(Connection.getCurrentConnections());
		}
		catch(debugmessage e) {
		System.out.println(Connection.getCurrentConnections());
		
		Logger.getInstance().logDebug("This is a debug message");
		break;
		}
	
		catch(info e) {
			Logger.getInstance().logInfo("This is a info message");
		System.out.println(Connection.getCurrentConnections());
		break;
		
		}
		catch(warning w){
		Logger.getInstance().logWarning("This is a warning message");
		Connection.release(ConnectionType.FTP);}
		System.out.println(Connection.getCurrentConnections());
		}
		catch(errorm e) {
		Logger.getInstance().logError("This is a error message");	
		System.out.println(Connection.getCurrentConnections());
		}
		finally {
		if(ftp == null) {
			System.out.println("FTP is a null");
		} else {
			System.out.println("FTP is not a null");
		}
		}
		ftp.send(" breaking the logic ");
		
	    
	}
	}

}

package beans;

import com.sun.jna.Library;
import com.sun.jna.Native;

// need jna-5.12.1.jar
// need jna-jpms-5.12.1.jar

public interface Dataacc extends Library {
	
	@SuppressWarnings("deprecation")
	Dataacc INSTANCE = (Dataacc) Native.loadLibrary("dataacc.dll", Dataacc.class);

	//void display(String g);
	//int printf(String format, Object... args); // From stdio
	
	// DLL_EXPORT void dlldataacc_SetDebug( int mode );
	void dlldataacc_SetDebug( int mode );

	// DLL_EXPORT void dlldataacc_InitTrace( const char* nomfichier );
	void dlldataacc_InitTrace( String nomfichier );

	// DLL_EXPORT int ConnectXR_compact( void );  // utilis� par LCO
	int ConnectXR_compact();

	// DLL_EXPORT void DisconnectXR();  // utilis� par LCO
	void DisconnectXR();
}


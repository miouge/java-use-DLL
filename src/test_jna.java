import beans.Dataacc;

public class test_jna {
	
	public static void main(String[] args) {
		
		Dataacc.INSTANCE.dlldataacc_SetDebug( 1 );
		
		Dataacc.INSTANCE.dlldataacc_InitTrace( "test-jna" );

		// DLL_EXPORT int ConnectXR_compact( void );  // utilis� par LCO
		Dataacc.INSTANCE.ConnectXR_compact();

		// DLL_EXPORT void DisconnectXR();  // utilis� par LCO
		Dataacc.INSTANCE.DisconnectXR();
		
		System.out.print( String.format( "done" ));
	}
}

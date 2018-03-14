public abstract class CuentaUsuario {
	private String nombreUsuario;
	private String contrase�a;

	public CuentaUsuario( String usuario, String contrase�a ) {
		this.setNombreUsuario( usuario );
		this.setContrase�a( contrase�a );
	}

  public abstract String tipoCuenta();

  public String getNombreUsuario() {
		return nombreUsuario;
	}

  public String informacionCuenta() {
    return "Cuenta Usuario " + getNombreUsuario();
  }

  public void setNombreUsuario( String nombreUsuario ) {
    this.nombreUsuario = nombreUsuario;
  }

  public String getContrase�a() {
    return contrase�a;
  }

  public void setContrase�a( String contrase�a ) {
		this.contrase�a = contrase�a;
	}

}
	

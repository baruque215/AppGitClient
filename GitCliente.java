/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appgitcliente;

/**
 * gitcliente : Describe el tipo de Gitclient elegido
 * @author baruque215
 */
public class GitCliente {


    private String cliente;
    private String version;
    private String sistemOper;
    private String licencia;

    public GitCliente() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSistemOper() {
        return sistemOper;
    }

    public void setSistemOper(String sistemOper) {
        this.sistemOper = sistemOper;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "GitCliente{" + "cliente=" + cliente + ", version=" + version + ", sistemOper=" + sistemOper + ", licencia=" + licencia + '}';
    }


}

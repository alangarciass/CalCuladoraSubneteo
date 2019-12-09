/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracongraficosdos;

/**
 *
 * @author alang
 */
public class Redes {
  private  String DireccionIP, Host, Redes,RedDos,RedTres,RedCuatro,BroadCast,MascaraDeRed,PrefijoMascara,NumDeRedes,HosXRed;

    public String getHosXRed() {
        return HosXRed;
    }

    public void setHosXRed(String HosXRed) {
        this.HosXRed = HosXRed;
    }

    public Redes(String DireccionIP, String Host, String Redes, String BroadCast, String MascaraDeRed, String PrefijoMascara, String NumDeRedes, String HosXRed) {
        this.DireccionIP = DireccionIP;
        this.Host = Host;
        this.Redes = Redes;
        this.BroadCast = BroadCast;
        this.MascaraDeRed = MascaraDeRed;
        this.PrefijoMascara = PrefijoMascara;
        this.NumDeRedes = NumDeRedes;
        this.HosXRed = HosXRed;
    }

    public Redes(String DireccionIP, String Host, String Redes, String BroadCast, String MascaraDeRed, String PrefijoMascara, String NumDeRedes) {
        this.DireccionIP = DireccionIP;
        this.Host = Host;
        this.Redes = Redes;
        this.BroadCast = BroadCast;
        this.MascaraDeRed = MascaraDeRed;
        this.PrefijoMascara = PrefijoMascara;
        this.NumDeRedes = NumDeRedes;
    }

    public String getNumDeRedes() {
        return NumDeRedes;
    }

    public void setNumDeRedes(String NumDeRedes) {
        this.NumDeRedes = NumDeRedes;
    }

    public Redes(String DireccionIP, String Host, String Redes) {
        this.DireccionIP = DireccionIP;
        this.Host = Host;
        this.Redes = Redes;
    }

    public Redes(String DireccionIP, String Host, String Redes, String BroadCast, String MascaraDeRed, String PrefijoMascara) {
        this.DireccionIP = DireccionIP;
        this.Host = Host;
        this.Redes = Redes;
        this.BroadCast = BroadCast;
        this.MascaraDeRed = MascaraDeRed;
        this.PrefijoMascara = PrefijoMascara;
    }

    public String getMascaraDeRed() {
        return MascaraDeRed;
    }

    public void setMascaraDeRed(String MascaraDeRed) {
        this.MascaraDeRed = MascaraDeRed;
    }

    public String getPrefijoMascara() {
        return PrefijoMascara;
    }

    public void setPrefijoMascara(String PrefijoMascara) {
        this.PrefijoMascara = PrefijoMascara;
    }

    public String getBroadCast() {
        return BroadCast;
    }

    public void setBroadCast(String BroadCast) {
        this.BroadCast = BroadCast;
    }

    public Redes(String DireccionIP, String Host, String Redes, String BroadCast) {
        this.DireccionIP = DireccionIP;
        this.Host = Host;
        this.Redes = Redes;
        this.BroadCast = BroadCast;
    }

    
 


    public String getRedDos() {
        return RedDos;
    }

    public void setRedDos(String RedDos) {
        this.RedDos = RedDos;
    }

    public String getRedTres() {
        return RedTres;
    }

    public void setRedTres(String RedTres) {
        this.RedTres = RedTres;
    }

    public String getRedCuatro() {
        return RedCuatro;
    }

    public void setRedCuatro(String RedCuatro) {
        this.RedCuatro = RedCuatro;
    }

    public Redes() {
    }

    public String getDireccionIP() {
        return DireccionIP;
    }

    public void setDireccionIP(String DireccionIP) {
        this.DireccionIP = DireccionIP+RedDos+RedTres+RedCuatro;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getRedes() {
      
        
        return Redes;
    }

    public void setRedes(String Redes) {
        this.Redes = Redes;
    }
    
    
}

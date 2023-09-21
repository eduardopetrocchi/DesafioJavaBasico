package DesafioJavaBasico.Iphone.src;

import DesafioJavaBasico.Iphone.src.funcoes.AparelhoTelefonico;
import DesafioJavaBasico.Iphone.src.funcoes.NavegadorInternet;
import DesafioJavaBasico.Iphone.src.funcoes.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical tocar = new ReprodutorMusical();
        tocar.tocar();
        ReprodutorMusical pause = new ReprodutorMusical();
        pause.pausar();
        ReprodutorMusical selecionar = new ReprodutorMusical();
        selecionar.selecionarMusica();
        
        AparelhoTelefonico ligar = new AparelhoTelefonico();
        ligar.ligar();
        AparelhoTelefonico atender = new AparelhoTelefonico();
        atender.atender();
        AparelhoTelefonico caixaPostal = new AparelhoTelefonico();
        caixaPostal.correioVoz();

        NavegadorInternet exibirPagina = new NavegadorInternet();
        exibirPagina.exibirPagina();
        NavegadorInternet adicionarAba = new NavegadorInternet();
        adicionarAba.adicionarNovaAba();
        NavegadorInternet atualizarPagina = new NavegadorInternet();
        atualizarPagina.atualizarPagina();
    }
}

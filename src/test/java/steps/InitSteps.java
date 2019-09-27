package steps;

import cucumber.api.java.pt.Dado;
import funcionalidades.InitFuncionalidades;

public class InitSteps {

    private InitFuncionalidades initFuncionalidades;

    public InitSteps(){
        this.initFuncionalidades = new InitFuncionalidades();
    }

    @Dado("^que acesso o sistema$")
    public void queAcessoSistema(){
        this.initFuncionalidades.realizaAcesso();
    }
}
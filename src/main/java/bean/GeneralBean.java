package bean;

import static util.MessageUtil.erro;
import static util.MessageUtil.sucesso;

import javax.faces.bean.ManagedBean;

import entidades.*;
import dao.*;
import bean.*;

//Testando:
@ManagedBean
public class GeneralBean {
	private VitimaBean vb;
	private AgressorBean ab;
	private DenunciaBean db;
	
	public String salvar() {
		try {
			vb.salvar();
			ab.salvar();
			db.salvar();
			sucesso("Sucesso", "Sucesso ao realizar salvamento");
			vb = new VitimaBean();
			ab = new AgressorBean();
			db = new DenunciaBean();
		} catch (Exception e) {
			erro("Erro", "Erro ao realizar salvamento!");
		}
		return null;
		
	}

}
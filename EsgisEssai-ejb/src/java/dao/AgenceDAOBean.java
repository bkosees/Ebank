/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.local.AgenceDaoBeanLocal;
import entities.Agence;

/**
 *
 * @author Osee.Bruce
 */
public class AgenceDAOBean extends GenericDAOBean<Agence, Long> implements AgenceDaoBeanLocal {

    public AgenceDAOBean() {
        super(Agence.class);
    }
}

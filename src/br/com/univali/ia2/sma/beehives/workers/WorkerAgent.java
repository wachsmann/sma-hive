/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.univali.ia2.sma.beehives.workers;

import br.com.univali.ia2.sma.beehives.workers.behaviours.Clean;
import jade.core.Agent;

/**
 *
 * @author 6182593
 */
public class WorkerAgent extends Agent {

    protected void setup() {
        System.out.println("WorkerAgent");
        addBehaviour(new Clean(this, 1000, 5000));
    }
}
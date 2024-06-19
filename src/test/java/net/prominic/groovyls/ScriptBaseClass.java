package net.prominic.groovyls;

import groovy.lang.Script;
import org.eclipse.lsp4j.Position;

public abstract class ScriptBaseClass extends Script {
    public ScriptBaseClass(){
        //getBinding().setVariable("position", new Position());
    }
    public Position position;
}

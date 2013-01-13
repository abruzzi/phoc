/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.free.jshoc.compute;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.script.ScriptException;

/**
 *
 * @author juntao
 */
public class Evaluator {
    public Evaluator(){}
    
    public Object evalScriptString(String expr){
        RuntimeEnv executor = RuntimeEnv.getInstance();
        Object obj = null;
        try {
            obj = executor.getScriptEngine().eval(expr);
        } catch (ScriptException ex) {
            ex.printStackTrace();
        }

        return obj;
    }

    public Object evalScriptFile(File file){
        RuntimeEnv executor = RuntimeEnv.getInstance();
        Object obj = null;
        try{
            obj = executor.getScriptEngine().eval(new FileReader(file));
        }catch(ScriptException ex){
            ex.printStackTrace();
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        
        return obj;
    }
}

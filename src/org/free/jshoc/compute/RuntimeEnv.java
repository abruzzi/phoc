/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.free.jshoc.compute;

import javax.script.Compilable;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author juntao
 */
public class RuntimeEnv {

    public static final String ENGINE_NAME = "JavaScript";
    private ScriptEngine scriptEngine;
    public static RuntimeEnv instance;

    private RuntimeEnv() {
        ScriptEngineManager manager = new ScriptEngineManager();
        scriptEngine = manager.getEngineByName(ENGINE_NAME);
    }

    public static RuntimeEnv getInstance() {
        if (instance == null) {
            instance = new RuntimeEnv();
        }
        return instance;
    }

    /**
     * the normal type of script engine
     * @return
     */
    public ScriptEngine getScriptEngine() {
        return (ScriptEngine) scriptEngine;
    }

    /**
     * convert the script engine to compilable
     * @return
     */
    public Compilable getCompilableEngine() {
        return (Compilable) scriptEngine;
    }

    /**
     * convert the script engine to invocable
     * @return
     */
    public Invocable getInvocableEngine() {
        return (Invocable) scriptEngine;
    }

    /**
     * execute a function defined in script, and pass them
     * the arguments list.
     */
    public Object invokeFunction(String func, Object... args) {
        Object result = null;
        try {
            result = getInvocableEngine().invokeFunction(func, args);
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return result;
    }
}

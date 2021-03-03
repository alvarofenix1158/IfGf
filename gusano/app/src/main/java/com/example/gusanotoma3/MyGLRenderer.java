package com.example.gusanotoma3;


import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;


public class MyGLRenderer implements GLSurfaceView.Renderer {

    private Triangulo mtriangulo;
    private  Cuadro miCuadro;


    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GLES20.glClearColor(1.0f, 0.2f,0.0f, 1.0f);
        mtriangulo= new Triangulo();
        miCuadro= new Cuadro();

    }

    @Override
    public void onDrawFrame(GL10 gl) {

        //mtriangulo.draw();
        miCuadro.draw();

    }


    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0,0, width, height);
    }

    public  static int loadShader(int type, String shaderCode){
        int shader= GLES20.glCreateShader(type);
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }

}

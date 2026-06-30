package org.webrtc;

/* loaded from: classes14.dex */
public class GlShader {
    private static final java.lang.String TAG = "GlShader";
    private int program;

    public GlShader(java.lang.String str, java.lang.String str2) {
        int compileShader = compileShader(35633, str);
        int compileShader2 = compileShader(35632, str2);
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        this.program = glCreateProgram;
        if (glCreateProgram == 0) {
            throw new java.lang.RuntimeException("glCreateProgram() failed. GLES20 error: " + android.opengl.GLES20.glGetError());
        }
        android.opengl.GLES20.glAttachShader(glCreateProgram, compileShader);
        android.opengl.GLES20.glAttachShader(this.program, compileShader2);
        android.opengl.GLES20.glLinkProgram(this.program);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(this.program, 35714, iArr, 0);
        if (iArr[0] == 1) {
            android.opengl.GLES20.glDeleteShader(compileShader);
            android.opengl.GLES20.glDeleteShader(compileShader2);
            org.webrtc.GlUtil.checkNoGLES2Error("Creating GlShader");
        } else {
            org.webrtc.Logging.e(TAG, "Could not link program: " + android.opengl.GLES20.glGetProgramInfoLog(this.program));
            throw new java.lang.RuntimeException(android.opengl.GLES20.glGetProgramInfoLog(this.program));
        }
    }

    private static int compileShader(int i17, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        if (glCreateShader == 0) {
            throw new java.lang.RuntimeException("glCreateShader() failed. GLES20 error: " + android.opengl.GLES20.glGetError());
        }
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            org.webrtc.GlUtil.checkNoGLES2Error("compileShader");
            return glCreateShader;
        }
        org.webrtc.Logging.e(TAG, "Compile error " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader) + " in shader:\n" + str);
        throw new java.lang.RuntimeException(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public int getAttribLocation(java.lang.String str) {
        int i17 = this.program;
        if (i17 == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(i17, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        throw new java.lang.RuntimeException("Could not locate '" + str + "' in program");
    }

    public int getUniformLocation(java.lang.String str) {
        int i17 = this.program;
        if (i17 == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i17, str);
        if (glGetUniformLocation >= 0) {
            return glGetUniformLocation;
        }
        throw new java.lang.RuntimeException("Could not locate uniform '" + str + "' in program");
    }

    public void release() {
        org.webrtc.Logging.d(TAG, "Deleting shader.");
        int i17 = this.program;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteProgram(i17);
            this.program = -1;
        }
    }

    public void setVertexAttribArray(java.lang.String str, int i17, java.nio.FloatBuffer floatBuffer) {
        setVertexAttribArray(str, i17, 0, floatBuffer);
    }

    public void useProgram() {
        if (this.program == -1) {
            throw new java.lang.RuntimeException("The program has been released");
        }
        synchronized (org.webrtc.EglBase.lock) {
            android.opengl.GLES20.glUseProgram(this.program);
        }
        org.webrtc.GlUtil.checkNoGLES2Error("glUseProgram");
    }

    public void setVertexAttribArray(java.lang.String str, int i17, int i18, java.nio.FloatBuffer floatBuffer) {
        if (this.program != -1) {
            int attribLocation = getAttribLocation(str);
            android.opengl.GLES20.glEnableVertexAttribArray(attribLocation);
            android.opengl.GLES20.glVertexAttribPointer(attribLocation, i17, 5126, false, i18, (java.nio.Buffer) floatBuffer);
            org.webrtc.GlUtil.checkNoGLES2Error("setVertexAttribArray");
            return;
        }
        throw new java.lang.RuntimeException("The program has been released");
    }
}

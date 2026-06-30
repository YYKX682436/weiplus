package com.tencent.thumbplayer.core.postprocessor;

/* loaded from: classes14.dex */
public class TPProgramUtils {
    private static final java.lang.String TAG = "Program";

    private static void checkEglError(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = false;
        while (true) {
            int eglGetError = android.opengl.EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            java.lang.Integer.toHexString(eglGetError);
            sb6.append(str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError));
            z17 = true;
        }
        if (z17) {
            new java.lang.RuntimeException("EGL error encountered (see log): " + sb6.toString());
        }
    }

    public static synchronized int createProgram(java.lang.String str, java.lang.String str2) {
        int createProgram;
        synchronized (com.tencent.thumbplayer.core.postprocessor.TPProgramUtils.class) {
            createProgram = createProgram(str, str2, null);
        }
        return createProgram;
    }

    private static synchronized int loadShader(int i17, java.lang.String str) {
        int glCreateShader;
        synchronized (com.tencent.thumbplayer.core.postprocessor.TPProgramUtils.class) {
            glCreateShader = android.opengl.GLES20.glCreateShader(i17);
            checkEglError("glCreateShader type=" + i17);
            android.opengl.GLES20.glShaderSource(glCreateShader, str);
            android.opengl.GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
                android.opengl.GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        return glCreateShader;
    }

    public static synchronized int createProgram(java.lang.String str, java.lang.String str2, int[] iArr) {
        synchronized (com.tencent.thumbplayer.core.postprocessor.TPProgramUtils.class) {
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendEquationSeparate(32774, 32774);
            android.opengl.GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            int loadShader = loadShader(35633, str);
            int i17 = 0;
            if (loadShader == 0) {
                return 0;
            }
            int loadShader2 = loadShader(35632, str2);
            if (loadShader2 == 0) {
                return 0;
            }
            if (iArr != null && iArr.length >= 2) {
                iArr[0] = loadShader;
                iArr[1] = loadShader2;
            }
            int glCreateProgram = android.opengl.GLES20.glCreateProgram();
            checkEglError("glCreateProgram");
            android.opengl.GLES20.glAttachShader(glCreateProgram, loadShader);
            checkEglError("glAttachShader");
            android.opengl.GLES20.glAttachShader(glCreateProgram, loadShader2);
            checkEglError("glAttachShader");
            android.opengl.GLES20.glLinkProgram(glCreateProgram);
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] != 1) {
                android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram);
                android.opengl.GLES20.glDeleteProgram(glCreateProgram);
            } else {
                i17 = glCreateProgram;
            }
            return i17;
        }
    }
}

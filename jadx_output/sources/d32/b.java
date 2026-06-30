package d32;

/* loaded from: classes14.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final int a(java.lang.String shaderSource, int i17) {
        kotlin.jvm.internal.o.g(shaderSource, "shaderSource");
        int[] iArr = new int[1];
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, shaderSource);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureGLUtil", "loadShader error, infoLog: %s", android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }

    public final int b(java.lang.String vertexShaderSource, java.lang.String fragmentShaderSource) {
        kotlin.jvm.internal.o.g(vertexShaderSource, "vertexShaderSource");
        kotlin.jvm.internal.o.g(fragmentShaderSource, "fragmentShaderSource");
        int[] iArr = new int[1];
        int a17 = a(vertexShaderSource, 35633);
        if (a17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureGLUtil", "load vertex shader failed");
            return 0;
        }
        int a18 = a(fragmentShaderSource, 35632);
        if (a18 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureGLUtil", "load fragment shader failed");
            return 0;
        }
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        android.opengl.GLES20.glAttachShader(glCreateProgram, a17);
        android.opengl.GLES20.glAttachShader(glCreateProgram, a18);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCaptureGLUtil", "link program failed");
            return 0;
        }
        android.opengl.GLES20.glDeleteShader(a17);
        android.opengl.GLES20.glDeleteShader(a18);
        return glCreateProgram;
    }
}

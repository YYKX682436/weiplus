package dp5;

/* loaded from: classes14.dex */
public final class b implements dp5.e {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f242277a = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, org.webrtc.EglBase.EGL_RECORDABLE_ANDROID, 1, 12344};

    public static boolean a(dp5.b bVar, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            str2 = "MicroMsg.GLEnvOp";
        }
        bVar.getClass();
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.Log.c(str2, str + ": EGL error: 0x" + java.lang.Integer.toHexString(eglGetError), new java.lang.Object[0]);
        return true;
    }

    public final void b(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.GLEnvOp", str + ": GL error: 0x" + java.lang.Integer.toHexString(glGetError), new java.lang.Object[0]);
        }
    }

    public final int c(java.lang.String shaderSource, int i17) {
        kotlin.jvm.internal.o.g(shaderSource, "shaderSource");
        int[] iArr = new int[1];
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        android.opengl.GLES20.glShaderSource(glCreateShader, shaderSource);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GLEnvOp", "loadShader error, infoLog: " + android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        return 0;
    }
}

package ew2;

/* loaded from: classes14.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new ew2.a(glGetError, msg);
            }
            throw new android.opengl.GLException(glGetError, msg + ": GLES20 error: " + glGetError);
        }
    }
}

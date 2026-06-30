package dp5;

/* loaded from: classes14.dex */
public interface f extends java.io.Closeable {
    static void n(dp5.f fVar, int i17, int i18, int i19, java.nio.Buffer buffer, int i27, int i28, int i29, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: allocTextureMem");
        }
        int i37 = (i29 & 4) != 0 ? 6408 : i19;
        java.nio.Buffer buffer2 = (i29 & 8) != 0 ? null : buffer;
        int i38 = (i29 & 16) != 0 ? 9729 : i27;
        int i39 = (i29 & 32) != 0 ? 10497 : i28;
        dp5.a aVar = (dp5.a) fVar;
        if (i17 == aVar.f242273e && i18 == aVar.f242274f && i37 == aVar.f242275g && buffer2 == null) {
            return;
        }
        int i47 = aVar.f242276h;
        aVar.f242276h = i47 + 1;
        if (i47 % 50 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GLEnvOp", aVar.hashCode() + " allocTexMem, width:" + i17 + ", height:" + i18 + ", internalFormat:" + i37 + ", ");
        }
        android.opengl.GLES20.glBindTexture(3553, aVar.f242272d);
        android.opengl.GLES20.glTexImage2D(3553, 0, i37, i17, i18, 0, i37, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer2);
        float f17 = i38;
        android.opengl.GLES20.glTexParameterf(3553, 10241, f17);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, f17);
        float f18 = i39;
        android.opengl.GLES20.glTexParameterf(3553, 10242, f18);
        android.opengl.GLES20.glTexParameterf(3553, 10243, f18);
        aVar.f242273e = i17;
        aVar.f242274f = i18;
        aVar.f242275g = i37;
    }
}

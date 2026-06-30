package oj0;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj0.h f345734d;

    public f(oj0.h hVar) {
        this.f345734d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj0.h hVar = this.f345734d;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FilterRender", "initGL");
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("FilterRenderCallbackHandlerThread", 5);
        hVar.f345739d = a17;
        a17.start();
        android.os.HandlerThread handlerThread = hVar.f345739d;
        if (handlerThread == null) {
            kotlin.jvm.internal.o.o("callbackThread");
            throw null;
        }
        hVar.f345738c = new android.os.Handler(handlerThread.getLooper());
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(hVar.f345746k, hVar.f345747l, 1, 3);
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        hVar.f345740e = newInstance;
        oj0.e eVar = new oj0.e();
        android.os.Handler handler = hVar.f345738c;
        if (handler == null) {
            kotlin.jvm.internal.o.o("callbackHandler");
            throw null;
        }
        newInstance.setOnImageAvailableListener(eVar, handler);
        rs0.g gVar = rs0.i.f399296a;
        android.media.ImageReader imageReader = hVar.f345740e;
        if (imageReader == null) {
            kotlin.jvm.internal.o.o("imageReader");
            throw null;
        }
        hVar.f345741f = rs0.g.n(gVar, imageReader.getSurface(), null, 0, 0, null, 16, null);
        rh0.d0 d0Var = hVar.f345745j;
        if (d0Var != null) {
            ((p05.l4) d0Var).o();
        }
        i95.m c17 = i95.n0.c(rh0.f0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        rh0.d0 u86 = rh0.f0.u8((rh0.f0) c17, 1, null, null, false, 14, null);
        hVar.f345745j = u86;
        ((p05.l4) u86).J(hVar.f345746k, hVar.f345747l);
        rh0.d0 d0Var2 = hVar.f345745j;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).H(false);
        }
        hVar.f345743h = gVar.r();
        hVar.f345744i = gVar.r();
        android.graphics.Bitmap a18 = hVar.a();
        android.opengl.GLES20.glBindTexture(3553, hVar.f345743h);
        android.opengl.GLUtils.texImage2D(3553, 0, a18, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        int i18 = hVar.f345744i;
        int i19 = hVar.f345746k;
        int i27 = hVar.f345747l;
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, i19, i27, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }
}

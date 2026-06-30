package d32;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f226141d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d32.j jVar) {
        super(0);
        this.f226141d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d32.j jVar = this.f226141d;
        d32.k kVar = jVar.f226156i;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("renderer");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureMixRenderer", "release: ");
        is0.c cVar = kVar.f226167f;
        if (cVar != null) {
            cVar.close();
        }
        is0.c cVar2 = kVar.f226169h;
        if (cVar2 != null) {
            cVar2.close();
        }
        is0.c cVar3 = kVar.B;
        if (cVar3 != null) {
            cVar3.close();
        }
        is0.c cVar4 = kVar.C;
        if (cVar4 != null) {
            cVar4.close();
        }
        android.opengl.GLES20.glDeleteProgram(kVar.f226171j);
        android.opengl.GLES20.glDeleteProgram(kVar.f226183v);
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{kVar.A}, 0);
        try {
            p05.l4 l4Var = kVar.f226187z;
            if (l4Var != null) {
                l4Var.o();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkSegmentDestroyFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1012L, 47L);
        }
        javax.microedition.khronos.egl.EGLDisplay eGLDisplay = jVar.f226151d;
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        javax.microedition.khronos.egl.EGL10 egl10 = jVar.f226150c;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        egl10.eglDestroyContext(jVar.f226151d, jVar.f226152e);
        egl10.eglDestroySurface(jVar.f226151d, jVar.f226153f);
        egl10.eglTerminate(jVar.f226151d);
        jVar.f226152e = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
        jVar.f226153f = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        jVar.f226159l.quit();
        return jz5.f0.f302826a;
    }
}

package et0;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et0.k f256536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(et0.k kVar) {
        super(0);
        this.f256536d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        et0.k kVar = this.f256536d;
        ms0.c cVar = kVar.f256547h;
        if (cVar != null) {
            ms0.c.o(cVar, false, 1, null);
        }
        kVar.f256547h = null;
        rs0.h hVar = kVar.f256543d;
        if (hVar != null) {
            android.opengl.EGL14.eglDestroyContext(hVar.f399292a, hVar.f399294c);
            android.opengl.EGL14.eglDestroySurface(hVar.f399292a, hVar.f399293b);
            hVar.f399293b = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
            kotlin.jvm.internal.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
            hVar.f399294c = EGL_NO_CONTEXT;
            android.os.HandlerThread handlerThread = kVar.f256545f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            kVar.f256545f = null;
            kVar.f256546g = null;
        }
        return jz5.f0.f302826a;
    }
}

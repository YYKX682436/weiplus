package dr4;

/* loaded from: classes14.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f242728a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f242729b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f242730c;

    /* renamed from: d, reason: collision with root package name */
    public final dr4.p f242731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f242732e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f242733f;

    public q(android.view.Surface surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f242728a = "MicroMsg.OpenGLSurface@" + hashCode();
        this.f242730c = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f242731d = new dr4.p();
        this.f242733f = new java.lang.Object();
        d(0, 0, i17, i18);
        this.f242729b = surface;
    }

    public final android.opengl.EGLSurface a() {
        android.opengl.EGLSurface eglSurface = this.f242730c;
        kotlin.jvm.internal.o.f(eglSurface, "eglSurface");
        return eglSurface;
    }

    public final boolean b() {
        java.lang.Object obj = this.f242729b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof android.graphics.SurfaceTexture) {
            return (fp.h.c(26) && ((android.graphics.SurfaceTexture) obj).isReleased()) ? false : true;
        }
        if (obj instanceof android.view.Surface) {
            return ((android.view.Surface) obj).isValid();
        }
        return false;
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f242728a, "markSurfaceRemoved:" + z17);
        synchronized (this.f242733f) {
            this.f242732e = z17;
        }
    }

    public final void d(int i17, int i18, int i19, int i27) {
        dr4.p pVar = this.f242731d;
        pVar.getClass();
        pVar.getClass();
        pVar.f242697a = i19;
        pVar.f242698b = i27;
    }

    public q(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f242728a = "MicroMsg.OpenGLSurface@" + hashCode();
        this.f242730c = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f242731d = new dr4.p();
        this.f242733f = new java.lang.Object();
        d(0, 0, i17, i18);
        this.f242729b = surface;
    }

    public q(int i17, int i18, int i19, int i27) {
        this.f242728a = "MicroMsg.OpenGLSurface@" + hashCode();
        this.f242730c = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f242731d = new dr4.p();
        this.f242733f = new java.lang.Object();
        d(i17, i18, i19, i27);
    }
}

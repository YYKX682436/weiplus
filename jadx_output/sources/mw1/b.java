package mw1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331690a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f331691b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f331692c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f331693d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f331694e;

    public b(java.lang.String username, java.lang.ref.WeakReference wInfoHolder, android.opengl.EGLSurface eGLSurface, android.opengl.EGLDisplay eglDisplay, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        eGLSurface = (i17 & 4) != 0 ? null : eGLSurface;
        if ((i17 & 8) != 0) {
            eglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            kotlin.jvm.internal.o.f(eglDisplay, "EGL_NO_DISPLAY");
        }
        z17 = (i17 & 16) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(wInfoHolder, "wInfoHolder");
        kotlin.jvm.internal.o.g(eglDisplay, "eglDisplay");
        this.f331690a = username;
        this.f331691b = wInfoHolder;
        this.f331692c = eGLSurface;
        this.f331693d = eglDisplay;
        this.f331694e = z17;
    }

    public final mw1.c a() {
        return (mw1.c) this.f331691b.get();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw1.b)) {
            return false;
        }
        mw1.b bVar = (mw1.b) obj;
        return kotlin.jvm.internal.o.b(this.f331690a, bVar.f331690a) && kotlin.jvm.internal.o.b(this.f331691b, bVar.f331691b) && kotlin.jvm.internal.o.b(this.f331692c, bVar.f331692c) && kotlin.jvm.internal.o.b(this.f331693d, bVar.f331693d) && this.f331694e == bVar.f331694e;
    }

    public int hashCode() {
        int hashCode = ((this.f331690a.hashCode() * 31) + this.f331691b.hashCode()) * 31;
        android.opengl.EGLSurface eGLSurface = this.f331692c;
        return ((((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f331693d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f331694e);
    }

    public java.lang.String toString() {
        return "RenderTarget(username=" + this.f331690a + ", wInfoHolder=" + this.f331691b + ", surface=" + this.f331692c + ", eglDisplay=" + this.f331693d + ", inUse=" + this.f331694e + ')';
    }
}

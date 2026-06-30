package jj3;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f300004a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f300005b;

    /* renamed from: c, reason: collision with root package name */
    public android.opengl.EGLSurface f300006c;

    /* renamed from: d, reason: collision with root package name */
    public android.opengl.EGLDisplay f300007d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f300008e;

    public c(java.lang.String username, java.lang.ref.WeakReference wInfoHolder, android.opengl.EGLSurface eGLSurface, android.opengl.EGLDisplay eglDisplay, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        eGLSurface = (i17 & 4) != 0 ? null : eGLSurface;
        if ((i17 & 8) != 0) {
            eglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            kotlin.jvm.internal.o.f(eglDisplay, "EGL_NO_DISPLAY");
        }
        z17 = (i17 & 16) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(wInfoHolder, "wInfoHolder");
        kotlin.jvm.internal.o.g(eglDisplay, "eglDisplay");
        this.f300004a = username;
        this.f300005b = wInfoHolder;
        this.f300006c = eGLSurface;
        this.f300007d = eglDisplay;
        this.f300008e = z17;
    }

    public final jj3.d a() {
        return (jj3.d) this.f300005b.get();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj3.c)) {
            return false;
        }
        jj3.c cVar = (jj3.c) obj;
        return kotlin.jvm.internal.o.b(this.f300004a, cVar.f300004a) && kotlin.jvm.internal.o.b(this.f300005b, cVar.f300005b) && kotlin.jvm.internal.o.b(this.f300006c, cVar.f300006c) && kotlin.jvm.internal.o.b(this.f300007d, cVar.f300007d) && this.f300008e == cVar.f300008e;
    }

    public int hashCode() {
        int hashCode = ((this.f300004a.hashCode() * 31) + this.f300005b.hashCode()) * 31;
        android.opengl.EGLSurface eGLSurface = this.f300006c;
        return ((((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f300007d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f300008e);
    }

    public java.lang.String toString() {
        return "RenderTarget(username=" + this.f300004a + ", wInfoHolder=" + this.f300005b + ", surface=" + this.f300006c + ", eglDisplay=" + this.f300007d + ", inUse=" + this.f300008e + ')';
    }
}

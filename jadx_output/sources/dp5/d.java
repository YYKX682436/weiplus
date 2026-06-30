package dp5;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.opengl.EGLDisplay f242280a;

    /* renamed from: b, reason: collision with root package name */
    public final android.opengl.EGLSurface f242281b;

    /* renamed from: c, reason: collision with root package name */
    public final android.opengl.EGLContext f242282c;

    public d(android.opengl.EGLDisplay display, android.opengl.EGLSurface eGLSurface, android.opengl.EGLContext eglContext) {
        kotlin.jvm.internal.o.g(display, "display");
        kotlin.jvm.internal.o.g(eglContext, "eglContext");
        this.f242280a = display;
        this.f242281b = eGLSurface;
        this.f242282c = eglContext;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp5.d)) {
            return false;
        }
        dp5.d dVar = (dp5.d) obj;
        return kotlin.jvm.internal.o.b(this.f242280a, dVar.f242280a) && kotlin.jvm.internal.o.b(this.f242281b, dVar.f242281b) && kotlin.jvm.internal.o.b(this.f242282c, dVar.f242282c);
    }

    public int hashCode() {
        int hashCode = this.f242280a.hashCode() * 31;
        android.opengl.EGLSurface eGLSurface = this.f242281b;
        return ((hashCode + (eGLSurface == null ? 0 : eGLSurface.hashCode())) * 31) + this.f242282c.hashCode();
    }

    public java.lang.String toString() {
        return "GLEnv(display=" + this.f242280a + ", eglSurface=" + this.f242281b + ", eglContext=" + this.f242282c + ')';
    }
}

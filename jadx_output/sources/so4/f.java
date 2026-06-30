package so4;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final so4.f f410775d = new so4.f();

    @Override // java.lang.Runnable
    public final void run() {
        rs0.h o17 = rs0.g.o(rs0.i.f399296a, null, 1, null);
        if (kotlin.jvm.internal.o.b(o17.f399294c, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocalEffectManager", "tryCreateX3DGlobalContext, create EGLContext failed");
            return;
        }
        so4.g.f410776a.h();
        if (!kotlin.jvm.internal.o.b(o17.f399293b, android.opengl.EGL14.EGL_NO_SURFACE)) {
            android.opengl.EGL14.eglDestroySurface(o17.f399292a, o17.f399293b);
        }
        android.opengl.EGL14.eglDestroyContext(o17.f399292a, o17.f399294c);
    }
}

package k63;

/* loaded from: classes14.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f304548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k63.m0 m0Var) {
        super(0);
        this.f304548d = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k63.m0 m0Var = this.f304548d;
        if (m0Var.f304558i != 0 && m0Var.f304559m != 0) {
            java.lang.System.nanoTime();
            if (m0Var.f304560n != null) {
                android.opengl.EGLDisplay eGLDisplay = m0Var.c().f399292a;
                android.opengl.EGLSurface eGLSurface = m0Var.f304560n;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, m0Var.c().f399294c);
            }
            m0Var.f304557h.d(null);
            if (m0Var.f304560n != null) {
                android.opengl.EGL14.eglSwapBuffers(m0Var.c().f399292a, m0Var.f304560n);
            }
            if (java.lang.System.currentTimeMillis() - m0Var.f304562p >= 30) {
                m0Var.f304566t.run();
            }
            java.lang.System.nanoTime();
        }
        return jz5.f0.f302826a;
    }
}

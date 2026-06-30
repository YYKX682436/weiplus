package go0;

/* loaded from: classes14.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(go0.f0 f0Var) {
        super(0);
        this.f273804d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f0 f0Var = this.f273804d;
        rs0.h hVar = f0Var.f273763i;
        android.opengl.EGLDisplay eGLDisplay = hVar != null ? hVar.f399292a : null;
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, hVar != null ? hVar.f399294c : null);
        android.opengl.EGLSurface eGLSurface2 = f0Var.f273765n;
        if (eGLSurface2 != null) {
            rs0.h hVar2 = f0Var.f273763i;
            if ((hVar2 != null ? hVar2.f399292a : null) != null) {
                android.opengl.EGL14.eglDestroySurface(hVar2 != null ? hVar2.f399292a : null, eGLSurface2);
                f0Var.f273765n = null;
                f0Var.f273766o = null;
            }
        }
        return jz5.f0.f302826a;
    }
}

package go0;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(go0.f0 f0Var) {
        super(0);
        this.f273807d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        go0.f0 f0Var = this.f273807d;
        android.opengl.EGLSurface eGLSurface = f0Var.f273765n;
        if (eGLSurface != null) {
            rs0.h hVar = f0Var.f273763i;
            android.opengl.EGL14.eglDestroySurface(hVar != null ? hVar.f399292a : null, eGLSurface);
        }
        go0.f1 f1Var = f0Var.f273767p;
        if (f1Var != null) {
            f1Var.n(true);
        }
        ft0.d dVar = f0Var.f273764m;
        if (dVar != null) {
            ft0.d.h(dVar, false, false, 2, null);
        }
        rs0.h hVar2 = f0Var.f273763i;
        if (hVar2 != null) {
            rs0.i.f399296a.u(hVar2);
        }
        f0Var.f273762h.removeCallbacksAndMessages(null);
        f0Var.f273761g.quitSafely();
        return jz5.f0.f302826a;
    }
}

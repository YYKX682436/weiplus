package go0;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f273869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f273870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(go0.f0 f0Var, java.lang.Object obj, boolean z17) {
        super(0);
        this.f273868d = f0Var;
        this.f273869e = obj;
        this.f273870f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.opengl.EGLSurface eGLSurface;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setOutputSurface from ");
        go0.f0 f0Var = this.f273868d;
        java.lang.Object obj = f0Var.f273766o;
        sb6.append(obj != null ? obj.hashCode() : 0);
        sb6.append(" to ");
        java.lang.Object obj2 = this.f273869e;
        sb6.append(obj2 != null ? obj2.hashCode() : 0);
        sb6.append(",releaeOldSurface:");
        boolean z17 = this.f273870f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreRender", sb6.toString());
        if (z17 && obj2 != null && !kotlin.jvm.internal.o.b(obj2, f0Var.f273766o) && (eGLSurface = f0Var.f273765n) != null) {
            rs0.h hVar = f0Var.f273763i;
            if ((hVar != null ? hVar.f399292a : null) != null) {
                android.opengl.EGL14.eglDestroySurface(hVar != null ? hVar.f399292a : null, eGLSurface);
                f0Var.f273765n = null;
                f0Var.f273766o = null;
            }
        }
        if (obj2 != null) {
            f0Var.f273765n = null;
            f0Var.f273766o = obj2;
        }
        return jz5.f0.f302826a;
    }
}

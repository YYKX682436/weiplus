package k63;

/* loaded from: classes14.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f304540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f304541e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(k63.m0 m0Var, android.view.Surface surface) {
        super(0);
        this.f304540d = m0Var;
        this.f304541e = surface;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.Surface surface = null;
        k63.m0 m0Var = this.f304540d;
        android.view.Surface surface2 = this.f304541e;
        if (surface2 != null) {
            k63.m0.a(m0Var);
            if (surface2.isValid()) {
                m0Var.f304560n = rs0.i.f399296a.k(m0Var.c().f399292a, surface2);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.GameLiveRenderManager", "outputSurface is invalid, ignore!");
                m0Var.f304560n = null;
            }
            surface = surface2;
        } else {
            k63.m0.a(m0Var);
            m0Var.f304560n = null;
        }
        m0Var.f304564r = surface;
        return jz5.f0.f302826a;
    }
}

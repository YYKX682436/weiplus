package zv0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f476197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f476198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f476199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f476200g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zv0.f0 f0Var, java.util.concurrent.ConcurrentHashMap concurrentHashMap, rv0.n1 n1Var, ex0.a0 a0Var) {
        super(1);
        this.f476197d = f0Var;
        this.f476198e = concurrentHashMap;
        this.f476199f = n1Var;
        this.f476200g = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        zv0.f0 f0Var = this.f476197d;
        if (f0Var.getUserActed$plugin_mj_template_release()) {
            for (java.util.Map.Entry entry : this.f476198e.entrySet()) {
                com.tencent.maas.base.MJID mjid = (com.tencent.maas.base.MJID) entry.getKey();
                java.lang.String transitionId = (java.lang.String) entry.getValue();
                ex0.a0 a0Var = this.f476200g;
                ex0.r K = a0Var.K(mjid);
                ex0.j0 j0Var = K instanceof ex0.j0 ? (ex0.j0) K : null;
                if (j0Var != null) {
                    kotlin.jvm.internal.o.g(transitionId, "transitionId");
                    a0Var.x(j0Var, transitionId);
                    a0Var.J(cx0.d.f224510f.a(cx0.d.f224509e), null);
                    f0Var.H();
                }
            }
        }
        f0Var.H();
        rv0.n1 n1Var = this.f476199f;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new zv0.k(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}

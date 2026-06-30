package wj;

/* loaded from: classes12.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f446371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj.t0 f446372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446373f;

    public a0(wj.j0 j0Var, wj.t0 t0Var, yz5.l lVar) {
        this.f446371d = j0Var;
        this.f446372e = t0Var;
        this.f446373f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        wj.j0 j0Var = this.f446371d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = j0Var.f446425f;
        wj.x xVar = new wj.x(h0Var, this.f446373f);
        wj.t0 t0Var = this.f446372e;
        concurrentHashMap.computeIfPresent(t0Var, xVar);
        com.tencent.mars.xlog.Log.w("MagicAdCommonFeatureService", "getAdInfoAsync, timeout, posId: " + t0Var);
        wj.p pj6 = j0Var.pj(t0Var);
        j0Var.nj(t0Var, pj6, "timeout=1");
        yz5.l lVar = (yz5.l) h0Var.f310123d;
        if (lVar != null) {
            pm0.v.X(new wj.y(lVar, pj6.f446462a));
        }
        j0Var.f446426g.computeIfPresent(t0Var, new wj.z(this));
    }
}

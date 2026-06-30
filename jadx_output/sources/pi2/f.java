package pi2;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.n f354774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pi2.n nVar) {
        super(0);
        this.f354774d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qf2.q3 q3Var;
        pi2.n nVar = this.f354774d;
        com.tencent.mm.plugin.finder.live.widget.e0.t(nVar, false, 1, null);
        oi2.a aVar = nVar.K;
        if (aVar != null && (q3Var = (qf2.q3) nVar.I.U0(qf2.q3.class)) != null) {
            com.tencent.mars.xlog.Log.i("FinderLivePayMicControl", "applyPayMicRequest payMicData: " + aVar);
            com.tencent.mm.plugin.finder.live.util.y.d(q3Var, null, null, new qf2.k3(q3Var, aVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}

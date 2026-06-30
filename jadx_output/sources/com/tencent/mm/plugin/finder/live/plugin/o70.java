package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class o70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f113712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        super(0);
        this.f113712d = v70Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ml2.q2 q2Var = ml2.q2.A1;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 64 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
        qo0.c cVar = this.f113712d.f114682p;
        qo0.b bVar = qo0.b.M3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SELF_EXIT_PK", true);
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_TOAST_MIC", true);
        cVar.statusChange(bVar, bundle);
        return jz5.f0.f302826a;
    }
}

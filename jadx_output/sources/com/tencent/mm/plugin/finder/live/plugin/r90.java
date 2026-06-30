package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f114115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f114116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f114117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, cm2.m0 m0Var, r45.y23 y23Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114115d = ea0Var;
        this.f114116e = m0Var;
        this.f114117f = y23Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.r90(this.f114115d, this.f114116e, this.f114117f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.r90 r90Var = (com.tencent.mm.plugin.finder.live.plugin.r90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r90Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.q4 q4Var = dk2.q4.f233938a;
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f114115d;
        android.content.Context context = ea0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        q4Var.b(context, ea0Var.S0(), this.f114116e.f43369w);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.finder.live.view.k0 R0 = ea0Var.R0();
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) R0 : null;
        r45.qt2 reportObj = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null;
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e S0 = ea0Var.S0();
        r45.y23 y23Var = this.f114117f;
        ((c61.p2) ybVar).Kj(reportObj, 18054, zl2.r4.k0(r4Var, S0, 25, pm0.v.u(y23Var.getLong(0)), 0, y23Var.getString(50), 8, null));
        return jz5.f0.f302826a;
    }
}

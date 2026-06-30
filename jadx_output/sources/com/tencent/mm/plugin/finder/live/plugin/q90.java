package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f113975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f113976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f113977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f113978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f113979i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(boolean z17, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, cm2.m0 m0Var, l81.b1 b1Var, r45.y23 y23Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113975e = z17;
        this.f113976f = ea0Var;
        this.f113977g = m0Var;
        this.f113978h = b1Var;
        this.f113979i = y23Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.q90(this.f113975e, this.f113976f, this.f113977g, this.f113978h, this.f113979i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.q90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113974d;
        cm2.m0 m0Var = this.f113977g;
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f113976f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.f113975e) {
                s40.a1 a1Var = (s40.a1) i95.n0.c(s40.a1.class);
                android.content.Context context = ea0Var.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r45.y23 y23Var = m0Var.f43368v;
                this.f113974d = 1;
                if (((com.tencent.mm.feature.finder.live.z5) a1Var).aj(context, y23Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context2 = ea0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        q4Var.n(context2, ea0Var.S0(), this.f113978h, ea0Var.Y0());
        android.content.Context context3 = ea0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        q4Var.b(context3, ea0Var.S0(), m0Var.f43369w);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.finder.live.view.k0 R0 = ea0Var.R0();
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = R0 instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) R0 : null;
        r45.qt2 reportObj = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null;
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e S0 = ea0Var.S0();
        r45.y23 y23Var2 = this.f113979i;
        ((c61.p2) ybVar).Kj(reportObj, 18054, zl2.r4.k0(r4Var, S0, 25, pm0.v.u(y23Var2.getLong(0)), 0, y23Var2.getString(50), 8, null));
        return jz5.f0.f302826a;
    }
}

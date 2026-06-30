package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class r implements com.tencent.mm.wallet_core.model.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f145904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145905b;

    public r(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout, long j17) {
        this.f145905b = envelopeAppBarLayout;
        this.f145904a = j17;
    }

    @Override // com.tencent.mm.wallet_core.model.y1
    public void a(com.tencent.mm.wallet_core.model.s1 s1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f145904a;
        boolean z17 = s1Var instanceof com.tencent.mm.wallet_core.model.r1;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145905b;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "downloadComplete failed，errorCode: %s", java.lang.Integer.valueOf(((com.tencent.mm.wallet_core.model.q1) s1Var).f213985a));
            envelopeAppBarLayout.f145785t.setVisibility(8);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, envelopeAppBarLayout.I1, 2, 3, java.lang.Long.valueOf(currentTimeMillis));
        } else {
            java.lang.String str = ((com.tencent.mm.wallet_core.model.r1) s1Var).f213987a;
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "downloadComplete success，file path: %s", str);
            com.tencent.mm.plugin.luckymoney.model.n3.f145460a.h(2, str, envelopeAppBarLayout.f145785t);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, envelopeAppBarLayout.I1, 1, 3, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}

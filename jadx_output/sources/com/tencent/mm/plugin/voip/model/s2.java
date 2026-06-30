package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class s2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176801d;

    public s2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176801d = d3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176801d;
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        boolean z17 = true;
        if (g1Var.f176532x.f176874p == 1) {
            int i17 = g1Var.f176508a;
            if (i17 != 2 && i17 != 4) {
                z17 = false;
            }
            if (z17) {
                vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "call timeout!");
                com.tencent.mm.plugin.voip.model.g1 g1Var2 = d3Var.f176411a;
                g1Var2.f176532x.M1.f176713a = 101;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11521, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 4, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                g1Var2.f176534z.M();
                d3Var.b(4);
            }
        }
        return false;
    }
}

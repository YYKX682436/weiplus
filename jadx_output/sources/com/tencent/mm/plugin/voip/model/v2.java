package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class v2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176813d;

    public v2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176813d = d3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176813d;
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        int i17 = v2protocalVar.f176877q;
        if (i17 == 0) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", fp.k.c() + " roomId == 0 ");
            d3Var.C.d();
        } else {
            if (g1Var.f176508a >= 5) {
                mq4.o oVar = new mq4.o(i17, v2protocalVar.f176883s, g1Var.S, g1Var.G, v2protocalVar.GetChannelDataTimeoutCnt());
                com.tencent.mm.plugin.voip.model.l1 l1Var = d3Var.f176411a.f176532x.M1;
                if (l1Var.P != 0) {
                    l1Var.g(-1L);
                }
                l1Var.P = java.lang.System.currentTimeMillis();
                oVar.L();
            }
        }
        return true;
    }
}

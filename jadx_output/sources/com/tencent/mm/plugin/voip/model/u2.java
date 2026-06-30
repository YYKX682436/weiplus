package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class u2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176808d;

    public u2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176808d = d3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176808d;
        com.tencent.mm.plugin.voip.model.g1 g1Var = d3Var.f176411a;
        g1Var.I++;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        if (v2protocalVar.f176877q == 0) {
            vq4.d0.b("MicroMsg.Voip.VoipServiceEx", fp.k.c() + "double link switch roomId == 0 ");
            d3Var.B.d();
        } else {
            v2protocalVar.app2EngineDataEx(v2protocalVar.f176858j1, v2protocalVar.f176861k1, v2protocalVar.f176864l1, 0, 0);
            com.tencent.mm.plugin.voip.model.g1 g1Var2 = d3Var.f176411a;
            if (!g1Var2.H && 1 == g1Var2.f176532x.field_mGetValidSample) {
                g1Var2.H = true;
                g1Var2.f176507J = g1Var2.I;
            }
            if (1 == g1Var2.f176526r) {
                g1Var2.f176526r = 15;
            }
            if (true == g1Var2.H) {
                int i17 = g1Var2.I;
                if (i17 - g1Var2.f176507J == g1Var2.f176526r) {
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var2.f176532x;
                    if ((v2protocalVar2.f176834b1 & 1) == 0) {
                        g1Var2.f176507J = i17;
                        int isDCSameLan = v2protocalVar2.isDCSameLan();
                        int currentConnType = d3Var.f176411a.f176532x.getCurrentConnType();
                        if (1 == isDCSameLan && 1 == currentConnType) {
                            vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  In the Same LAN, isDCSameLan = " + isDCSameLan);
                            com.tencent.mm.plugin.voip.model.g1 g1Var3 = d3Var.f176411a;
                            g1Var3.I = g1Var3.I + 1;
                            return true;
                        }
                        int i18 = d3Var.f176411a.f176532x.getcurstrategy();
                        int isRelayConnReady = d3Var.f176411a.f176532x.isRelayConnReady();
                        int isDCReady = d3Var.f176411a.f176532x.isDCReady();
                        com.tencent.mm.plugin.voip.model.g1 g1Var4 = d3Var.f176411a;
                        int i19 = g1Var4.f176526r - 3;
                        g1Var4.f176532x.app2EngineLinkQualityEx(i19 <= 15 ? i19 : 15, d3Var.A);
                        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = d3Var.f176411a.f176532x;
                        new mq4.k(v2protocalVar3.f176877q, v2protocalVar3.f176883s, v2protocalVar3.f176880r, currentConnType, isRelayConnReady, isDCReady, i18, d3Var.A, v2protocalVar3.field_realLinkQualityInfoBuffLen).L();
                        d3Var.f176411a.f176532x.f176837c1++;
                        vq4.d0.c("MicroMsg.Voip.VoipServiceEx", "zhengxue[DOUBLELINK]  doubleLinkSwitchReportStatus " + d3Var.f176411a.f176526r + " isFirstValidSampleSet " + d3Var.f176411a.H + " mGetValidSample " + d3Var.f176411a.f176532x.field_mGetValidSample + "mDoubleLinkSwitchReqCnt " + d3Var.f176411a.f176532x.f176837c1 + "mTimerCounter " + d3Var.f176411a.I + "mLastSwitchTimer " + d3Var.f176411a.f176507J);
                    }
                }
            }
        }
        return true;
    }
}

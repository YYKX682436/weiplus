package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class i2 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.h2 f176676d;

    public i2(com.tencent.mm.plugin.voip.model.h2 h2Var) {
        this.f176676d = h2Var;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "network status change from " + i17);
        com.tencent.mm.plugin.voip.model.h2 h2Var = this.f176676d;
        if (h2Var.f176562e && i17 == 4) {
            com.tencent.mm.plugin.voip.model.g1 g1Var = h2Var.f176558a.f176411a;
            int i18 = g1Var.L;
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
            if (i18 == 0) {
                g1Var.L = v2protocalVar.f176856j;
            }
            int e17 = vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (e17 != g1Var.L) {
                vq4.d0.c("MicroMsg.Voip.VoipContext", "steve: onVoipLocalNetTypeChange: local network type change from " + g1Var.L + " to " + e17);
                try {
                    byte[] bArr = new byte[4];
                    bArr[0] = (byte) e17;
                    int appCmd = v2protocalVar.setAppCmd(301, bArr, 4);
                    if (appCmd < 0) {
                        vq4.d0.c("MicroMsg.Voip.VoipContext", "steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type" + e17 + "fail:" + appCmd + ", [roomid=" + v2protocalVar.f176880r + ", roomkey=" + v2protocalVar.f176883s + "]");
                    }
                    r45.ww6 ww6Var = new r45.ww6();
                    ww6Var.f389547d = 3;
                    ww6Var.f389548e = new com.tencent.mm.protobuf.g(bArr, 0, 1);
                    v2protocalVar.SendRUDP(ww6Var.toByteArray(), ww6Var.toByteArray().length);
                } catch (java.lang.Exception unused) {
                    vq4.d0.c("MicroMsg.Voip.VoipContext", "onVoipLocalNetTypeChange Error");
                }
                g1Var.L = e17;
            }
            com.tencent.mm.plugin.voip.model.d3 d3Var = h2Var.f176558a;
            if (d3Var.f176411a.f176513e) {
                d3Var.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                com.tencent.mm.plugin.voip.model.g1 g1Var2 = d3Var.f176411a;
                g1Var2.f176532x.c(linkedList);
                int i19 = 0;
                int i27 = 0;
                for (int i28 = 0; i28 < linkedList.size(); i28++) {
                    if (((r45.et4) linkedList.get(i28)).f373722g == 5 || ((r45.et4) linkedList.get(i28)).f373722g == 6) {
                        i27++;
                    }
                    if (((r45.et4) linkedList.get(i28)).f373722g == 4) {
                        i19++;
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var2.f176532x;
                sb6.append(v2protocalVar2.f176884s0);
                sb6.append("|redirect:");
                sb6.append(i19);
                sb6.append(":");
                sb6.append(i27);
                v2protocalVar2.f176884s0 = sb6.toString();
                int i29 = v2protocalVar2.f176877q;
                if (i29 == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipServiceEx", "current room Id is unavailable,can not run redirect cgi");
                    return;
                }
                mq4.s sVar = new mq4.s(i29, v2protocalVar2.f176883s, v2protocalVar2.f176880r, 0, 0, null, linkedList);
                com.tencent.mm.plugin.voip.model.l1 l1Var = v2protocalVar2.M1;
                l1Var.getClass();
                l1Var.Q = java.lang.System.currentTimeMillis();
                sVar.L();
            }
        }
    }
}

package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176339d;

    public b1(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176339d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar;
        byte[] bArr;
        vq4.d0.c("MicroMsg.Voip.VoipContext", "v2protocal QueryNicWanIp");
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176339d;
        if (g1Var.P != null && (bArr = (v2protocalVar = g1Var.f176532x).f176900x1) != null) {
            int QueryNicWanIp = v2protocalVar.QueryNicWanIp(bArr, bArr.length);
            if (QueryNicWanIp == 0) {
                return;
            }
            vq4.d0.b("MicroMsg.Voip.VoipContext", "query nic wan ip fail ret:" + QueryNicWanIp);
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
        if (!(v2protocalVar2.f176869n0 == 0 && v2protocalVar2.f176872o0 == 1) && vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a) == 4) {
            g1Var.i();
        }
    }
}

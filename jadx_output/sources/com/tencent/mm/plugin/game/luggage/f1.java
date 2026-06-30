package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class f1 extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f139552d = new byte[0];

    public f1(com.tencent.mm.plugin.game.luggage.g1 g1Var) {
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        synchronized (this.f139552d) {
            if (h53.j.d() != null) {
                h53.j d17 = h53.j.d();
                d17.getClass();
                java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                d17.f279056f.a(new h53.h(d17, formatedNetType));
                d17.f279057g.h(java.lang.String.format("if (SystemInfo == 'undefined' || SystemInfo.networkType == 'undefined) {return;} SystemInfo.networkType=\"%s\"; console.log(SystemInfo.networkType);", formatedNetType), null);
            }
        }
    }
}

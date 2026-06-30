package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176930d;

    public z2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176930d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int e17 = vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        boolean isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176930d;
        if (isWifi) {
            int h17 = com.tencent.mm.sdk.platformtools.v0.f193027a.h();
            com.tencent.mm.plugin.voip.model.d3.E = h17;
            d3Var.f176411a.f176532x.setNetSignalValue(4, h17);
        }
        int d17 = vq4.d0.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        d3Var.f176411a.f176532x.setNetSignalValue(d17, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "nettype %d wifi rssi %d ratiotype %d radio signal value %d", java.lang.Integer.valueOf(e17), java.lang.Integer.valueOf(com.tencent.mm.plugin.voip.model.d3.E), java.lang.Integer.valueOf(d17), -1);
    }
}

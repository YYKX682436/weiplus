package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class w2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176911d;

    public w2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176911d = d3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "voip called out of time,now destroy...");
        com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176911d;
        if (3 == d3Var.f176411a.f176508a && (i17 = d3Var.f176413c) != 0 && i17 == d3Var.e()) {
            d3Var.f176413c = 0;
            d3Var.f176411a.v(5, -9000, "", -1);
        }
        return false;
    }
}

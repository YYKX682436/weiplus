package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class o0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.g1 f176769d;

    public o0(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176769d = g1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176769d;
        if (g1Var.f176508a != 4) {
            return false;
        }
        vq4.d0.c("MicroMsg.Voip.VoipContext", "connect time out.. now finish..");
        g1Var.f176532x.M1.f176713a = 105;
        g1Var.v(1, -9000, "", -1);
        return false;
    }
}

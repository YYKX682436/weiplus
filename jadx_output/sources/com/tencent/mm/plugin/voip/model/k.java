package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.n f176688d;

    public k(com.tencent.mm.plugin.voip.model.n nVar) {
        this.f176688d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "on timeout, dismiss incoming card");
        com.tencent.mm.plugin.voip.model.n nVar = this.f176688d;
        jq4.z0.c(nVar.f176753d, false, false, false, 3, null);
        com.tencent.mm.plugin.voip.model.n.b(nVar, 3);
        nVar.p();
    }
}

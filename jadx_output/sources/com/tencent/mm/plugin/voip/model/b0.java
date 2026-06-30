package com.tencent.mm.plugin.voip.model;

/* loaded from: classes10.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.c0 f176338d;

    public b0(com.tencent.mm.plugin.voip.model.c0 c0Var) {
        this.f176338d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "on stop voip");
        com.tencent.mm.plugin.voip.model.c0 c0Var = this.f176338d;
        c0Var.f176761o = true;
        c0Var.k();
    }
}

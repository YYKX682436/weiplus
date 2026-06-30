package com.tencent.mm.plugin.voip.model;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.c0 f176320d;

    public a0(com.tencent.mm.plugin.voip.model.c0 c0Var) {
        this.f176320d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipIncomingCallManager", "on release camera");
        com.tencent.mm.plugin.voip.model.c0 c0Var = this.f176320d;
        c0Var.f176762p = true;
        c0Var.k();
    }
}

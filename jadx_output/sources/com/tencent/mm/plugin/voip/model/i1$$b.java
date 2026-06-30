package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public final /* synthetic */ class i1$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.i1 f176673d;

    public /* synthetic */ i1$$b(com.tencent.mm.plugin.voip.model.i1 i1Var) {
        this.f176673d = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.voip.model.i1 i1Var = this.f176673d;
        i1Var.getClass();
        try {
            if (i1Var.f176647b != null) {
                i1Var.f176647b.l();
                i1Var.f176647b = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "finish stopRecord and release recorder");
            }
            i1Var.i();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipDeviceHandler", "start record error: %s", e17.getMessage());
            i1Var.f176654i = 1;
            com.tencent.mm.plugin.voip.model.g1 g1Var = i1Var.f176649d;
            g1Var.f176532x.L = java.lang.Math.abs(1);
            g1Var.f176534z.u();
        }
    }
}

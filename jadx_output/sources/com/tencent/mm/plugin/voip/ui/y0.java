package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.t0 f177026d;

    public y0(com.tencent.mm.plugin.voip.ui.t0 t0Var) {
        this.f177026d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = this.f177026d.f176987a;
        if (voipViewFragment == null || !voipViewFragment.c()) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.voip.ui.x0 x0Var = new com.tencent.mm.plugin.voip.ui.x0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(x0Var, 2000L, false);
    }
}

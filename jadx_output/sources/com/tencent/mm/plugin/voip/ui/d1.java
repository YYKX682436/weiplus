package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.e1 f176947d;

    public d1(com.tencent.mm.plugin.voip.ui.e1 e1Var) {
        this.f176947d = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.ui.e1 e1Var = this.f176947d;
        com.tencent.mm.plugin.voip.ui.t0 t0Var = e1Var.f176950e;
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = t0Var.f176987a;
        if (voipViewFragment == null || t0Var.f176990d) {
            return;
        }
        voipViewFragment.b(e1Var.f176949d);
    }
}

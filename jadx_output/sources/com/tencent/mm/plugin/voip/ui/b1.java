package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.c1 f176939d;

    public b1(com.tencent.mm.plugin.voip.ui.c1 c1Var) {
        this.f176939d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.ui.c1 c1Var = this.f176939d;
        com.tencent.mm.plugin.voip.ui.t0 t0Var = c1Var.f176944e;
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = t0Var.f176987a;
        if (voipViewFragment == null || t0Var.f176990d) {
            return;
        }
        voipViewFragment.setVoicePlayDevice(c1Var.f176943d);
    }
}

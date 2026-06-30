package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes14.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.a1 f177028d;

    public z0(com.tencent.mm.plugin.voip.ui.a1 a1Var) {
        this.f177028d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.ui.t0 t0Var = this.f177028d.f176937d;
        com.tencent.mm.plugin.voip.ui.VoipViewFragment voipViewFragment = t0Var.f176987a;
        if (voipViewFragment == null || t0Var.f176990d) {
            return;
        }
        voipViewFragment.d();
    }
}

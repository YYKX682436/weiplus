package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.s4 f173124d;

    public r4(com.tencent.mm.plugin.teenmode.ui.s4 s4Var) {
        this.f173124d = s4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        j45.l.h(this.f173124d.f173133d, "teenmode", ".ui.SettingsTeenModeIntro");
        this.f173124d.f173133d.overridePendingTransition(0, 0);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.teenmode.ui.q4 q4Var = new com.tencent.mm.plugin.teenmode.ui.q4(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(q4Var, 200L, null);
    }
}

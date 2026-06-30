package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class uc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f161604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI f161605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd0.g1 f161606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wd0.g1 f161607g;

    public uc(com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI, wd0.g1 g1Var, wd0.g1 g1Var2) {
        this.f161604d = f4Var;
        this.f161605e = settingsHearingAidInitUI;
        this.f161606f = g1Var;
        this.f161607g = g1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f161604d.dismiss();
        boolean b17 = k14.t.f303377a.b();
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI = this.f161605e;
        if (b17) {
            int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.f160424r;
            settingsHearingAidInitUI.V6(this.f161606f, this.f161607g);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsHearingAidInitUI.getContext());
        u1Var.a(false);
        u1Var.g(settingsHearingAidInitUI.getString(com.tencent.mm.R.string.o5v));
        u1Var.n(settingsHearingAidInitUI.getContext().getString(com.tencent.mm.R.string.jgd));
        u1Var.j(settingsHearingAidInitUI.getContext().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.tc(settingsHearingAidInitUI));
        u1Var.q(false);
    }
}

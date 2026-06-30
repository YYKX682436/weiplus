package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class ee implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f160994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI f160995e;

    public ee(com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        this.f160994d = f4Var;
        this.f160995e = settingsHearingAidTestEnvironmentUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f160994d.dismiss();
        boolean b17 = k14.t.f303377a.b();
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI = this.f160995e;
        if (b17) {
            int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.f160436z;
            settingsHearingAidTestEnvironmentUI.X6();
            return;
        }
        int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.f160436z;
        settingsHearingAidTestEnvironmentUI.V6("download_materials", 2);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsHearingAidTestEnvironmentUI.getContext());
        u1Var.a(false);
        u1Var.g(settingsHearingAidTestEnvironmentUI.getString(com.tencent.mm.R.string.o5v));
        u1Var.n(settingsHearingAidTestEnvironmentUI.getContext().getString(com.tencent.mm.R.string.jgd));
        u1Var.j(settingsHearingAidTestEnvironmentUI.getContext().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.de(settingsHearingAidTestEnvironmentUI));
        u1Var.q(false);
    }
}

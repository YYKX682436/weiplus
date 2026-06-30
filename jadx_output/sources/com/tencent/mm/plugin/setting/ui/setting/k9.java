package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class k9 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161232a;

    public k9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161232a = settingsCareModeIntro;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161232a;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsCareModeIntro.getContext());
        u1Var.g(settingsCareModeIntro.getContext().getResources().getString(com.tencent.mm.R.string.f492980ij4));
        u1Var.a(true);
        u1Var.c(new com.tencent.mm.plugin.setting.ui.setting.i9(this, z17), new com.tencent.mm.plugin.setting.ui.setting.j9(this, z17));
        u1Var.q(false);
    }
}

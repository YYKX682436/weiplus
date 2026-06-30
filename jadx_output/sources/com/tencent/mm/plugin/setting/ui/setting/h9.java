package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class h9 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161100a;

    public h9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161100a = settingsCareModeIntro;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        boolean g17 = j65.e.g();
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161100a;
        if (!g17 && !j65.e.e() && !j65.e.c() && !z17) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsCareModeIntro.getContext());
            u1Var.g(settingsCareModeIntro.getContext().getResources().getString(com.tencent.mm.R.string.f492980ij4));
            u1Var.a(true);
            u1Var.c(new com.tencent.mm.plugin.setting.ui.setting.f9(this), new com.tencent.mm.plugin.setting.ui.setting.g9(this, z17));
            u1Var.q(false);
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, java.lang.Boolean.valueOf(z17));
        j65.e.o();
        com.tencent.mm.autogen.mmdata.rpt.CareModeSwitchStruct careModeSwitchStruct = new com.tencent.mm.autogen.mmdata.rpt.CareModeSwitchStruct();
        careModeSwitchStruct.f55580d = z17 ? 3L : 4L;
        careModeSwitchStruct.k();
        l14.a.a("listen_text_msg_btn", z17);
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.V6(settingsCareModeIntro);
    }
}

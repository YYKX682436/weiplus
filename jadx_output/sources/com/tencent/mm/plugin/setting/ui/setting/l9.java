package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class l9 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161287a;

    public l9(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161287a = settingsCareModeIntro;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161287a;
        if (!z17) {
            int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.D;
            settingsCareModeIntro.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingsCareModeIntro.getContext(), 1, true);
            k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.q9(settingsCareModeIntro);
            k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.r8(settingsCareModeIntro);
            k0Var.q(settingsCareModeIntro.getResources().getString(com.tencent.mm.R.string.lsk), 17);
            k0Var.f211880r = new com.tencent.mm.plugin.setting.ui.setting.s8(settingsCareModeIntro);
            k0Var.C = new com.tencent.mm.plugin.setting.ui.setting.t8(settingsCareModeIntro);
            k0Var.f211854d = new com.tencent.mm.plugin.setting.ui.setting.u8(settingsCareModeIntro);
            k0Var.v();
            return;
        }
        int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.D;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(settingsCareModeIntro.getContext(), 2, 4, true);
        z2Var.y(settingsCareModeIntro.getResources().getString(com.tencent.mm.R.string.f490454vi));
        z2Var.F = new com.tencent.mm.plugin.setting.ui.setting.p9(settingsCareModeIntro, z2Var);
        z2Var.x(1);
        android.view.View inflate = com.tencent.mm.ui.id.b(settingsCareModeIntro.getContext()).inflate(com.tencent.mm.R.layout.djt, (android.view.ViewGroup) null);
        com.tencent.mm.ui.bk.s0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc)).getPaint());
        z2Var.j(inflate);
        z2Var.C();
        j65.e.l(true);
        l14.a.a("silent_mode_btn", z17);
        ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ni();
        ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Bi(true);
        ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).wi();
    }
}

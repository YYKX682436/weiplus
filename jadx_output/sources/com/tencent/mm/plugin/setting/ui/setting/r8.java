package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class r8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro f161499d;

    public r8(com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro) {
        this.f161499d = settingsCareModeIntro;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro settingsCareModeIntro = this.f161499d;
        if (itemId == settingsCareModeIntro.C) {
            l14.a.a("silent_mode_btn", false);
            ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ai(true);
            ((vd0.d2) ((wd0.m1) i95.n0.c(wd0.m1.class))).Ui();
            j65.e.l(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro.U6(settingsCareModeIntro);
            if (j65.e.e() || j65.e.f() || j65.e.c()) {
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsCareModeIntro.getContext());
            u1Var.g(settingsCareModeIntro.getContext().getResources().getString(com.tencent.mm.R.string.f492980ij4));
            u1Var.m(com.tencent.mm.R.string.f490454vi);
            u1Var.a(true);
            u1Var.l(new com.tencent.mm.plugin.setting.ui.setting.q8(this));
            u1Var.q(false);
        }
    }
}

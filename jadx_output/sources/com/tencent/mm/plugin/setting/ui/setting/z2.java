package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class z2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode f161805d;

    public z2(com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode settingDarkMode) {
        this.f161805d = settingDarkMode;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode settingDarkMode = this.f161805d;
        com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference.f161506e.a(settingDarkMode, "select_view_dark_mode", settingDarkMode.f160204s ? "dark_mode" : "normal_mode", 4);
        j75.f stateCenter = settingDarkMode.getStateCenter();
        if (stateCenter != null) {
            stateCenter.B3(new t14.t());
        }
        boolean z17 = settingDarkMode.f160205t;
        if ((!z17 || settingDarkMode.f160197i == z17) && (z17 || settingDarkMode.f160196h == settingDarkMode.f160204s)) {
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode_follow_system", settingDarkMode.f160205t);
            com.tencent.mm.ui.bk.x0();
            com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("dark_mode", settingDarkMode.f160204s);
            if (settingDarkMode.f160205t) {
                com.tencent.mm.ui.ee.e(2, settingDarkMode.getTaskId());
            } else {
                com.tencent.mm.ui.ee.e(settingDarkMode.f160204s ? 1 : 0, settingDarkMode.getTaskId());
            }
            settingDarkMode.Y6();
            settingDarkMode.finish();
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingDarkMode.getContext());
            u1Var.g(settingDarkMode.getContext().getResources().getString(com.tencent.mm.R.string.ij6));
            u1Var.a(true);
            u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.a3(settingDarkMode));
            u1Var.q(false);
        }
        return true;
    }
}

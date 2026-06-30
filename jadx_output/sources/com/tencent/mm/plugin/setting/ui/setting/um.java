package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class um implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161617d;

    public um(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161617d = settingsSwitchAccountUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = this.f161617d;
        if (!settingsSwitchAccountUI.f160686f) {
            settingsSwitchAccountUI.f160686f = true;
            settingsSwitchAccountUI.f160685e.setDeleteState(true);
            settingsSwitchAccountUI.f160685e.b();
            settingsSwitchAccountUI.Y6();
            c01.uc ucVar = c01.uc.f37514c;
            if (((java.util.HashSet) ucVar.d()).size() > 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 1, 3, ucVar.f(), ucVar.e(), wo.w0.k());
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 0, 3, ucVar.f(), ucVar.e(), wo.w0.k());
            }
        }
        return false;
    }
}

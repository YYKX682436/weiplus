package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class hm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161119d;

    public hm(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161119d = settingsSwitchAccountUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = this.f161119d;
        settingsSwitchAccountUI.f160686f = false;
        settingsSwitchAccountUI.f160695r = false;
        settingsSwitchAccountUI.f160685e.setDeleteState(false);
        settingsSwitchAccountUI.f160685e.b();
        settingsSwitchAccountUI.Y6();
        return false;
    }
}

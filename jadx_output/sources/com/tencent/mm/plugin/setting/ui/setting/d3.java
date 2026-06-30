package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class d3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI f160931d;

    public d3(com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI settingDeleteAccountUI) {
        this.f160931d = settingDeleteAccountUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountUI settingDeleteAccountUI = this.f160931d;
        settingDeleteAccountUI.hideVKB();
        settingDeleteAccountUI.finish();
        return true;
    }
}

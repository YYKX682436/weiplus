package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class pf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI f161442d;

    public pf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI) {
        this.f161442d = settingsManageAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 700) {
            return true;
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI = this.f161442d;
        settingsManageAuthUI.f160489i = false;
        settingsManageAuthUI.f160486f.notifyDataSetChanged();
        settingsManageAuthUI.T6();
        return true;
    }
}

package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class qf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI f161474d;

    public qf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI) {
        this.f161474d = settingsManageAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 700) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI settingsManageAuthUI = this.f161474d;
            settingsManageAuthUI.f160489i = true;
            settingsManageAuthUI.f160486f.notifyDataSetChanged();
            settingsManageAuthUI.T6();
        }
        return true;
    }
}

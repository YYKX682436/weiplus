package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class mi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI f161332d;

    public mi(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI settingsModifyNameUI) {
        this.f161332d = settingsModifyNameUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI settingsModifyNameUI = this.f161332d;
        settingsModifyNameUI.hideVKB();
        settingsModifyNameUI.finish();
        return true;
    }
}

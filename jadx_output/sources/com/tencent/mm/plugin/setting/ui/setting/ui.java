package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class ui implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI f161613d;

    public ui(com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI settingsMoreSafeUI) {
        this.f161613d = settingsMoreSafeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsMoreSafeUI settingsMoreSafeUI = this.f161613d;
        settingsMoreSafeUI.hideVKB();
        settingsMoreSafeUI.finish();
        return true;
    }
}

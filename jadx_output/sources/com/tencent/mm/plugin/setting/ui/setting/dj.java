package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class dj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI f160951d;

    public dj(com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI settingsNetStatUI) {
        this.f160951d = settingsNetStatUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI settingsNetStatUI = this.f160951d;
        settingsNetStatUI.hideVKB();
        settingsNetStatUI.finish();
        return true;
    }
}

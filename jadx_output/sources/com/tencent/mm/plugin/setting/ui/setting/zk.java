package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class zk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI f161832d;

    public zk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI settingsPersonalMoreUI) {
        this.f161832d = settingsPersonalMoreUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalMoreUI settingsPersonalMoreUI = this.f161832d;
        settingsPersonalMoreUI.hideVKB();
        settingsPersonalMoreUI.finish();
        return true;
    }
}

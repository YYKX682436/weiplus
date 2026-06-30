package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class o6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI f161379d;

    public o6(com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI settingsAccountInfoUI) {
        this.f161379d = settingsAccountInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI settingsAccountInfoUI = this.f161379d;
        settingsAccountInfoUI.hideVKB();
        settingsAccountInfoUI.finish();
        return true;
    }
}

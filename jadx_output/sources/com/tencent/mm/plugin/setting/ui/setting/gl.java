package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class gl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI f161079d;

    public gl(com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI settingsRingtoneUI) {
        this.f161079d = settingsRingtoneUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI settingsRingtoneUI = this.f161079d;
        settingsRingtoneUI.hideVKB();
        settingsRingtoneUI.finish();
        return true;
    }
}

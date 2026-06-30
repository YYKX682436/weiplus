package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class fl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI f161040d;

    public fl(com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI settingsPrivacyUI) {
        this.f161040d = settingsPrivacyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI settingsPrivacyUI = this.f161040d;
        settingsPrivacyUI.hideVKB();
        settingsPrivacyUI.finish();
        return true;
    }
}

package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class fm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI f161041d;

    public fm(com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI) {
        this.f161041d = settingsSnsPrivacyUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSnsPrivacyUI settingsSnsPrivacyUI = this.f161041d;
        settingsSnsPrivacyUI.hideVKB();
        settingsSnsPrivacyUI.finish();
        return true;
    }
}

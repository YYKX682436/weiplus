package com.tencent.mm.plugin.setting.ui.setting;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.if, reason: invalid class name */
/* loaded from: classes11.dex */
public class Cif implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI f161156d;

    public Cif(com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI settingsLanguageUI) {
        this.f161156d = settingsLanguageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI settingsLanguageUI = this.f161156d;
        settingsLanguageUI.hideVKB();
        settingsLanguageUI.finish();
        return true;
    }
}

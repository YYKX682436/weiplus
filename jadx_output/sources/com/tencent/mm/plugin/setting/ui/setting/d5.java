package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class d5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera f160934d;

    public d5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera settingsAboutCamera) {
        this.f160934d = settingsAboutCamera;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera settingsAboutCamera = this.f160934d;
        settingsAboutCamera.hideVKB();
        settingsAboutCamera.finish();
        return true;
    }
}

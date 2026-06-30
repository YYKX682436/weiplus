package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class gm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI f161080d;

    public gm(com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI settingsSpecialSceneNotificationUI) {
        this.f161080d = settingsSpecialSceneNotificationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSpecialSceneNotificationUI settingsSpecialSceneNotificationUI = this.f161080d;
        settingsSpecialSceneNotificationUI.hideVKB();
        settingsSpecialSceneNotificationUI.finish();
        return true;
    }
}

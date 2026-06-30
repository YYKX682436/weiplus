package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class r5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161495d;

    public r5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f161495d = settingsAboutMicroMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f161495d;
        settingsAboutMicroMsgUI.hideVKB();
        settingsAboutMicroMsgUI.finish();
        return true;
    }
}

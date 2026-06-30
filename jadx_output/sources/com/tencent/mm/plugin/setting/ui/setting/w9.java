package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class w9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI f161692d;

    public w9(com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI settingsChattingUI) {
        this.f161692d = settingsChattingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI settingsChattingUI = this.f161692d;
        settingsChattingUI.hideVKB();
        settingsChattingUI.finish();
        return true;
    }
}

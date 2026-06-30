package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class r9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI f161500d;

    public r9(com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI settingsChattingBackgroundUI) {
        this.f161500d = settingsChattingBackgroundUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI settingsChattingBackgroundUI = this.f161500d;
        settingsChattingBackgroundUI.hideVKB();
        settingsChattingBackgroundUI.finish();
        return true;
    }
}

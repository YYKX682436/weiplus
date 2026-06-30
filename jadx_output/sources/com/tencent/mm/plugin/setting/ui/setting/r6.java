package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class r6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI f161496d;

    public r6(com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI settingsAddMeUI) {
        this.f161496d = settingsAddMeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI settingsAddMeUI = this.f161496d;
        settingsAddMeUI.hideVKB();
        settingsAddMeUI.finish();
        return true;
    }
}

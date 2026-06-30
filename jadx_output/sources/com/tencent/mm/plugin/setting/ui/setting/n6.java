package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class n6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutTimelineUI f161349d;

    public n6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutTimelineUI settingsAboutTimelineUI) {
        this.f161349d = settingsAboutTimelineUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutTimelineUI settingsAboutTimelineUI = this.f161349d;
        settingsAboutTimelineUI.hideVKB();
        settingsAboutTimelineUI.finish();
        return true;
    }
}

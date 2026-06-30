package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class si implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI f161543d;

    public si(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyUserAuthUI settingsModifyUserAuthUI) {
        this.f161543d = settingsModifyUserAuthUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161543d.finish();
        return true;
    }
}

package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class bg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI f160871d;

    public bg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI) {
        this.f160871d = settingsManageFindMoreUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f160871d.finish();
        return true;
    }
}

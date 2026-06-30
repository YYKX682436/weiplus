package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class yl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount f161794d;

    public yl(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount settingsSelectCreateAccount) {
        this.f161794d = settingsSelectCreateAccount;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161794d.finish();
        return false;
    }
}

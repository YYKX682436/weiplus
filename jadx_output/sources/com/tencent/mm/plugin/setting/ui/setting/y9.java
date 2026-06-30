package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class y9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI f161780d;

    public y9(com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI) {
        this.f161780d = settingsCreateAliasUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI = this.f161780d;
        settingsCreateAliasUI.hideVKB();
        settingsCreateAliasUI.finish();
        return true;
    }
}

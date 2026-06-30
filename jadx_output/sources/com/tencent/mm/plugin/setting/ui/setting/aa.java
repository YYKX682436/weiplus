package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class aa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI f160808d;

    public aa(com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI) {
        this.f160808d = settingsCreateAliasUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI = this.f160808d;
        settingsCreateAliasUI.f160374g = settingsCreateAliasUI.f160371d.getText().toString().trim();
        if (!c01.z1.r().equalsIgnoreCase(settingsCreateAliasUI.f160374g)) {
            db5.e1.u(settingsCreateAliasUI.getContext(), settingsCreateAliasUI.getString(com.tencent.mm.R.string.gyc, settingsCreateAliasUI.f160374g), settingsCreateAliasUI.getString(com.tencent.mm.R.string.bb8), new com.tencent.mm.plugin.setting.ui.setting.z9(this), null);
            return true;
        }
        settingsCreateAliasUI.hideVKB();
        settingsCreateAliasUI.finish();
        return true;
    }
}

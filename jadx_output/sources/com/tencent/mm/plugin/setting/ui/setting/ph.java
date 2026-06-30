package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ph implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI f161444d;

    public ph(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        this.f161444d = settingsModifyEmailAddrUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI.f160535q;
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = this.f161444d;
        settingsModifyEmailAddrUI.hideVKB();
        settingsModifyEmailAddrUI.finish();
        if (settingsModifyEmailAddrUI.f160545p) {
            settingsModifyEmailAddrUI.setResult(-1);
            return true;
        }
        settingsModifyEmailAddrUI.setResult(0);
        return true;
    }
}

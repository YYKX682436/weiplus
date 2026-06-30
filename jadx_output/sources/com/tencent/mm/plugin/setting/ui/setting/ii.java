package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ii implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI f161158d;

    public ii(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI) {
        this.f161158d = settingsModifyEmailAddrUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI = this.f161158d;
        settingsModifyEmailAddrUI.f160539g = settingsModifyEmailAddrUI.f160537e.getText().toString().trim();
        if (!com.tencent.mm.sdk.platformtools.t8.Y0(settingsModifyEmailAddrUI.f160539g)) {
            db5.e1.i(settingsModifyEmailAddrUI.getContext(), com.tencent.mm.R.string.f493438k64, com.tencent.mm.R.string.f490573yv);
            return true;
        }
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf((num == null || (num.intValue() & 2) == 0) ? false : true);
        if (settingsModifyEmailAddrUI.f160539g.equals(settingsModifyEmailAddrUI.f160538f) && valueOf.booleanValue()) {
            settingsModifyEmailAddrUI.finish();
        } else {
            v61.i0 i0Var = new v61.i0(1, settingsModifyEmailAddrUI.f160539g);
            gm0.j1.d().g(i0Var);
            com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI settingsModifyEmailAddrUI2 = this.f161158d;
            settingsModifyEmailAddrUI2.f160536d = db5.e1.Q(settingsModifyEmailAddrUI2, settingsModifyEmailAddrUI2.getString(com.tencent.mm.R.string.f490573yv), settingsModifyEmailAddrUI.getString(com.tencent.mm.R.string.ipz), true, true, new com.tencent.mm.plugin.setting.ui.setting.hi(this, i0Var));
            settingsModifyEmailAddrUI.hideVKB();
        }
        return true;
    }
}

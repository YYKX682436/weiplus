package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class xb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI f161734d;

    public xb(com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI) {
        this.f161734d = settingsFontUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI = this.f161734d;
        g0Var.d(11609, java.lang.Integer.valueOf(settingsFontUI.f160385d), java.lang.Integer.valueOf(settingsFontUI.f160386e), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, java.lang.Integer.valueOf(settingsFontUI.f160385d), java.lang.Integer.valueOf(settingsFontUI.f160386e));
        settingsFontUI.finish();
        return true;
    }
}

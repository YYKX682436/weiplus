package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class yb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI f161782d;

    public yb(com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI) {
        this.f161782d = settingsFontUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI settingsFontUI = this.f161782d;
        float f17 = settingsFontUI.f160388g;
        if (settingsFontUI.f160389h != f17) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsFontUI.getContext());
            u1Var.g(settingsFontUI.getContext().getResources().getString(com.tencent.mm.R.string.ini));
            u1Var.a(true);
            u1Var.b(new com.tencent.mm.plugin.setting.ui.setting.zb(settingsFontUI, f17));
            u1Var.q(false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(settingsFontUI.f160385d), java.lang.Integer.valueOf(settingsFontUI.f160386e), 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, java.lang.Integer.valueOf(settingsFontUI.f160385d), java.lang.Integer.valueOf(settingsFontUI.f160386e));
            settingsFontUI.finish();
        }
        return true;
    }
}

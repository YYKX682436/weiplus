package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class vm implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161672d;

    public vm(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161672d = settingsSwitchAccountUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = this.f161672d;
        settingsSwitchAccountUI.f160686f = false;
        settingsSwitchAccountUI.f160695r = false;
        settingsSwitchAccountUI.f160685e.setDeleteState(false);
        settingsSwitchAccountUI.f160685e.b();
        settingsSwitchAccountUI.Y6();
        if (settingsSwitchAccountUI.f160685e.getAccountCount() == 0) {
            c01.uc ucVar = c01.uc.f37514c;
            if (((java.util.HashSet) ucVar.d()).size() > 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 1, 11, ucVar.f(), ucVar.e(), wo.w0.k());
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 0, 11, ucVar.f(), ucVar.e(), wo.w0.k());
            }
            android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(settingsSwitchAccountUI);
            b17.addFlags(67108864);
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI2 = this.f161672d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(b17);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(settingsSwitchAccountUI2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$9", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSwitchAccountUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(settingsSwitchAccountUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$9", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSwitchAccountUI.finish();
            db5.f.k(settingsSwitchAccountUI);
            settingsSwitchAccountUI.f160694q = false;
        }
        return false;
    }
}

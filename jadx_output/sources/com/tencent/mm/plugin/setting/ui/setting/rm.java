package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class rm implements w24.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161519a;

    public rm(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161519a = settingsSwitchAccountUI;
    }

    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = this.f161519a;
        if (!K0) {
            if (settingsSwitchAccountUI.f160693p != 0) {
                settingsSwitchAccountUI.T6(str);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "switch to %s, current %s", str, settingsSwitchAccountUI.f160691n);
            if (str.equals(settingsSwitchAccountUI.f160691n)) {
                settingsSwitchAccountUI.finish();
                return;
            } else {
                settingsSwitchAccountUI.W6();
                com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putString("last_switch_account_to_wx_username", str).commit();
                return;
            }
        }
        if (settingsSwitchAccountUI.f160693p != 0) {
            android.content.Intent intent = new android.content.Intent(settingsSwitchAccountUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
            intent.putExtra("mobile_input_purpose", 1);
            intent.putExtra("from_switch_account", true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI2 = this.f161519a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(settingsSwitchAccountUI2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$5", "onClickAvatar", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            settingsSwitchAccountUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(settingsSwitchAccountUI2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$5", "onClickAvatar", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.i(settingsSwitchAccountUI);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(((java.util.HashMap) settingsSwitchAccountUI.f160699v).size() > 1 ? 1 : 0);
        objArr[1] = 11;
        c01.uc ucVar = c01.uc.f37514c;
        objArr[2] = ucVar.f();
        objArr[3] = ucVar.e();
        objArr[4] = wo.w0.k();
        g0Var.d(14978, objArr);
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Global_AffiliateAccount_Int, -1);
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(274436, null);
        boolean z17 = (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AffiliatedAcctRegSwitch", 0) == 0 && g17 == -1) ? false : true;
        ip.j b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
        if (g17 == -1) {
            g17 = 0;
        }
        int b18 = b17.b("AffiliatedAcctRegScene", g17);
        if (!gm0.j1.b().n() || !"CN".equalsIgnoreCase(str2) || !z17) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0);
            sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
            sharedPreferences.edit().putBoolean("last_switch_account_to_regui", false).commit();
            settingsSwitchAccountUI.W6();
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = java.lang.Integer.valueOf(((java.util.HashMap) settingsSwitchAccountUI.f160699v).size() > 1 ? 1 : 0);
        objArr2[1] = 12;
        objArr2[2] = ucVar.f();
        objArr2[3] = ucVar.e();
        objArr2[4] = wo.w0.k();
        g0Var.d(14978, objArr2);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingsSwitchAccountUI.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.pm(this, b18);
        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.qm(this, b18);
        k0Var.v();
    }
}

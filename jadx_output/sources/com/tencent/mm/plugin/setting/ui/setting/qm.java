package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class qm implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.rm f161484e;

    public qm(com.tencent.mm.plugin.setting.ui.setting.rm rmVar, int i17) {
        this.f161484e = rmVar;
        this.f161483d = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting.rm rmVar = this.f161484e;
        if (itemId == 0) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = rmVar.f161519a;
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.f160683y;
            settingsSwitchAccountUI.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_other_account", "view_clk", settingsSwitchAccountUI.f160696s, 34575);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(((java.util.HashMap) rmVar.f161519a.f160699v).size() > 1 ? 1 : 0);
            objArr[1] = 13;
            c01.uc ucVar = c01.uc.f37514c;
            objArr[2] = ucVar.f();
            objArr[3] = ucVar.e();
            objArr[4] = wo.w0.k();
            g0Var.d(14978, objArr);
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0);
            sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
            sharedPreferences.edit().putBoolean("last_switch_account_to_regui", false).commit();
            rmVar.f161519a.W6();
            return;
        }
        if (itemId != 1) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = java.lang.Integer.valueOf(((java.util.HashMap) rmVar.f161519a.f160699v).size() > 1 ? 1 : 0);
        objArr2[1] = 14;
        c01.uc ucVar2 = c01.uc.f37514c;
        objArr2[2] = ucVar2.f();
        objArr2[3] = ucVar2.e();
        objArr2[4] = wo.w0.k();
        g0Var2.d(14978, objArr2);
        java.lang.String u17 = gm0.j1.u().c().u(6, "");
        int i19 = this.f161483d;
        if (i19 != 0 && com.tencent.mm.sdk.platformtools.t8.K0(u17)) {
            rmVar.f161519a.onActivityResult(702, 1, new android.content.Intent());
            return;
        }
        android.content.Intent intent = new android.content.Intent(rmVar.f161519a, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount.class);
        intent.putExtra("RegScene", i19);
        rmVar.f161519a.startActivityForResult(intent, 702);
    }
}

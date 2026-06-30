package d24;

/* loaded from: classes11.dex */
public final class n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225949d;

    public n(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225949d = settingButtonLogoutAccount;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225949d;
        d17.q(281, settingButtonLogoutAccount.A);
        settingButtonLogoutAccount.A = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingButtonLogoutAccount.f161867z;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            settingButtonLogoutAccount.f161867z = null;
        }
        android.app.ProgressDialog progressDialog = settingButtonLogoutAccount.B;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
        settingButtonLogoutAccount.E7();
    }
}

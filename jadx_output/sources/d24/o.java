package d24;

/* loaded from: classes11.dex */
public final class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f225951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225952e;

    public o(de0.i iVar, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225951d = iVar;
        this.f225952e = settingButtonLogoutAccount;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f225951d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225952e;
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
        return false;
    }
}

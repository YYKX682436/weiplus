package d24;

/* loaded from: classes11.dex */
public final class l0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f225943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225944e;

    public l0(com.tencent.mm.modelsimple.w0 w0Var, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225943d = w0Var;
        this.f225944e = settingButtonLogoutAccount;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d(this.f225943d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225944e;
        d17.q(255, settingButtonLogoutAccount.C);
        settingButtonLogoutAccount.C = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingButtonLogoutAccount.D;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            settingButtonLogoutAccount.D = null;
        }
        android.app.ProgressDialog progressDialog = settingButtonLogoutAccount.B;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        settingButtonLogoutAccount.C7(true);
        return false;
    }
}

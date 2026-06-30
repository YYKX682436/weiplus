package d24;

/* loaded from: classes11.dex */
public final class u implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225968d;

    public u(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225968d = settingButtonLogoutAccount;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225968d;
        d17.q(281, settingButtonLogoutAccount.f161851g);
        gm0.j1.d().q(282, settingButtonLogoutAccount.f161852h);
        settingButtonLogoutAccount.f161851g = null;
        settingButtonLogoutAccount.f161852h = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingButtonLogoutAccount.f161853i;
        if (b4Var != null && b4Var != null) {
            b4Var.d();
        }
        android.app.ProgressDialog progressDialog = settingButtonLogoutAccount.B;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount.z7(settingButtonLogoutAccount);
        return false;
    }
}

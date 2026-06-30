package d24;

/* loaded from: classes11.dex */
public final class v implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225969d;

    public v(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225969d = settingButtonLogoutAccount;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225969d;
        d17.q(281, settingButtonLogoutAccount.f161851g);
        gm0.j1.d().q(282, settingButtonLogoutAccount.f161852h);
        settingButtonLogoutAccount.f161851g = null;
        settingButtonLogoutAccount.f161852h = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingButtonLogoutAccount.D;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            settingButtonLogoutAccount.D = null;
        }
        android.app.ProgressDialog progressDialog = settingButtonLogoutAccount.B;
        if (progressDialog == null || progressDialog == null) {
            return;
        }
        progressDialog.dismiss();
    }
}

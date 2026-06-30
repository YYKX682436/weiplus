package d24;

/* loaded from: classes11.dex */
public final class p implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f225954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225955e;

    public p(de0.i iVar, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225954d = iVar;
        this.f225955e = settingButtonLogoutAccount;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f225954d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225955e;
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
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}

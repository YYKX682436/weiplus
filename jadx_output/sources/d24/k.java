package d24;

/* loaded from: classes11.dex */
public final class k implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f225938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225939e;

    public k(com.tencent.mm.modelsimple.w0 w0Var, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount) {
        this.f225938d = w0Var;
        this.f225939e = settingButtonExitAccount;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f225938d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount = this.f225939e;
        d17.q(255, settingButtonExitAccount.f161849q);
        settingButtonExitAccount.f161849q = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingButtonExitAccount.f161850r;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            settingButtonExitAccount.f161850r = null;
        }
        android.app.ProgressDialog progressDialog = settingButtonExitAccount.f161848p;
        if (progressDialog == null || progressDialog == null) {
            return;
        }
        progressDialog.dismiss();
    }
}

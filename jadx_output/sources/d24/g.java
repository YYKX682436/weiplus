package d24;

/* loaded from: classes11.dex */
public final class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f225920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225921e;

    public g(de0.i iVar, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount) {
        this.f225920d = iVar;
        this.f225921e = settingButtonExitAccount;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f225920d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount = this.f225921e;
        d17.q(281, settingButtonExitAccount.f161847o);
        settingButtonExitAccount.f161847o = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingButtonExitAccount.f161846n;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            settingButtonExitAccount.f161846n = null;
        }
        android.app.ProgressDialog progressDialog = settingButtonExitAccount.f161848p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}

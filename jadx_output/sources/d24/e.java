package d24;

/* loaded from: classes11.dex */
public final class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225912d;

    public e(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount) {
        this.f225912d = settingButtonExitAccount;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount = this.f225912d;
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
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
        settingButtonExitAccount.y7();
    }
}

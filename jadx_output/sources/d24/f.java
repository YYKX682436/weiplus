package d24;

/* loaded from: classes11.dex */
public final class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f225914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225915e;

    public f(de0.i iVar, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount) {
        this.f225914d = iVar;
        this.f225915e = settingButtonExitAccount;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f225914d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount = this.f225915e;
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
        return false;
    }
}

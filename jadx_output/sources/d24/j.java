package d24;

/* loaded from: classes11.dex */
public final class j implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f225932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225933e;

    public j(com.tencent.mm.modelsimple.w0 w0Var, com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount) {
        this.f225932d = w0Var;
        this.f225933e = settingButtonExitAccount;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d(this.f225932d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount = this.f225933e;
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
        if (progressDialog != null && progressDialog != null) {
            progressDialog.cancel();
        }
        settingButtonExitAccount.x7(true);
        return false;
    }
}

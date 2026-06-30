package d24;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount f225923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f225924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225926g;

    public h(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f225923d = settingButtonExitAccount;
        this.f225924e = m1Var;
        this.f225925f = i17;
        this.f225926g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount settingButtonExitAccount = this.f225923d;
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
            progressDialog.dismiss();
        }
        com.tencent.mm.modelbase.m1 m1Var = this.f225924e;
        if (m1Var.getType() == 255) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.modelsimple.NetSceneQueryHasPswd");
            if (((com.tencent.mm.modelsimple.w0) m1Var).f71444f == 1) {
                if (this.f225925f != -3 || this.f225926g != 4) {
                    settingButtonExitAccount.x7(true);
                    return;
                }
                android.content.Intent intent = new android.content.Intent(settingButtonExitAccount.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
                intent.putExtra("kintent_hint", settingButtonExitAccount.getString(com.tencent.mm.R.string.hx9));
                android.app.Activity context = settingButtonExitAccount.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonExitAccount$setPwdOrexit$1$onSceneEnd$1", "run", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
    }
}

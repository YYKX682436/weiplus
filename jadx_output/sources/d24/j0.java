package d24;

/* loaded from: classes11.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f225935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f225936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f225937g;

    public j0(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f225934d = settingButtonLogoutAccount;
        this.f225935e = m1Var;
        this.f225936f = i17;
        this.f225937g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225934d;
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
            progressDialog.dismiss();
        }
        com.tencent.mm.modelbase.m1 m1Var = this.f225935e;
        if (m1Var.getType() == 255) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.modelsimple.NetSceneQueryHasPswd");
            if (((com.tencent.mm.modelsimple.w0) m1Var).f71444f == 1) {
                if (this.f225936f != -3 || this.f225937g != 4) {
                    settingButtonLogoutAccount.C7(true);
                    return;
                }
                android.content.Intent intent = new android.content.Intent(settingButtonLogoutAccount.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
                intent.putExtra("kintent_hint", settingButtonLogoutAccount.getString(com.tencent.mm.R.string.hx9));
                android.app.Activity context = settingButtonLogoutAccount.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonLogoutAccount$setPwdOrexit$1$onSceneEnd$1", "run", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
    }
}

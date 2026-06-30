package w45;

/* loaded from: classes.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f442912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f442913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f442914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f442915g;

    public l(w45.p pVar, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f442912d = pVar;
        this.f442913e = m1Var;
        this.f442914f = i17;
        this.f442915g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        w45.p pVar = this.f442912d;
        d17.q(255, pVar.f442923c);
        pVar.f442923c = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = pVar.f442924d;
        if (b4Var != null) {
            if (b4Var != null) {
                b4Var.d();
            }
            pVar.f442924d = null;
        }
        android.app.ProgressDialog progressDialog = pVar.f442926f;
        if (progressDialog != null && progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.modelbase.m1 m1Var = this.f442913e;
        if (m1Var.getType() == 255) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.modelsimple.NetSceneQueryHasPswd");
            if (((com.tencent.mm.modelsimple.w0) m1Var).f71444f == 2) {
                if (this.f442914f != -3 || this.f442915g != 4) {
                    w45.p.a(pVar);
                    return;
                }
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.qqlogin.LogoutEmptyUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/qqlogin/ChangeQQLogoutHelper$queryHasPwdAndLogout$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/qqlogin/ChangeQQLogoutHelper$queryHasPwdAndLogout$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}

package m71;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m71.g f324487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f324488e;

    public d(m71.g gVar, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f324487d = gVar;
        this.f324488e = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        m71.g gVar = this.f324487d;
        sb6.append(gVar.getActivity().getLocalClassName());
        sb6.append(" startLauncher");
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountManualAuthUIC", sb6.toString());
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(gVar.getContext());
        b17.addFlags(67108864);
        com.tencent.mm.modelsimple.v0 v0Var = this.f324488e;
        b17.putExtra("kstyle_show_bind_mobile_afterauth", v0Var.O());
        b17.putExtra("kstyle_bind_recommend_show", v0Var.P());
        b17.putExtra("kstyle_bind_wording", v0Var.Q());
        androidx.appcompat.app.AppCompatActivity activity = gVar.getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/account/uic/AccountManualAuthUIC", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/account/uic/AccountManualAuthUIC", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        gVar.getActivity().finish();
    }
}

package mz2;

/* loaded from: classes3.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f333125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f333126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f333127f;

    public g2(mz2.j2 j2Var, android.app.Activity activity, android.os.Bundle bundle, com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f333125d = activity;
        this.f333126e = bundle;
        this.f333127f = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSoterService", "click faceid btn");
        android.content.Intent intent = new android.content.Intent(this.f333125d, (java.lang.Class<?>) com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.class);
        intent.putExtra("pwd", this.f333126e.getString("key_pwd1"));
        intent.putExtra("key_scene", 1);
        android.app.Activity activity = this.f333125d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f333127f.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

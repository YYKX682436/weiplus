package mz2;

/* loaded from: classes3.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.h f333132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f333133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f333134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f333135g;

    public h2(mz2.j2 j2Var, com.tencent.mm.wallet_core.h hVar, android.os.Bundle bundle, android.app.Activity activity, com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f333132d = hVar;
        this.f333133e = bundle;
        this.f333134f = activity;
        this.f333135g = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSoterService", "click fingerprint btn");
        if (this.f333132d != null) {
            android.os.Bundle bundle = this.f333133e;
            bundle.putBoolean("key_show_guide", false);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtras(bundle);
            j45.l.j(this.f333134f, com.tencent.soter.core.biometric.FingerprintManagerProxy.FINGERPRINT_SERVICE, ".ui.FingerPrintAuthTransparentUI", intent, null);
        }
        this.f333135g.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/fingerprint/mgr/WalletSoterServiceImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

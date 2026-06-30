package qz2;

/* loaded from: classes9.dex */
public final class f1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f367860d;

    public f1(qz2.j1 j1Var) {
        this.f367860d = j1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        qz2.y0 y0Var = (qz2.y0) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "on receive state: " + y0Var);
        boolean z17 = y0Var instanceof qz2.x0;
        qz2.j1 j1Var = this.f367860d;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = j1Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity).showLoading(false);
            return;
        }
        if (y0Var instanceof qz2.u0) {
            androidx.appcompat.app.AppCompatActivity activity2 = j1Var.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity2).hideLoading();
            return;
        }
        if (y0Var instanceof qz2.v0) {
            java.lang.String str = ((qz2.v0) y0Var).f367917a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = j1Var.getString(com.tencent.mm.R.string.f_k);
            }
            db5.e1.E(j1Var.getActivity(), str, "", j1Var.getString(com.tencent.mm.R.string.kmf), false, new qz2.c1(j1Var));
            return;
        }
        if (y0Var instanceof qz2.w0) {
            qz2.w0 w0Var = (qz2.w0) y0Var;
            java.lang.String str2 = w0Var.f367921b;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = j1Var.getString(com.tencent.mm.R.string.f_k);
            }
            db5.e1.C(j1Var.getActivity(), str2, w0Var.f367920a, j1Var.getString(com.tencent.mm.R.string.f493629l14), j1Var.getString(com.tencent.mm.R.string.kmf), false, new qz2.d1(j1Var), new qz2.e1(j1Var));
        }
    }
}

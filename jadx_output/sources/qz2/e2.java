package qz2;

/* loaded from: classes9.dex */
public final class e2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f367857d;

    public e2(qz2.i2 i2Var) {
        this.f367857d = i2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        qz2.y1 y1Var = (qz2.y1) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayUIC", "on receive state: " + y1Var);
        boolean z17 = y1Var instanceof qz2.x1;
        qz2.i2 i2Var = this.f367857d;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = i2Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity).showLoading(false);
            return;
        }
        if (y1Var instanceof qz2.u1) {
            androidx.appcompat.app.AppCompatActivity activity2 = i2Var.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
            ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity2).hideLoading();
            return;
        }
        if (y1Var instanceof qz2.v1) {
            java.lang.String str = ((qz2.v1) y1Var).f367918a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = i2Var.getString(com.tencent.mm.R.string.f_k);
            }
            db5.e1.E(i2Var.getActivity(), str, "", i2Var.getString(com.tencent.mm.R.string.kmf), false, new qz2.b2(i2Var));
            return;
        }
        if (y1Var instanceof qz2.w1) {
            qz2.w1 w1Var = (qz2.w1) y1Var;
            java.lang.String str2 = w1Var.f367923b;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = i2Var.getString(com.tencent.mm.R.string.f_k);
            }
            db5.e1.C(i2Var.getActivity(), str2, w1Var.f367922a, i2Var.getString(com.tencent.mm.R.string.f493629l14), i2Var.getString(com.tencent.mm.R.string.kmf), false, new qz2.c2(i2Var), new qz2.d2(i2Var));
        }
    }
}

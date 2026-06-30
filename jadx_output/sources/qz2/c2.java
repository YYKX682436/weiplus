package qz2;

/* loaded from: classes9.dex */
public final class c2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.i2 f367849d;

    public c2(qz2.i2 i2Var) {
        this.f367849d = i2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qz2.q1 q1Var = new qz2.q1(-1);
        qz2.i2 i2Var = this.f367849d;
        i2Var.P6(q1Var);
        com.tencent.mm.wallet_core.ui.r1.V(i2Var.getActivity(), "https://kf.qq.com/touch/sappfaq/210406zmIFbI210406FFnEnI.html", true);
    }
}

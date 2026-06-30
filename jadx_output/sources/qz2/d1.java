package qz2;

/* loaded from: classes9.dex */
public final class d1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f367852d;

    public d1(qz2.j1 j1Var) {
        this.f367852d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qz2.q0 q0Var = new qz2.q0(-1);
        qz2.j1 j1Var = this.f367852d;
        j1Var.P6(q0Var);
        com.tencent.mm.wallet_core.ui.r1.V(j1Var.getActivity(), "https://kf.qq.com/touch/sappfaq/210406zmIFbI210406FFnEnI.html", true);
    }
}

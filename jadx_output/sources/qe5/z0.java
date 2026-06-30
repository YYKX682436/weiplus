package qe5;

/* loaded from: classes12.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final qe5.x0 f362226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f362227b;

    public z0(qe5.n1 n1Var) {
        this.f362227b = n1Var;
        android.widget.Button c17 = n1Var.U6().c();
        em.d0 U6 = n1Var.U6();
        if (U6.f254213v == null) {
            U6.f254213v = (android.widget.TextView) U6.f254192a.findViewById(com.tencent.mm.R.id.f484119d35);
        }
        android.widget.TextView textView = U6.f254213v;
        kd5.e T6 = n1Var.T6();
        this.f362226a = new qe5.x0(c17, textView, T6 != null ? T6.f306881i : null, n1Var.U6());
    }

    public final void a() {
        qe5.n1 n1Var = this.f362227b;
        em.d0 U6 = n1Var.U6();
        U6.b().setVisibility(0);
        kd5.e T6 = n1Var.T6();
        if ((T6 != null ? T6.f306893x : null) != null) {
            U6.k().setVisibility(0);
            if (n1Var.V6()) {
                U6.p().setVisibility(0);
                U6.k().setText(n1Var.getString(com.tencent.mm.R.string.nhp));
                j75.f Q6 = n1Var.Q6();
                if (Q6 != null) {
                    kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209723h);
                    nVar.f306904c = true;
                    Q6.B3(nVar);
                }
            } else {
                U6.k().setText(n1Var.getString(com.tencent.mm.R.string.nho));
            }
        }
        kd5.e T62 = n1Var.T6();
        if (T62 != null && T62.P) {
            U6.b().setEnabled(false);
            U6.n().setVisibility(0);
        }
        j75.f Q62 = n1Var.Q6();
        if (Q62 != null) {
            kd5.n nVar2 = new kd5.n(com.tencent.mm.ui.report.p.f209725m);
            nVar2.f306904c = true;
            nVar2.f306905d = com.tencent.mm.ui.report.l.f209687h;
            Q62.B3(nVar2);
        }
    }
}

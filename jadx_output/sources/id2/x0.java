package id2;

/* loaded from: classes.dex */
public final class x0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290873c;

    public x0(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, id2.v1 v1Var) {
        this.f290871a = h0Var;
        this.f290872b = h0Var2;
        this.f290873c = v1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f290871a.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) this.f290872b.f310123d, null, 1, null);
        int i17 = fVar.f70615a;
        id2.v1 v1Var = this.f290873c;
        if (i17 == 0 && fVar.f70616b == 0) {
            long j17 = v1Var.H;
            long j18 = ((r45.rr1) fVar.f70618d).getLong(1);
            boolean z17 = j18 > j17;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) v1Var.getContext(), 1, false);
            android.view.View inflate = android.view.View.inflate(v1Var.getContext(), com.tencent.mm.R.layout.arw, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundCornerConstraintLayout");
            com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
            roundCornerConstraintLayout.B(com.tencent.mm.ui.zk.a(v1Var.getContext(), 12), com.tencent.mm.ui.zk.a(v1Var.getContext(), 12), 0.0f, 0.0f);
            roundCornerConstraintLayout.findViewById(com.tencent.mm.R.id.f2a).setOnClickListener(new id2.k1(k0Var));
            ((android.widget.TextView) roundCornerConstraintLayout.findViewById(com.tencent.mm.R.id.f1o)).setText(java.lang.String.valueOf(j18));
            ((android.widget.TextView) roundCornerConstraintLayout.findViewById(com.tencent.mm.R.id.f1x)).setVisibility(z17 ? 0 : 8);
            ((android.widget.TextView) roundCornerConstraintLayout.findViewById(com.tencent.mm.R.id.f1x)).setOnClickListener(new id2.l1(v1Var));
            ((android.widget.TextView) roundCornerConstraintLayout.findViewById(com.tencent.mm.R.id.f2c)).setText(z17 ? v1Var.getActivity().getString(com.tencent.mm.R.string.dii) : v1Var.getActivity().getString(com.tencent.mm.R.string.dih));
            ((android.widget.TextView) roundCornerConstraintLayout.findViewById(com.tencent.mm.R.id.f484661f30)).setText(z17 ? java.lang.String.valueOf(j17) : java.lang.String.valueOf(j17 - j18));
            android.widget.TextView textView = (android.widget.TextView) roundCornerConstraintLayout.findViewById(com.tencent.mm.R.id.f1r);
            textView.setText(z17 ? v1Var.getActivity().getString(com.tencent.mm.R.string.dix) : v1Var.getActivity().getString(com.tencent.mm.R.string.diy));
            textView.setOnClickListener(new id2.q1(k0Var, z17, v1Var, textView));
            k0Var.f211872n = new id2.r1(k0Var, roundCornerConstraintLayout);
            k0Var.e(true);
            k0Var.v();
        } else {
            db5.t7.m(v1Var.getActivity(), v1Var.getActivity().getString(com.tencent.mm.R.string.dig));
        }
        return jz5.f0.f302826a;
    }
}

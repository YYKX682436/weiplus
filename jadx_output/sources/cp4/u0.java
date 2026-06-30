package cp4;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f221083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(cp4.g1 g1Var) {
        super(0);
        this.f221083d = g1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cp4.g1 g1Var = this.f221083d;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) g1Var.findViewById(com.tencent.mm.R.id.dfp);
        g1Var.setOnClickListener(cp4.t0.f221080d);
        return linearLayout;
    }
}

package ku3;

/* loaded from: classes3.dex */
public final class k4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f312295d;

    public k4(ku3.m4 m4Var) {
        this.f312295d = m4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f475588b;
        ku3.m4 m4Var = this.f312295d;
        if (z17) {
            m4Var.c().setBackground(m4Var.f312324m);
            m4Var.b().s(com.tencent.mm.R.raw.icons_menu_filter, com.tencent.mm.R.color.f478772gs);
        } else {
            m4Var.c().setBackground(m4Var.f312325n);
            m4Var.b().s(com.tencent.mm.R.raw.icons_menu_filter, com.tencent.mm.R.color.f478773gt);
        }
    }
}

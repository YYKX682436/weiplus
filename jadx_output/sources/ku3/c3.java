package ku3;

/* loaded from: classes3.dex */
public final class c3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f312180d;

    public c3(ku3.e3 e3Var) {
        this.f312180d = e3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f475588b;
        ku3.e3 e3Var = this.f312180d;
        if (z17) {
            e3Var.e().setBackground(e3Var.f312210m);
            e3Var.d().s(com.tencent.mm.R.raw.icons_menu_beauty, com.tencent.mm.R.color.f478772gs);
        } else {
            e3Var.e().setBackground(e3Var.f312211n);
            e3Var.d().s(com.tencent.mm.R.raw.icons_menu_beauty, com.tencent.mm.R.color.f478773gt);
        }
    }
}

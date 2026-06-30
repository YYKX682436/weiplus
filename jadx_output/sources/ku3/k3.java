package ku3;

/* loaded from: classes3.dex */
public final class k3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f312294d;

    public k3(ku3.y3 y3Var) {
        this.f312294d = y3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f475588b;
        ku3.y3 y3Var = this.f312294d;
        if (z17) {
            y3Var.e().setBackground(y3Var.f312482t);
            y3Var.d().s(com.tencent.mm.R.raw.icons_menu_countdown, com.tencent.mm.R.color.f478772gs);
        } else {
            y3Var.e().setBackground(y3Var.f312483u);
            y3Var.d().s(com.tencent.mm.R.raw.icons_menu_countdown, com.tencent.mm.R.color.f478773gt);
        }
    }
}

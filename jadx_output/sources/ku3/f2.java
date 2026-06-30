package ku3;

/* loaded from: classes3.dex */
public final class f2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f312228d;

    public f2(ku3.n2 n2Var) {
        this.f312228d = n2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        if (((zt3.b) obj).f475585a == 1) {
            ku3.n2 n2Var = this.f312228d;
            n2Var.f312337e.S6(1, new ku3.b2(n2Var));
            ku3.c2 c2Var = new ku3.c2(n2Var);
            zt3.a aVar = n2Var.f312337e;
            aVar.S6(4, c2Var);
            aVar.S6(2, new ku3.d2(n2Var));
            aVar.S6(3, new ku3.e2(n2Var));
        }
    }
}

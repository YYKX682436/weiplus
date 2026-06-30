package ku3;

/* loaded from: classes3.dex */
public final class b2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f312171d;

    public b2(ku3.n2 n2Var) {
        this.f312171d = n2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        if (cVar.f475591e) {
            boolean z17 = cVar.f475588b;
            ku3.n2 n2Var = this.f312171d;
            if (z17) {
                n2Var.c(i65.a.r(n2Var.f312336d.getContext(), com.tencent.mm.R.string.f492727hm4));
            } else {
                n2Var.c(i65.a.r(n2Var.f312336d.getContext(), com.tencent.mm.R.string.f492726hm3));
            }
        }
    }
}

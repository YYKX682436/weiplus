package ku3;

/* loaded from: classes3.dex */
public final class c2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f312179d;

    public c2(ku3.n2 n2Var) {
        this.f312179d = n2Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f475588b;
        ku3.n2 n2Var = this.f312179d;
        if (z17) {
            n2Var.c(i65.a.r(n2Var.f312336d.getContext(), com.tencent.mm.R.string.hm6));
        } else {
            n2Var.c(i65.a.r(n2Var.f312336d.getContext(), com.tencent.mm.R.string.f492728hm5));
        }
    }
}

package ku3;

/* loaded from: classes5.dex */
public final class p5 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.r5 f312364d;

    public p5(ku3.r5 r5Var) {
        this.f312364d = r5Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f475588b;
        ku3.r5 r5Var = this.f312364d;
        if (!z17) {
            kotlinx.coroutines.l.d(r5Var.f312383f, null, null, new ku3.o5(r5Var, null), 3, null);
        } else {
            db5.t7.m(r5Var.f312382e.getContext(), i65.a.r(r5Var.f312382e.getContext(), com.tencent.mm.R.string.hmk));
            kotlinx.coroutines.l.d(r5Var.f312383f, null, null, new ku3.n5(r5Var, null), 3, null);
        }
    }
}

package el2;

/* loaded from: classes3.dex */
public final class z0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253955d;

    public z0(el2.i1 i1Var) {
        this.f253955d = i1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        el2.i1 i1Var = this.f253955d;
        android.view.ViewGroup viewGroup = i1Var.f253812d;
        viewGroup.postDelayed(new el2.d1(viewGroup, i1Var, 1.0f), i1Var.f253824s);
        if (i1Var.f253822q) {
            el2.i1.m(i1Var);
        }
    }
}

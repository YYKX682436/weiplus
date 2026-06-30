package el2;

/* loaded from: classes3.dex */
public final class v0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253928d;

    public v0(el2.i1 i1Var) {
        this.f253928d = i1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.tp1 tp1Var = (r45.tp1) obj;
        if ((tp1Var != null ? tp1Var.getInteger(4) : 0) == 0) {
            el2.i1.k(this.f253928d, tp1Var != null ? (r45.kv1) tp1Var.getCustom(0) : null, false);
        }
    }
}

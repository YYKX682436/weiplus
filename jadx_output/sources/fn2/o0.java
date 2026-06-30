package fn2;

/* loaded from: classes5.dex */
public final class o0 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fn2.s0 f264342a;

    public o0(fn2.s0 s0Var) {
        this.f264342a = s0Var;
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0.5f;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        hn2.d dVar;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            bm2.i6 i6Var = k3Var instanceof bm2.i6 ? (bm2.i6) k3Var : null;
            if (i6Var != null) {
                fn2.s0 s0Var = this.f264342a;
                bm2.o6 o6Var = s0Var.f264388g;
                if (o6Var == null) {
                    kotlin.jvm.internal.o.o("rvAdapter");
                    throw null;
                }
                bm2.h6 h6Var = (bm2.h6) kz5.n0.a0(o6Var.f22204t, i6Var.getAdapterPosition());
                if (h6Var != null && (dVar = h6Var.f21947b) != null && !s0Var.getExposedSet().contains(dVar.f282505a)) {
                    bm2.o6 o6Var2 = s0Var.f264388g;
                    if (o6Var2 == null) {
                        kotlin.jvm.internal.o.o("rvAdapter");
                        throw null;
                    }
                    o6Var2.I(1, 3, dVar);
                    bm2.o6 o6Var3 = s0Var.f264388g;
                    if (o6Var3 == null) {
                        kotlin.jvm.internal.o.o("rvAdapter");
                        throw null;
                    }
                    o6Var3.I(1, 4, dVar);
                    s0Var.getExposedSet().add(dVar.f282505a);
                }
            }
        }
    }
}

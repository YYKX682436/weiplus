package fn2;

/* loaded from: classes5.dex */
public final class f extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fn2.s f264253a;

    public f(fn2.s sVar) {
        this.f264253a = sVar;
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
                fn2.s sVar = this.f264253a;
                bm2.h6 h6Var = (bm2.h6) kz5.n0.a0(sVar.f264377p.f22204t, i6Var.getAdapterPosition());
                if (h6Var != null && (dVar = h6Var.f21947b) != null) {
                    java.util.Set set = sVar.f264378q;
                    if (!set.contains(dVar.f282505a)) {
                        sVar.f264377p.I(1, 3, dVar);
                        set.add(dVar.f282505a);
                    }
                }
            }
        }
    }
}

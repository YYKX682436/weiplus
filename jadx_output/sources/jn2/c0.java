package jn2;

/* loaded from: classes5.dex */
public final class c0 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn2.f0 f300565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf2.x f300566b;

    public c0(jn2.f0 f0Var, sf2.x xVar) {
        this.f300565a = f0Var;
        this.f300566b = xVar;
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
        r45.ay1 ay1Var;
        java.lang.String str;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            jn2.b1 b1Var = k3Var instanceof jn2.b1 ? (jn2.b1) k3Var : null;
            if (b1Var != null) {
                int adapterPosition = b1Var.getAdapterPosition();
                jn2.f0 f0Var = this.f300565a;
                jn2.c1 c1Var = f0Var.f300600f;
                if (c1Var == null) {
                    kotlin.jvm.internal.o.o("rvAdapter");
                    throw null;
                }
                jn2.w0 w0Var = (jn2.w0) kz5.n0.a0(c1Var.f300574n, adapterPosition);
                if (w0Var != null && (str = (ay1Var = w0Var.f300740a).f370350d) != null) {
                    java.util.Set set = f0Var.f300612u;
                    if (!set.contains(str)) {
                        set.add(str);
                        r45.ch6 ch6Var = f0Var.f300605n;
                        r45.in inVar = f0Var.f300608q;
                        sf2.x xVar = this.f300566b;
                        xVar.getClass();
                        te2.a9.f417883a.a(xVar.h7(), 2, inVar, ch6Var, ay1Var);
                    }
                }
            }
        }
    }
}

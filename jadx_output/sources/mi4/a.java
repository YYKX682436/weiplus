package mi4;

/* loaded from: classes9.dex */
public final class a extends ym5.m0 {
    @Override // ym5.m0
    public long c(androidx.recyclerview.widget.k3 k3Var) {
        long j17;
        android.view.View view;
        android.content.Context context;
        if (k3Var == null || (view = k3Var.itemView) == null || (context = view.getContext()) == null) {
            j17 = -1;
        } else {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(hi4.m.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            j17 = ((hi4.m) a17).f281558e;
        }
        return super.c(k3Var) + j17;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                hi4.a aVar = obj instanceof hi4.a ? (hi4.a) obj : null;
                if (aVar != null) {
                    hi4.k kVar = hi4.m.f281555f;
                    android.content.Context context = s0Var.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    hi4.m b17 = kVar.b(context);
                    if (!ii4.b.a(aVar)) {
                        java.lang.String str = hi4.m.f281556g + b17.f281558e;
                        if (!kotlin.jvm.internal.o.b(aVar.f281541p1, str)) {
                            aVar.f281541p1 = str;
                            java.lang.String field_sessionId = aVar.field_sessionId;
                            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                            kVar.d(field_sessionId, 52);
                        }
                    }
                }
            }
        }
    }
}

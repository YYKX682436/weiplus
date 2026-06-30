package mi4;

/* loaded from: classes9.dex */
public final class c extends ym5.m0 {
    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        hi4.e eVar;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null && (eVar = (hi4.e) s0Var.f293125i) != null) {
                hi4.k kVar = hi4.m.f281555f;
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String str = hi4.m.f281556g + kVar.b(context).f281558e;
                if (!kotlin.jvm.internal.o.b(eVar.N, str)) {
                    kotlin.jvm.internal.o.g(str, "<set-?>");
                    eVar.N = str;
                    java.lang.String field_session_id = eVar.field_session_id;
                    kotlin.jvm.internal.o.f(field_session_id, "field_session_id");
                    kVar.d(field_session_id, 101);
                }
            }
        }
    }
}

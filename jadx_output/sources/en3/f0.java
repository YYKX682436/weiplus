package en3;

/* loaded from: classes8.dex */
public final class f0 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ en3.g0 f255297d;

    public f0(en3.g0 g0Var) {
        this.f255297d = g0Var;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        tm0.a event = (tm0.a) obj;
        kotlin.jvm.internal.o.g(event, "event");
        tm0.b bVar = tm0.b.f420454m;
        tm0.b bVar2 = event.f420446a;
        en3.g0 g0Var = this.f255297d;
        if (bVar2 == bVar) {
            g0Var.getClass();
        }
        j75.f Ni = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Ni();
        if (Ni != null) {
            Ni.z3(g0Var, en3.e0.f255295d);
            Ni.B3(new sa0.e(event));
        }
    }
}

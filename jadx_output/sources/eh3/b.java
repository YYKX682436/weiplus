package eh3;

/* loaded from: classes11.dex */
public final class b implements com.tencent.mm.plugin.messenger.foundation.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh3.d f252916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.t80 f252917c;

    public b(java.util.List list, eh3.d dVar, r45.t80 t80Var) {
        this.f252915a = list;
        this.f252916b = dVar;
        this.f252917c = t80Var;
    }

    @Override // com.tencent.mm.plugin.messenger.foundation.u
    public final void a(com.tencent.mm.storage.z3 it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remarkPyInitial: ");
        java.lang.String T0 = it.T0();
        eh3.d dVar = this.f252916b;
        sb6.append(eh3.d.b(dVar, T0));
        sb6.append(" -> ");
        r45.t80 t80Var = this.f252917c;
        r45.du5 du5Var = (r45.du5) t80Var.getCustom(1);
        sb6.append(eh3.d.b(dVar, du5Var != null ? du5Var.f372756d : null));
        this.f252915a.add(sb6.toString());
        r45.du5 du5Var2 = (r45.du5) t80Var.getCustom(1);
        it.R1(du5Var2 != null ? du5Var2.f372756d : null);
    }
}

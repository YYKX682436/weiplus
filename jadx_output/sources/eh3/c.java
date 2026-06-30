package eh3;

/* loaded from: classes11.dex */
public final class c implements com.tencent.mm.plugin.messenger.foundation.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh3.d f252919b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.t80 f252920c;

    public c(java.util.List list, eh3.d dVar, r45.t80 t80Var) {
        this.f252918a = list;
        this.f252919b = dVar;
        this.f252920c = t80Var;
    }

    @Override // com.tencent.mm.plugin.messenger.foundation.u
    public final void a(com.tencent.mm.storage.z3 it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remarkQuanpin: ");
        java.lang.String U0 = it.U0();
        eh3.d dVar = this.f252919b;
        sb6.append(eh3.d.b(dVar, U0));
        sb6.append(" -> ");
        r45.t80 t80Var = this.f252920c;
        r45.du5 du5Var = (r45.du5) t80Var.getCustom(2);
        sb6.append(eh3.d.b(dVar, du5Var != null ? du5Var.f372756d : null));
        this.f252918a.add(sb6.toString());
        r45.du5 du5Var2 = (r45.du5) t80Var.getCustom(2);
        it.S1(du5Var2 != null ? du5Var2.f372756d : null);
    }
}

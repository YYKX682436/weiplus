package eh3;

/* loaded from: classes11.dex */
public final class a implements com.tencent.mm.plugin.messenger.foundation.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh3.d f252912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.t80 f252913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f252914d;

    public a(java.util.List list, eh3.d dVar, r45.t80 t80Var, kotlin.jvm.internal.h0 h0Var) {
        this.f252911a = list;
        this.f252912b = dVar;
        this.f252913c = t80Var;
        this.f252914d = h0Var;
    }

    @Override // com.tencent.mm.plugin.messenger.foundation.u
    public final void a(com.tencent.mm.storage.z3 it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remark: ");
        java.lang.String w07 = it.w0();
        eh3.d dVar = this.f252912b;
        sb6.append(eh3.d.b(dVar, w07));
        sb6.append(" -> ");
        r45.t80 t80Var = this.f252913c;
        r45.du5 du5Var = (r45.du5) t80Var.getCustom(0);
        sb6.append(eh3.d.b(dVar, du5Var != null ? du5Var.f372756d : null));
        this.f252911a.add(sb6.toString());
        r45.du5 du5Var2 = (r45.du5) t80Var.getCustom(0);
        it.n1(du5Var2 != null ? du5Var2.f372756d : null);
        com.tencent.mm.storage.ya yaVar = (com.tencent.mm.storage.ya) this.f252914d.f310123d;
        r45.du5 du5Var3 = (r45.du5) t80Var.getCustom(0);
        yaVar.field_conRemark = du5Var3 != null ? du5Var3.f372756d : null;
    }
}

package qb2;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.b0 f361157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f361158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f361159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qb2.b0 b0Var, java.util.List list, boolean z17) {
        super(0);
        this.f361157d = b0Var;
        this.f361158e = list;
        this.f361159f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qb2.b0 b0Var = this.f361157d;
        int itemCount = b0Var.getItemCount();
        java.util.List<qb2.t> list = this.f361158e;
        for (qb2.t tVar : list) {
            java.util.HashMap hashMap = b0Var.f361173o;
            if (!hashMap.containsKey(tVar.field_sessionId)) {
                java.lang.String field_sessionId = tVar.field_sessionId;
                kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                hashMap.put(field_sessionId, tVar);
                b0Var.f361172n.add(tVar);
            }
        }
        if (this.f361159f) {
            b0Var.notifyDataSetChanged();
        } else {
            b0Var.r(itemCount, list.size());
        }
        return jz5.f0.f302826a;
    }
}

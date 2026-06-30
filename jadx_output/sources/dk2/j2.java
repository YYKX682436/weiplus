package dk2;

/* loaded from: classes3.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f233632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.z0 f233633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233634f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.modelbase.f fVar, ek2.z0 z0Var, dk2.r4 r4Var) {
        super(0);
        this.f233632d = fVar;
        this.f233633e = z0Var;
        this.f233634f = r4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ht1 ht1Var;
        ek2.z0 z0Var = this.f233633e;
        com.tencent.mm.modelbase.f fVar = this.f233632d;
        if (fVar != null && (ht1Var = (r45.ht1) fVar.f70618d) != null) {
            dk2.r4 r4Var = this.f233634f;
            r45.nw1 nw1Var = ((mm2.e1) r4Var.f234007b.a(mm2.e1.class)).f328988r;
            if (!(nw1Var != null && ht1Var.getLong(5) == nw1Var.getLong(0))) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLotteryRecord invalid resp,liveId:");
                sb6.append(java.lang.Long.valueOf(ht1Var.getLong(5)));
                sb6.append(",current liveId:");
                r45.nw1 nw1Var2 = ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r;
                sb6.append(nw1Var2 != null ? java.lang.Long.valueOf(nw1Var2.getLong(0)) : null);
                com.tencent.mars.xlog.Log.i(r4Var.f234009d, sb6.toString());
                if (z0Var != null) {
                    z0Var.a(3, 10123, "invalid liveId", ht1Var);
                }
                return jz5.f0.f302826a;
            }
        }
        if (z0Var != null) {
            int i17 = fVar.f70615a;
            int i18 = fVar.f70616b;
            java.lang.String str = fVar.f70617c;
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            z0Var.a(i17, i18, str, (r45.ht1) resp);
        }
        return jz5.f0.f302826a;
    }
}

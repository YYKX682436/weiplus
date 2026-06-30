package pr;

/* loaded from: classes11.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u3 f357777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u3 f357778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pr.t f357779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.storage.u3 u3Var, com.tencent.mm.storage.u3 u3Var2, pr.t tVar) {
        super(3);
        this.f357777d = u3Var;
        this.f357778e = u3Var2;
        this.f357779f = tVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List needInfoList = (java.util.List) obj2;
        com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) obj3;
        kotlin.jvm.internal.o.g(needInfoList, "needInfoList");
        com.tencent.mm.storage.u3 u3Var = this.f357777d;
        com.tencent.mm.storage.u3 u3Var2 = this.f357778e;
        if (booleanValue) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + 86400000));
            gm0.j1.u().c().x(u3Var2, java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(164L, 0L, 1L, false);
            new pr.h(needInfoList, gVar, new pr.r(this.f357779f, u3Var2));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(164L, 1L, 1L, false);
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + 3600000));
            gm0.j1.u().c().x(u3Var2, java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}

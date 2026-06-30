package cq;

/* loaded from: classes.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cq.k f221194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221195g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(yz5.l lVar, yz5.l lVar2, cq.k kVar, int i17) {
        super(1);
        this.f221192d = lVar;
        this.f221193e = lVar2;
        this.f221194f = kVar;
        this.f221195g = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.kv0 kv0Var;
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.modelbase.o oVar2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.rr2 rr2Var = fVar != null ? (r45.rr2) fVar.f70618d : null;
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17 || rr2Var == null) {
            yz5.l lVar = this.f221193e;
            if (lVar == null) {
                return null;
            }
            lVar.invoke(fVar);
        } else {
            com.tencent.mm.modelbase.i iVar = fVar.f70620f;
            int i17 = (iVar == null || (oVar2 = iVar.f70646f) == null) ? 0 : oVar2.f70713d;
            com.tencent.mm.protobuf.f fVar2 = (iVar == null || (oVar = iVar.f70646f) == null) ? null : oVar.f70710a.f70684a;
            r45.qv0 qv0Var = fVar2 instanceof r45.qv0 ? (r45.qv0) fVar2 : null;
            long j17 = (qv0Var == null || (kv0Var = (r45.kv0) qv0Var.getCustom(1)) == null) ? 0L : kv0Var.getLong(5);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.rr2) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                arrayList.add(h90Var.a(finderObject, 0));
            }
            this.f221194f.Ui(arrayList, this.f221195g, i17, j17);
            yz5.l lVar2 = this.f221192d;
            if (lVar2 == null) {
                return null;
            }
            lVar2.invoke(rr2Var);
        }
        return f0Var;
    }
}

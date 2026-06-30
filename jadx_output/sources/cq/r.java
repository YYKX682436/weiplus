package cq;

/* loaded from: classes.dex */
public final class r implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cq.k f221266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f221267d;

    public r(yz5.l lVar, yz5.l lVar2, cq.k kVar, r45.qt2 qt2Var) {
        this.f221264a = lVar;
        this.f221265b = lVar2;
        this.f221266c = kVar;
        this.f221267d = qt2Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.kv0 kv0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (b17) {
            com.tencent.mm.modelbase.o oVar = fVar.f70620f.f70646f;
            int i17 = oVar.f70713d;
            com.tencent.mm.protobuf.f fVar2 = oVar.f70710a.f70684a;
            r45.qv0 qv0Var = fVar2 instanceof r45.qv0 ? (r45.qv0) fVar2 : null;
            long j17 = (qv0Var == null || (kv0Var = (r45.kv0) qv0Var.getCustom(1)) == null) ? 0L : kv0Var.getLong(5);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.sv0) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getObjects(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                arrayList.add(h90Var.a(finderObject, 0));
            }
            this.f221266c.Ui(arrayList, this.f221267d.getInteger(5), i17, j17);
            yz5.l lVar = this.f221264a;
            if (lVar != null) {
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                kotlin.jvm.internal.o.f(resp, "resp");
                lVar.invoke(resp);
                return f0Var;
            }
        } else {
            yz5.l lVar2 = this.f221265b;
            if (lVar2 != null) {
                lVar2.invoke(fVar);
                return f0Var;
            }
        }
        return null;
    }
}

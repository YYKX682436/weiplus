package cq;

/* loaded from: classes.dex */
public final class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cq.k f221203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f221204d;

    public h(yz5.l lVar, yz5.l lVar2, cq.k kVar, int i17) {
        this.f221201a = lVar;
        this.f221202b = lVar2;
        this.f221203c = kVar;
        this.f221204d = i17;
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
            r45.by0 by0Var = fVar2 instanceof r45.by0 ? (r45.by0) fVar2 : null;
            long j17 = (by0Var == null || (kv0Var = (r45.kv0) by0Var.getCustom(1)) == null) ? 0L : kv0Var.getLong(5);
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.cy0) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                arrayList.add(h90Var.a(finderObject, 0));
            }
            cq.k kVar = this.f221203c;
            int i18 = this.f221204d;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) it.next();
                kVar.Ni(finderItem, i18, i17, j17);
                kVar.Ni(finderItem, 355, i17, j17);
            }
            yz5.l lVar = this.f221201a;
            if (lVar != null) {
                com.tencent.mm.protobuf.f fVar3 = fVar.f70618d;
                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderColumnFlowResp");
                lVar.invoke((r45.cy0) fVar3);
                return f0Var;
            }
        } else {
            yz5.l lVar2 = this.f221202b;
            if (lVar2 != null) {
                lVar2.invoke(fVar);
                return f0Var;
            }
        }
        return null;
    }
}

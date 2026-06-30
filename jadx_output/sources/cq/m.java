package cq;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cq.k f221237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f221238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yz5.l lVar, yz5.l lVar2, cq.k kVar, r45.qt2 qt2Var) {
        super(1);
        this.f221235d = lVar;
        this.f221236e = lVar2;
        this.f221237f = kVar;
        this.f221238g = qt2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list;
        r45.kv0 kv0Var;
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.modelbase.o oVar2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        r45.cu0 cu0Var = fVar != null ? (r45.cu0) fVar.f70618d : null;
        boolean z17 = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17 || cu0Var == null) {
            yz5.l lVar = this.f221236e;
            if (lVar == null) {
                return null;
            }
            lVar.invoke(fVar);
        } else {
            com.tencent.mm.modelbase.i iVar = fVar.f70620f;
            int i17 = (iVar == null || (oVar2 = iVar.f70646f) == null) ? 0 : oVar2.f70713d;
            com.tencent.mm.protobuf.f fVar2 = (iVar == null || (oVar = iVar.f70646f) == null) ? null : oVar.f70710a.f70684a;
            r45.qr2 qr2Var = fVar2 instanceof r45.qr2 ? (r45.qr2) fVar2 : null;
            long j17 = (qr2Var == null || (kv0Var = (r45.kv0) qr2Var.getCustom(1)) == null) ? 0L : kv0Var.getLong(5);
            r45.cu0 cu0Var2 = (r45.cu0) fVar.f70618d;
            if (cu0Var2 != null && (list = cu0Var2.getList(1)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                    com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                    kotlin.jvm.internal.o.d(finderObject);
                    arrayList.add(h90Var.a(finderObject, 0));
                }
                this.f221237f.Ui(arrayList, this.f221238g.getInteger(5), i17, j17);
            }
            yz5.l lVar2 = this.f221235d;
            if (lVar2 == null) {
                return null;
            }
            lVar2.invoke(cu0Var);
        }
        return f0Var;
    }
}

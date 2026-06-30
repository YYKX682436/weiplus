package zy2;

/* loaded from: classes2.dex */
public final class rc extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f477563g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f477564h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f477565i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(java.lang.String qrUrl) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(qrUrl, "qrUrl");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.y82 y82Var = new r45.y82();
        y82Var.set(2, qrUrl);
        r45.z82 z82Var = new r45.z82();
        lVar.f70664a = y82Var;
        lVar.f70665b = z82Var;
        lVar.f70667d = 7424;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveselectgo";
        this.f477563g = lVar.a();
        this.f477565i = qrUrl;
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mm.modelbase.u0 u0Var = this.f477564h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.tencent.mm.network.v0 v0Var) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.o oVar = this.f477563g;
        java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
        r45.z82 z82Var = obj instanceof r45.z82 ? (r45.z82) obj : null;
        return (z82Var == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) z82Var.getCustom(3)) == null) ? kz5.p0.f313996d : kz5.b0.c(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0));
    }

    @Override // az2.v
    public long L() {
        r45.kv0 kv0Var;
        com.tencent.mm.modelbase.o oVar = this.f477563g;
        java.lang.Object obj = oVar != null ? oVar.f70710a.f70684a : null;
        r45.y82 y82Var = obj instanceof r45.y82 ? (r45.y82) obj : null;
        if (y82Var == null || (kv0Var = (r45.kv0) y82Var.getCustom(1)) == null) {
            return 0L;
        }
        return kv0Var.getLong(5);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f477564h = u0Var;
        return dispatch(sVar, this.f477563g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 7424;
    }
}

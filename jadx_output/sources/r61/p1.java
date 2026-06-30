package r61;

/* loaded from: classes2.dex */
public class p1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392943d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392944e;

    public p1(int[] iArr) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cz5();
        lVar.f70665b = new r45.dz5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendinviteemail";
        lVar.f70667d = 116;
        lVar.f70668e = 41;
        lVar.f70669f = 1000000041;
        this.f392944e = lVar.a();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 : iArr) {
            linkedList.add(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.protobuf.f fVar = this.f392944e.f70710a.f70684a;
        ((r45.cz5) fVar).f371948e = linkedList;
        ((r45.cz5) fVar).f371947d = linkedList.size();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392943d = u0Var;
        return dispatch(sVar, this.f392944e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 116;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f392943d.onSceneEnd(i18, i19, str, this);
    }
}

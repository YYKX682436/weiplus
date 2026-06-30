package zf4;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f472653d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f472654e;

    public e(int i17, java.util.LinkedList linkedList, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jz4();
        lVar.f70665b = new r45.kz4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/opvoicereminder";
        lVar.f70667d = 331;
        lVar.f70668e = 150;
        lVar.f70669f = 1000000150;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f472654e = a17;
        r45.jz4 jz4Var = (r45.jz4) a17.f70710a.f70684a;
        jz4Var.f378227d = i17;
        jz4Var.f378229f = linkedList;
        jz4Var.f378228e = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f472653d = u0Var;
        return dispatch(sVar, this.f472654e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 331;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        this.f472653d.onSceneEnd(i18, i19, str, this);
    }
}

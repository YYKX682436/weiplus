package e93;

/* loaded from: classes.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f250361d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f250362e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f250363f;

    public e(java.util.LinkedList linkedList) {
        this.f250363f = new java.util.LinkedList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ip4();
        lVar.f70665b = new r45.jp4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/modifycontactlabellist";
        lVar.f70667d = 638;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f250361d = lVar.a();
        this.f250363f = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f250362e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f250361d;
        r45.ip4 ip4Var = (r45.ip4) oVar.f70710a.f70684a;
        java.util.LinkedList linkedList = this.f250363f;
        ip4Var.f377256e = linkedList;
        ip4Var.f377255d = linkedList.size();
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 638;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f250362e.onSceneEnd(i18, i19, str, this);
    }
}

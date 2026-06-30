package e93;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f250352d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f250353e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f250354f;

    public b(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f250354f = linkedList;
        new java.util.ArrayList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ah();
        lVar.f70665b = new r45.bh();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchupdatecontactlabelwithseq";
        lVar.f70667d = 5882;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f250352d = lVar.a();
        linkedList.addAll(list);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f250353e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f250352d;
        r45.ah ahVar = (r45.ah) oVar.f70710a.f70684a;
        java.util.LinkedList linkedList = this.f250354f;
        if (linkedList != null && linkedList.size() > 0) {
            ahVar.f370005d = linkedList;
            return dispatch(sVar, oVar, this);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Label.NetSceneBatchUpdateContactLabelList", "[doScene] label id list is null.");
        u0Var.onSceneEnd(3, -1, "[doScene]empty label is list.", this);
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5882;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f250353e.onSceneEnd(i18, i19, str, this);
    }
}

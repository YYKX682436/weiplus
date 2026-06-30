package xt1;

/* loaded from: classes11.dex */
public class b0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456450d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456451e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f456452f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f456453g;

    public b0(java.util.LinkedList linkedList, r45.pd6 pd6Var, int i17) {
        this(linkedList, pd6Var, i17, "");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456451e = u0Var;
        return dispatch(sVar, this.f456450d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1099;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            this.f456451e.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.lang.String str2 = ((r45.ef) this.f456450d.f70711b.f70700a).f373382d;
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
            this.f456451e.onSceneEnd(4, -1, null, this);
            return;
        }
        java.util.ArrayList c17 = lu1.t.c(str2);
        if (c17 != null) {
            lu1.a0.J();
            this.f456452f.addAll(c17);
        }
        this.f456451e.onSceneEnd(0, 0, str, this);
    }

    public b0(java.util.LinkedList linkedList, r45.pd6 pd6Var, int i17, java.lang.String str) {
        this.f456452f = new java.util.LinkedList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.df();
        lVar.f70665b = new r45.ef();
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchgetcarditembytpinfo";
        lVar.f70667d = 1099;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456450d = a17;
        r45.df dfVar = (r45.df) a17.f70710a.f70684a;
        dfVar.f372369d = linkedList;
        dfVar.f372370e = pd6Var;
        dfVar.f372371f = i17;
        this.f456453g = str;
    }
}

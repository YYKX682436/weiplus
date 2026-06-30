package su4;

/* loaded from: classes8.dex */
public class y1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413141d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413142e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.w97 f413143f;

    /* renamed from: g, reason: collision with root package name */
    public r45.x97 f413144g;

    public y1(java.util.List list, int i17, long j17, java.util.List list2) {
        this.f413143f = new r45.w97();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1948;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/websearchconfig";
        lVar.f70664a = new r45.w97();
        lVar.f70665b = new r45.x97();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413142e = a17;
        r45.w97 w97Var = (r45.w97) a17.f70710a.f70684a;
        this.f413143f = w97Var;
        w97Var.f388993e = com.tencent.mm.plugin.websearch.l2.a(0);
        w97Var.f388994f = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        w97Var.f388997i = com.tencent.mm.plugin.websearch.l2.b();
        w97Var.f388998m = su4.r2.i();
        w97Var.f389000o = su4.r2.g();
        if (list != null) {
            w97Var.f388992d.addAll(list);
        }
        w97Var.f388995g = i17;
        w97Var.f388996h = j17;
        if (list2 != null) {
            w97Var.f388999n.addAll(list2);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413141d = u0Var;
        return dispatch(sVar, this.f413142e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1948;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearchConfig", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f413141d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.x97 x97Var = (r45.x97) this.f413142e.f70711b.f70700a;
        this.f413144g = x97Var;
        if (x97Var != null) {
            java.lang.String str2 = x97Var.f389903d;
        }
        this.f413141d.onSceneEnd(i18, i19, str, this);
    }
}

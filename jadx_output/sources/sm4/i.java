package sm4;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public long f409946d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409947e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f409948f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f409949g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f409950h;

    /* renamed from: i, reason: collision with root package name */
    public int f409951i;

    public i(sm4.i iVar) {
        this.f409951i = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "copy NetSceneTopStorySetBlockList", java.lang.Integer.valueOf(iVar.f409949g.size()), java.lang.Integer.valueOf(iVar.f409950h.size()));
        this.f409951i = iVar.f409951i;
        H(iVar.f409949g, iVar.f409950h);
    }

    public final void H(java.util.List list, java.util.List list2) {
        this.f409946d = java.lang.System.currentTimeMillis();
        this.f409949g = list;
        this.f409950h = list2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2859;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/colikeblock";
        lVar.f70664a = new r45.m50();
        lVar.f70665b = new r45.o50();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409948f = a17;
        r45.m50 m50Var = (r45.m50) a17.f70710a.f70684a;
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.n50 n50Var = new r45.n50();
            n50Var.f381080d = ((java.lang.Integer) list2.get(i17)).intValue();
            n50Var.f381081e = (java.lang.String) list.get(i17);
            m50Var.f380154d.add(n50Var);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409947e = u0Var;
        return dispatch(sVar, this.f409948f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2859;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f409946d));
        this.f409947e.onSceneEnd(i18, i19, str, this);
    }

    public i(java.util.List list, java.util.List list2) {
        this.f409951i = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "create NetSceneTopStorySetBlockList, users size:%s, type size:%s", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(list2.size()));
        H(list, list2);
    }
}

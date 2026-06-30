package sm4;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409935d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409936e;

    public e(r45.un6 un6Var, java.util.List list) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryGetVideoUrl", "Create NetSceneTopStoryGetVideoUrl Video");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2579;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/recommendgetvideourl";
        lVar.f70664a = new r45.al5();
        lVar.f70665b = new r45.bl5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409936e = a17;
        r45.al5 al5Var = (r45.al5) a17.f70710a.f70684a;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            r45.y80 y80Var = new r45.y80();
            y80Var.f390853d = str;
            al5Var.f370109d.add(y80Var);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409935d = u0Var;
        return dispatch(sVar, this.f409936e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2579;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryGetVideoUrl", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f409935d.onSceneEnd(i18, i19, str, this);
    }
}

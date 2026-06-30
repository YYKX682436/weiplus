package sm4;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409930d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409931e;

    /* renamed from: f, reason: collision with root package name */
    public final long f409932f = java.lang.System.currentTimeMillis();

    public c(int i17, long j17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2748;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/getcolikeblocklist";
        lVar.f70664a = new r45.id3();
        lVar.f70665b = new r45.jd3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409931e = a17;
        r45.id3 id3Var = (r45.id3) a17.f70710a.f70684a;
        id3Var.f376948d = i17;
        id3Var.f376950f = j17;
        id3Var.f376949e = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryGetBlockList", "request NetSceneTopStoryGetBlockList: %d %d %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409930d = u0Var;
        return dispatch(sVar, this.f409931e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2748;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryGetBlockList", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f409932f));
        this.f409930d.onSceneEnd(i18, i19, str, this);
    }
}

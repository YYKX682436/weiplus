package sm4;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409940d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409941e;

    /* renamed from: f, reason: collision with root package name */
    public final long f409942f;

    public g(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, dm.m0 m0Var, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostHaokan", "Create NetSceneTopStoryPostVideo ts:%s, extInfo:%s, comment:%s, requestId:%s, appVersion:%s", java.lang.Long.valueOf(j17), str, str2, str3, str4);
        this.f409942f = java.lang.System.currentTimeMillis();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2534;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/colikepost";
        lVar.f70664a = new r45.p50();
        lVar.f70665b = new r45.q50();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409941e = a17;
        r45.p50 p50Var = (r45.p50) a17.f70710a.f70684a;
        p50Var.f382756d = j17;
        p50Var.f382757e = str;
        p50Var.f382758f = str2;
        p50Var.f382759g = str3;
        r45.l50 l50Var = new r45.l50();
        p50Var.f382760h = l50Var;
        l50Var.f379145e = m0Var.field_appName;
        l50Var.f379144d = m0Var.field_appId;
        l50Var.f379146f = str4;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409940d = u0Var;
        return dispatch(sVar, this.f409941e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2534;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryPostHaokan", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f409942f));
        this.f409940d.onSceneEnd(i18, i19, str, this);
    }
}

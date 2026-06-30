package sm4;

/* loaded from: classes.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, mf0.y {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409933d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409934e;

    public d(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2830;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/getuserattrbyopenid";
        lVar.f70664a = new r45.wq3();
        lVar.f70665b = new r45.xq3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409934e = a17;
        ((r45.wq3) a17.f70710a.f70684a).f389387d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409933d = u0Var;
        return dispatch(sVar, this.f409934e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2830;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneTopStoryGetUsername", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f409933d.onSceneEnd(i18, i19, str, this);
    }
}

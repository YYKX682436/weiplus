package h23;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f278310d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278311e;

    /* renamed from: f, reason: collision with root package name */
    public r45.q75 f278312f;

    public a(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.p75();
        lVar.f70665b = new r45.q75();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70667d = 7701;
        lVar.f70678o = 2;
        lVar.f70666c = "/cgi-bin/mmpay-bin/pa/searchpaymentfunction";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f278310d = a17;
        ((r45.p75) a17.f70710a.f70684a).f382813d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f278311e = u0Var;
        return dispatch(sVar, this.f278310d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public long getReturnTimeout() {
        return 2000L;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 7701;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.NetSceneGetSearchFunction", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f278312f = (r45.q75) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f278311e.onSceneEnd(i18, i19, str, this);
    }
}

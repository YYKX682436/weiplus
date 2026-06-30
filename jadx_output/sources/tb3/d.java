package tb3;

/* loaded from: classes8.dex */
public class d extends com.tencent.mm.wallet_core.model.d1 implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f417003d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f417004e;

    /* renamed from: f, reason: collision with root package name */
    public r45.do0 f417005f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f417006g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f417007h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f417008i;

    public d(int i17, int i18, int i19, int i27) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.co0();
        lVar.f70665b = new r45.do0();
        lVar.f70667d = 1970;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/ffrequestwxhb";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f417003d = a17;
        r45.co0 co0Var = (r45.co0) a17.f70710a.f70684a;
        co0Var.f371679d = i17;
        co0Var.f371680e = i18;
        co0Var.f371681f = i19;
        co0Var.f371682g = i27;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            co0Var.f371683h = c17.f384409f;
            co0Var.f371684i = c17.f384410g;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f417004e = u0Var;
        return dispatch(sVar, this.f417003d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1970;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("NetSceneF2FLuckyMoneyPrepare", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.do0 do0Var = (r45.do0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f417005f = do0Var;
        this.f417006g = do0Var.f372613g;
        this.f417007h = do0Var.f372612f;
        this.f417008i = do0Var.f372614h;
        com.tencent.mm.modelbase.u0 u0Var = this.f417004e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

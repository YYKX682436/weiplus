package tb3;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f417009d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f417010e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f417011f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f417012g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f417013h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f417014i;

    /* renamed from: m, reason: collision with root package name */
    public int f417015m;

    public e() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ao0();
        lVar.f70665b = new r45.bo0();
        lVar.f70667d = 1990;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/ffquerydowxhb";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f417009d = a17;
        r45.ao0 ao0Var = (r45.ao0) a17.f70710a.f70684a;
        ao0Var.f370165f = java.lang.System.currentTimeMillis() / 1000;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            ao0Var.f370163d = c17.f384409f;
            ao0Var.f370164e = c17.f384410g;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f417010e = u0Var;
        return dispatch(sVar, this.f417009d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1990;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("NetSceneF2FLuckyMoneyQuery", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.bo0 bo0Var = (r45.bo0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f417011f = bo0Var.f370907f;
        this.f417012g = bo0Var.f370908g;
        this.f417015m = bo0Var.f370909h;
        this.f417013h = bo0Var.f370911m;
        this.f417014i = bo0Var.f370910i;
        com.tencent.mm.modelbase.u0 u0Var = this.f417010e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, bo0Var.f370905d, bo0Var.f370906e, this);
        }
    }
}

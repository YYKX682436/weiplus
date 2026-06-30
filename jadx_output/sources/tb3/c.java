package tb3;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f416985d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f416986e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zn0 f416987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f416988g;

    /* renamed from: h, reason: collision with root package name */
    public int f416989h;

    /* renamed from: i, reason: collision with root package name */
    public int f416990i;

    /* renamed from: m, reason: collision with root package name */
    public int f416991m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f416992n;

    /* renamed from: o, reason: collision with root package name */
    public int f416993o;

    /* renamed from: p, reason: collision with root package name */
    public r45.lj5 f416994p;

    /* renamed from: q, reason: collision with root package name */
    public int f416995q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f416996r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f416997s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f416998t;

    /* renamed from: u, reason: collision with root package name */
    public int f416999u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f417000v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f417001w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f417002x;

    public c(java.lang.String str, com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yn0();
        lVar.f70665b = new r45.zn0();
        lVar.f70667d = 1997;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/ffopenwxhb";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f416985d = a17;
        r45.yn0 yn0Var = (r45.yn0) a17.f70710a.f70684a;
        yn0Var.f391233d = str;
        yn0Var.f391241o = gVar;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            yn0Var.f391234e = c17.f384408e;
            yn0Var.f391235f = c17.f384407d;
            yn0Var.f391236g = c17.f384412i;
            yn0Var.f391237h = c17.f384413m;
            yn0Var.f391238i = c17.f384411h;
            yn0Var.f391239m = c17.f384409f;
            yn0Var.f391240n = c17.f384410g;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f416986e = u0Var;
        return dispatch(sVar, this.f416985d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1997;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        this.f416987f = (r45.zn0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("NetSceneF2FLuckyMoneyOpen", "errType %d, retCode %d, retMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f416987f.f392219d), this.f416987f.f392220e);
        r45.zn0 zn0Var = this.f416987f;
        this.f416988g = zn0Var.f392222g;
        this.f416989h = zn0Var.f392223h;
        this.f416991m = zn0Var.f392224i;
        this.f416990i = zn0Var.f392221f;
        this.f416992n = zn0Var.f392225m;
        this.f416993o = zn0Var.f392226n;
        this.f416994p = zn0Var.f392227o;
        this.f416995q = zn0Var.f392228p;
        this.f416996r = zn0Var.f392229q;
        this.f416997s = zn0Var.f392230r;
        this.f416998t = zn0Var.f392231s;
        this.f416999u = zn0Var.f392232t;
        this.f417000v = zn0Var.f392233u;
        this.f417001w = zn0Var.f392234v;
        this.f417002x = zn0Var.f392236x;
        com.tencent.mm.modelbase.u0 u0Var = this.f416986e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, zn0Var.f392219d, zn0Var.f392220e, this);
        }
    }
}

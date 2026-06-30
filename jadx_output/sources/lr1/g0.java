package lr1;

/* loaded from: classes2.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f320663d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f320664e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kw5 f320665f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f320666g;

    /* renamed from: h, reason: collision with root package name */
    public final long f320667h;

    /* renamed from: i, reason: collision with root package name */
    public final int f320668i;

    /* renamed from: m, reason: collision with root package name */
    public final int f320669m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f320670n;

    public g0(java.lang.String str, long j17, int i17, int i18, java.lang.String str2) {
        this.f320666g = str;
        this.f320667h = j17;
        this.f320668i = i17;
        this.f320669m = i18;
        this.f320670n = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchDetailPageNew", "Constructors: keyword = (%s) , LSB exist () , businessType is (%d) , offset is (%d) , scene is (%d), searchId(%s).", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f320663d = u0Var;
        java.lang.String str = this.f320666g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSearchDetailPageNew", "keyword is unavailable.");
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1071;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/bizsearch/detailpage";
        lVar.f70664a = new r45.jw5();
        lVar.f70665b = new r45.kw5();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f320664e = a17;
        r45.jw5 jw5Var = (r45.jw5) a17.f70710a.f70684a;
        jw5Var.f378172g = lr1.o.a();
        jw5Var.f378170e = str;
        jw5Var.f378169d = this.f320667h;
        jw5Var.f378171f = this.f320668i;
        jw5Var.f378173h = this.f320669m;
        jw5Var.f378176n = this.f320670n;
        return dispatch(sVar, this.f320664e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1071;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchDetailPageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0 && (oVar = this.f320664e) != null) {
            this.f320665f = (r45.kw5) oVar.f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f320663d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

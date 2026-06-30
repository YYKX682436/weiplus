package eh4;

/* loaded from: classes4.dex */
public class d extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252939d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252940e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f252941f;

    /* renamed from: g, reason: collision with root package name */
    public final int f252942g;

    /* renamed from: h, reason: collision with root package name */
    public int f252943h;

    /* renamed from: i, reason: collision with root package name */
    public final int f252944i;

    public d(int i17, long j17, int i18, java.lang.String str, int i19) {
        this.f252944i = 0;
        this.f252944i = i19;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ik6();
        lVar.f70665b = new r45.jk6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/talkmicaction";
        lVar.f70667d = 334;
        lVar.f70668e = 146;
        lVar.f70669f = 1000000146;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252940e = a17;
        r45.ik6 ik6Var = (r45.ik6) a17.f70710a.f70684a;
        ik6Var.f377116d = i17;
        ik6Var.f377117e = j17;
        ik6Var.f377118f = i18;
        ik6Var.f377119g = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        this.f252942g = i18;
        this.f252941f = str;
        ik6Var.f377120h = i19;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f252941f;
    }

    @Override // eh4.f
    public int I() {
        return this.f252944i;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252939d = u0Var;
        return dispatch(sVar, this.f252940e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 334;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f252939d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f252943h = ((r45.jk6) this.f252940e.f70711b.f70700a).f377904d;
            this.f252939d.onSceneEnd(i18, i19, str, this);
        }
    }
}

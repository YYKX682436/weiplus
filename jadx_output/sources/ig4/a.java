package ig4;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f291435d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f291436e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f291437f;

    /* renamed from: g, reason: collision with root package name */
    public int f291438g;

    /* renamed from: h, reason: collision with root package name */
    public r45.e17 f291439h;

    /* renamed from: i, reason: collision with root package name */
    public long f291440i;

    /* renamed from: m, reason: collision with root package name */
    public int f291441m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f291442n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f291443o;

    /* renamed from: p, reason: collision with root package name */
    public r45.x17 f291444p;

    /* renamed from: q, reason: collision with root package name */
    public int f291445q = -1;

    /* renamed from: r, reason: collision with root package name */
    public r45.zu6 f291446r;

    public a(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        H(str, i17, -1, -1L, str2, i18, str3, str4);
    }

    public final void H(java.lang.String str, int i17, int i18, long j17, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.a30();
        lVar.f70665b = new r45.b30();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkvoicetrans";
        lVar.f70667d = 546;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f291435d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckVoiceTrans", "voiceId:%s, totalLen:%d, encodeType: %d, svrMsgId: %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17));
        if (i18 >= 0) {
            this.f291439h = ig4.d.a(i18, str2, 0L, "");
        }
        if (j17 > 0) {
            this.f291440i = j17;
        }
        this.f291437f = str;
        this.f291438g = i17;
        this.f291441m = i19;
        this.f291442n = str3;
        this.f291443o = str4;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f291436e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f291435d;
        r45.a30 a30Var = (r45.a30) oVar.f70710a.f70684a;
        a30Var.f369692d = this.f291437f;
        a30Var.f369693e = this.f291438g;
        a30Var.f369695g = this.f291439h;
        a30Var.f369696h = this.f291440i;
        a30Var.f369697i = this.f291441m;
        a30Var.f369698m = this.f291442n;
        a30Var.f369699n = this.f291443o;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 546;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.b30 b30Var = (r45.b30) this.f291435d.f70711b.f70700a;
            if (b30Var == null) {
                return;
            }
            this.f291444p = b30Var.f370492e;
            this.f291445q = b30Var.f370491d;
            this.f291446r = b30Var.f370493f;
            r45.oh5 oh5Var = b30Var.f370494g;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckVoiceTrans", "end checkVoiceTrans, & errType:%d, errCode:%d, voiceId: %s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), this.f291437f);
        }
        this.f291436e.onSceneEnd(i18, i19, str, this);
    }

    public a(java.lang.String str, int i17, int i18, long j17, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4) {
        H(str, i17, i18, j17, str2, i19, str3, str4);
    }
}

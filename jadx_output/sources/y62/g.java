package y62;

/* loaded from: classes11.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f459637d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f459638e;

    /* renamed from: f, reason: collision with root package name */
    public final int f459639f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f459640g;

    /* renamed from: h, reason: collision with root package name */
    public final int f459641h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f459642i;

    /* renamed from: m, reason: collision with root package name */
    public int f459643m;

    /* renamed from: n, reason: collision with root package name */
    public final int f459644n;

    /* renamed from: o, reason: collision with root package name */
    public final int f459645o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f459646p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.ka f459647q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.ea f459648r;

    /* renamed from: s, reason: collision with root package name */
    public int f459649s;

    /* renamed from: t, reason: collision with root package name */
    public final long f459650t;

    public g(int i17, int i18, java.lang.String str, int i19, int i27, java.lang.String str2, r45.ka kaVar, r45.ea eaVar) {
        this.f459649s = 5000;
        this.f459650t = 0L;
        this.f459639f = i17;
        this.f459640g = str;
        this.f459641h = i18;
        this.f459645o = i19;
        this.f459644n = i27;
        this.f459647q = kaVar;
        this.f459648r = eaVar;
        this.f459646p = str2;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i27);
        objArr[4] = java.lang.Integer.valueOf(i19);
        objArr[5] = java.lang.Boolean.valueOf(kaVar != null);
        objArr[6] = java.lang.Boolean.valueOf(eaVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, totalLen=%s, controlType=%s, %s, %s", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f459637d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 985;
        lVar.f70666c = "/cgi-bin/micromsg-bin/appvoicecontrol";
        lVar.f70664a = new r45.fa();
        lVar.f70665b = new r45.ga();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f459638e = a17;
        r45.fa faVar = (r45.fa) a17.f70710a.f70684a;
        faVar.f374119d = this.f459639f;
        faVar.f374120e = this.f459640g;
        faVar.f374121f = this.f459641h;
        faVar.f374122g = this.f459645o;
        faVar.f374123h = this.f459647q;
        faVar.f374124i = this.f459648r;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 985;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0 && v0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f459637d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] callback null");
        }
    }

    public g(int i17, int i18, java.lang.String str, int i19, r45.ka kaVar, r45.ea eaVar, long j17) {
        this.f459649s = 5000;
        this.f459650t = 0L;
        this.f459639f = i17;
        this.f459640g = str;
        this.f459641h = i18;
        this.f459645o = i19;
        this.f459647q = kaVar;
        this.f459648r = eaVar;
        this.f459650t = j17;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = java.lang.Integer.valueOf(i19);
        objArr[4] = java.lang.Boolean.valueOf(kaVar != null);
        objArr[5] = java.lang.Boolean.valueOf(eaVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, controlType=%s, %s, %s", objArr);
    }
}

package j72;

/* loaded from: classes14.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f298041d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f298042e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.lf3 f298043f;

    /* renamed from: g, reason: collision with root package name */
    public r45.mf3 f298044g;

    /* JADX WARN: Removed duplicated region for block: B:59:0x0269 A[Catch: Exception -> 0x0264, TryCatch #3 {Exception -> 0x0264, blocks: (B:73:0x025b, B:59:0x0269, B:62:0x026f, B:64:0x0286, B:69:0x028f, B:71:0x0299), top: B:72:0x025b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026f A[Catch: Exception -> 0x0264, TryCatch #3 {Exception -> 0x0264, blocks: (B:73:0x025b, B:59:0x0269, B:62:0x026f, B:64:0x0286, B:69:0x028f, B:71:0x0299), top: B:72:0x025b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r25, java.lang.String r26, float r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.String r32, byte[] r33, boolean r34, int r35, long r36, double r38, double r40, k72.v r42) {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j72.c.<init>(java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, byte[], boolean, int, long, double, double, k72.v):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f298041d = u0Var;
        return dispatch(sVar, this.f298042e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2726;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetFaceCheckResult", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, i19 == 0 ? 54L : 55L, 1L, false);
        this.f298044g = (r45.mf3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f298041d.onSceneEnd(i18, i19, str, this);
    }
}

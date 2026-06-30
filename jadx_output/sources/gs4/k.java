package gs4;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f275113d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f275114e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lp6 f275115f;

    /* renamed from: g, reason: collision with root package name */
    public gs4.j f275116g;

    public k(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.kp6 kp6Var = new r45.kp6();
        kp6Var.f378898d = i17;
        lVar.f70664a = kp6Var;
        lVar.f70665b = new r45.lp6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonegetswitch";
        lVar.f70667d = 1813;
        this.f275113d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f275114e = u0Var;
        return dispatch(sVar, this.f275113d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1813;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.mobileRemit.NetSceneMobileRemitGetSwitch", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f275115f = (r45.lp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f275114e.onSceneEnd(i18, i19, str, this);
    }
}

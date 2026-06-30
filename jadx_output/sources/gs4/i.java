package gs4;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f275100d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f275101e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bp6 f275102f;

    public i(int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ap6 ap6Var = new r45.ap6();
        ap6Var.f370179d = i17;
        ap6Var.f370180e = i18;
        lVar.f70664a = ap6Var;
        lVar.f70665b = new r45.bp6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonechangeswitch";
        lVar.f70667d = 1724;
        this.f275100d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitChangeSwitch", "NetSceneMobileRemitChangeSwitch() switchChangeType:%s", java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f275101e = u0Var;
        return dispatch(sVar, this.f275100d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1724;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.mobileRemit.NetSceneMobileRemitChangeSwitch", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f275102f = (r45.bp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f275101e.onSceneEnd(i18, i19, str, this);
    }
}

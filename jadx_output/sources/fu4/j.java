package fu4;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266898d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266899e;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.v15();
        lVar.f70665b = new r45.w15();
        lVar.f70666c = "/cgi-bin/mmpay-bin/opensotertouchlock";
        lVar.f70667d = 1967;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266899e = a17;
        r45.v15 v15Var = (r45.v15) a17.f70710a.f70684a;
        v15Var.f387802d = str;
        v15Var.f387803e = str2;
        v15Var.f387804f = str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266898d = u0Var;
        return dispatch(sVar, this.f266899e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1967;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenSoterFingerprintLock", "open soter fingerprint lock errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f266898d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

package r73;

/* loaded from: classes9.dex */
public class f extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.zw3 f393169r;

    public f() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yw3();
        lVar.f70665b = new r45.zw3();
        lVar.f70667d = 2725;
        lVar.f70666c = "/cgi-bin/mmpay-bin/honeypayerlist";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneHoneyPayerList", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.zw3 zw3Var = (r45.zw3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393169r = zw3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneHoneyPayerList", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zw3Var.f392420d), this.f393169r.f392421e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.zw3 zw3Var = (r45.zw3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = zw3Var.f392420d;
        this.f214030h = zw3Var.f392421e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2725;
    }
}

package r73;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.yd3 f393167r;

    public d(java.lang.String str, long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xd3();
        lVar.f70665b = new r45.yd3();
        lVar.f70667d = 2630;
        lVar.f70666c = "/cgi-bin/mmpay-bin/createhpcardtoken";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.xd3 xd3Var = (r45.xd3) a17.f70710a.f70684a;
        xd3Var.f389995d = str;
        xd3Var.f389996e = j17;
        xd3Var.f389997f = at4.g0.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCreateTokenSign", "take_message: %s, credit_line: %s", str, java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCreateTokenSign", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.yd3 yd3Var = (r45.yd3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393167r = yd3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCreateTokenSign", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(yd3Var.f390990d), this.f393167r.f390991e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.yd3 yd3Var = (r45.yd3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = yd3Var.f390990d;
        this.f214030h = yd3Var.f390991e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2630;
    }
}

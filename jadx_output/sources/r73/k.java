package r73;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.pg5 f393176r;

    public k(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.og5();
        lVar.f70665b = new r45.pg5();
        lVar.f70667d = 2851;
        lVar.f70666c = "/cgi-bin/mmpay-bin/qryhpcarddetail";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        ((r45.og5) a17.f70710a.f70684a).f382244d = str;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryHoneyPayCardDetail", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.pg5 pg5Var = (r45.pg5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393176r = pg5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryHoneyPayCardDetail", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(pg5Var.f383027d), this.f393176r.f383028e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.pg5 pg5Var = (r45.pg5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = pg5Var.f383027d;
        this.f214030h = pg5Var.f383028e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2851;
    }
}

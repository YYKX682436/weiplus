package r73;

/* loaded from: classes2.dex */
public class n extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.kr6 f393179r;

    public n(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jr6();
        lVar.f70665b = new r45.kr6();
        lVar.f70667d = 2659;
        lVar.f70666c = "/cgi-bin/mmpay-bin/unbindhpcard";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.jr6 jr6Var = (r45.jr6) a17.f70710a.f70684a;
        jr6Var.f378075d = str;
        jr6Var.f378076e = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnbindHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.kr6 kr6Var = (r45.kr6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393179r = kr6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnbindHoneyPayCard", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(kr6Var.f378911d), this.f393179r.f378912e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.kr6 kr6Var = (r45.kr6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = kr6Var.f378911d;
        this.f214030h = kr6Var.f378912e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2659;
    }
}

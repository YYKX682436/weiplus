package r73;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.sp4 f393175r;

    public j(r45.n75 n75Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rp4();
        lVar.f70665b = new r45.sp4();
        lVar.f70667d = 2941;
        lVar.f70666c = "/cgi-bin/mmpay-bin/modifyhppayerpayway";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.rp4 rp4Var = (r45.rp4) a17.f70710a.f70684a;
        rp4Var.f385076d = n75Var;
        rp4Var.f385077e = str;
        rp4Var.f385078f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "cardNo: %s, suffix: %s, bankType: %s sessionId: %s", str, n75Var.f381138h, n75Var.f381136f, str2);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.sp4 sp4Var = (r45.sp4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393175r = sp4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerPayWay", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(sp4Var.f385896d), this.f393175r.f385897e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.sp4 sp4Var = (r45.sp4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = sp4Var.f385896d;
        this.f214030h = sp4Var.f385897e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2941;
    }
}

package r73;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.op4 f393171r;

    /* renamed from: s, reason: collision with root package name */
    public final long f393172s;

    public h(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.np4();
        lVar.f70665b = new r45.op4();
        lVar.f70667d = 2685;
        lVar.f70666c = "/cgi-bin/mmpay-bin/modifyhppayercreditline";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.np4 np4Var = (r45.np4) a17.f70710a.f70684a;
        np4Var.f381573d = j17;
        np4Var.f381574e = str;
        np4Var.f381575f = str2;
        this.f393172s = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "credit line: %s", java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.op4 op4Var = (r45.op4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393171r = op4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerCreditLine", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(op4Var.f382425d), this.f393171r.f382426e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.op4 op4Var = (r45.op4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = op4Var.f382425d;
        this.f214030h = op4Var.f382426e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2685;
    }
}

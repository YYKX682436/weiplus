package r73;

/* loaded from: classes2.dex */
public class g extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.fi3 f393170r;

    public g(java.lang.String str, long j17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ei3();
        lVar.f70665b = new r45.fi3();
        lVar.f70667d = 2815;
        lVar.f70666c = "/cgi-bin/mmpay-bin/gmcreditlinetoken";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.ei3 ei3Var = (r45.ei3) a17.f70710a.f70684a;
        ei3Var.f373531d = str;
        ei3Var.f373532e = j17;
        ei3Var.f373533f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMCreditLineTokenSign", "card_no: %s, credit_line: %s", str, java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMCreditLineTokenSign", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fi3 fi3Var = (r45.fi3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393170r = fi3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMCreditLineTokenSign", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(fi3Var.f374379e), this.f393170r.f374380f);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.fi3 fi3Var = (r45.fi3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = fi3Var.f374379e;
        this.f214030h = fi3Var.f374380f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2815;
    }
}

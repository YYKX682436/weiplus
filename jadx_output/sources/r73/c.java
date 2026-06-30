package r73;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.z90 f393166r;

    public c(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.y90();
        lVar.f70665b = new r45.z90();
        lVar.f70667d = 2662;
        lVar.f70666c = "/cgi-bin/mmpay-bin/createhoneypaycard";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.y90 y90Var = (r45.y90) a17.f70710a.f70684a;
        y90Var.f390877d = str;
        y90Var.f390878e = j17;
        y90Var.f390879f = str2;
        y90Var.f390880g = str3;
        y90Var.f390881h = i17;
        y90Var.f390882i = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCreateHoneyPayCard", "username: %s, credit line: %s", str2, java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCreateHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.z90 z90Var = (r45.z90) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393166r = z90Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCreateHoneyPayCard", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(z90Var.f391795d), this.f393166r.f391796e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.z90 z90Var = (r45.z90) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = z90Var.f391795d;
        this.f214030h = z90Var.f391796e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2662;
    }
}

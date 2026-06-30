package r73;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.a10 f393164r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f393165s;

    public b(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z00();
        lVar.f70665b = new r45.a10();
        lVar.f70667d = 2926;
        lVar.f70666c = "/cgi-bin/mmpay-bin/checkhoneyuser";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.z00 z00Var = (r45.z00) a17.f70710a.f70684a;
        z00Var.f391563d = str;
        z00Var.f391564e = i17;
        this.f393165s = str;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckHoneyUser", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.a10 a10Var = (r45.a10) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393164r = a10Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckHoneyUser", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(a10Var.f369620d), this.f393164r.f369621e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.a10 a10Var = (r45.a10) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = a10Var.f369620d;
        this.f214030h = a10Var.f369621e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2926;
    }
}

package r73;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.qp4 f393173r;

    /* renamed from: s, reason: collision with root package name */
    public final int f393174s;

    public i(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pp4();
        lVar.f70665b = new r45.qp4();
        lVar.f70667d = 2742;
        lVar.f70666c = "/cgi-bin/mmpay-bin/modifyhppayernotify";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        ((r45.pp4) a17.f70710a.f70684a).f383293d = i17;
        this.f393174s = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "notify flag: %s", java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.qp4 qp4Var = (r45.qp4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393173r = qp4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(qp4Var.f384181d), this.f393173r.f384182e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.qp4 qp4Var = (r45.qp4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = qp4Var.f384181d;
        this.f214030h = qp4Var.f384182e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2742;
    }
}

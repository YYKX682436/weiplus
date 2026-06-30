package ww1;

/* loaded from: classes2.dex */
public class q1 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.wu5 f450270r;

    public q1(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vu5();
        lVar.f70665b = new r45.wu5();
        lVar.f70667d = 1800;
        lVar.f70666c = "/cgi-bin/mmpay-bin/scanf2fmaterialcode";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.vu5 vu5Var = (r45.vu5) a17.f70710a.f70684a;
        vu5Var.f388585d = str;
        vu5Var.f388586e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fMaterial", "req url: %s, %s", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.wu5 wu5Var = (r45.wu5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f450270r = wu5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2fMaterial", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(wu5Var.f389475d), this.f450270r.f389476e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.wu5 wu5Var = (r45.wu5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = wu5Var.f389475d;
        this.f214030h = wu5Var.f389476e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1800;
    }
}

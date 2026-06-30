package xw1;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.av5 f457667r;

    public e(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zu5();
        lVar.f70665b = new r45.av5();
        lVar.f70667d = 2811;
        lVar.f70666c = "/cgi-bin/mmpay-bin/scanrewardmaterialcode";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.zu5 zu5Var = (r45.zu5) a17.f70710a.f70684a;
        zu5Var.f392376d = str;
        zu5Var.f392377e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardMaterial", "req url: %s, %s", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.av5 av5Var = (r45.av5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f457667r = av5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardMaterial", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(av5Var.f370277d), this.f457667r.f370278e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.av5 av5Var = (r45.av5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = av5Var.f370277d;
        this.f214030h = av5Var.f370278e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2811;
    }
}

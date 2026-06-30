package xw1;

/* loaded from: classes9.dex */
public class h extends xw1.c {

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f457674m;

    /* renamed from: n, reason: collision with root package name */
    public r45.lx f457675n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f457676o;

    public h(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kx();
        lVar.f70665b = new r45.lx();
        lVar.f70667d = 1516;
        lVar.f70666c = "/cgi-bin/mmpay-bin/scanrewardqrcode";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f457674m = a17;
        r45.kx kxVar = (r45.kx) a17.f70710a.f70684a;
        kxVar.f379008d = str;
        kxVar.f379009e = i17;
        kxVar.f379010f = str2;
    }

    @Override // xw1.c
    public boolean H() {
        return false;
    }

    @Override // xw1.c
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardScanCode", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.lx lxVar = (r45.lx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f457675n = lxVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQrRewardScanCode", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(lxVar.f379903d), this.f457675n.f379904e);
        if (!this.f457661h && this.f457675n.f379903d != 0) {
            this.f457662i = true;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f457676o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f457676o = u0Var;
        return dispatch(sVar, this.f457674m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1516;
    }
}

package r01;

/* loaded from: classes9.dex */
public class k3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, r01.y2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368131d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368132e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nm3 f368133f;

    /* renamed from: g, reason: collision with root package name */
    public final r01.z2 f368134g;

    public k3(r01.z2 z2Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetReceiptAssisPluginMenu", "NetSceneGetReceiptAssisPluginMenu begin");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1769;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getreceiptassismenu";
        r45.mm3 mm3Var = new r45.mm3();
        mm3Var.f380662d = c01.id.c();
        lVar.f70664a = mm3Var;
        lVar.f70665b = new r45.nm3();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        this.f368131d = lVar.a();
        this.f368134g = z2Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368132e = u0Var;
        return dispatch(sVar, this.f368131d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1769;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetReceiptAssisPluginMenu", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f368133f = (r45.nm3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f368132e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        r01.z2 z2Var = this.f368134g;
        if (z2Var != null) {
            z2Var.a(i18, i19, str, this);
        }
    }
}

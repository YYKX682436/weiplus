package z12;

/* loaded from: classes4.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469350d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469351e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f469352f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469353g;

    /* renamed from: h, reason: collision with root package name */
    public final int f469354h;

    public q(java.lang.String str, int i17, int i18) {
        this.f469352f = str;
        this.f469353g = i17;
        this.f469354h = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.re3();
        lVar.f70665b = new r45.se3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getemotiondetail";
        lVar.f70667d = 412;
        lVar.f70668e = 211;
        lVar.f70669f = 1000000211;
        this.f469350d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int i17 = this.f469353g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f469354h;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str = this.f469352f;
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ProductID:%s, Scene:%d, Version:%d", str, valueOf, valueOf2);
        this.f469351e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469350d;
        r45.re3 re3Var = (r45.re3) oVar.f70710a.f70684a;
        re3Var.f384760d = str;
        re3Var.f384761e = i17;
        re3Var.f384762f = i18;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 412;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ErrType:" + i18 + "   errCode:" + i19);
        if (i18 != 0 && i19 != 0 && i19 != 5) {
            this.f469351e.onSceneEnd(i18, i19, str, this);
            return;
        }
        if (i18 == 0 && i19 == 0) {
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().d().z0(this.f469352f, (r45.se3) this.f469350d.f70711b.f70700a, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        }
        this.f469351e.onSceneEnd(i18, i19, str, this);
    }
}

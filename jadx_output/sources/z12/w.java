package z12;

/* loaded from: classes2.dex */
public class w extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469376d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469377e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f469378f;

    /* renamed from: g, reason: collision with root package name */
    public final int f469379g;

    public w(java.lang.String str, int i17) {
        this.f469378f = str;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.equals(java.lang.String.valueOf(17))) {
            this.f469378f = "com.tencent.xin.emoticon.tusiji";
        }
        this.f469379g = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xn4();
        lVar.f70665b = new r45.yn4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/modemotionpack";
        lVar.f70667d = 413;
        lVar.f70668e = 212;
        lVar.f70669f = 1000000212;
        this.f469376d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneModEmotionPack", "NetSceneModEmotionPack: %s, %s", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469377e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469376d;
        r45.xn4 xn4Var = (r45.xn4) oVar.f70710a.f70684a;
        xn4Var.f390252d = this.f469378f;
        xn4Var.f390253e = this.f469379g;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 413;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27 = this.f469379g;
        if (i18 == 0 && i19 == 0) {
            if (i27 == 1) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(165L, 2L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(165L, 4L, 1L, false);
            }
            this.f469377e.onSceneEnd(i18, i19, str, this);
            return;
        }
        this.f469377e.onSceneEnd(i18, i19, str, this);
        if (i27 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(165L, 3L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneModEmotionPack", "del tukiz failed  ");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(165L, 5L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NetSceneModEmotionPack", "del emoji failed md5:%s", this.f469378f);
        }
    }
}

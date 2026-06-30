package va3;

/* loaded from: classes4.dex */
public class z extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f434393d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f434394e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f434395f;

    public z(float f17, float f18, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yh3();
        lVar.f70665b = new r45.zh3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlocimg";
        lVar.f70667d = me1.b.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f434394e = a17;
        r45.yh3 yh3Var = (r45.yh3) a17.f70710a.f70684a;
        yh3Var.f391081h = str2;
        if (com.tencent.mm.sdk.platformtools.t8.P0(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            yh3Var.f391082i = 1;
        } else {
            yh3Var.f391082i = 0;
        }
        yh3Var.f391078e = f17;
        yh3Var.f391077d = f18;
        yh3Var.f391083m = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetLocImg", "src w %d h %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        while (i19 * i27 > 270000) {
            i19 = (int) (i19 / 1.2d);
            i27 = (int) (i27 / 1.2d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetLocImg", "NetSceneGetLocImg %f %f %d w = %d h = %d lan=%s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), yh3Var.f391081h);
        yh3Var.f391080g = i27;
        yh3Var.f391079f = i19;
        this.f434395f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f434393d = u0Var;
        return dispatch(sVar, this.f434394e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return me1.b.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        try {
            byte[] bArr2 = ((r45.zh3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f392062d.f371841f.f192156a;
            com.tencent.mm.vfs.w6.S(this.f434395f, bArr2, 0, bArr2.length);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetLocImg", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f434393d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

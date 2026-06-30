package su4;

/* loaded from: classes.dex */
public class z1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413147d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413148e;

    /* renamed from: f, reason: collision with root package name */
    public r45.th4 f413149f;

    /* renamed from: g, reason: collision with root package name */
    public final int f413150g;

    /* renamed from: h, reason: collision with root package name */
    public final int f413151h;

    /* renamed from: i, reason: collision with root package name */
    public final int f413152i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f413153m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f413154n;

    public z1(int i17, int i18, int i19, int i27, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list) {
        this(i17, i18, i19, i27, str, j17, str2, str3, str4, list, 0);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413147d = u0Var;
        return dispatch(sVar, this.f413148e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1048;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.NetSceneWebSearchGuide", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            su4.k2.h(207, this.f413151h, this.f413154n, "", "", 0, true, this.f413153m, false, "", "", 1048);
            this.f413147d.onSceneEnd(i18, i19, str, this);
        } else {
            r45.th4 th4Var = (r45.th4) this.f413148e.f70711b.f70700a;
            this.f413149f = th4Var;
            su4.k2.h(207, this.f413151h, this.f413154n, "", th4Var.f386440f, 0, true, this.f413153m, true, "", "", 1048);
            this.f413147d.onSceneEnd(i18, i19, str, this);
        }
    }

    public z1(int i17, int i18, int i19, int i27, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i28) {
        this.f413151h = i17;
        this.f413152i = i27;
        this.f413150g = i18;
        this.f413153m = str2;
        this.f413154n = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.NetSceneWebSearchGuide", "scene %d, h5Version=%d type=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1048;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/searchguide";
        lVar.f70664a = new r45.sh4();
        lVar.f70665b = new r45.th4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413148e = a17;
        r45.sh4 sh4Var = (r45.sh4) a17.f70710a.f70684a;
        sh4Var.f385724d = i17;
        sh4Var.f385725e = i19;
        sh4Var.f385726f = su4.r2.i();
        sh4Var.f385727g = i18;
        sh4Var.f385728h = str;
        sh4Var.f385729i = j17;
        sh4Var.f385730m = str3;
        sh4Var.f385731n = str4;
        sh4Var.f385734q = str2;
        sh4Var.f385735r = i28;
        sh4Var.f385732o = su4.r2.g();
        if (list != null) {
            sh4Var.f385733p.addAll(list);
        }
        su4.k2.h(204, i17, str3, "", "", 0, true, str2, true, null, "", i18);
    }
}

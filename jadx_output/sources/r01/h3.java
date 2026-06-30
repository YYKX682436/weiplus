package r01;

/* loaded from: classes9.dex */
public class h3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368105d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368106e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f368107f;

    public h3(r01.m mVar, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qf5();
        lVar.f70665b = new r45.rf5();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/reportpluginstat";
        lVar.f70667d = 2805;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368106e = a17;
        r45.qf5 qf5Var = (r45.qf5) a17.f70710a.f70684a;
        qf5Var.f383945d = i17;
        qf5Var.f383946e = mVar.field_wwCorpId;
        qf5Var.f383948g = mVar.field_wwUserVid;
        qf5Var.f383949h = gm0.j1.b().h();
        qf5Var.f383950i = i19;
        qf5Var.f383951m = i18;
        qf5Var.f383952n = i27;
        qf5Var.f383953o = new java.util.Date().getTime();
        qf5Var.f383954p = 1;
        qf5Var.f383955q = com.tencent.mm.sdk.platformtools.a0.a(null, o45.wf.f343029g);
        this.f368107f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368105d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneEnterprisePushStat", "do scene");
        return dispatch(sVar, this.f368106e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2805;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f368105d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}

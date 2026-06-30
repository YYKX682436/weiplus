package op3;

/* loaded from: classes5.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f347250d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f347251e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.Pair f347252f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.SendPatActionReportStruct f347253g;

    public b(android.util.Pair pair, java.lang.String str, java.lang.String str2, int i17) {
        r45.kz5 kz5Var = new r45.kz5();
        kz5Var.f379043d = c01.z1.r();
        kz5Var.f379044e = str;
        kz5Var.f379045f = str2;
        kz5Var.f379046g = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).aj(pair);
        kz5Var.f379047h = i17;
        this.f347252f = pair;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = kz5Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendpat";
        lVar.f70667d = 849;
        lVar.f70665b = new r45.lz5();
        this.f347250d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendPat", "NetSceneSendPat ChatUsername:%s PattedUsername:%s msgPointer:%s", str, str2, pair);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f347251e = u0Var;
        return dispatch(sVar, this.f347250d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 849;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendPat", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f347251e.onSceneEnd(i18, i19, str, this);
    }
}

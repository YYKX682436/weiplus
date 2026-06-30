package lx3;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f322095h = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f322096d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f322097e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.a93 f322098f;

    /* renamed from: g, reason: collision with root package name */
    public r45.q0 f322099g;

    public k(int i17, int i18) {
        this.f322098f = null;
        H(true);
        r45.p0 p0Var = new r45.p0();
        r45.a93 a93Var = new r45.a93();
        this.f322098f = a93Var;
        try {
            p0Var.f382641d = i17;
            p0Var.f382642e = i18;
            a93Var.f369856d = p0Var;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAPMStrategy", "parse data error");
        }
    }

    public void H(boolean z17) {
        synchronized (f322095h) {
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f322097e = u0Var;
        if (!gm0.j1.b().n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetAPMStrategy", "get mrs strategy must go after login");
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70670g = false;
        lVar.f70664a = this.f322098f;
        lVar.f70665b = new r45.b93();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getapmstrategy";
        lVar.f70667d = 914;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f322096d = a17;
        int dispatch = dispatch(sVar, a17, this);
        if (dispatch < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAPMStrategy", "mark all failed. do scene %d", java.lang.Integer.valueOf(dispatch));
            try {
                this.f322099g = null;
                H(false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAPMStrategy", "onStrategyResp failed  hash:%d  , ex:%s", java.lang.Integer.valueOf(hashCode()), com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 914;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        try {
            this.f322099g = null;
            if (gm0.j1.n().f273288b != null && gm0.j1.n().f273288b.f70764d != null) {
                if (i18 == 0) {
                    this.f322099g = ((r45.b93) this.f322096d.f70711b.f70700a).f370638d;
                    this.f322097e.onSceneEnd(i18, i19, str, this);
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAPMStrategy", "get report strategy err, errType:" + i18 + ", errCode:" + i19);
                this.f322097e.onSceneEnd(i18, i19, str, this);
                return;
            }
            com.tencent.mars.xlog.Log.f("MicroMsg.NetSceneGetAPMStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f322097e.onSceneEnd(i18, i19, str, this);
        } finally {
            H(false);
        }
    }
}

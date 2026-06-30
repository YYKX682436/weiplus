package lx3;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f322100h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f322101i = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f322102d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f322103e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ed3 f322104f;

    /* renamed from: g, reason: collision with root package name */
    public final lx3.f f322105g;

    public l(byte[] bArr) {
        this.f322104f = null;
        lx3.f fVar = new lx3.f(null);
        this.f322105g = fVar;
        synchronized (f322101i) {
            f322100h = true;
        }
        r45.ed3 mMGetStrategyReq = com.tencent.mars.smc.SmcProtoBufUtil.toMMGetStrategyReq();
        this.f322104f = mMGetStrategyReq;
        if (mMGetStrategyReq != null) {
            r45.fw3 fw3Var = new r45.fw3();
            mMGetStrategyReq.f373310n = fw3Var;
            fw3Var.f374652d = fVar.b(0);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f322103e = u0Var;
        boolean n17 = gm0.j1.b().n();
        r45.ed3 ed3Var = this.f322104f;
        if (!n17) {
            ed3Var.f373306g = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.s0());
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70670g = false;
        lVar.f70664a = ed3Var;
        lVar.f70665b = new r45.fd3();
        lVar.f70666c = n17 ? "/cgi-bin/micromsg-bin/getkvidkeystrategy" : "/cgi-bin/micromsg-bin/getkvidkeystrategyrsa";
        lVar.f70667d = getType();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f322102d = a17;
        if (!n17) {
            a17.setRsaInfo(new o45.pi("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125));
            this.f322102d.f70714e = 1;
        }
        int dispatch = dispatch(sVar, this.f322102d, this);
        if (dispatch < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCliKVStrategy", "mark all failed. do scene %d", java.lang.Integer.valueOf(dispatch));
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnStrategyResp(3, -1, null, 1);
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnStrategyResp(3, -1, null, 2);
                ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).i4(3, -1, null, 1);
                ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).i4(3, -1, null, 2);
                synchronized (f322101i) {
                    f322100h = false;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", java.lang.Integer.valueOf(hashCode()), com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return gm0.j1.b().n() ? com.tencent.mm.plugin.appbrand.jsapi.s6.CTRL_INDEX : com.tencent.mm.plugin.appbrand.jsapi.q6.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (gm0.j1.n().f273288b == null || gm0.j1.n().f273288b.f70764d == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.NetSceneGetCliKVStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f322103e.onSceneEnd(i18, i19, str, this);
            return;
        }
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy err, errType:" + i18 + ", errCode:" + i19);
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnStrategyResp(i18, i19, null, 1);
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnStrategyResp(i18, i19, null, 2);
            ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).i4(0, 0, null, 1);
            ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).i4(0, 0, null, 2);
            this.f322103e.onSceneEnd(i18, i19, str, this);
            synchronized (f322101i) {
                f322100h = false;
            }
            return;
        }
        r45.fd3 fd3Var = (r45.fd3) this.f322102d.f70711b.f70700a;
        this.f322105g.c(fd3Var.f374238w, 0);
        try {
            p45.f smcKVStrategyResp = com.tencent.mars.smc.SmcProtoBufUtil.toSmcKVStrategyResp(fd3Var);
            p45.c smcIdkeyStrategyResp = com.tencent.mars.smc.SmcProtoBufUtil.toSmcIdkeyStrategyResp(fd3Var);
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnStrategyResp(0, 0, smcKVStrategyResp.toByteArray(), 1);
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnStrategyResp(0, 0, smcIdkeyStrategyResp.toByteArray(), 2);
            ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).i4(0, 0, smcKVStrategyResp.toByteArray(), 1);
            ((com.tencent.mm.plugin.zero.s0) i95.n0.c(com.tencent.mm.plugin.zero.s0.class)).i4(0, 0, smcIdkeyStrategyResp.toByteArray(), 2);
        } catch (java.lang.Exception e17) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", valueOf, com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        this.f322103e.onSceneEnd(i18, i19, str, this);
        synchronized (f322101i) {
            f322100h = false;
        }
    }
}

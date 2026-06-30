package lx3;

/* loaded from: classes12.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f322083d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f322084e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f322085f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.u30 f322086g;

    /* renamed from: h, reason: collision with root package name */
    public final int f322087h;

    /* renamed from: i, reason: collision with root package name */
    public final lx3.f f322088i = new lx3.f(null);

    public h(byte[] bArr, int i17) {
        boolean z17 = false;
        this.f322084e = false;
        this.f322086g = null;
        this.f322087h = 0;
        if (bArr == null) {
            throw new java.lang.NullPointerException("data must not be null");
        }
        this.f322087h = i17;
        if (!com.tencent.mm.sdk.platformtools.x2.p()) {
            z17 = gm0.j1.b().n();
        } else if (com.tencent.mm.network.x2.c().f71993n.f71902o != 0) {
            z17 = true;
        }
        this.f322084e = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCliReportKV", "isLogin ? %s", java.lang.Boolean.valueOf(z17));
        if (i17 == 1) {
            try {
                p45.i iVar = new p45.i();
                iVar.parseFrom(bArr);
                this.f322086g = com.tencent.mars.smc.SmcProtoBufUtil.toMMReportKvReq(iVar);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCliReportKV", "parse data error");
                gm0.j1.i();
                gm0.j1.e().j(new lx3.i(this));
            }
        } else if (i17 == 2) {
            try {
                p45.g gVar = new p45.g();
                gVar.parseFrom(bArr);
                this.f322086g = com.tencent.mars.smc.SmcProtoBufUtil.toMMReportIdkeyReq(gVar);
            } catch (java.lang.Exception unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCliReportKV", "parse data error");
                gm0.j1.i();
                gm0.j1.e().j(new lx3.j(this));
            }
        }
        r45.u30 u30Var = this.f322086g;
        if (u30Var == null) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCliReportKV", "NetSceneCliReportKV parse req is null, stack[%s]", new com.tencent.mm.sdk.platformtools.z3());
        } else {
            u30Var.f386983i = new r45.fw3();
            this.f322086g.f386983i.f374652d = this.f322088i.b(this.f322087h);
        }
    }

    public final void H(final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.m1 m1Var) {
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            setHasCallbackToQueue(true);
            fs.g.c(com.tencent.mm.modelbase.j1.class, java.lang.Integer.valueOf(m1Var.getType()), new fs.o() { // from class: lx3.h$$a
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    com.tencent.mm.modelbase.j1 j1Var = (com.tencent.mm.modelbase.j1) nVar;
                    if (j1Var != null) {
                        j1Var.onSceneEnd(i17, i18, str, m1Var);
                        return false;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCliReportKV", "%s returns null, skip notifying.", j1Var);
                    return false;
                }
            });
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f322085f = u0Var;
        r45.u30 u30Var = this.f322086g;
        if (u30Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCliReportKV", "do scene but req is null!");
            return -2;
        }
        boolean z17 = this.f322084e;
        if (!z17) {
            u30Var.f386982h = com.tencent.mm.protobuf.g.b(com.tencent.mm.sdk.platformtools.t8.s0());
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70670g = false;
        lVar.f70664a = u30Var;
        lVar.f70665b = new r45.v30();
        int i17 = this.f322087h;
        java.lang.String str = 1 == i17 ? "/cgi-bin/micromsg-bin/newreportkvcomm" : "/cgi-bin/micromsg-bin/newreportidkey";
        java.lang.String str2 = 1 == i17 ? "/cgi-bin/micromsg-bin/newreportkvcommrsa" : "/cgi-bin/micromsg-bin/newreportidkeyrsa";
        if (!z17) {
            str = str2;
        }
        lVar.f70666c = str;
        lVar.f70667d = getType();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f322083d = a17;
        if (!z17) {
            a17.setRsaInfo(new o45.pi("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125));
            this.f322083d.f70714e = 1;
        }
        int dispatch = dispatch(sVar, this.f322083d, this);
        if (dispatch < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCliReportKV", "mark all failed. do scene %d", java.lang.Integer.valueOf(dispatch));
            try {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnReportResp(3, -1, null, i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", java.lang.Integer.valueOf(hashCode()), com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        boolean z17 = this.f322084e;
        int i17 = this.f322087h;
        return !z17 ? 1 == i17 ? 997 : 987 : 1 == i17 ? 996 : 986;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (!com.tencent.mm.sdk.platformtools.x2.p() && (gm0.j1.n() == null || gm0.j1.n().f273288b == null || gm0.j1.n().f273288b.f70764d == null)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.NetSceneCliReportKV", "null == MMCore.getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f322085f.onSceneEnd(i18, i19, str, this);
            return;
        }
        int i27 = this.f322087h;
        if (i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy err, errType:" + i18 + ", errCode:" + i19);
            ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnReportResp(i18, i19, null, i27);
            this.f322085f.onSceneEnd(i18, i19, str, this);
            H(i18, i19, str, this);
            return;
        }
        r45.v30 v30Var = (r45.v30) this.f322083d.f70711b.f70700a;
        this.f322088i.c(v30Var.f387846q, i27);
        try {
        } catch (java.lang.Exception e17) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", valueOf, com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        if (i27 != 1) {
            if (i27 == 2) {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnReportResp(0, 0, com.tencent.mars.smc.SmcProtoBufUtil.toSmcReportIdkeyResp(v30Var).toByteArray(), i27);
            }
            this.f322085f.onSceneEnd(i18, i19, str, this);
            H(i18, i19, str, this);
        }
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).OnReportResp(0, 0, com.tencent.mars.smc.SmcProtoBufUtil.toSmcReportKvResp(v30Var).toByteArray(), i27);
        this.f322085f.onSceneEnd(i18, i19, str, this);
        H(i18, i19, str, this);
    }
}

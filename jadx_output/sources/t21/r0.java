package t21;

/* loaded from: classes12.dex */
public class r0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f414903d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f414904e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f414905f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f414906g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f414907h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f414908i;

    /* renamed from: n, reason: collision with root package name */
    public dn.o f414910n;

    /* renamed from: m, reason: collision with root package name */
    public t21.v2 f414909m = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f414911o = "";

    /* renamed from: p, reason: collision with root package name */
    public long f414912p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f414913q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f414914r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f414915s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f414916t = true;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f414917u = null;

    /* renamed from: v, reason: collision with root package name */
    public int f414918v = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f414919w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f414920x = new t21.o0(this);

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f414921y = new com.tencent.mm.sdk.platformtools.b4(new t21.q0(this), false);

    public r0(java.lang.String str, boolean z17) {
        iz5.a.g(null, str != null);
        this.f414905f = str;
        this.f414907h = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "%s NetSceneDownloadVideo:  file [%s] isCompleteOnlineVideo [%b]", J(), str, java.lang.Boolean.valueOf(z17));
    }

    public final void H(int i17) {
        boolean z17;
        t21.v2 h17;
        com.tencent.mm.storage.f9 o27;
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f22571s;
        java.lang.String str = this.f414905f;
        java.lang.String wi6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wi(((k90.b) u0Var).rj(null, f0Var, str, false));
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, f0Var, str, true);
        if (this.f414916t) {
            z17 = vf0.c.fj(wi6, rj6);
        } else {
            com.tencent.mm.vfs.w6.h(wi6);
            z17 = true;
        }
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1) && (h17 = t21.d3.h(str)) != null && (o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(h17.h(), h17.f415004c)) != null) {
            java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(o27, f0Var, h17.d(), false);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(o27, h17.d(), false);
            if (com.tencent.mm.vfs.w6.j(rj7)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "check c2c video recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj7, o27.getType(), com.tencent.mm.vfs.w6.p(rj7), null).f477691a);
            }
            if (com.tencent.mm.vfs.w6.j(tj6)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "check c2c video thumb recv dup, ret = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, o27.getType(), com.tencent.mm.vfs.w6.p(tj6), null).f477691a);
            }
        }
        gm0.j1.e().j(new t21.p0(this, z17, i17));
    }

    public final boolean I() {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f414906g)) {
            z17 = false;
        } else {
            if (this.f414907h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "%s cancel online video task.", J());
                t21.o2.Di().g(this.f414906g, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "%s cancel offline video task.", J());
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(this.f414906g);
            }
            z17 = true;
        }
        this.f414915s = true;
        return z17;
    }

    public final java.lang.String J() {
        return this.f414905f + "_" + hashCode();
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        I();
        super.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x060b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x060d  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r35, com.tencent.mm.modelbase.u0 r36) {
        /*
            Method dump skipped, instructions count: 2011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r0.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 150;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04c5  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r24, int r25, int r26, java.lang.String r27, com.tencent.mm.network.v0 r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 2500;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 210L, 1L, false);
        }
        return securityLimitCountReach;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        int i17;
        int i18;
        r45.tf0 tf0Var = (r45.tf0) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        if (tf0Var.f386371i > 0 && (i17 = tf0Var.f386368f) >= 0 && (i18 = tf0Var.f386367e) > 0 && i18 > i17) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ERR: SECURITY CHECK FAILED [");
        java.lang.String str = this.f414905f;
        sb6.append(str);
        sb6.append(",");
        sb6.append(this.f414909m.f415004c);
        sb6.append(",");
        sb6.append(this.f414909m.e());
        sb6.append(",");
        sb6.append(this.f414909m.h());
        sb6.append("] ");
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVideo", sb6.toString());
        t21.d3.G(str);
        return com.tencent.mm.modelbase.o1.EFailed;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 211L, 1L, false);
        t21.d3.G(this.f414905f);
    }
}

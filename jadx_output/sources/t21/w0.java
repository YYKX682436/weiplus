package t21;

/* loaded from: classes12.dex */
public class w0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f415031d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f415032e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f415033f;

    /* renamed from: h, reason: collision with root package name */
    public final int f415035h;

    /* renamed from: n, reason: collision with root package name */
    public t21.v2 f415038n;

    /* renamed from: p, reason: collision with root package name */
    public final fp.j f415040p;

    /* renamed from: t, reason: collision with root package name */
    public final int f415044t;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f415034g = "";

    /* renamed from: i, reason: collision with root package name */
    public int f415036i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f415037m = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f415039o = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f415041q = true;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f415042r = "";

    /* renamed from: s, reason: collision with root package name */
    public long f415043s = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f415045u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f415046v = false;

    /* renamed from: w, reason: collision with root package name */
    public int f415047w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final z25.e f415048x = new t21.c1(this);

    /* renamed from: y, reason: collision with root package name */
    public final dn.k f415049y = new t21.h1(this);

    /* renamed from: z, reason: collision with root package name */
    public final z25.e f415050z = new t21.l1(this);
    public final dn.k A = new t21.o1(this);
    public final com.tencent.mm.sdk.platformtools.b4 B = new com.tencent.mm.sdk.platformtools.b4(new t21.p1(this), true);

    public w0(java.lang.String str) {
        this.f415040p = null;
        this.f415044t = 4;
        iz5.a.g(null, str != null);
        this.f415033f = str;
        t21.v2 h17 = t21.d3.h(str);
        this.f415038n = h17;
        if (h17 != null) {
            this.f415035h = 2500;
        } else {
            this.f415035h = 0;
        }
        this.f415040p = new fp.j();
        t21.v2 v2Var = this.f415038n;
        if (v2Var != null && 3 == v2Var.f415026x) {
            this.f415044t = 6;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s NetSceneUploadVideo:  videoType:[%d]", N(), java.lang.Integer.valueOf(this.f415044t));
    }

    public static void H(final t21.w0 w0Var, final dn.h hVar) {
        final t21.v2 v2Var = w0Var.f415038n;
        if (v2Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, video info is null !");
            return;
        }
        if (hVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, cdn result is null !");
            return;
        }
        final y15.d dVar = new y15.d();
        dVar.fromXml(v2Var.g());
        y15.c n17 = dVar.n();
        if (com.tencent.mm.sdk.platformtools.t8.K0(n17.getString(n17.f458922d + 0)) && !hVar.b()) {
            y15.c n18 = dVar.n();
            n18.set(n18.f458922d + 0, hVar.field_aesKey);
            y15.c n19 = dVar.n();
            n19.set(n19.f458922d + 2, hVar.field_aesKey);
            y15.c n27 = dVar.n();
            n27.set(n27.f458922d + 1, hVar.field_fileId);
            y15.c n28 = dVar.n();
            n28.set(n28.f458922d + 3, hVar.field_fileId);
            v2Var.f415025w = dVar.toXml();
            v2Var.U = 2097152;
            t21.d3.Q(v2Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "do check before md5 check, aeskey = " + hVar.field_aesKey);
        }
        if (!hVar.b() || !com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_aesKey)) {
            w0Var.L(v2Var, hVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "onlyDoUpload, upload by cdn hit md5, do md5 check");
        ((at3.b) ((xy.f) i95.n0.c(xy.f.class))).wi(hVar.field_fileId, hVar.field_filemd5, hVar.field_mp4identifymd5, hVar.field_filecrc, new xy.e() { // from class: t21.w0$$a
            @Override // xy.e
            public final void a(java.lang.String str, int i17, int i18) {
                t21.w0 w0Var2 = t21.w0.this;
                w0Var2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "on Md5 check, aeskey = %s, errType = %d, errCode = %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                if (i17 != 0 || i18 != 0) {
                    w0Var2.f415031d.onSceneEnd(4, 102, "", w0Var2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "on Md5 chech failed, do reUpload");
                    return;
                }
                y15.d dVar2 = dVar;
                y15.c n29 = dVar2.n();
                n29.set(n29.f458922d + 0, str);
                y15.c n37 = dVar2.n();
                n37.set(n37.f458922d + 2, str);
                java.lang.String xml = dVar2.toXml();
                t21.v2 v2Var2 = v2Var;
                v2Var2.f415025w = xml;
                v2Var2.U = 2097152;
                t21.d3.Q(v2Var2);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "on Md5 check, recv xml = %s", v2Var2.g());
                w0Var2.L(v2Var2, hVar);
            }
        });
    }

    public final int I() {
        int i17;
        int i18 = 0;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, this.f415038n.d(), false);
        if (!d61.c.a(rj6)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideo", "%s check preload length but it not mp4.", N());
            return 0;
        }
        d61.b bVar = new d61.b();
        long a17 = bVar.a(rj6);
        long j17 = bVar.f226711a;
        if (a17 < 131072 && a17 > 0 && (i17 = this.f415038n.f415015m) > 5) {
            long j18 = bVar.f226712b;
            if (j18 > 0 && j17 > 0 && (i18 = ((int) j17) + ((int) ((j18 * 5) / i17))) <= 131072) {
                i18 += 131072;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s check preload length[%d] moovPos[%d %d] duration[%d] filelen[%d]", N(), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(a17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f415038n.f415015m), java.lang.Long.valueOf(bVar.f226712b));
        return i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J() {
        /*
            Method dump skipped, instructions count: 1505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.J():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String K(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.K(java.lang.String):java.lang.String");
    }

    public final void L(t21.v2 v2Var, dn.h hVar) {
        zz.b hj6;
        v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415011i = 199;
        v2Var.U = 2098436;
        t21.d3.Q(v2Var);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f415038n.h(), this.f415038n.f415016n);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1;
        this.f415031d.onSceneEnd(0, 0, "", this);
        M(hVar);
        if (z17 && hVar != null) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            bm5.f0 f0Var = bm5.f0.f22571s;
            java.lang.String str = this.f415033f;
            java.lang.String rj6 = ((k90.b) u0Var).rj(Li, f0Var, str, false);
            java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, str, false);
            if (com.tencent.mm.vfs.w6.j(rj6)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(v2Var.f())) {
                    java.lang.String p17 = com.tencent.mm.vfs.w6.p(tj6);
                    hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, Li.getType(), hVar.field_filemd5, null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "check video thumb dup, fileName = " + str + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, Li.getType(), p17, null).f477691a);
                } else {
                    hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(this.f415038n.f(), rj6, tj6, Li.getType(), this.f415038n.f415015m, com.tencent.mm.vfs.w6.p(this.f415038n.f()));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "check video dup, fileName = " + str + " result = " + hj6.f477691a);
            }
        }
    }

    public final void M(dn.h hVar) {
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f415038n.h(), this.f415038n.f415016n);
        t21.i2.wi().Ri(hVar, new wf0.l1(this.f415033f, bm5.f0.f22571s), !com.tencent.mm.sdk.platformtools.t8.K0(this.f415038n.M) ? this.f415038n.M : c01.ia.v(Li.G), Li.I0());
    }

    public final java.lang.String N() {
        return this.f415033f + "_" + hashCode();
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideo", "%s stop %s", N(), this.f415042r);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f415042r)) {
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f415042r);
        }
        this.f415037m = true;
        super.cancel();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(5:178|179|180|181|182)|(2:184|(6:186|187|188|(1:14)|15|(1:17)(4:19|(1:21)(3:155|(1:157)(1:177)|(1:159)(6:160|(2:162|(4:167|(3:169|(1:171)(1:174)|(1:173))|175|(1:24)(29:25|(1:27)(2:147|(2:149|150)(2:151|(2:153|154)))|28|(1:30)|31|(1:33)|34|(1:36)|37|(1:39)(1:146)|40|(1:42)(2:135|(4:138|139|140|141)(1:137))|43|(1:45)|46|(1:48)|49|(1:(1:134))(11:53|(1:55)|56|(1:58)|59|(1:61)|62|(1:64)|65|(1:67)|68)|69|(1:71)|(5:73|(1:75)|76|(1:78)|79)|80|(1:82)(2:126|(1:128))|83|(4:85|(1:87)|88|(1:92))|93|(2:95|(2:109|110)(4:99|(1:101)|102|(2:104|105)(1:106)))(2:111|(2:124|125)(2:115|(2:117|118)(2:119|(2:121|122)(1:123))))|107|108))(1:166))|176|(0)|175|(0)(0)))|22|(0)(0))))|192|193) */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x008e, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ee  */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.InputStream] */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r22, com.tencent.mm.modelbase.u0 r23) {
        /*
            Method dump skipped, instructions count: 1755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getDispatchInterceptRet(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        t21.v2 v2Var = this.f415038n;
        return w11.c1.a(new com.tencent.mm.plugin.msg.MsgIdTalker(v2Var.f415016n, v2Var.f415020r), this) ? org.chromium.net.NetError.ERR_SSL_BAD_RECORD_MAC_ALERT : super.getDispatchInterceptRet(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public long getReturnTimeout() {
        return 1800000L;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f7  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r27, int r28, int r29, java.lang.String r30, com.tencent.mm.network.v0 r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.w0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return this.f415035h;
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
        int i19;
        int i27;
        r45.xu6 xu6Var = (r45.xu6) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xu6Var.f390437d) && xu6Var.f390451r > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(xu6Var.f390438e) && !com.tencent.mm.sdk.platformtools.t8.K0(xu6Var.f390439f) && xu6Var.f390450q > 0 && (i17 = xu6Var.f390441h) <= (i18 = xu6Var.f390440g) && i17 >= 0 && (i19 = xu6Var.f390445n) <= (i27 = xu6Var.f390444m) && i19 >= 0 && ((i19 != i27 || i17 != i18) && i18 > 0 && i27 > 0 && (xu6Var.f390446o.f371839d > 0 || xu6Var.f390442i.f371839d > 0))) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideo", "ERR: Security Check Failed file:" + this.f415033f + " user:" + xu6Var.f390439f);
        return com.tencent.mm.modelbase.o1.EFailed;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 221L, 1L, false);
        t21.d3.G(this.f415033f);
    }
}

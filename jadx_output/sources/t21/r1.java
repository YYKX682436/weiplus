package t21;

/* loaded from: classes12.dex */
public class r1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f414922d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f414923e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f414924f;

    /* renamed from: g, reason: collision with root package name */
    public final int f414925g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f414926h;

    /* renamed from: i, reason: collision with root package name */
    public dn.h f414927i;

    /* renamed from: m, reason: collision with root package name */
    public final m11.a0 f414928m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f414929n;

    /* renamed from: o, reason: collision with root package name */
    public t21.v2 f414930o;

    /* renamed from: p, reason: collision with root package name */
    public int f414931p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f414932q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f414933r;

    /* renamed from: s, reason: collision with root package name */
    public t21.v2 f414934s;

    /* renamed from: t, reason: collision with root package name */
    public dn.h f414935t;

    /* renamed from: u, reason: collision with root package name */
    public final dn.k f414936u = new t21.t1(this);

    public r1(java.lang.String str, int i17, dn.h hVar, m11.a0 a0Var, boolean z17) {
        this.f414924f = null;
        this.f414925g = 0;
        this.f414927i = null;
        this.f414928m = null;
        iz5.a.g(null, str != null);
        iz5.a.g(null, a0Var != null);
        this.f414924f = str;
        this.f414927i = hVar;
        this.f414928m = a0Var;
        this.f414925g = i17;
        this.f414932q = z17;
    }

    public static void H(t21.r1 r1Var) {
        if (r1Var.f414934s == null) {
            return;
        }
        t21.v2 v2Var = r1Var.f414930o;
        java.lang.String b17 = com.tencent.mm.modelcdntran.i2.b("upvideo", v2Var.f415012j, v2Var.h(), r1Var.f414930o.S);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra genClientId failed not use cdn file:%s", r1Var.L(), r1Var.f414930o.d());
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(r1Var.f414930o.h(), r1Var.f414930o.f415016n);
        java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, false);
        r1Var.f414929n = b17;
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_NetSceneUploadVideo_1";
        mVar.f241787f = r1Var.f414936u;
        mVar.field_mediaId = b17;
        mVar.field_fullpath = Ai;
        mVar.field_appType = 11;
        mVar.field_fileType = 4;
        mVar.field_talker = r1Var.f414930o.h();
        mVar.N = "HDVideo:1";
        mVar.field_enable_hitcheck = !com.tencent.mm.storage.z3.K3(r1Var.f414930o.h()) && r1Var.f414932q;
        if (com.tencent.mm.storage.z3.K3(r1Var.f414930o.h())) {
            mVar.field_sendmsg_viacdn = false;
        } else if (com.tencent.mm.pluginsdk.model.e4.b(Ai)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(106L, 30L, 1L, false);
        }
        mVar.field_largesvideo = 1;
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.msgsend.RepairerConfigMsgOriginVideoThumb()) == 1) {
            java.lang.String I = r1Var.I(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, r1Var.f414930o.d(), false));
            mVar.field_thumbpath = I;
            int k17 = (int) com.tencent.mm.vfs.w6.k(I);
            r1Var.f414931p = k17;
            if (k17 >= 5242880) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", r1Var.L(), mVar.field_thumbpath, java.lang.Integer.valueOf(r1Var.f414931p));
                return;
            }
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(r1Var.f414930o.g(), "msg", null);
        if (d17 != null) {
            mVar.field_fileId = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideourl");
            mVar.field_aesKey = (java.lang.String) d17.get(".msg.videomsg.$cdnrawvideoaeskey");
            if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_fileId) || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_aesKey)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra parse video recv xml failed", r1Var.L());
                try {
                    java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseVideoHash");
                    if (d18 == null) {
                        d18 = "";
                    }
                    java.lang.String[] split = d18.split(",");
                    gm0.j1.i();
                    int b18 = kk.m.b(gm0.j1.b().h(), 100);
                    boolean z17 = split != null && split.length >= 1 && com.tencent.mm.sdk.platformtools.t8.P(split[0], 0) >= b18;
                    boolean z18 = split != null && split.length >= 2 && com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) >= b18;
                    if (split != null && split.length >= 3) {
                        com.tencent.mm.sdk.platformtools.t8.P(split[2], 0);
                    }
                    if (z65.c.a()) {
                        z18 = true;
                        z17 = true;
                    }
                    java.lang.String[] i17 = z17 ? t21.o2.Ui().i(Ai, com.tencent.mm.sdk.platformtools.t8.P(split[2], 0)) : null;
                    if (z18 && i17 != null && i17.length == 2) {
                        if (!com.tencent.mm.sdk.platformtools.t8.D0(i17[0], "null")) {
                            mVar.field_fileId = i17[0];
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.D0(i17[1], "null")) {
                            mVar.field_aesKey = i17[1];
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "Check use videohash :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra parse video recv xml failed", r1Var.L());
            try {
                java.lang.String d19 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("UseVideoHash");
                if (d19 == null) {
                    d19 = "";
                }
                java.lang.String[] split2 = d19.split(",");
                gm0.j1.i();
                int b19 = kk.m.b(gm0.j1.b().h(), 100);
                boolean z19 = split2 != null && split2.length >= 1 && com.tencent.mm.sdk.platformtools.t8.P(split2[0], 0) >= b19;
                boolean z27 = split2 != null && split2.length >= 2 && com.tencent.mm.sdk.platformtools.t8.P(split2[1], 0) >= b19;
                if (split2 != null && split2.length >= 3) {
                    com.tencent.mm.sdk.platformtools.t8.P(split2[2], 0);
                }
                if (z65.c.a()) {
                    z27 = true;
                    z19 = true;
                }
                java.lang.String[] i18 = z19 ? t21.o2.Ui().i(Ai, com.tencent.mm.sdk.platformtools.t8.P(split2[2], 0)) : null;
                if (z27 && i18 != null && i18.length == 2) {
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(i18[0], "null")) {
                        mVar.field_fileId = i18[0];
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(i18[1], "null")) {
                        mVar.field_aesKey = i18[1];
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "Check use videohash :%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_aesKey)) {
            mVar.field_aesKey = "";
            mVar.field_fileId = "";
            mVar.field_aesKey = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi();
            mVar.field_enable_hitcheck = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s summersafecdn check hit cache VideoHash origin video :%s %s %s %b %d", r1Var.L(), mVar.field_mediaId, mVar.field_fileId, mVar.field_aesKey, java.lang.Boolean.valueOf(r1Var.f414932q), java.lang.Integer.valueOf(mVar.field_largesvideo));
        if (((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).isH265VideoVFS(Ai)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "origin video upload h265, set file format to x265");
            mVar.field_fileFormat = 2;
        } else {
            mVar.field_fileFormat = 1;
        }
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 226L, 1L, false);
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra addSendTask failed.", r1Var.L());
            r1Var.f414929n = "";
        } else {
            f65.y0 y0Var = f65.y0.f260019a;
            java.lang.String str = r1Var.f414924f;
            if (str == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).b(new f65.h0(str), "MicroMsg.VideoSendReporter");
        }
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
    public final java.lang.String I(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r1.I(java.lang.String):java.lang.String");
    }

    public final void J(t21.v2 v2Var, dn.h hVar, dn.h hVar2) {
        zz.b hj6;
        t21.v2 h17;
        v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415011i = 199;
        v2Var.U = 2098436;
        t21.d3.Q(v2Var);
        java.lang.String str = v2Var.S;
        if (t21.d3.s() && hVar2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str) && (h17 = t21.d3.h(str)) != null) {
            h17.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
            h17.f415011i = 199;
            h17.U = cc1.y.CTRL_INDEX;
            t21.d3.Q(h17);
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f414930o.h(), this.f414930o.f415016n);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1;
        this.f414922d.onSceneEnd(0, 0, "", this);
        if (!t21.d3.t() || this.f414926h == null) {
            this.f414928m.a(0, 0, 0L, "");
        }
        dn.h hVar3 = this.f414935t;
        if (hVar3 != null) {
            K(hVar3);
        } else {
            K(hVar);
        }
        if (z17) {
            java.lang.String str2 = this.f414924f;
            if (hVar != null) {
                java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22571s, str2, false);
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, str2, false);
                if (com.tencent.mm.vfs.w6.j(rj6)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(v2Var.f())) {
                        java.lang.String p17 = com.tencent.mm.vfs.w6.p(tj6);
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, Li.getType(), hVar.field_filemd5, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "check video thumb dup, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, Li.getType(), p17, null).f477691a);
                    } else {
                        hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(this.f414930o.f(), rj6, tj6, Li.getType(), this.f414930o.f415015m, com.tencent.mm.vfs.w6.p(this.f414930o.f()));
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "check video dup, fileName = " + str2 + " result = " + hj6.f477691a);
                }
            }
            if (hVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                return;
            }
            java.lang.String Ai = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(Li, false);
            if (com.tencent.mm.vfs.w6.j(Ai)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "check video dup origin, fileName = " + str2 + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(Ai, Li.getType(), hVar2.field_filemd5, null).f477691a);
            }
        }
    }

    public final void K(dn.h hVar) {
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f414930o.h(), this.f414930o.f415016n);
        t21.i2.wi().Ri(hVar, new wf0.l1(this.f414924f, bm5.f0.f22571s), !com.tencent.mm.sdk.platformtools.t8.K0(this.f414930o.M) ? this.f414930o.M : c01.ia.v(Li.G), Li.I0());
    }

    public final java.lang.String L() {
        return this.f414924f + "_" + hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0406 A[Catch: Exception -> 0x043b, TryCatch #0 {Exception -> 0x043b, blocks: (B:104:0x0397, B:107:0x03ae, B:109:0x03c7, B:111:0x03cb, B:115:0x03d9, B:117:0x03df, B:121:0x03f0, B:123:0x03f4, B:124:0x03fb, B:128:0x0406, B:131:0x041c, B:133:0x0420, B:135:0x0429, B:136:0x042d, B:138:0x0436), top: B:103:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0429 A[Catch: Exception -> 0x043b, TryCatch #0 {Exception -> 0x043b, blocks: (B:104:0x0397, B:107:0x03ae, B:109:0x03c7, B:111:0x03cb, B:115:0x03d9, B:117:0x03df, B:121:0x03f0, B:123:0x03f4, B:124:0x03fb, B:128:0x0406, B:131:0x041c, B:133:0x0420, B:135:0x0429, B:136:0x042d, B:138:0x0436), top: B:103:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0436 A[Catch: Exception -> 0x043b, TRY_LEAVE, TryCatch #0 {Exception -> 0x043b, blocks: (B:104:0x0397, B:107:0x03ae, B:109:0x03c7, B:111:0x03cb, B:115:0x03d9, B:117:0x03df, B:121:0x03f0, B:123:0x03f4, B:124:0x03fb, B:128:0x0406, B:131:0x041c, B:133:0x0420, B:135:0x0429, B:136:0x042d, B:138:0x0436), top: B:103:0x0397 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(int r33, int r34, java.lang.String r35, r45.c06 r36, com.tencent.mm.modelbase.m1 r37) {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r1.M(int, int, java.lang.String, r45.c06, com.tencent.mm.modelbase.m1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    @Override // com.tencent.mm.modelbase.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int doScene(com.tencent.mm.network.s r21, com.tencent.mm.modelbase.u0 r22) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.r1.doScene(com.tencent.mm.network.s, com.tencent.mm.modelbase.u0):int");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getDispatchInterceptRet(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        t21.v2 v2Var = this.f414930o;
        return w11.c1.a(new com.tencent.mm.plugin.msg.MsgIdTalker(v2Var.f415016n, v2Var.f415020r), this) ? org.chromium.net.NetError.ERR_SSL_BAD_RECORD_MAC_ALERT : super.getDispatchInterceptRet(sVar, v0Var, l0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6828;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVideoOrigin", "%s cdntra onGYNetEnd errtype[%d %d]", L(), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.c06 c06Var = (r45.c06) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        java.lang.String str2 = this.f414924f;
        t21.v2 h17 = t21.d3.h(str2);
        this.f414930o = h17;
        if (h17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd Get INFO FAILED :" + str2);
            f65.y0.f260019a.l(null, this.f414924f, 5, 0L, 0L, 0L, 0L, this.f414933r != null, -1);
            this.f414922d.onSceneEnd(i18, i19, str, this);
            this.f414928m.a(3, -1, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == 102) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "summersafecdn ERR: MM_ERR_GET_AESKEY_FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414930o.h());
            f65.y0.f260019a.l(null, this.f414924f, 4, 0L, 0L, 0L, 0L, this.f414933r != null, i19);
            this.f414922d.onSceneEnd(i18, i19, str, this);
            this.f414928m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 == -22) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd BLACK  errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414930o.h());
            f65.y0.f260019a.l(null, this.f414924f, 4, 0L, 0L, 0L, 0L, this.f414933r != null, i19);
            t21.d3.D(str2);
            this.f414922d.onSceneEnd(i18, i19, str, this);
            this.f414928m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 4 && i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd SERVER FAILED errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414930o.h());
            t21.d3.G(str2);
            f65.y0.f260019a.l(null, this.f414924f, 4, 0L, 0L, 0L, 0L, this.f414933r != null, i19);
            this.f414922d.onSceneEnd(i18, i19, str, this);
            this.f414928m.a(i18, i19, 0L, "");
            return;
        }
        if (i18 == 0 && i19 == 0) {
            M(i18, i19, str, c06Var, this);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVideoOrigin", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i18 + " errCode:" + i19 + "  file:" + str2 + " user:" + this.f414930o.h());
        t21.d3.G(str2);
        f65.y0.f260019a.l(null, this.f414924f, 4, 0L, 0L, 0L, 0L, this.f414933r != null, i19);
        this.f414922d.onSceneEnd(i18, i19, str, this);
        this.f414928m.a(i18, i19, 0L, "");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        t21.d3.G(this.f414924f);
    }
}

package m11;

/* loaded from: classes12.dex */
public class t0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, k70.b0 {
    public static final boolean E;
    public boolean A;
    public java.lang.String B;
    public int C;
    public final com.tencent.mm.modelcdntran.q0 D;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f322777d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.v0 f322778e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f322779f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f322780g;

    /* renamed from: h, reason: collision with root package name */
    public final long f322781h;

    /* renamed from: i, reason: collision with root package name */
    public final long f322782i;

    /* renamed from: m, reason: collision with root package name */
    public final long f322783m;

    /* renamed from: n, reason: collision with root package name */
    public int f322784n;

    /* renamed from: o, reason: collision with root package name */
    public final int f322785o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.modelstat.q f322786p;

    /* renamed from: q, reason: collision with root package name */
    public final long f322787q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f322788r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f322789s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f322790t;

    /* renamed from: u, reason: collision with root package name */
    public long f322791u;

    /* renamed from: v, reason: collision with root package name */
    public int f322792v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f322793w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f322794x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f322795y;

    /* renamed from: z, reason: collision with root package name */
    public int f322796z;

    static {
        boolean z17 = false;
        if ("1".equals(j62.e.g().a("clicfg_c2c_wxam_recv", "0", false, true)) || z65.c.a()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (z17) {
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("recvC2CImageUseWxam", true);
        }
        com.tencent.mars.xlog.Log.i("NetSceneGetMsgImg", "recvC2CImageUseWxam, use = " + z17);
        E = z17;
    }

    public t0(long j17, long j18, java.lang.String str, int i17, com.tencent.mm.modelbase.v0 v0Var) {
        this(j17, j18, str, i17, v0Var, -1);
    }

    public final boolean H(m11.b0 b0Var, java.lang.String str, long j17) {
        java.lang.String str2;
        java.lang.String str3;
        dn.m mVar;
        g83.c cVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(b0Var.f322652t)) {
            return false;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(b0Var.f322652t, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e(this.f322777d, "parse cdnInfo failed. [%s]", b0Var.f322652t);
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f322777d, "img cdn info %s", b0Var.f322652t);
        j15.d dVar = new j15.d();
        dVar.fromXml(b0Var.f322652t);
        this.f322796z = 0;
        if (this.f322785o != 1) {
            str2 = (java.lang.String) d17.get(".msg.img.$cdnmidimgurl");
            this.f322796z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$length"), 0);
        } else {
            str2 = (java.lang.String) d17.get(".msg.img.$cdnbigimgurl");
            this.f322796z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$hdlength"), 0);
        }
        java.lang.String str4 = str2;
        if (this.f322785o != 1) {
            str3 = (java.lang.String) d17.get(".msg.img.$tpurl");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                this.f322796z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$tplength"), 0);
            }
        } else {
            str3 = (java.lang.String) d17.get(".msg.img.$tphdurl");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                this.f322796z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$tphdlength"), 0);
            }
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.img.$hevc_mid_size"), 0);
        if (this.f322796z <= 1 && P >= 0) {
            this.f322796z = P;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(this.f322789s.I0()));
        if (com.tencent.mm.sdk.platformtools.t8.K0(dVar.o().j()) && com.tencent.mm.sdk.platformtools.t8.K0(dVar.o().A())) {
            hashMap.put("source_format", java.lang.String.valueOf(2));
        } else {
            hashMap.put("source_format", java.lang.String.valueOf(1));
            if (dVar.o().r() == 0) {
                hashMap.put("source_filesize", java.lang.String.valueOf(dVar.o().r()));
            } else {
                hashMap.put("source_filesize", java.lang.String.valueOf(dVar.o().z()));
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4) && com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e(this.f322777d, "cdntra get cdnUrlfailed.");
            return false;
        }
        java.lang.String str5 = (java.lang.String) d17.get(".msg.img.$aeskey");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            com.tencent.mars.xlog.Log.e(this.f322777d, "cdntra get aes key failed.");
            return false;
        }
        this.f322790t = com.tencent.mm.modelcdntran.i2.b("downimg", b0Var.f322646n, this.f322789s.Q0(), "" + this.f322789s.getMsgId());
        boolean z17 = this.f322793w && ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Ni();
        if (z17) {
            this.f322790t += "_hevc";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f322790t)) {
            com.tencent.mars.xlog.Log.w(this.f322777d, "cdntra genClientId failed not use cdn imgLocalId:%d", java.lang.Long.valueOf(this.f322783m));
            return false;
        }
        java.lang.String str6 = (java.lang.String) d17.get(".msg.img.$md5");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.K0(str6) && (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d17.get(".msg.img.$cdnbigimgurl")) || this.f322785o == 1)) {
            synchronized (g83.c.class) {
                if (g83.c.f269545a == null) {
                    g83.c.f269545a = new g83.c();
                }
                cVar = g83.c.f269545a;
            }
            cVar.getClass();
            gm0.j1.b().c();
            java.lang.String g17 = ((lf3.q) ((nf3.e) i95.n0.c(nf3.e.class))).wi().g(str6, this.f322796z);
            int k17 = (int) com.tencent.mm.vfs.w6.k(g17);
            int i17 = this.f322796z;
            int i18 = i17 - k17;
            java.lang.String str7 = this.f322777d;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = str6;
            objArr[2] = d17.get(".msg.img.$cdnbigimgurl");
            objArr[3] = java.lang.Boolean.valueOf(this.f322785o == 1);
            objArr[4] = java.lang.Integer.valueOf(k17);
            objArr[5] = g17;
            objArr[6] = java.lang.Integer.valueOf(i18);
            objArr[7] = this.f322795y;
            com.tencent.mars.xlog.Log.i(str7, "MediaCheckDuplicationStorage: totallen:%s md5:%s big:%s NOcompress:%s  dup(len:%d path:%s) diffLen:%d to:%s", objArr);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(g17) && i18 >= 0 && i18 <= 16) {
                com.tencent.mars.xlog.Log.i(this.f322777d, "MediaCheckDuplicationStorage copy dup file now :%s -> %s [%b]", g17, this.f322795y, java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.D0(g17, this.f322795y) && com.tencent.mm.vfs.w6.d(g17, this.f322795y, false) >= 0));
                int i19 = this.f322796z;
                I(b0Var, i19, i19, 0, null);
                if (this.f322789s != null) {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(this.f322789s.Q0(), "update", this.f322789s, 0));
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13267, str4, java.lang.Long.valueOf(this.f322789s.I0()), str6, java.lang.Long.valueOf(this.f322789s.getCreateTime() / 1000), this.f322789s.Q0(), 3, java.lang.Integer.valueOf(k17));
                return true;
            }
        }
        this.B = str6;
        com.tencent.mars.xlog.Log.i(this.f322777d, "checkUseCdn: %s, %s", java.lang.Boolean.valueOf(this.f322793w), java.lang.Boolean.valueOf(z17));
        dn.m mVar2 = new dn.m();
        if (z17) {
            mVar2.f241785d = "task_NetSceneGetMsgImg_1";
            mVar2.field_mediaId = this.f322790t;
            mVar2.field_supportFormats = new int[]{1, 2};
        } else {
            mVar2.f241785d = "task_NetSceneGetMsgImg_2";
            mVar2.field_mediaId = this.f322790t;
            mVar2.field_supportFormats = new int[]{1};
        }
        mVar2.field_fullpath = this.f322795y;
        int i27 = this.f322792v;
        mVar2.field_fileType = i27;
        mVar2.field_totalLen = this.f322796z;
        if (i27 == 2) {
            mVar2.field_wxamTotalLen = P;
        }
        mVar2.field_aesKey = str5;
        mVar2.field_fileId = str4;
        mVar2.field_priority = 2;
        mVar2.field_chattype = com.tencent.mm.storage.z3.R4(this.f322789s.Q0()) ? 1 : 0;
        mVar2.f241790i = this.C;
        mVar2.field_filemd5 = str6;
        mVar2.j(this.f322777d, hashMap);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            java.lang.String str8 = (java.lang.String) d17.get(".msg.img.$tpauthkey");
            mVar2.field_fileType = 19;
            mVar2.field_authKey = str8;
            mVar2.f241811z = str3;
            mVar2.field_fileId = "";
        }
        com.tencent.mars.xlog.Log.i(this.f322777d, "cdnautostart %s %b", "image_" + this.f322789s.getMsgId(), java.lang.Boolean.valueOf(com.tencent.mm.modelcdntran.s1.fj().f70997u.contains("image_" + this.f322789s.getMsgId())));
        if (com.tencent.mm.modelcdntran.s1.fj().f70997u.contains("image_" + this.f322789s.getMsgId())) {
            com.tencent.mm.modelcdntran.s1.fj().f70997u.remove("image_" + this.f322789s.getMsgId());
            mVar2.field_autostart = true;
        } else if (mVar2.f241790i != 0) {
            mVar2.field_autostart = true;
        } else {
            mVar2.field_autostart = false;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.D);
        com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "startCdnDownload taskInfo field_mediaId:" + mVar2.field_mediaId);
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        kotlinx.coroutines.flow.n2 d76 = aj6 != null ? aj6.d7(mVar2) : null;
        if (d76 != null) {
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
            if (lifecycleScope != null) {
                v65.i.b(lifecycleScope, null, new com.tencent.mm.modelcdntran.d0(d76, weakReference, null), 1, null);
            }
            mVar = mVar2;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            com.tencent.mars.xlog.Log.i(this.f322777d, "add recv task");
            return true;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 196L, 1L, false);
        com.tencent.mars.xlog.Log.e(this.f322777d, "addRecvTask failed :%s", this.f322790t);
        this.f322790t = "";
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(final m11.b0 r25, int r26, int r27, int r28, byte[] r29) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.t0.I(m11.b0, int, int, int, byte[]):boolean");
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f322790t) && com.tencent.mm.modelcdntran.s1.fj() != null) {
            java.lang.String mediaId = this.f322790t;
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.D);
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            com.tencent.mars.xlog.Log.i("MicroMsg.Cdn.CdnFSCJavaHelper", "cancelDownloadTask taskInfo field_mediaId:".concat(mediaId));
            com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
            kotlinx.coroutines.flow.n2 U6 = aj6 != null ? aj6.U6(mediaId) : null;
            if (U6 != null && (lifecycleScope = gm0.j1.b().f273245h.f273145e) != null) {
                v65.i.b(lifecycleScope, null, new com.tencent.mm.modelcdntran.b0(U6, weakReference, null), 1, null);
            }
        }
        super.cancel();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f322779f = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f322780g;
        r45.fj3 fj3Var = (r45.fj3) oVar.f70710a.f70684a;
        m11.l0 Di = m11.b1.Di();
        long j17 = this.f322783m;
        m11.b0 C1 = Di.C1(java.lang.Long.valueOf(j17));
        long j18 = C1.f322633a;
        java.lang.String str = this.f322777d;
        if (j18 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 195L, 1L, false);
            com.tencent.mars.xlog.Log.e(str, "doScene id:%d  img:%s", java.lang.Long.valueOf(j17), C1);
            return -1;
        }
        if (C1.f322648p != 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(111L, 194L, 1L, false);
            com.tencent.mars.xlog.Log.e(str, "doSceneError, id:%d, status:%d", java.lang.Long.valueOf(C1.f322633a), java.lang.Integer.valueOf(C1.f322648p));
            return -1;
        }
        com.tencent.mm.storage.f9 f9Var = this.f322789s;
        if (tg3.s1.a(f9Var)) {
            com.tencent.mars.xlog.Log.e(str, "doSceneError, isUnreadMediaExpired id:%d, msgId:%s, msgSvrId:%s", java.lang.Long.valueOf(C1.f322633a), java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
            return -1;
        }
        java.lang.String str2 = C1.f322637e;
        int i17 = this.f322785o;
        if (str2 == null || !str2.startsWith("SERVERID://")) {
            this.f322794x = C1.f322637e;
            this.f322795y = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f322789s, bm5.c0.f22550a.d(C1.l()), this.f322794x, null, "");
        } else {
            if (i17 == 1) {
                this.f322794x = kk.k.g((C1.f322637e + "_hd").getBytes());
            } else {
                this.f322794x = kk.k.g(C1.f322637e.getBytes());
            }
            sx.c0 c0Var = (sx.c0) i95.n0.c(sx.c0.class);
            java.lang.String str3 = this.f322794x;
            ((rx.j) c0Var).getClass();
            com.tencent.mm.modelcdntran.b1 bj6 = com.tencent.mm.modelcdntran.s1.bj();
            this.f322795y = bj6 != null ? bj6.T6(str3) : null;
        }
        com.tencent.mars.xlog.Log.i(str, "doscene id:%d comp:%d off:%d total:%d name:%s tmp:%s full:%s", java.lang.Long.valueOf(C1.f322633a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(C1.f322635c), java.lang.Integer.valueOf(C1.f322636d), str2, this.f322794x, this.f322795y);
        if (this.f322791u == 0) {
            this.f322791u = java.lang.System.currentTimeMillis();
            this.f322792v = i17 != 1 ? 2 : 1;
        }
        if (H(C1, fj3Var.f374395e.f372756d, fj3Var.f374401n)) {
            return 0;
        }
        C1.n("");
        m11.b1.Di().F4(java.lang.Long.valueOf(j17), C1);
        fj3Var.f374398h = C1.f322635c;
        fj3Var.f374399i = this.f322784n;
        fj3Var.f374397g = C1.f322636d;
        com.tencent.mm.modelstat.q qVar = this.f322786p;
        if (qVar != null) {
            if (qVar.f71546d == 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                qVar.f71543a = java.lang.System.currentTimeMillis();
                qVar.f71547e = android.os.SystemClock.elapsedRealtime();
            }
            qVar.f71546d++;
        }
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 109;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r17, int r18, int r19, java.lang.String r20, com.tencent.mm.network.v0 r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m11.t0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return this.f322785o == 0 ? 100 : 1280;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public t0(long j17, long j18, java.lang.String str, int i17, com.tencent.mm.modelbase.v0 v0Var, int i18) {
        this.f322777d = "MicroMsg.NetSceneGetMsgImg";
        this.f322782i = -1L;
        this.f322786p = null;
        this.f322789s = null;
        this.f322790t = "";
        this.f322791u = 0L;
        this.f322792v = 0;
        this.f322793w = true;
        this.f322794x = "";
        this.f322795y = "";
        this.f322796z = 0;
        this.A = false;
        this.B = null;
        this.C = 0;
        this.D = new m11.v0(this);
        iz5.a.g(null, j17 >= 0 && j18 >= 0 && v0Var != null);
        this.f322778e = v0Var;
        this.f322785o = i17;
        this.f322781h = j17;
        this.f322782i = j17;
        this.f322783m = j17;
        this.f322787q = j18;
        this.f322788r = str;
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(j17));
        if (i17 == 1) {
            long j19 = C1.f322649q;
            this.f322783m = j19;
            C1 = m11.b1.Di().C1(java.lang.Long.valueOf(j19));
        }
        this.f322777d = "MicroMsg.NetSceneGetMsgImg[" + this.f322783m + "]";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fj3();
        lVar.f70665b = new r45.gj3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getmsgimg";
        lVar.f70667d = 109;
        lVar.f70668e = 10;
        lVar.f70669f = 1000000010;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f322780g = a17;
        r45.fj3 fj3Var = (r45.fj3) a17.f70710a.f70684a;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j18);
        this.f322789s = Li;
        fj3Var.f374398h = C1.f322635c;
        fj3Var.f374397g = C1.f322636d;
        fj3Var.f374401n = Li.I0();
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = Li.Q0();
        du5Var.f372757e = true;
        fj3Var.f374395e = du5Var;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = (java.lang.String) gm0.j1.u().c().l(2, null);
        du5Var2.f372757e = true;
        fj3Var.f374396f = du5Var2;
        fj3Var.f374400m = i17;
        int i19 = C1.f322635c;
        if (i19 == 0) {
            this.f322786p = new com.tencent.mm.modelstat.q(109, false, C1.f322636d);
        }
        this.f322784n = 8192;
        if (v0Var != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new m11.u0(this, v0Var, i19, C1.f322636d));
        }
    }
}

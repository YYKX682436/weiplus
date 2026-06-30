package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class l3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: y, reason: collision with root package name */
    public static int f164382y;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f164383d;

    /* renamed from: f, reason: collision with root package name */
    public final int f164385f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f164386g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.za6 f164387h;

    /* renamed from: i, reason: collision with root package name */
    public final int f164388i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f164389m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f164390n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f164391o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f164392p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f164393q;

    /* renamed from: r, reason: collision with root package name */
    public final long f164394r;

    /* renamed from: s, reason: collision with root package name */
    public final long f164395s;

    /* renamed from: t, reason: collision with root package name */
    public final int f164396t;

    /* renamed from: u, reason: collision with root package name */
    public final int f164397u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.k3 f164399w;

    /* renamed from: e, reason: collision with root package name */
    public int f164384e = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f164398v = 0;

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f164400x = new com.tencent.mm.plugin.sns.model.j3(this);

    public l3(int i17, java.lang.String str, boolean z17, int i18) {
        boolean z18 = false;
        this.f164386g = "";
        this.f164388i = 0;
        this.f164389m = "";
        this.f164391o = "";
        this.f164392p = false;
        this.f164393q = false;
        this.f164394r = 0L;
        this.f164395s = 0L;
        this.f164396t = 0;
        this.f164397u = 0;
        this.f164394r = java.lang.System.currentTimeMillis();
        this.f164388i = i17;
        this.f164389m = str;
        this.f164397u = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.za6();
        lVar.f70665b = new r45.ab6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsupload";
        lVar.f70667d = 207;
        lVar.f70668e = 95;
        lVar.f70669f = 1000000095;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f164383d = a17;
        r45.za6 za6Var = (r45.za6) a17.f70710a.f70684a;
        this.f164387h = za6Var;
        com.tencent.mm.plugin.sns.storage.l2 n17 = com.tencent.mm.plugin.sns.model.l4.Hj().n1(i17);
        this.f164393q = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "start snsupload netscene localId " + i17 + "  offset " + n17.d() + " path " + n17.e() + " totallen " + n17.f());
        com.tencent.mm.plugin.sns.statistics.v0.c(i17);
        if (!z17) {
            za6Var.f391872t = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "this is single upload");
        }
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
            java.lang.String path = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), n17.e()) + ca4.z0.X(n17.e());
            this.f164386g = path;
            nu3.e eVar = nu3.e.f340198a;
            kotlin.jvm.internal.o.g(path, "path");
            ((java.util.ArrayList) nu3.e.f340207j).add(path);
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReporter", "[setSnsPicWxamPath] path: ".concat(path));
            int k17 = (int) com.tencent.mm.vfs.w6.k(path);
            this.f164385f = k17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "totallen " + k17 + " isLongPic: " + ca4.z0.k0(path));
            java.lang.String str2 = mj4Var.f380572p;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = kk.k.g(("" + android.os.SystemClock.elapsedRealtime()).getBytes());
                mj4Var.f380572p = str2;
                try {
                    n17.m(mj4Var.toByteArray());
                    com.tencent.mm.plugin.sns.model.l4.Hj().Y2(n17.c(), n17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsUpload", e17, "", new java.lang.Object[0]);
                }
            }
            r45.za6 za6Var2 = this.f164387h;
            za6Var2.f391862g = this.f164385f;
            za6Var2.f391860e = n17.d();
            r45.za6 za6Var3 = this.f164387h;
            za6Var3.f391864i = str2;
            this.f164391o = str2;
            za6Var3.f391865m = mj4Var.f380563d;
            za6Var3.f391867o = mj4Var.f380571o + "";
            this.f164387h.f391866n = mj4Var.f380564e;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "request upload type " + n17.g() + " md5: " + mj4Var.f380579w + " appid " + mj4Var.f380580x + " contenttype " + mj4Var.f380581y);
            this.f164387h.f391859d = n17.g();
            r45.kq6 kq6Var = new r45.kq6();
            kq6Var.f378906d = mj4Var.f380573q;
            kq6Var.f378907e = mj4Var.f380574r;
            this.f164387h.f391870r = kq6Var;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mj4Var.f380579w)) {
                this.f164387h.f391873u = mj4Var.f380579w;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(mj4Var.f380580x)) {
                this.f164387h.f391871s = mj4Var.f380580x;
            }
            r45.za6 za6Var4 = this.f164387h;
            za6Var4.f391874v = mj4Var.f380581y;
            if (x51.o1.f452048d) {
                za6Var4.f391859d = 0;
            }
            if (this.f164395s == 0) {
                this.f164395s = java.lang.System.currentTimeMillis();
                this.f164396t = 20201;
            }
            r45.za6 za6Var5 = this.f164387h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSnsUpload", "cdntra not use cdn flag:%b", java.lang.Boolean.valueOf(((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else if (x51.o1.B == 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else {
                java.lang.String str3 = za6Var5.f391864i;
                this.f164391o = str3;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSnsUpload", "cdntra genClientId failed not use cdn");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
                    z18 = true;
                }
            }
            if (z18) {
                this.f164392p = true;
            } else {
                if (M()) {
                    return;
                }
                J();
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
        }
    }

    public static int H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHttpChunkSize", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_http_chunk_size, 8) * 1024;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHttpChunkSize", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return Ni;
    }

    public int I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return this.f164388i;
    }

    public final void J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        int i17 = this.f164388i;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1(i17);
        n17.j(0);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
            mj4Var.f380572p = "";
            n17.m(mj4Var.toByteArray());
            com.tencent.mm.plugin.sns.model.l4.Hj().Y2(i17, n17);
            com.tencent.mm.plugin.sns.model.l4.xj().A(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        }
    }

    public final void K(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mm.plugin.sns.storage.m2 Hj = com.tencent.mm.plugin.sns.model.l4.Hj();
        int i18 = this.f164388i;
        com.tencent.mm.plugin.sns.storage.l2 n17 = Hj.n1(i18);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
            mj4Var.f380570n = 1;
            mj4Var.f380575s = i17;
            n17.m(mj4Var.toByteArray());
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.model.l4.xj().A(i18);
        com.tencent.mm.plugin.sns.model.l4.Hj().Y2(i18, n17);
        if (this.f164399w != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUploadResult", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1");
            pm0.v.X(new ac4.a(false, i18));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUploadResult", "com.tencent.mm.plugin.sns.ui.comment.emoticon.upload.SnsCmtImageUploadMgr$customSnsUploadCallback$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(1:3)(1:75)|4|(1:74)(1:8)|9|(2:10|11)|(1:13)|14|(2:16|(10:18|(6:21|22|23|24|28|19)|51|52|53|54|55|(1:57)(2:61|(1:63))|58|59))|67|(1:69)|52|53|54|55|(0)(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSnsUpload", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean L(java.lang.String r25, int r26, java.lang.String r27, int r28, java.lang.String r29, java.lang.String r30, r45.rl r31) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.l3.L(java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, r45.rl):boolean");
    }

    public final boolean M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mm.plugin.sns.storage.l2 n17 = com.tencent.mm.plugin.sns.model.l4.Hj().n1(I());
        int f17 = n17.f() - n17.d();
        if (f17 > H()) {
            f17 = H();
        }
        int d17 = n17.d();
        this.f164384e = d17;
        byte[] N = com.tencent.mm.vfs.w6.N(this.f164386g, d17, f17);
        if (N == null || N.length <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return false;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        r45.za6 za6Var = this.f164387h;
        za6Var.f391863h = cu5Var;
        za6Var.f391860e = this.f164384e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancel", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        super.cancel();
        if (this.f164392p && !com.tencent.mm.sdk.platformtools.t8.K0(this.f164391o)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "cancel by cdn " + this.f164391o);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(this.f164391o);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancel", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        this.f164390n = u0Var;
        if (!this.f164392p) {
            int dispatch = dispatch(sVar, this.f164383d, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return dispatch;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        java.lang.String str = this.f164387h.f391864i;
        this.f164391o = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSnsUpload", "cdntra genClientId failed not use cdn");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        } else {
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_NetSceneSnsUpload_1";
            mVar.f241787f = this.f164400x;
            mVar.field_mediaId = this.f164391o;
            java.lang.String str2 = this.f164386g;
            mVar.field_fullpath = str2;
            mVar.field_thumbpath = "";
            mVar.field_fileType = this.f164396t;
            mVar.field_talker = "";
            mVar.field_priority = 2;
            mVar.field_needStorage = true;
            mVar.field_isStreamMedia = false;
            int i18 = this.f164398v;
            boolean z17 = this.f164393q;
            if (i18 != 0) {
                mVar.field_appType = i18;
                i17 = 1;
            } else {
                if (com.tencent.mm.plugin.sns.storage.m2.h2()) {
                    boolean i19 = pc4.d.f353410a.i();
                    if (i19) {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        com.tencent.mm.sdk.platformtools.x.J(str2, options);
                        int min = java.lang.Math.min(options.outWidth, options.outHeight);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiSpecLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_spec_size_limit, 1680);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "getMultiSpecLimit:" + Ni);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiSpecLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                        if (min < Ni) {
                            i19 = false;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "mIsSpecWxam:%b", java.lang.Boolean.valueOf(i19));
                    mVar.field_appType = z17 ? i19 ? 117 : 114 : i19 ? 116 : 113;
                } else {
                    if (com.tencent.mm.plugin.sns.storage.m2.k2()) {
                        mVar.field_appType = z17 ? 108 : 107;
                    } else if (com.tencent.mm.plugin.sns.storage.m2.X1()) {
                        mVar.field_appType = z17 ? 108 : 107;
                    } else if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(64)) {
                        mVar.field_appType = z17 ? 104 : 103;
                    } else {
                        mVar.field_appType = z17 ? 101 : 100;
                    }
                }
                i17 = 1;
            }
            mVar.field_bzScene = i17;
            java.lang.String concat = "is_single_media:".concat(z17 ? "0" : "1");
            mVar.N = concat;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "customHeader: %s", concat);
            if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSnsUpload", "cdntra addSendTask failed. clientid:%s", this.f164391o);
                this.f164391o = "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return 207;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        r45.ab6 ab6Var = (r45.ab6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        int i27 = this.f164397u;
        if (i18 == 4) {
            K(i19);
            if (i27 == 21) {
                ha4.b.a(12);
            }
            this.f164390n.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        if (i18 != 0 || i19 != 0) {
            J();
            if (i27 == 21) {
                ha4.b.a(13);
            }
            this.f164390n.onSceneEnd(i18, i19, str, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        com.tencent.mm.plugin.sns.storage.l2 n17 = com.tencent.mm.plugin.sns.model.l4.Hj().n1(I());
        int i28 = ab6Var.f369897d;
        if (i28 < 0 || (i28 > n17.f() && n17.f() > 0)) {
            J();
            if (i18 == 3) {
                ha4.b.a(14);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        if (ab6Var.f369897d < n17.d()) {
            J();
            if (i18 == 3) {
                ha4.b.a(14);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", " bufferUrl: " + ab6Var.f369900g.f385537d + " bufferUrlType: " + ab6Var.f369900g.f385538e + "  id:" + ab6Var.f369903m + " thumb Count: " + ab6Var.f369901h + "  type " + ab6Var.f369904n + " startPos : " + ab6Var.f369897d);
        n17.j(ab6Var.f369897d);
        com.tencent.mm.plugin.sns.model.l4.Hj().Y2(I(), n17);
        if (n17.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSnsUpload", "uploadsns done pass: " + (java.lang.System.currentTimeMillis() - this.f164394r));
            java.util.LinkedList linkedList = ab6Var.f369902i;
            int size = linkedList.size();
            r45.za6 za6Var = this.f164387h;
            if (size == 0 || linkedList.size() <= 0) {
                r45.s76 s76Var = ab6Var.f369900g;
                L(s76Var.f385537d, s76Var.f385538e, "", 0, ab6Var.f369903m + "", za6Var.f391873u, null);
            } else {
                r45.s76 s76Var2 = ab6Var.f369900g;
                L(s76Var2.f385537d, s76Var2.f385538e, ((r45.s76) linkedList.get(0)).f385537d, ((r45.s76) linkedList.get(0)).f385538e, ab6Var.f369903m + "", za6Var.f391873u, null);
            }
            this.f164390n.onSceneEnd(i18, i19, str, this);
        } else if (M() && doScene(dispatcher(), this.f164390n) < 0) {
            this.f164390n.onSceneEnd(3, -1, "doScene failed", this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_http_upload_limit, 2500);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return Ni;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.tencent.mm.modelbase.o1 o1Var = com.tencent.mm.modelbase.o1.EOk;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        return o1Var;
    }
}

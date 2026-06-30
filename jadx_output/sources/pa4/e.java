package pa4;

/* loaded from: classes4.dex */
public final class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.l2 f353026d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.mj4 f353027e;

    /* renamed from: f, reason: collision with root package name */
    public final pa4.m f353028f;

    /* renamed from: g, reason: collision with root package name */
    public final int f353029g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f353030h;

    /* renamed from: i, reason: collision with root package name */
    public final pa4.o f353031i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f353032m;

    /* renamed from: n, reason: collision with root package name */
    public r45.za6 f353033n;

    /* renamed from: o, reason: collision with root package name */
    public int f353034o;

    /* renamed from: p, reason: collision with root package name */
    public int f353035p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f353036q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f353037r;

    /* renamed from: s, reason: collision with root package name */
    public long f353038s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f353039t;

    /* renamed from: u, reason: collision with root package name */
    public int f353040u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f353041v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f353042w;

    /* renamed from: x, reason: collision with root package name */
    public final dn.k f353043x;

    public e(com.tencent.mm.plugin.sns.storage.l2 snsMedia, r45.mj4 uploadInfo, pa4.m uploadCallback, int i17, int i18, boolean z17, java.lang.String livePhotoUUId, pa4.o workHelper) {
        boolean z18;
        kotlin.jvm.internal.o.g(snsMedia, "snsMedia");
        kotlin.jvm.internal.o.g(uploadInfo, "uploadInfo");
        kotlin.jvm.internal.o.g(uploadCallback, "uploadCallback");
        kotlin.jvm.internal.o.g(livePhotoUUId, "livePhotoUUId");
        kotlin.jvm.internal.o.g(workHelper, "workHelper");
        this.f353026d = snsMedia;
        this.f353027e = uploadInfo;
        this.f353028f = uploadCallback;
        this.f353029g = i18;
        this.f353030h = z17;
        this.f353031i = workHelper;
        this.f353036q = "";
        this.f353039t = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f353038s = java.lang.System.currentTimeMillis();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.za6();
        lVar.f70665b = new r45.ab6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnsupload";
        lVar.f70667d = 207;
        lVar.f70668e = 95;
        lVar.f70669f = 1000000095;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f353032m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsUploadRequest");
        this.f353033n = (r45.za6) fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "start sns upload netScene localId " + i18 + "  offset " + snsMedia.d() + " path " + snsMedia.e() + " totalLen " + snsMedia.f());
        com.tencent.mm.plugin.sns.statistics.v0.c(i18);
        if (!z17) {
            r45.za6 za6Var = this.f353033n;
            if (za6Var == null) {
                kotlin.jvm.internal.o.o("req");
                throw null;
            }
            za6Var.f391872t = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "this is single upload");
        }
        java.lang.String X = ca4.z0.X(snsMedia.e());
        this.f353036q = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), snsMedia.e()) + X;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "path: " + this.f353036q + " temPicName: " + X + " tmpPath: " + snsMedia.e());
        this.f353035p = (int) com.tencent.mm.vfs.w6.k(this.f353036q);
        this.f353037r = ca4.z0.k0(this.f353036q);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "totaLen " + this.f353035p + " isLongPic: " + this.f353037r + " livePhotoUUId: " + livePhotoUUId + " uploadInfoLivePhotoUUId: " + uploadInfo.E);
        java.lang.String str = uploadInfo.f380572p;
        boolean z19 = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            byte[] bytes = ("" + android.os.SystemClock.elapsedRealtime()).getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            str = kk.k.g(bytes);
            uploadInfo.f380572p = str;
            z18 = true;
        } else {
            z18 = false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(uploadInfo.E)) {
            uploadInfo.E = livePhotoUUId;
            z18 = true;
        }
        if (z18) {
            try {
                snsMedia.m(uploadInfo.toByteArray());
                com.tencent.mm.plugin.sns.model.l4.Hj().Y2(snsMedia.c(), snsMedia);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsLivePhotoImgUpload", e17, "", new java.lang.Object[0]);
            }
        }
        r45.za6 za6Var2 = this.f353033n;
        if (za6Var2 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var2.f391862g = this.f353035p;
        za6Var2.f391860e = snsMedia.d();
        r45.za6 za6Var3 = this.f353033n;
        if (za6Var3 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var3.f391864i = str;
        kotlin.jvm.internal.o.d(str);
        this.f353039t = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "filter style " + uploadInfo.f380563d);
        r45.za6 za6Var4 = this.f353033n;
        if (za6Var4 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var4.f391865m = uploadInfo.f380563d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "syncWeibo " + uploadInfo.f380564e);
        r45.za6 za6Var5 = this.f353033n;
        if (za6Var5 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var5.f391867o = uploadInfo.f380571o + "";
        r45.za6 za6Var6 = this.f353033n;
        if (za6Var6 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var6.f391866n = uploadInfo.f380564e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "request upload type " + snsMedia.g() + " md5: " + uploadInfo.f380579w + " appid " + uploadInfo.f380580x + " contenttype " + uploadInfo.f380581y);
        r45.za6 za6Var7 = this.f353033n;
        if (za6Var7 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var7.f391859d = snsMedia.g();
        r45.kq6 kq6Var = new r45.kq6();
        kq6Var.f378906d = uploadInfo.f380573q;
        kq6Var.f378907e = uploadInfo.f380574r;
        r45.za6 za6Var8 = this.f353033n;
        if (za6Var8 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var8.f391870r = kq6Var;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(uploadInfo.f380579w)) {
            r45.za6 za6Var9 = this.f353033n;
            if (za6Var9 == null) {
                kotlin.jvm.internal.o.o("req");
                throw null;
            }
            za6Var9.f391873u = uploadInfo.f380579w;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(uploadInfo.f380580x)) {
            r45.za6 za6Var10 = this.f353033n;
            if (za6Var10 == null) {
                kotlin.jvm.internal.o.o("req");
                throw null;
            }
            za6Var10.f391871s = uploadInfo.f380580x;
        }
        r45.za6 za6Var11 = this.f353033n;
        if (za6Var11 == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        za6Var11.f391874v = uploadInfo.f380581y;
        if (x51.o1.f452048d) {
            za6Var11.f391859d = 0;
        }
        this.f353040u = 20201;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsLivePhotoImgUpload", "cdn tra not use cdn");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else if (x51.o1.B == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else {
            java.lang.String ClientId = za6Var11.f391864i;
            kotlin.jvm.internal.o.f(ClientId, "ClientId");
            this.f353039t = ClientId;
            if (com.tencent.mm.sdk.platformtools.t8.K0(ClientId)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsLivePhotoImgUpload", "cdntra genClientId failed not use cdn");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUserCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                z19 = true;
            }
        }
        if (z19) {
            this.f353041v = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else if (P()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else {
            M();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        }
        this.f353043x = new pa4.a(this);
    }

    public static final /* synthetic */ int H(pa4.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        int i17 = eVar.f353029g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLocalId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return i17;
    }

    public static final /* synthetic */ java.lang.String I(pa4.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        java.lang.String str = eVar.f353036q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPath$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return str;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.storage.l2 J(pa4.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsMedia$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.tencent.mm.plugin.sns.storage.l2 l2Var = eVar.f353026d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsMedia$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return l2Var;
    }

    public static final /* synthetic */ r45.mj4 K(pa4.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        r45.mj4 mj4Var = eVar.f353027e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return mj4Var;
    }

    public static final /* synthetic */ java.lang.String L(pa4.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUseCdnTransClientId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        java.lang.String str = eVar.f353039t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUseCdnTransClientId$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return str;
    }

    public final void M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f353031i.a("ImageOnError", new pa4.b(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    public final void N(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f353031i.a("ImageOnErrorServer", new pa4.c(i17, this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    public final void O(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f353031i.a("ImageOnPostScene", new pa4.d(str, str3, i17, str2, str4, this, i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    public final boolean P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.tencent.mm.plugin.sns.storage.l2 l2Var = this.f353026d;
        int f17 = l2Var.f() - l2Var.d();
        if (f17 > com.tencent.mm.plugin.sns.model.l3.H()) {
            f17 = com.tencent.mm.plugin.sns.model.l3.H();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "onPreDoScene >> dataLen: " + f17 + " offset: " + l2Var.d());
        int d17 = l2Var.d();
        this.f353034o = d17;
        byte[] N = com.tencent.mm.vfs.w6.N(this.f353036q, d17, f17);
        if (N != null) {
            if (!(N.length == 0)) {
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(N);
                r45.za6 za6Var = this.f353033n;
                if (za6Var == null) {
                    kotlin.jvm.internal.o.o("req");
                    throw null;
                }
                za6Var.f391863h = cu5Var;
                if (za6Var == null) {
                    kotlin.jvm.internal.o.o("req");
                    throw null;
                }
                za6Var.f391860e = this.f353034o;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDoScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return false;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        this.f353042w = u0Var;
        if (!this.f353041v) {
            int dispatch = dispatch(sVar, this.f353032m, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            return dispatch;
        }
        r45.za6 za6Var = this.f353033n;
        if (za6Var == null) {
            kotlin.jvm.internal.o.o("req");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        java.lang.String ClientId = za6Var.f391864i;
        kotlin.jvm.internal.o.f(ClientId, "ClientId");
        this.f353039t = ClientId;
        if (com.tencent.mm.sdk.platformtools.t8.K0(ClientId)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsLivePhotoImgUpload", "cdntra genClientId failed not use cdn");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        } else {
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_NetSceneSnsUpload_1";
            mVar.f241787f = this.f353043x;
            mVar.field_mediaId = this.f353039t;
            mVar.field_fullpath = this.f353036q;
            mVar.field_thumbpath = "";
            mVar.field_fileType = this.f353040u;
            mVar.field_talker = "";
            mVar.field_priority = 2;
            mVar.field_needStorage = true;
            mVar.field_isStreamMedia = false;
            boolean h27 = com.tencent.mm.plugin.sns.storage.m2.h2();
            boolean z17 = this.f353030h;
            if (h27) {
                mVar.field_appType = z17 ? 114 : 113;
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
            mVar.field_bzScene = 1;
            mVar.N = "live_photo_uuid:" + this.f353027e.E + "\r\nis_single_media:" + (z17 ? "0" : "1");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("customHeader: ");
            sb6.append(mVar.N);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
            if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsLivePhotoImgUpload", "cdntra addSendTask failed. clientid:%s", this.f353039t);
                this.f353039t = "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUseCdn", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return 207;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "onGYNetEnd >> netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        kotlin.jvm.internal.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsUploadResponse");
        r45.ab6 ab6Var = (r45.ab6) fVar;
        int i27 = this.f353029g;
        if (i18 == 4) {
            N(i19);
            com.tencent.mm.plugin.sns.statistics.v0.a(i27, i18, i19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            return;
        }
        if (i18 != 0 || i19 != 0) {
            M();
            com.tencent.mm.plugin.sns.statistics.v0.a(i27, i18, i19);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            return;
        }
        int i28 = ab6Var.f369897d;
        if (i28 >= 0) {
            com.tencent.mm.plugin.sns.storage.l2 l2Var = this.f353026d;
            if (i28 <= l2Var.f() || l2Var.f() <= 0) {
                if (ab6Var.f369897d < l2Var.d()) {
                    M();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", " bufferUrl: " + ab6Var.f369900g.f385537d + " bufferUrlType: " + ab6Var.f369900g.f385538e + "  id:" + ab6Var.f369903m + " thumb Count: " + ab6Var.f369901h + "  type " + ab6Var.f369904n + " startPos : " + ab6Var.f369897d);
                l2Var.j(ab6Var.f369897d);
                if (l2Var.i()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoImgUpload", "upload sns done pass: " + (java.lang.System.currentTimeMillis() - this.f353038s));
                    java.util.LinkedList linkedList = ab6Var.f369902i;
                    if (linkedList.size() == 0 || linkedList.size() <= 0) {
                        java.lang.String Url = ab6Var.f369900g.f385537d;
                        kotlin.jvm.internal.o.f(Url, "Url");
                        int i29 = ab6Var.f369900g.f385538e;
                        java.lang.String str2 = ab6Var.f369903m + "";
                        r45.za6 za6Var = this.f353033n;
                        if (za6Var == null) {
                            kotlin.jvm.internal.o.o("req");
                            throw null;
                        }
                        O(Url, i29, "", 0, str2, za6Var.f391873u);
                    } else {
                        java.lang.String Url2 = ab6Var.f369900g.f385537d;
                        kotlin.jvm.internal.o.f(Url2, "Url");
                        int i37 = ab6Var.f369900g.f385538e;
                        java.lang.String Url3 = ((r45.s76) linkedList.get(0)).f385537d;
                        kotlin.jvm.internal.o.f(Url3, "Url");
                        int i38 = ((r45.s76) linkedList.get(0)).f385538e;
                        java.lang.String str3 = ab6Var.f369903m + "";
                        r45.za6 za6Var2 = this.f353033n;
                        if (za6Var2 == null) {
                            kotlin.jvm.internal.o.o("req");
                            throw null;
                        }
                        O(Url2, i37, Url3, i38, str3, za6Var2.f391873u);
                    }
                    com.tencent.mm.plugin.sns.statistics.v0.a(i27, i18, i19);
                } else if (P() && doScene(dispatcher(), this.f353042w) < 0) {
                    com.tencent.mm.plugin.sns.statistics.v0.a(i27, 3, -1);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                return;
            }
        }
        M();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_http_upload_limit, 2500);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return Ni;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.tencent.mm.modelbase.o1 o1Var = com.tencent.mm.modelbase.o1.EOk;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        return o1Var;
    }
}

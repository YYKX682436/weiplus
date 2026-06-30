package cw2;

/* loaded from: classes15.dex */
public final class s6 extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader implements dn.n, dn.k, dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f223999d;

    /* renamed from: e, reason: collision with root package name */
    public final cw2.wa f224000e;

    /* renamed from: f, reason: collision with root package name */
    public int f224001f;

    /* renamed from: g, reason: collision with root package name */
    public so2.i3 f224002g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f224003h;

    /* renamed from: i, reason: collision with root package name */
    public long f224004i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f224005m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f224006n;

    public s6(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, java.lang.String mediaId, cw2.wa mediaInfo) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        this.f224006n = finderThumbPlayerProxy;
        this.f223999d = mediaId;
        this.f224000e = mediaInfo;
        this.f224003h = new java.util.concurrent.atomic.AtomicBoolean(false);
        so2.i3 c17 = cu2.x.c(cu2.x.f222449a, mediaId, true, false, false, 12, null);
        this.f224002g = c17;
        boolean j17 = com.tencent.mm.vfs.w6.j(c17.u0());
        java.lang.String str = mediaInfo.f224095b;
        boolean j18 = com.tencent.mm.vfs.w6.j(str);
        long k17 = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "create ResourceLoaderProxy, cache:" + this.f224002g + " mediaCache path:" + this.f224002g.u0() + ", exists:" + j17 + " mediaInfo path:" + str + ", exists:" + j18 + "size:" + k17 + "totalSize:" + this.f224002g.field_totalSize);
        so2.i3 i3Var = this.f224002g;
        int i17 = i3Var.field_state;
        cw2.p6 p6Var = finderThumbPlayerProxy.T;
        if (i17 == -2 || i17 == -1 || i17 == 0) {
            p6Var.getClass();
            p6Var.f223933d = "未命中预加载";
            a();
        } else if (i17 != 3) {
            int w07 = i3Var.w0();
            if (w07 > 0) {
                java.lang.String str2 = "预加载" + w07 + '%';
                p6Var.getClass();
                kotlin.jvm.internal.o.g(str2, "<set-?>");
                p6Var.f223933d = str2;
            } else {
                p6Var.getClass();
                p6Var.f223933d = "未命中预加载";
            }
        } else if (!j18 || k17 != i3Var.field_totalSize) {
            a();
            p6Var.getClass();
            p6Var.f223933d = "未命中预加载";
        }
        this.f224005m = "";
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
    }

    public final void a() {
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "resetMediaCache");
        cu2.x xVar = cu2.x.f222449a;
        cw2.wa waVar = this.f224000e;
        long feedId = waVar.f224099f.getFeedId();
        java.lang.String str = this.f223999d;
        java.lang.String string = waVar.f224098e.e().getString(9);
        if (string == null) {
            string = "";
        }
        java.lang.String str2 = waVar.f224094a;
        if (str2 == null) {
            str2 = "";
        }
        cu2.x.h(xVar, feedId, str, string, str2, waVar.f224098e.b(), waVar.f224098e.g(), waVar.f224098e.c(), 0L, 0L, 1, waVar.f224098e.e().getInteger(3), "", "", false, waVar.f224098e.d(), 8192, null);
        b();
    }

    public final void b() {
        this.f224002g = cu2.x.c(cu2.x.f222449a, this.f223999d, false, false, false, 14, null);
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "updateRequestingData " + z17 + ' ' + this);
        this.f224003h.set(z17);
    }

    @Override // dn.n
    public void f(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224006n;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onProgress() offset=" + j17 + " total=" + j18 + ' ' + this);
        finderThumbPlayerProxy.f130651e2 = java.lang.Math.max(finderThumbPlayerProxy.f130651e2, j17);
        cu2.x.f222449a.n(mediaId, j17, j18, (j17 == 0 || j17 != j18) ? 1 : 3);
        b();
        if (finderThumbPlayerProxy.isViewFocused) {
            so2.i3 i3Var = this.f224002g;
            if (i3Var.field_videoBitrate + i3Var.field_audioBitrate > 0) {
                finderThumbPlayerProxy.getCurrentPlaySecond();
                com.tencent.mm.autogen.events.VideoFeedProgressChangeEvent videoFeedProgressChangeEvent = new com.tencent.mm.autogen.events.VideoFeedProgressChangeEvent();
                videoFeedProgressChangeEvent.f54933g.getClass();
                videoFeedProgressChangeEvent.e();
            }
        }
        cw2.eb downloadCallback = finderThumbPlayerProxy.getDownloadCallback();
        if (downloadCallback != null) {
            downloadCallback.c((int) j17, (int) j18, this.f224000e.f224098e);
        }
    }

    @Override // dn.n
    public void g(java.lang.String mediaId, int i17, dn.h sceneResult) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(sceneResult, "sceneResult");
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "FTPP.onFinish mediaId=" + mediaId + " ret=" + i17 + " recvedBytes=" + sceneResult.field_recvedBytes + " fileLength=" + sceneResult.field_fileLength + "  finderformat:" + java.lang.Integer.valueOf(sceneResult.field_videoFormat));
        cu2.x xVar = cu2.x.f222449a;
        java.lang.String profile = sceneResult.f241778m;
        kotlin.jvm.internal.o.f(profile, "profile");
        xVar.l(mediaId, profile);
        pm0.v.X(new cw2.r6(this.f224006n, i17, mediaId, sceneResult, this));
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2) {
        boolean z17 = false;
        if (str != null && r26.i0.n(str, ".m3u8", true)) {
            z17 = true;
        }
        java.lang.String str3 = z17 ? "application/vnd.apple.mpegurl" : com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "getContentType() taskId:" + i17 + ", fileKey:" + str2 + " contentType:" + str3);
        return str3;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2) {
        cw2.wa waVar = this.f224000e;
        java.lang.String i18 = com.tencent.mm.vfs.w6.i(waVar.f224095b, false);
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "getDataFilePath(), taskId:" + i17 + " fileKey:" + str2 + " dataFilePath:" + i18 + " isExists:" + com.tencent.mm.vfs.w6.j(i18) + " mediaInfoPath:" + waVar.f224095b);
        return i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224006n;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "getDataTotalSize() taskId:" + i17 + ", fileKey:" + str2 + " dataTotalSize:" + this.f224002g.field_totalSize + ' ');
        long j17 = this.f224002g.field_totalSize;
        finderThumbPlayerProxy.f130649d2 = j17;
        return j17;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader, com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130641g2;
        java.util.HashMap hashMap = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130642h2;
        java.lang.String str3 = this.f223999d;
        boolean containsKey = hashMap.containsKey(str3);
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "getM3U8Content() taskId:" + i17 + ", fileKey:" + str2 + " contains:" + containsKey);
        java.lang.String str4 = (java.lang.String) hashMap.get(str3);
        return str4 == null ? this.f224005m : str4;
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String mediaId, long j17, long j18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        c(false);
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224006n;
        finderThumbPlayerProxy.f130651e2 = java.lang.Math.max(finderThumbPlayerProxy.f130651e2, j17);
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onDataAvailable() offset=" + j17 + " length=" + j18 + ' ' + this + '}');
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String mediaId, java.lang.String str) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "onM3U8Ready m3u8:" + str);
        if (str == null) {
            str = "";
        }
        this.f224005m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d7  */
    @Override // dn.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMoovReady(java.lang.String r8, long r9, long r11, com.tencent.mars.cdn.CdnManager.VideoInfo r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.s6.onMoovReady(java.lang.String, long, long, com.tencent.mars.cdn.CdnManager$VideoInfo):void");
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        fw2.a fTPPLog;
        java.lang.String str3;
        java.lang.String str4;
        long j19;
        long j27;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        long j28;
        long j29;
        fw2.a fTPPLog2;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2;
        long j37;
        fw2.a fTPPLog3;
        java.lang.String str5;
        long j38;
        long j39;
        fw2.a fTPPLog4;
        fw2.a fTPPLog5;
        kw2.a fTPPKVReporter;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = this.f224006n;
        finderThumbPlayerProxy3.setRequestOffset(j17);
        finderThumbPlayerProxy3.f130647c2 = j18;
        if (!finderThumbPlayerProxy3.U.get()) {
            com.tencent.mars.xlog.Log.w(finderThumbPlayerProxy3.getFTPPTag(), "notifyDataReady taskId:" + i17 + ", return for downloader never start. requestOffset:" + j17 + " requestLength:" + j18 + ' ' + this);
            fTPPKVReporter = finderThumbPlayerProxy3.getFTPPKVReporter();
            if (!fTPPKVReporter.f312863a) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1505L, 249L, 1L);
                fTPPKVReporter.f312863a = true;
            }
        } else {
            if (!finderThumbPlayerProxy3.V() || j17 <= this.f224002g.field_cacheSize) {
                boolean A0 = this.f224002g.A0();
                java.lang.String str6 = this.f223999d;
                if (A0) {
                    str4 = str6;
                    str3 = " requestLength:";
                    j27 = j18;
                    j19 = 0;
                } else {
                    long[] jArr = new long[2];
                    int queryContinuousSize = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryContinuousSize(str6, j17, jArr);
                    if (queryContinuousSize == 0) {
                        long j47 = jArr[0];
                        if (j47 != -1) {
                            if (j47 > j18) {
                                j47 = j18;
                            }
                            str3 = " requestLength:";
                            j27 = j47;
                            j19 = 0;
                            str4 = str6;
                        }
                    }
                    fTPPLog = finderThumbPlayerProxy3.getFTPPLog();
                    java.lang.String fTPPTag = finderThumbPlayerProxy3.getFTPPTag();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyDataReady taskId:");
                    sb6.append(i17);
                    str3 = " requestLength:";
                    sb6.append(" queryContinuousSize error, ret:");
                    sb6.append(queryContinuousSize);
                    sb6.append(" requestOffset:");
                    sb6.append(j17);
                    sb6.append(" continuousSize:");
                    str4 = str6;
                    sb6.append(jArr[0]);
                    sb6.append(" totalSize:");
                    sb6.append(jArr[1]);
                    sb6.append(' ');
                    sb6.append(this);
                    java.lang.String sb7 = sb6.toString();
                    fTPPLog.getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - fTPPLog.f267083a > 1000) {
                        com.tencent.mars.xlog.Log.w(fTPPTag, sb7);
                        fTPPLog.f267083a = currentTimeMillis;
                    }
                    j19 = 0;
                    j27 = 0;
                }
                if (j27 != j19) {
                    finderThumbPlayerProxy = finderThumbPlayerProxy3;
                    j28 = j17;
                    j29 = j27;
                    if (j28 + j29 != this.f224004i) {
                        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "notifyDataReady taskId:" + i17 + " returnLength:" + j29 + " fixRequest[offset:" + j28 + " length:" + j18 + "], originRequest[offset:" + j28 + " length:" + j18 + "] lastOnReadDataEnd:" + this.f224004i + ' ' + this);
                        finderThumbPlayerProxy2 = finderThumbPlayerProxy;
                        long j48 = j28 + j29;
                        this.f224004i = j48;
                        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4 = finderThumbPlayerProxy2;
                        finderThumbPlayerProxy4.f130651e2 = java.lang.Math.max(finderThumbPlayerProxy4.f130651e2, j48);
                        j37 = j29;
                    } else {
                        fTPPLog2 = finderThumbPlayerProxy.getFTPPLog();
                        java.lang.String fTPPTag2 = finderThumbPlayerProxy.getFTPPTag();
                        finderThumbPlayerProxy2 = finderThumbPlayerProxy;
                        java.lang.String str7 = "notifyDataReady taskId:" + i17 + " returnLength:" + j29 + " fixRequest[offset:" + j28 + " length:" + j18 + "],  originRequest[offset:" + j28 + " length:" + j18 + "] lastOnReadDataEnd:" + this.f224004i + ' ' + this;
                        fTPPLog2.getClass();
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis2 - fTPPLog2.f267085c > 1000) {
                            com.tencent.mars.xlog.Log.w(fTPPTag2, str7);
                            fTPPLog2.f267085c = currentTimeMillis2;
                        }
                        long j482 = j28 + j29;
                        this.f224004i = j482;
                        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy42 = finderThumbPlayerProxy2;
                        finderThumbPlayerProxy42.f130651e2 = java.lang.Math.max(finderThumbPlayerProxy42.f130651e2, j482);
                        j37 = j29;
                    }
                } else if (!this.f224002g.field_moovReady || this.f224003h.get()) {
                    long j49 = j27;
                    finderThumbPlayerProxy = finderThumbPlayerProxy3;
                    j28 = j17;
                    fTPPLog3 = finderThumbPlayerProxy.getFTPPLog();
                    java.lang.String fTPPTag3 = finderThumbPlayerProxy.getFTPPTag();
                    java.lang.String str8 = "notifyDataReady taskId:" + i17 + " returnLength:" + j49 + " fixRequest[offset:" + j28 + " length:" + j18 + "],  originRequest[offset:" + j28 + " length:" + j18 + "] " + this;
                    fTPPLog3.getClass();
                    long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis3 - fTPPLog3.f267085c > 500) {
                        com.tencent.mars.xlog.Log.w(fTPPTag3, str8);
                        fTPPLog3.f267085c = currentTimeMillis3;
                    }
                    j29 = j49;
                    finderThumbPlayerProxy2 = finderThumbPlayerProxy;
                    long j4822 = j28 + j29;
                    this.f224004i = j4822;
                    com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy422 = finderThumbPlayerProxy2;
                    finderThumbPlayerProxy422.f130651e2 = java.lang.Math.max(finderThumbPlayerProxy422.f130651e2, j4822);
                    j37 = j29;
                } else {
                    long j57 = j17 + j18;
                    long j58 = this.f224002g.field_totalSize;
                    if (j57 > j58) {
                        long j59 = j58 - j17;
                        java.lang.String fTPPTag4 = finderThumbPlayerProxy3.getFTPPTag();
                        str5 = "notifyDataReady taskId:";
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str5);
                        sb8.append(i17);
                        sb8.append(" requestLength is valid, requestOffset:");
                        sb8.append(j17);
                        sb8.append(", requestLength:");
                        sb8.append(j59);
                        sb8.append(", totalSize:");
                        j38 = j27;
                        sb8.append(this.f224002g.field_totalSize);
                        sb8.append(' ');
                        sb8.append(this);
                        com.tencent.mars.xlog.Log.w(fTPPTag4, sb8.toString());
                        j39 = j59;
                    } else {
                        str5 = "notifyDataReady taskId:";
                        j38 = j27;
                        j39 = j18;
                    }
                    ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
                    Di.getClass();
                    java.lang.String mediaId = str4;
                    kotlin.jvm.internal.o.g(mediaId, "mediaId");
                    if (Di.f253685a.containsKey(mediaId)) {
                        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                        java.lang.String str9 = str5;
                        long j66 = j39;
                        java.lang.String str10 = str3;
                        int f17 = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().f(this.f223999d, j17, j39, 3000, new cw2.q6(finderThumbPlayerProxy3, i17, this, countDownLatch));
                        if (f17 == 0) {
                            com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy3.getFTPPTag(), str9 + i17 + " requestVideoData not in running id mediaId:" + mediaId);
                            c(false);
                            countDownLatch.countDown();
                        }
                        try {
                            countDownLatch.await(5L, java.util.concurrent.TimeUnit.SECONDS);
                        } catch (java.lang.Throwable unused) {
                            com.tencent.mars.xlog.Log.w(finderThumbPlayerProxy3.getFTPPTag(), str9 + i17 + " countdown timeout exception.");
                        }
                        java.lang.String fTPPTag5 = finderThumbPlayerProxy3.getFTPPTag();
                        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(str9);
                        sb9.append(i17);
                        sb9.append(" requestVideoData requestOffset:");
                        sb9.append(j17);
                        sb9.append(" requestLengthFix:");
                        sb9.append(j66);
                        sb9.append(str10);
                        j28 = j17;
                        sb9.append(j18);
                        sb9.append(" requestDataRet:");
                        sb9.append(f17);
                        sb9.append("  cacheSize:");
                        sb9.append(this.f224002g.field_cacheSize);
                        sb9.append(' ');
                        sb9.append(this);
                        com.tencent.mars.xlog.Log.i(fTPPTag5, sb9.toString());
                        finderThumbPlayerProxy2 = finderThumbPlayerProxy3;
                        j29 = j38;
                        long j48222 = j28 + j29;
                        this.f224004i = j48222;
                        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4222 = finderThumbPlayerProxy2;
                        finderThumbPlayerProxy4222.f130651e2 = java.lang.Math.max(finderThumbPlayerProxy4222.f130651e2, j48222);
                        j37 = j29;
                    } else {
                        fTPPLog4 = finderThumbPlayerProxy3.getFTPPLog();
                        java.lang.String fTPPTag6 = finderThumbPlayerProxy3.getFTPPTag();
                        java.lang.String str11 = str5 + i17 + " isMediaInRunningStreamTaskMap mediaId:" + mediaId;
                        fTPPLog4.getClass();
                        long currentTimeMillis4 = java.lang.System.currentTimeMillis();
                        if (currentTimeMillis4 - fTPPLog4.f267086d > 500) {
                            com.tencent.mars.xlog.Log.w(fTPPTag6, str11);
                            fTPPLog4.f267086d = currentTimeMillis4;
                        }
                        j29 = j38;
                        j37 = j29;
                    }
                }
                return (int) j37;
            }
            fTPPLog5 = finderThumbPlayerProxy3.getFTPPLog();
            java.lang.String fTPPTag7 = finderThumbPlayerProxy3.getFTPPTag();
            java.lang.String str12 = "notifyDataReady taskId:" + i17 + " return for pause state. request[offset:" + j17 + " length:" + j18 + "] cacheSize:" + this.f224002g.field_cacheSize + ' ' + this;
            fTPPLog5.getClass();
            long currentTimeMillis5 = java.lang.System.currentTimeMillis();
            if (currentTimeMillis5 - fTPPLog5.f267084b > 5000) {
                com.tencent.mars.xlog.Log.w(fTPPTag7, str12);
                fTPPLog5.f267084b = currentTimeMillis5;
            }
        }
        j37 = 0;
        return (int) j37;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f224006n;
        com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "onStartReadData() taskId:" + i17 + ", fileKey:" + str2 + ", requestStart:" + j17 + ", requestEnd:" + j18);
        kz2.a aVar = finderThumbPlayerProxy.R;
        if (aVar != null) {
            aVar.c("onStartRead");
        }
        int i18 = this.f224001f;
        this.f224001f = i18 + 1;
        return i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mars.xlog.Log.i(this.f224006n.getFTPPTag(), "onStopReadData() taskId:" + i17 + ", fileName:" + str + ", requestId:" + i18);
        return this.f224001f;
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.String fTPPTag = this.f224006n.getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback() mediaId=");
        sb6.append(mediaId);
        sb6.append(" startRet=");
        sb6.append(i17);
        sb6.append(" finishedLength=");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.field_finishedLength) : null);
        sb6.append(" fileFormat=");
        sb6.append(hVar != null ? hVar.field_videoFlag : null);
        sb6.append(' ');
        sb6.append(this);
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
        if (gVar != null) {
            if (!(i17 == 0 && gVar.field_finishedLength > 0)) {
                gVar = null;
            }
            if (gVar != null) {
                long j17 = gVar.field_finishedLength;
                long j18 = gVar.field_toltalLength;
                this.f224002g = cu2.x.f222449a.n(mediaId, j17, j18, j17 >= j18 ? 3 : 1);
                b();
            }
        }
        if (hVar != null) {
            cu2.x xVar = cu2.x.f222449a;
            java.lang.String profile = hVar.f241778m;
            kotlin.jvm.internal.o.f(profile, "profile");
            xVar.l(mediaId, profile);
        }
        return 0;
    }

    public java.lang.String toString() {
        return com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j(this.f224006n) + " isMoovReady:" + this.f224002g.field_moovReady + " isRequestingData:" + this.f224003h.get() + " isFinish:" + this.f224002g.A0() + " total:" + this.f224002g.field_totalSize + " mediacache:" + this.f224002g.hashCode();
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }

    @Override // dn.l
    public void x(java.lang.String mediaId, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.lang.String fTPPTag = this.f224006n.getFTPPTag();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreloadCompleted] mediaId=");
        sb6.append(mediaId);
        sb6.append(" Ret=");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        sb6.append(" finishedLength=");
        sb6.append(hVar != null ? java.lang.Long.valueOf(hVar.field_recvedBytes) : null);
        sb6.append(' ');
        sb6.append(this);
        com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
        ((c61.l7) i95.n0.c(c61.l7.class)).Uj().i(mediaId, hVar, "proxy#complete");
    }
}

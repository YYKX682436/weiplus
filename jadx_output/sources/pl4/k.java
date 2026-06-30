package pl4;

/* loaded from: classes15.dex */
public final class k implements com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener {

    /* renamed from: v, reason: collision with root package name */
    public static final pl4.c f356716v = new pl4.c(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f356717a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f356718b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f356719c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f356720d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f356721e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.qqmusicplayerprocess.audio.playermanager.EKeyDecryptor f356722f;

    /* renamed from: g, reason: collision with root package name */
    public long f356723g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356724h;

    /* renamed from: i, reason: collision with root package name */
    public long f356725i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f356726j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f356727k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f356728l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f356729m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f356730n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f356731o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f356732p;

    /* renamed from: q, reason: collision with root package name */
    public final ku5.f f356733q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f356734r;

    /* renamed from: s, reason: collision with root package name */
    public final dn.o f356735s;

    /* renamed from: t, reason: collision with root package name */
    public final pl4.f f356736t;

    /* renamed from: u, reason: collision with root package name */
    public final pl4.d f356737u;

    public k(java.lang.String dataUrl, java.lang.String fileCacheId, java.lang.String str, java.lang.String str2, yz5.l onError) {
        kotlin.jvm.internal.o.g(dataUrl, "dataUrl");
        kotlin.jvm.internal.o.g(fileCacheId, "fileCacheId");
        kotlin.jvm.internal.o.g(onError, "onError");
        this.f356717a = dataUrl;
        this.f356718b = fileCacheId;
        this.f356719c = str2;
        this.f356720d = onError;
        this.f356721e = new java.lang.Object();
        e();
        this.f356725i = -1L;
        this.f356732p = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f356733q = ((ku5.t0) ku5.t0.f312615d).o("TingTPResourceLoader:" + fileCacheId, 2, 2, new java.util.concurrent.LinkedBlockingQueue());
        dn.o oVar = new dn.o();
        oVar.M1 = dataUrl;
        oVar.field_mediaId = fileCacheId;
        oVar.field_fullpath = ol4.s.f346206d.d(fileCacheId);
        boolean z17 = true;
        oVar.H1 = 1;
        oVar.f241785d = "task_TingAudioDownloader";
        oVar.Z = 10;
        oVar.f241809y0 = 4;
        oVar.f241791l1 = true;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (!z17) {
            oVar.N1 = str;
        }
        this.f356735s = oVar;
        this.f356736t = new pl4.f(this);
        this.f356737u = new pl4.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016a  */
    /* JADX WARN: Type inference failed for: r9v1, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(pl4.k r21, com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest r22) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl4.k.a(pl4.k, com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest):boolean");
    }

    public static int h(pl4.k kVar, long j17, long j18, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "requestVideoData, mediaId:" + kVar.f356718b + ", offset: " + j17 + ", length: " + j18 + ", durationMs: " + i17);
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).requestVideoData(kVar.f356718b, j17, j18, 10000);
    }

    public final void b() {
        if (this.f356729m) {
            synchronized (this.f356721e) {
                if (!this.f356726j) {
                    if (this.f356727k) {
                        if (this.f356730n) {
                            if (this.f356725i > 0) {
                                this.f356730n = false;
                                long d17 = d(0L);
                                com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "checkBufferTask fileCacheId " + this.f356718b + " requestAllData currentOffset " + d17);
                                h(this, d17, this.f356725i, 0, 4, null);
                                return;
                            }
                            return;
                        }
                        synchronized (this.f356721e) {
                            if (this.f356732p.isEmpty()) {
                                return;
                            }
                            com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest = (com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest) this.f356732p.getLast();
                            long currentOffset = iTPAssetResourceLoadingRequest.getLoadingDataRequest().getCurrentOffset();
                            long requestedOffset = (iTPAssetResourceLoadingRequest.getLoadingDataRequest().getRequestedOffset() + iTPAssetResourceLoadingRequest.getLoadingDataRequest().getRequestedLength()) - currentOffset;
                            long j17 = this.f356725i;
                            if (requestedOffset > j17) {
                                requestedOffset = j17;
                            }
                            if (requestedOffset <= 0) {
                                return;
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "checkBufferTask fileCacheId:" + this.f356718b + ", currentOffset:" + currentOffset + ", leftLength:" + requestedOffset);
                            h(this, currentOffset, requestedOffset, 0, 4, null);
                        }
                    }
                }
            }
        }
    }

    public final void c(long j17) {
        this.f356725i = j17;
        yz5.l lVar = this.f356734r;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(j17));
        }
        this.f356734r = null;
    }

    public final long d(long j17) {
        if (this.f356726j) {
            return this.f356725i - j17;
        }
        long[] jArr = new long[2];
        int queryContinuousSize = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryContinuousSize(this.f356718b, j17, jArr);
        long j18 = jArr[0];
        if (queryContinuousSize != 0 || j18 == -1) {
            return 0L;
        }
        return j18;
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener
    public void didCancelLoadingRequest(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest) {
        synchronized (this.f356721e) {
            this.f356732p.remove(iTPAssetResourceLoadingRequest);
        }
    }

    public final void e() {
        if (this.f356722f != null) {
            return;
        }
        boolean z17 = true;
        java.lang.String str = this.f356719c;
        if (str != null && (r26.n0.N(str) ^ true)) {
            if (!com.tencent.qqmusicplayerprocess.audio.playermanager.EKeyDecryptor.f215255c) {
                try {
                    fp.d0.n("ekeydecryptor");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TingTPResourceLoader", "loadLibrary failed e " + e17.getMessage());
                    this.f356720d.invoke("Decrypt init error: " + e17.getMessage());
                    z17 = false;
                }
                com.tencent.qqmusicplayerprocess.audio.playermanager.EKeyDecryptor.f215255c = z17;
            }
            if (com.tencent.qqmusicplayerprocess.audio.playermanager.EKeyDecryptor.f215255c) {
                this.f356722f = new com.tencent.qqmusicplayerprocess.audio.playermanager.EKeyDecryptor(str);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.TingTPResourceLoader", "loadLibrary failed");
            }
        }
    }

    public final void f(boolean z17, boolean z18) {
        java.lang.String str;
        boolean z19;
        synchronized (this.f356721e) {
            if (this.f356727k) {
                return;
            }
            this.f356727k = true;
            if (z17) {
                e();
            }
            com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
            dn.o oVar = this.f356735s;
            c2CDownloadRequest.fileKey = oVar.field_mediaId;
            c2CDownloadRequest.url = oVar.M1;
            c2CDownloadRequest.referer = oVar.N1;
            c2CDownloadRequest.setSavePath(oVar.field_fullpath);
            c2CDownloadRequest.fileType = 90;
            c2CDownloadRequest.apptype = 276;
            c2CDownloadRequest.bizid = 3;
            c2CDownloadRequest.concurrentCount = 4;
            c2CDownloadRequest.transforTimeoutSeconds = 60;
            dn.o oVar2 = this.f356735s;
            c2CDownloadRequest.preloadRatio = oVar2.field_preloadRatio;
            c2CDownloadRequest.preloadMinSize = oVar2.f241805x;
            c2CDownloadRequest.treatAsVideoFile = oVar2.f241791l1;
            pl4.c cVar = f356716v;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingTPDownloadUseSimpleDns()) == 1) {
                c2CDownloadRequest.resolveHostPriority = 1;
                c2CDownloadRequest.resolveHostFlags = 7;
            }
            dn.o oVar3 = this.f356735s;
            if (com.tencent.mm.vfs.w6.j(oVar3.M1)) {
                str = oVar3.M1;
            } else {
                java.lang.String field_fullpath = oVar3.field_fullpath;
                kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
                str = (com.tencent.mm.vfs.w6.j(cVar.a(field_fullpath)) && com.tencent.mm.vfs.w6.j(oVar3.field_fullpath)) ? oVar3.field_fullpath : null;
            }
            if (str != null && (r26.n0.N(str) ^ true)) {
                long k17 = com.tencent.mm.vfs.w6.k(str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIsDownloadComplete mediaId:");
                sb6.append(this.f356718b);
                sb6.append(" total:");
                sb6.append(k17);
                sb6.append(", decryptKeySize:");
                java.lang.String str2 = this.f356719c;
                sb6.append(str2 != null ? str2.length() : 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", sb6.toString());
                if (this.f356725i <= 0 && k17 > 0) {
                    this.f356726j = true;
                    c(k17);
                }
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19) {
                this.f356724h = true;
                return;
            }
            int startSNSDownload = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this.f356736t, this.f356737u, this.f356735s.H1);
            if (-21006 == startSNSDownload && !z18) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "startSNSDownload fileCacheId:" + this.f356718b + ", result:" + startSNSDownload + " do retry");
                ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(this.f356718b);
                synchronized (this.f356721e) {
                    this.f356727k = false;
                }
                f(z17, true);
                return;
            }
            byte[] bytes = (this.f356717a + '-' + this.f356719c).getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("startSNSDownload, useSimpleDns: ");
            sb7.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ting.RepairerConfigTingTPDownloadUseSimpleDns()) == 1);
            sb7.append(", mediaId: ");
            sb7.append(this.f356735s.field_mediaId);
            sb7.append(", result: ");
            sb7.append(startSNSDownload);
            sb7.append(", decryptKeySize:");
            java.lang.String str3 = this.f356719c;
            sb7.append(str3 != null ? str3.length() : 0);
            sb7.append(", md5hash:");
            sb7.append(g17);
            sb7.append(", url:");
            sb7.append(this.f356735s.M1);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", sb7.toString());
            if (startSNSDownload != 0) {
                this.f356720d.invoke("download error: " + startSNSDownload);
            }
        }
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener
    public void fillInContentInformation(com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest) {
        if (tPAssetResourceLoadingContentInformationRequest == null) {
            return;
        }
        tPAssetResourceLoadingContentInformationRequest.contentType = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4;
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("resourceLoader");
        boolean j17 = com.tencent.mm.vfs.w6.j(c17);
        java.lang.String str = this.f356718b;
        if (!j17) {
            com.tencent.mm.vfs.w6.u(c17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "fillInContentInformation, fileCacheId:" + str + ", mkdirs for " + c17 + ", success: " + com.tencent.mm.vfs.w6.j(c17) + '.');
        }
        boolean z17 = true;
        java.lang.String b17 = com.tencent.mm.vfs.x6.b(c17 + '/' + str + ".mp4", true);
        if (b17 != null && b17.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            tPAssetResourceLoadingContentInformationRequest.dataFilePath = b17;
        }
        if (this.f356725i <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "fillInContentInformation, fileCacheId:" + str + ", totalLen:" + this.f356725i + ", nativePath:" + b17);
        tPAssetResourceLoadingContentInformationRequest.dataTotalSize = this.f356725i;
    }

    public final void g() {
        this.f356733q.execute(new pl4.g(this));
    }

    public final void i(boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).h(new pl4.h(this, z17), "TingTPResourceLoaderPool");
    }

    public final void j(boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).h(new pl4.i(this, z17), "TingTPResourceLoaderPool");
    }

    @Override // com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener
    public boolean shouldWaitForLoadingOfRequestedResource(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest iTPAssetResourceLoadingRequest) {
        if (iTPAssetResourceLoadingRequest == null) {
            return false;
        }
        com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingDataRequest loadingDataRequest = iTPAssetResourceLoadingRequest.getLoadingDataRequest();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingTPResourceLoader", "shouldWaitForLoadingOfRequestedResource, fileCacheId:" + this.f356718b + ", requestedOffset:" + loadingDataRequest.getRequestedOffset() + ", currentOffset:" + loadingDataRequest.getCurrentOffset() + ", requestedLength:" + loadingDataRequest.getRequestedLength());
        synchronized (this.f356721e) {
            this.f356732p.add(iTPAssetResourceLoadingRequest);
            this.f356731o = true;
        }
        i(false);
        g();
        b();
        return true;
    }
}

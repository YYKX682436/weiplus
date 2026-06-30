package pk1;

/* loaded from: classes12.dex */
public final class c0 implements dn.k, dn.n {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.c0 f355423d = new pk1.c0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f355424e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f355425f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f355426g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f355427h = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f355428i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f355429m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f355430n = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f355431o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f355432p = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.HashMap f355433q = new java.util.HashMap();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f355434r = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: s, reason: collision with root package name */
    public static yz5.l f355435s;

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "getCdnAuthInfo, mediaId: " + str);
    }

    public final void a(java.lang.Object caller, java.lang.String srcUrl, java.lang.String str, java.lang.String downloadId, java.lang.String cachePath, long j17, long j18) {
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        kotlin.jvm.internal.o.g(caller, "caller");
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        kotlin.jvm.internal.o.g(cachePath, "cachePath");
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355424e;
        reentrantLock.lock();
        try {
            java.util.HashMap hashMap = f355425f;
            pk1.b0 b0Var = (pk1.b0) hashMap.get(downloadId);
            reentrantLock.unlock();
            if (b0Var == null) {
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f355434r;
                reentrantLock2.lock();
                try {
                    yz5.l lVar = f355435s;
                    if (lVar != null) {
                        lVar.invoke(downloadId);
                    }
                    pk1.b0 b0Var2 = new pk1.b0(srcUrl, downloadId, cachePath, 0L, 0L, 24, null);
                    str2 = "MicroMsg.AppBrand.ThumbCdnDownloadManager";
                    com.tencent.mars.xlog.Log.i(str2, "startDownload, addDownloadTask");
                    pk1.b bVar = pk1.b.f355416d;
                    dn.o oVar = new dn.o();
                    oVar.M1 = srcUrl;
                    oVar.field_mediaId = downloadId;
                    oVar.field_fullpath = cachePath;
                    oVar.N1 = str;
                    oVar.H1 = 1;
                    pk1.c0 c0Var = f355423d;
                    oVar.f241787f = c0Var;
                    oVar.f241815c2 = c0Var;
                    oVar.f241785d = "task_AppbrandCdnService_2";
                    oVar.Z = 4;
                    str3 = "MicroMsg.AppBrandCdnService";
                    com.tencent.mars.xlog.Log.i(str3, "addDownloadTask, mediaId: " + oVar.field_mediaId);
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = pk1.b.f355418f;
                    if (concurrentHashMap.putIfAbsent(oVar.field_mediaId, oVar) == null) {
                        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
                        c2CDownloadRequest.fileKey = oVar.field_mediaId;
                        c2CDownloadRequest.url = oVar.M1;
                        c2CDownloadRequest.referer = oVar.N1;
                        c2CDownloadRequest.setSavePath(oVar.field_fullpath);
                        c2CDownloadRequest.fileType = 20210;
                        c2CDownloadRequest.concurrentCount = 10;
                        c2CDownloadRequest.preloadRatio = oVar.field_preloadRatio;
                        c2CDownloadRequest.preloadMinSize = oVar.f241805x;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.N1) || ((java.lang.Boolean) ((jz5.n) pk1.b.f355419g).getValue()).booleanValue()) {
                            str4 = "User-Agent:" + bVar.b() + "\r\nAccept-Encoding:identity\nContent-Type:\r\n";
                        } else {
                            str4 = "User-Agent:" + bVar.b() + "\r\nAccept-Encoding:identity\nContent-Type:\r\nReferer:" + oVar.N1 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
                        }
                        c2CDownloadRequest.customHeader = str4;
                        i17 = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startHttpVideoStreamingDownload(c2CDownloadRequest, bVar, bVar, oVar.H1);
                        com.tencent.mars.xlog.Log.i(str3, "addDownloadTask, startHttpVideoStreamingDownload, result: " + i17 + ", disableRefererHeader:" + ((java.lang.Boolean) ((jz5.n) pk1.b.f355419g).getValue()).booleanValue());
                        if (i17 != 0) {
                            concurrentHashMap.remove(oVar.field_mediaId);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i(str3, "download task has already add");
                        i17 = 0;
                    }
                    if (i17 != 0) {
                        com.tencent.mars.xlog.Log.w(str2, "startDownload, addDownloadTask fail");
                        java.util.concurrent.locks.ReentrantLock reentrantLock3 = f355427h;
                        reentrantLock3.lock();
                        try {
                            f355428i.put(downloadId, java.lang.Boolean.FALSE);
                            java.util.HashSet hashSet = (java.util.HashSet) f355429m.get(downloadId);
                            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
                            if (X0 != null) {
                                java.util.Iterator it = X0.iterator();
                                while (it.hasNext()) {
                                    yz5.l lVar2 = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                                    if (lVar2 != null) {
                                        lVar2.invoke(java.lang.Boolean.FALSE);
                                    }
                                }
                                return;
                            }
                            return;
                        } finally {
                            reentrantLock3.unlock();
                        }
                    }
                    reentrantLock.lock();
                    try {
                        hashMap.put(downloadId, b0Var2);
                        java.util.HashMap hashMap2 = f355426g;
                        java.lang.Object obj = hashMap2.get(downloadId);
                        if (obj == null) {
                            obj = new java.util.HashSet();
                            hashMap2.put(downloadId, obj);
                        }
                        ((java.util.HashSet) obj).add(java.lang.Integer.valueOf(caller.hashCode()));
                    } finally {
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            } else {
                str2 = "MicroMsg.AppBrand.ThumbCdnDownloadManager";
                str3 = "MicroMsg.AppBrandCdnService";
            }
            pk1.b bVar2 = pk1.b.f355416d;
            com.tencent.mars.xlog.Log.i(str3, "requestVideoData, mediaId: " + downloadId + ", offset: " + j17 + ", length: " + j18 + ", durationMs: 0");
            com.tencent.mars.xlog.Log.i(str2, "startDownload, requestVideoData, downloadId: " + downloadId + ", offset: " + j17 + ", length: " + j18 + " result:" + ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).requestVideoData(downloadId, j17, j18, 0));
        } finally {
        }
    }

    public final void b(java.lang.Object caller, java.lang.String downloadId) {
        kotlin.jvm.internal.o.g(caller, "caller");
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355424e;
        reentrantLock.lock();
        java.util.HashMap hashMap = f355425f;
        try {
            if (((pk1.b0) hashMap.get(downloadId)) == null) {
                return;
            }
            java.util.HashMap hashMap2 = f355426g;
            java.util.HashSet hashSet = (java.util.HashSet) hashMap2.get(downloadId);
            boolean z17 = false;
            if (hashSet != null && true == hashSet.remove(java.lang.Integer.valueOf(caller.hashCode()))) {
                z17 = true;
            }
            if (z17) {
                if (!hashSet.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "stopDownload, callersSet is not empty");
                    return;
                }
                reentrantLock.unlock();
                if (pk1.b.f355416d.a(downloadId) != 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ThumbCdnDownloadManager", "stopDownload, cancelDownloadTask fail");
                }
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f355427h;
                reentrantLock2.lock();
                try {
                    f355428i.remove(downloadId);
                    java.util.HashSet hashSet2 = (java.util.HashSet) f355429m.get(downloadId);
                    if (hashSet2 != null) {
                        java.util.Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                            if (lVar != null) {
                                lVar.invoke(java.lang.Boolean.FALSE);
                            }
                        }
                    }
                    reentrantLock.lock();
                    try {
                        hashMap2.remove(downloadId);
                    } finally {
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
        } finally {
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (str == null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355427h;
        reentrantLock.lock();
        try {
            f355428i.put(str, java.lang.Boolean.TRUE);
            java.util.HashSet hashSet = (java.util.HashSet) f355429m.get(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.TRUE);
                    }
                }
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = f355430n;
            reentrantLock2.lock();
            java.util.HashMap hashMap = f355431o;
            try {
                java.util.HashSet hashSet2 = j17 >= j18 ? (java.util.HashSet) hashMap.remove(str) : (java.util.HashSet) hashMap.get(str);
                if (hashSet2 != null) {
                    java.util.Iterator it6 = hashSet2.iterator();
                    while (it6.hasNext()) {
                        yz5.p pVar = (yz5.p) ((java.lang.ref.WeakReference) it6.next()).get();
                        if (pVar != null) {
                            pVar.invoke(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
                        }
                    }
                }
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = f355424e;
                reentrantLock3.lock();
                try {
                    pk1.b0 b0Var = (pk1.b0) f355425f.get(str);
                    if (b0Var == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onProgress, taskInfo is null");
                    } else {
                        b0Var.f355420a = j17;
                        b0Var.f355421b = j18;
                    }
                } finally {
                    reentrantLock3.unlock();
                }
            } finally {
                reentrantLock2.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onFinish, mediaId: " + str + ", ret: " + i17);
        if (str == null || hVar == null) {
            return;
        }
        boolean z17 = i17 == 0;
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355427h;
        reentrantLock.lock();
        try {
            f355428i.put(str, java.lang.Boolean.valueOf(z17));
            java.util.HashSet hashSet = (java.util.HashSet) f355429m.remove(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.valueOf(z17));
                    }
                }
            }
            long j17 = hVar.field_fileLength;
            if (z17) {
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f355430n;
                reentrantLock2.lock();
                try {
                    java.util.HashSet hashSet2 = (java.util.HashSet) f355431o.remove(str);
                    if (hashSet2 != null) {
                        java.util.Iterator it6 = hashSet2.iterator();
                        while (it6.hasNext()) {
                            yz5.p pVar = (yz5.p) ((java.lang.ref.WeakReference) it6.next()).get();
                            if (pVar != null) {
                                pVar.invoke(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j17));
                            }
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
            if (pk1.b.f355416d.a(str) != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onFinish, cancelDownloadTask fail");
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock3 = f355424e;
            reentrantLock3.lock();
            try {
                f355426g.remove(str);
                if (z17) {
                    java.util.concurrent.locks.ReentrantLock reentrantLock4 = f355432p;
                    reentrantLock4.lock();
                    try {
                        java.util.HashSet hashSet3 = (java.util.HashSet) f355433q.remove(str);
                        java.util.Set X02 = hashSet3 != null ? kz5.n0.X0(hashSet3) : null;
                        if (X02 != null) {
                            java.util.Iterator it7 = X02.iterator();
                            while (it7.hasNext()) {
                                pk1.a0 a0Var = (pk1.a0) ((java.lang.ref.WeakReference) it7.next()).get();
                                if (a0Var != null) {
                                    pk1.l0 l0Var = ((pk1.k0) a0Var).f355460a;
                                    com.tencent.mars.xlog.Log.i(l0Var.f355470h, "onFinish: total: " + j17);
                                    com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = l0Var.f355469g;
                                    if (aVar != null) {
                                        pk1.r rVar = (pk1.r) aVar;
                                        java.lang.System.currentTimeMillis();
                                        rVar.f355492d = j17;
                                        com.tencent.mars.xlog.Log.i(rVar.f355486a, "markDownloadFinish videoFileSize:%d", java.lang.Long.valueOf(j17));
                                    }
                                }
                            }
                        }
                    } finally {
                        reentrantLock4.unlock();
                    }
                }
            } finally {
                reentrantLock3.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onDataAvailable, mediaId: " + str + ", offset: " + j17 + ", length: " + j18);
        if (str == null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355427h;
        reentrantLock.lock();
        try {
            f355428i.put(str, java.lang.Boolean.TRUE);
            java.util.HashSet hashSet = (java.util.HashSet) f355429m.get(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.TRUE);
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onMoovReady, mediaId: " + str + ", m3u8: " + str2);
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "onMoovReady, mediaId: " + str + ", offset: " + j17 + ", length: " + j18);
        if (str == null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355427h;
        reentrantLock.lock();
        try {
            f355428i.put(str, java.lang.Boolean.TRUE);
            java.util.HashSet hashSet = (java.util.HashSet) f355429m.get(str);
            java.util.Set X0 = hashSet != null ? kz5.n0.X0(hashSet) : null;
            if (X0 != null) {
                java.util.Iterator it = X0.iterator();
                while (it.hasNext()) {
                    yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                    if (lVar != null) {
                        lVar.invoke(java.lang.Boolean.TRUE);
                    }
                }
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = f355432p;
            reentrantLock2.lock();
            try {
                java.util.HashSet hashSet2 = (java.util.HashSet) f355433q.get(str);
                java.util.Set X02 = hashSet2 != null ? kz5.n0.X0(hashSet2) : null;
                if (X02 != null) {
                    java.util.Iterator it6 = X02.iterator();
                    while (it6.hasNext()) {
                        pk1.a0 a0Var = (pk1.a0) ((java.lang.ref.WeakReference) it6.next()).get();
                        if (a0Var != null) {
                            pk1.l0 l0Var = ((pk1.k0) a0Var).f355460a;
                            com.tencent.mars.xlog.Log.i(l0Var.f355470h, "onMoovReady: offset: " + j17 + ", length: " + j18);
                            com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = l0Var.f355469g;
                            if (aVar != null) {
                                pk1.r rVar = (pk1.r) aVar;
                                if (j18 > 0 && rVar.M > 0) {
                                    rVar.L = java.lang.System.currentTimeMillis() - rVar.M;
                                    rVar.f355485J = j18;
                                    rVar.K = j17;
                                }
                                com.tencent.mars.xlog.Log.i(rVar.f355486a, "setMoovInfo offset:%d, moovSize:%d， moovCostTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(rVar.L));
                            }
                        }
                    }
                }
            } finally {
                reentrantLock2.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "callback, mediaId: " + mediaId + ", startRet: " + i17);
        if (i17 == 0) {
            return 0;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355427h;
        reentrantLock.lock();
        try {
            f355428i.put(mediaId, java.lang.Boolean.FALSE);
            java.util.HashSet hashSet = (java.util.HashSet) f355429m.get(mediaId);
            if (hashSet == null) {
                return 0;
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                yz5.l lVar = (yz5.l) ((java.lang.ref.WeakReference) it.next()).get();
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.FALSE);
                }
            }
            return 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnDownloadManager", "decodePrepareResponse, mediaId: " + str);
        return new byte[0];
    }
}

package ha3;

/* loaded from: classes15.dex */
public final class j extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f279874d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f279875e;

    /* renamed from: f, reason: collision with root package name */
    public final ha3.l0 f279876f;

    /* renamed from: g, reason: collision with root package name */
    public int f279877g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f279878h;

    /* renamed from: i, reason: collision with root package name */
    public long f279879i;

    /* renamed from: m, reason: collision with root package name */
    public long f279880m;

    /* renamed from: n, reason: collision with root package name */
    public int f279881n;

    /* renamed from: o, reason: collision with root package name */
    public long f279882o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f279883p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f279884q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279885r;

    public j(ha3.v vVar, java.lang.String mainMediaId, java.lang.String rawPreviewUrl) {
        kotlin.jvm.internal.o.g(mainMediaId, "mainMediaId");
        kotlin.jvm.internal.o.g(rawPreviewUrl, "rawPreviewUrl");
        this.f279885r = vVar;
        this.f279874d = mainMediaId;
        this.f279875e = "LiteAppVideoHLSPlayer.HLSResourceLoaderProxy";
        this.f279876f = new ha3.l0();
        this.f279878h = "";
        this.f279881n = -1;
        this.f279883p = "";
        this.f279884q = "";
    }

    public final void a() {
        java.util.Objects.toString(this.f279885r.f279940b);
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.h0 h0Var = ha3.j0.f279887b;
        h0Var.getClass();
        java.lang.String mainMediaId = this.f279874d;
        kotlin.jvm.internal.o.g(mainMediaId, "mainMediaId");
        java.util.Map map = h0Var.f279870e;
        kotlin.jvm.internal.o.d(map);
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            ha3.e0 e0Var = (ha3.e0) entry.getValue();
            if (!e0Var.f279838f) {
                kotlin.jvm.internal.o.d(str);
                if (r26.i0.y(str, mainMediaId.concat("@"), false) && e0Var.f279839g) {
                    ha3.j0.f279886a.b(str);
                    e0Var.f279839g = false;
                }
            }
        }
    }

    public final void b(java.lang.String fileName, boolean z17) {
        ha3.l0 l0Var = this.f279876f;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(fileName, "fileName");
        ha3.m0 m0Var = (ha3.m0) ((java.util.LinkedHashMap) l0Var.f279898d).get(fileName);
        l0Var.hashCode();
        if (m0Var == null) {
            com.tencent.mars.xlog.Log.e(this.f279875e, "[prepareTsData] failed: ".concat(fileName));
        } else {
            c(m0Var);
            if (z17) {
                c(l0Var.b(m0Var.f279900a + 1));
            }
        }
    }

    public final void c(ha3.m0 m0Var) {
        dn.o oVar;
        ha3.e0 e0Var;
        boolean z17;
        ha3.e0 e0Var2;
        java.lang.String str = this.f279875e;
        if (m0Var == null) {
            com.tencent.mars.xlog.Log.e(str, "[tryDownloadSegment] failed, invalid segmentInfo");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "[tryDownloadSegment] seg, " + m0Var.f279902c);
        java.lang.String str2 = m0Var.f279903d;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.String segmentFile = m0Var.f279902c;
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.h0 h0Var = ha3.j0.f279887b;
        java.lang.String str4 = this.f279885r.f279939a;
        kotlin.jvm.internal.o.d(str4);
        h0Var.getClass();
        java.lang.String mainMediaId = this.f279874d;
        kotlin.jvm.internal.o.g(mainMediaId, "mainMediaId");
        kotlin.jvm.internal.o.g(segmentFile, "segmentFile");
        java.lang.String mediaId = ha3.r0.f279930a.a(mainMediaId, segmentFile);
        java.lang.String o17 = new com.tencent.mm.vfs.r6(h0Var.f279869d + mainMediaId.concat("_liteapp") + "-hls").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPreviewSegmentTask] try start, mediaId: ");
        sb6.append(mediaId);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", sb6.toString());
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        try {
            android.net.Uri parse = android.net.Uri.parse(str4);
            java.lang.String host = parse.getHost();
            java.lang.String queryParameter = parse.getQueryParameter("aesKey");
            java.lang.String str5 = o17 + '/' + mediaId;
            java.lang.String queryParameter2 = parse.getQueryParameter("fileExt");
            if (queryParameter2 == null) {
                queryParameter2 = "mp4";
            }
            oVar = dn.e.a(mediaId, str3, host, queryParameter, str5, queryParameter2);
        } catch (java.lang.Exception unused) {
            oVar = null;
        }
        if (oVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] create task failed, mediaId: ".concat(mediaId));
            return;
        }
        java.util.Map map = h0Var.f279870e;
        if (map.get(mediaId) == null) {
            e0Var = new ha3.e0();
        } else {
            java.lang.Object obj = map.get(mediaId);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.media.video.LiteAppVideoPlayerCdnDownloadMgr.LiteAppVideoPlayerTaskInfo");
            e0Var = (ha3.e0) obj;
        }
        java.lang.String field_fullpath = oVar.field_fullpath;
        kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
        if (com.tencent.mm.vfs.w6.j(field_fullpath)) {
            long k17 = com.tencent.mm.vfs.w6.k(field_fullpath);
            if (map.get(mediaId) == null) {
                e0Var2 = new ha3.e0();
            } else {
                java.lang.Object obj2 = map.get(mediaId);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.lite.media.video.LiteAppVideoPlayerCdnDownloadMgr.LiteAppVideoPlayerTaskInfo");
                e0Var2 = (ha3.e0) obj2;
            }
            e0Var2.f279836d = true;
            e0Var2.f279833a = k17;
            e0Var2.f279835c = k17;
            e0Var2.f279837e = field_fullpath;
            e0Var2.f279839g = false;
            map.put(mediaId, e0Var2);
            ha3.e0 e0Var3 = (ha3.e0) map.get(mediaId);
            if (e0Var3 != null) {
                e0Var3.f279839g = false;
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] hit cache, mediaId: ".concat(mediaId));
            return;
        }
        if (e0Var.f279839g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] isDoing: mediaId: ".concat(mediaId));
            return;
        }
        if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(mediaId)) {
            int b17 = ha3.j0.f279886a.b(mediaId);
            e0Var.f279839g = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerCdnDownloadMgr", "[startPreviewSegmentTask] cancel for restart, mediaId: " + mediaId + " cancelResult:" + b17);
        }
        java.lang.String field_fullpath2 = oVar.field_fullpath;
        kotlin.jvm.internal.o.f(field_fullpath2, "field_fullpath");
        e0Var.f279837e = field_fullpath2;
        e0Var.f279839g = true;
        oVar.f241815c2 = h0Var;
        ha3.i0 i0Var2 = ha3.j0.f279886a;
        i0Var2.getClass();
        java.lang.String str6 = oVar.field_fullpath;
        java.lang.String str7 = oVar.field_fullpath + "_temp";
        oVar.field_fullpath = str7;
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest b18 = ha3.r0.f279930a.b(oVar);
        kotlin.jvm.internal.o.d(str6);
        if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(b18, i0Var2, new ha3.q0(i0Var2, str7, str6), 0) == 0) {
            java.util.HashMap hashMap = i0Var2.f279873d;
            java.lang.String field_mediaId = oVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, oVar);
        }
        map.put(mediaId, e0Var);
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        if (r26.i0.n(fileName, ".ts", false)) {
            return "video/mp2t";
        }
        java.util.Objects.toString(this.f279885r.f279940b);
        return "application/vnd.apple.mpegurl";
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String a17 = ha3.r0.f279930a.a(this.f279874d, fileName);
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.e0 c17 = ha3.j0.f279887b.c(a17);
        java.lang.String str2 = c17 != null ? c17.f279837e : null;
        kotlin.jvm.internal.o.d(str2);
        java.util.Objects.toString(this.f279885r.f279940b);
        return str2;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String a17 = ha3.r0.f279930a.a(this.f279874d, fileName);
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.h0 h0Var = ha3.j0.f279887b;
        ha3.e0 c17 = h0Var.c(a17);
        java.lang.String str2 = c17 != null ? c17.f279837e : null;
        kotlin.jvm.internal.o.d(str2);
        boolean j17 = com.tencent.mm.vfs.w6.j(str2);
        ha3.v vVar = this.f279885r;
        java.lang.String str3 = this.f279875e;
        if (j17) {
            long k17 = com.tencent.mm.vfs.w6.k(str2);
            if (k17 == 0) {
                com.tencent.mm.vfs.w6.h(str2);
                b(fileName, false);
                com.tencent.mars.xlog.Log.e(str3, "[getDataTotalSize] res exist but length = 0, retry download mediaId=" + a17 + " fileName=" + fileName);
                return k17;
            }
            com.tencent.mars.xlog.Log.i(str3, "[getDataTotalSize] res exist, player: " + vVar.f279940b + " mediaId=" + a17 + " fileName=" + fileName + " localTotalSize:" + k17);
            return k17;
        }
        ha3.e0 c18 = h0Var.c(a17);
        java.lang.Long valueOf = c18 != null ? java.lang.Long.valueOf(c18.f279835c) : null;
        kotlin.jvm.internal.o.d(valueOf);
        long longValue = valueOf.longValue();
        if (this.f279882o != longValue || !kotlin.jvm.internal.o.b(this.f279883p, fileName)) {
            this.f279882o = longValue;
            this.f279883p = fileName;
            com.tencent.mars.xlog.Log.i(str3, "[getDataTotalSize] wait to download, player: " + vVar.f279940b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
        }
        if (longValue <= 0 && !kotlin.jvm.internal.o.b(this.f279884q, fileName)) {
            com.tencent.mars.xlog.Log.e(str3, "[getDataTotalSize] error, player: " + vVar.f279940b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
            this.f279884q = fileName;
        }
        return longValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader, com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        ha3.v vVar;
        ha3.l0 l0Var;
        ha3.v vVar2;
        java.util.Iterator it;
        ha3.l0 l0Var2;
        double d17;
        java.util.Iterator it6;
        ha3.v vVar3 = this.f279885r;
        java.lang.String str3 = vVar3.f279941c;
        ?? r47 = 0;
        boolean z17 = vVar3.f279942d.length() == 0;
        ha3.l0 l0Var3 = this.f279876f;
        if (z17) {
            java.lang.String rawM3U8Content = vVar3.f279941c;
            l0Var3.getClass();
            kotlin.jvm.internal.o.g(rawM3U8Content, "rawM3U8Content");
            java.lang.StringBuilder sb6 = l0Var3.f279896b;
            r26.e0.d(sb6);
            java.util.ArrayList arrayList = (java.util.ArrayList) l0Var3.f279897c;
            arrayList.clear();
            java.util.Map map = l0Var3.f279898d;
            ((java.util.LinkedHashMap) map).clear();
            java.util.Iterator it7 = new r26.t("\\r?\\n").g(rawM3U8Content, 0).iterator();
            int i18 = 0;
            ha3.m0 m0Var = null;
            java.util.LinkedHashMap linkedHashMap = null;
            while (it7.hasNext()) {
                java.lang.String obj = r26.n0.u0((java.lang.String) it7.next()).toString();
                if (!(obj.length() == 0 ? true : r47)) {
                    if (r26.i0.y(obj, "#EXT-X-MEDIA-SEQUENCE:", r47)) {
                        java.lang.String substring = obj.substring(22);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        java.lang.Integer h17 = r26.h0.h(substring);
                        l0Var3.f279895a = h17 != null ? h17.intValue() : r47;
                        l0Var3.a(obj);
                    } else if (r26.i0.y(obj, "#EXT-X-TARGETDURATION:", r47)) {
                        java.lang.String substring2 = obj.substring(22);
                        kotlin.jvm.internal.o.f(substring2, "substring(...)");
                        java.lang.Double e17 = r26.g0.e(substring2);
                        if (e17 != null) {
                            e17.doubleValue();
                        }
                        l0Var3.a(obj);
                    } else {
                        if (r26.i0.y(obj, "#EXT-X-KEY:", r47)) {
                            java.lang.String substring3 = obj.substring(11);
                            kotlin.jvm.internal.o.f(substring3, "substring(...)");
                            java.util.List f07 = r26.n0.f0(substring3, new java.lang.String[]{","}, false, 0, 6, null);
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            java.util.Iterator it8 = f07.iterator();
                            while (it8.hasNext()) {
                                java.util.List f08 = r26.n0.f0((java.lang.String) it8.next(), new java.lang.String[]{"="}, false, 2, 2, null);
                                java.util.Iterator it9 = it7;
                                if (f08.size() >= 2) {
                                    java.lang.String obj2 = r26.n0.u0((java.lang.String) f08.get(r47)).toString();
                                    java.lang.String obj3 = r26.n0.u0((java.lang.String) f08.get(1)).toString();
                                    if (kotlin.jvm.internal.o.b(obj2, "URI")) {
                                        it6 = it8;
                                        if (r26.i0.A(obj3, "\"", r47, 2, null) && r26.i0.n(obj3, "\"", r47)) {
                                            obj3 = obj3.substring(1, obj3.length() - 1);
                                            kotlin.jvm.internal.o.f(obj3, "substring(...)");
                                            linkedHashMap2.put(obj2, obj3);
                                        }
                                    } else {
                                        it6 = it8;
                                    }
                                    linkedHashMap2.put(obj2, obj3);
                                } else {
                                    it6 = it8;
                                }
                                it8 = it6;
                                it7 = it9;
                            }
                            it = it7;
                            l0Var3.a(obj);
                            vVar2 = vVar3;
                            l0Var2 = l0Var3;
                            linkedHashMap = linkedHashMap2;
                        } else {
                            it = it7;
                            if (r26.i0.y(obj, "#EXTINF:", r47)) {
                                m0Var = new ha3.m0(0, 0.0d, null, null, null, 31, null);
                                m0Var.f279900a = l0Var3.f279895a + i18;
                                i18++;
                                java.lang.String substring4 = obj.substring(8);
                                kotlin.jvm.internal.o.f(substring4, "substring(...)");
                                int K = r26.n0.K(substring4, ',', 0, false, 6, null);
                                java.lang.String str4 = substring4;
                                if (K != -1) {
                                    java.lang.String substring5 = substring4.substring(r47, K);
                                    kotlin.jvm.internal.o.f(substring5, "substring(...)");
                                    str4 = substring5;
                                }
                                java.lang.Double e18 = r26.g0.e(str4);
                                vVar2 = vVar3;
                                if (e18 != null) {
                                    double doubleValue = e18.doubleValue();
                                    l0Var2 = l0Var3;
                                    d17 = doubleValue;
                                } else {
                                    l0Var2 = l0Var3;
                                    d17 = 0.0d;
                                }
                                m0Var.f279901b = java.lang.Math.max(0.0d, d17);
                                m0Var.f279904e = linkedHashMap;
                                l0Var2.a(obj);
                            } else {
                                vVar2 = vVar3;
                                l0Var2 = l0Var3;
                                if (!r26.i0.y(obj, "#", false) && m0Var != null) {
                                    java.lang.String str5 = i18 + ".ts";
                                    kotlin.jvm.internal.o.g(str5, "<set-?>");
                                    m0Var.f279902c = str5;
                                    m0Var.f279903d = obj;
                                    map.put(str5, m0Var);
                                    arrayList.add(m0Var);
                                    obj = m0Var.f279902c;
                                    m0Var = null;
                                }
                                l0Var2.a(obj);
                            }
                        }
                        l0Var3 = l0Var2;
                        vVar3 = vVar2;
                        r47 = 0;
                        it7 = it;
                    }
                }
                vVar2 = vVar3;
                it = it7;
                l0Var2 = l0Var3;
                l0Var3 = l0Var2;
                vVar3 = vVar2;
                r47 = 0;
                it7 = it;
            }
            vVar = vVar3;
            l0Var = l0Var3;
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            vVar.f279942d = sb7;
            com.tencent.mars.xlog.Log.i(this.f279875e, "[tryDownloadSegment] index: 0");
            c(l0Var.b(0));
        } else {
            vVar = vVar3;
            l0Var = l0Var3;
        }
        l0Var.getClass();
        return vVar.f279942d;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String a17 = ha3.r0.f279930a.a(this.f279874d, fileName);
        boolean b17 = kotlin.jvm.internal.o.b(this.f279878h, a17);
        ha3.v vVar = this.f279885r;
        if (!b17 || j17 != this.f279879i || j18 != this.f279880m || this.f279881n != vVar.f279946h) {
            java.util.Objects.toString(vVar.f279940b);
            int i18 = vVar.f279946h;
            this.f279879i = j17;
            this.f279880m = j18;
            this.f279878h = a17;
            this.f279881n = i18;
        }
        if (j18 <= 0) {
            return 0;
        }
        ha3.i0 i0Var = ha3.j0.f279886a;
        ha3.e0 c17 = ha3.j0.f279887b.c(a17);
        if (c17 != null && c17.f279836d) {
            return (int) j18;
        }
        if (vVar.f279946h == 6 || !((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(a17)) {
            int i19 = vVar.f279946h;
            return 0;
        }
        if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).isVideoDataAvailable(a17, j17, j18)) {
            return (int) j18;
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStartReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        ha3.r0.f279930a.a(this.f279874d, fileName);
        java.util.Objects.toString(this.f279885r.f279940b);
        b(fileName, true);
        int i18 = this.f279877g;
        this.f279877g = i18 + 1;
        return i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        ha3.r0.f279930a.a(this.f279874d, fileName);
        java.util.Objects.toString(this.f279885r.f279940b);
        return this.f279877g;
    }
}

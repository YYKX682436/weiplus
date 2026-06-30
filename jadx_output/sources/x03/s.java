package x03;

/* loaded from: classes15.dex */
public final class s extends com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f451111d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f451112e;

    /* renamed from: f, reason: collision with root package name */
    public final x03.t1 f451113f;

    /* renamed from: g, reason: collision with root package name */
    public long f451114g;

    /* renamed from: h, reason: collision with root package name */
    public int f451115h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451116i;

    /* renamed from: m, reason: collision with root package name */
    public long f451117m;

    /* renamed from: n, reason: collision with root package name */
    public long f451118n;

    /* renamed from: o, reason: collision with root package name */
    public int f451119o;

    /* renamed from: p, reason: collision with root package name */
    public long f451120p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f451121q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f451122r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x03.i0 f451123s;

    public s(x03.i0 i0Var, java.lang.String mainMediaId, java.lang.String rawPreviewUrl) {
        kotlin.jvm.internal.o.g(mainMediaId, "mainMediaId");
        kotlin.jvm.internal.o.g(rawPreviewUrl, "rawPreviewUrl");
        this.f451123s = i0Var;
        this.f451111d = mainMediaId;
        this.f451112e = "FlutterVideoHLSPlayer.HLSResourceLoaderProxy";
        this.f451113f = new x03.t1();
        this.f451116i = "";
        this.f451119o = -1;
        this.f451121q = "";
        this.f451122r = "";
    }

    public final void a(java.lang.String fileName, boolean z17) {
        x03.t1 t1Var = this.f451113f;
        t1Var.getClass();
        kotlin.jvm.internal.o.g(fileName, "fileName");
        x03.u1 u1Var = (x03.u1) ((java.util.LinkedHashMap) t1Var.f451130d).get(fileName);
        t1Var.hashCode();
        if (u1Var == null) {
            com.tencent.mars.xlog.Log.e(this.f451112e, "[prepareTsData] failed: ".concat(fileName));
        } else {
            b(u1Var);
            if (z17) {
                b(t1Var.b(u1Var.f451146a + 1));
            }
        }
    }

    public final void b(x03.u1 u1Var) {
        dn.o oVar;
        x03.f fVar;
        boolean z17;
        x03.f fVar2;
        java.lang.String str = this.f451112e;
        if (u1Var == null) {
            com.tencent.mars.xlog.Log.e(str, "[tryDownloadSegment] failed, invalid segmentInfo");
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "[tryDownloadSegment] seg, " + u1Var.f451148c);
        java.lang.String str2 = u1Var.f451149d;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.String segmentFile = u1Var.f451148c;
        x03.v0 v0Var = x03.x0.f451161d;
        x03.x0 a17 = v0Var.a();
        java.lang.String rawUrl = this.f451123s.f451049f;
        x03.i iVar = a17.f451164b;
        iVar.getClass();
        java.lang.String mainMediaId = this.f451111d;
        kotlin.jvm.internal.o.g(mainMediaId, "mainMediaId");
        kotlin.jvm.internal.o.g(rawUrl, "rawUrl");
        kotlin.jvm.internal.o.g(segmentFile, "segmentFile");
        java.lang.String mediaId = x03.z1.f451178a.a(mainMediaId, segmentFile);
        java.lang.String o17 = new com.tencent.mm.vfs.r6(iVar.f451039e + '-' + mainMediaId + "-hls").o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[startPreviewSegmentTask] try start, mediaId: ");
        sb6.append(mediaId);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str4 = iVar.f451038d;
        com.tencent.mars.xlog.Log.i(str4, sb7);
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        try {
            android.net.Uri parse = android.net.Uri.parse(rawUrl);
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
            com.tencent.mars.xlog.Log.e(str4, "[startPreviewSegmentTask] create task failed, mediaId: ".concat(mediaId));
            return;
        }
        java.util.Map map = iVar.f451041g;
        if (map.get(mediaId) == null) {
            fVar = new x03.f();
        } else {
            java.lang.Object obj = map.get(mediaId);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
            fVar = (x03.f) obj;
        }
        java.lang.String field_fullpath = oVar.field_fullpath;
        kotlin.jvm.internal.o.f(field_fullpath, "field_fullpath");
        if (com.tencent.mm.vfs.w6.j(field_fullpath)) {
            long k17 = com.tencent.mm.vfs.w6.k(field_fullpath);
            if (map.get(mediaId) == null) {
                fVar2 = new x03.f();
            } else {
                java.lang.Object obj2 = map.get(mediaId);
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                fVar2 = (x03.f) obj2;
            }
            fVar2.f451015d = true;
            fVar2.f451012a = k17;
            fVar2.f451014c = k17;
            fVar2.f451016e = field_fullpath;
            fVar2.f451018g = false;
            map.put(mediaId, fVar2);
            x03.f fVar3 = (x03.f) map.get(mediaId);
            if (fVar3 != null) {
                fVar3.f451018g = false;
            }
            iVar.f451040f = null;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e(str4, "[startPreviewSegmentTask] hit cache, mediaId: ".concat(mediaId));
            return;
        }
        if (fVar.f451018g) {
            com.tencent.mars.xlog.Log.i(str4, "[startPreviewSegmentTask] isDoing: mediaId: ".concat(mediaId));
            return;
        }
        if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(mediaId)) {
            int b17 = v0Var.a().f451165c.b(mediaId);
            fVar.f451018g = false;
            com.tencent.mars.xlog.Log.i(str4, "[startPreviewSegmentTask] cancel for restart, mediaId: " + mediaId + " cancelResult:" + b17);
        }
        java.lang.String field_fullpath2 = oVar.field_fullpath;
        kotlin.jvm.internal.o.f(field_fullpath2, "field_fullpath");
        fVar.f451016e = field_fullpath2;
        fVar.f451018g = true;
        oVar.f241815c2 = iVar;
        x03.j jVar = v0Var.a().f451165c;
        jVar.getClass();
        java.lang.String str6 = oVar.field_fullpath;
        java.lang.String str7 = oVar.field_fullpath + "_temp";
        oVar.field_fullpath = str7;
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest b18 = x03.z1.f451178a.b(oVar);
        kotlin.jvm.internal.o.d(str6);
        if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(b18, jVar, new x03.y1(jVar, str7, str6), 0) == 0) {
            java.util.HashMap hashMap = jVar.f451060d;
            java.lang.String field_mediaId = oVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, oVar);
        }
        map.put(mediaId, fVar);
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getContentType(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        if (r26.i0.n(fileName, ".ts", false)) {
            return "video/mp2t";
        }
        java.util.Objects.toString(this.f451123s.f451045b);
        return "application/vnd.apple.mpegurl";
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getDataFilePath(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String str2 = x03.x0.f451161d.a().f451164b.b(x03.z1.f451178a.a(this.f451111d, fileName)).f451016e;
        kotlin.jvm.internal.o.d(str2);
        java.util.Objects.toString(this.f451123s.f451045b);
        return str2;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public long getDataTotalSize(int i17, java.lang.String fileName, java.lang.String str) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String a17 = x03.z1.f451178a.a(this.f451111d, fileName);
        x03.v0 v0Var = x03.x0.f451161d;
        java.lang.String str2 = v0Var.a().f451164b.b(a17).f451016e;
        kotlin.jvm.internal.o.d(str2);
        boolean j17 = com.tencent.mm.vfs.w6.j(str2);
        x03.i0 i0Var = this.f451123s;
        java.lang.String str3 = this.f451112e;
        if (j17) {
            long k17 = com.tencent.mm.vfs.w6.k(str2);
            if (k17 == 0) {
                com.tencent.mm.vfs.w6.h(str2);
                a(fileName, false);
                com.tencent.mars.xlog.Log.e(str3, "[getDataTotalSize] res exist but length = 0, retry download mediaId=" + a17 + " fileName=" + fileName);
                return k17;
            }
            com.tencent.mars.xlog.Log.i(str3, "[getDataTotalSize] res exist, player: " + i0Var.f451045b + " mediaId=" + a17 + " fileName=" + fileName + " localTotalSize:" + k17);
            return k17;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(v0Var.a().f451164b.b(a17).f451014c);
        kotlin.jvm.internal.o.d(valueOf);
        long longValue = valueOf.longValue();
        if (this.f451120p != longValue || !kotlin.jvm.internal.o.b(this.f451121q, fileName)) {
            this.f451120p = longValue;
            this.f451121q = fileName;
            com.tencent.mars.xlog.Log.i(str3, "[getDataTotalSize] wait to download, player: " + i0Var.f451045b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
        }
        if (longValue <= 0 && !kotlin.jvm.internal.o.b(this.f451122r, fileName)) {
            com.tencent.mars.xlog.Log.e(str3, "[getDataTotalSize] error, player: " + i0Var.f451045b + " mediaId=" + a17 + " fileName=" + fileName + " totalSize:" + longValue);
            this.f451122r = fileName;
        }
        return longValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.tencent.thumbplayer.datatransport.resourceloader.AbsTPAssetResourceLoader, com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        x03.i0 i0Var;
        x03.t1 t1Var;
        x03.i0 i0Var2;
        java.util.Iterator it;
        x03.t1 t1Var2;
        double d17;
        java.util.Iterator it6;
        x03.i0 i0Var3 = this.f451123s;
        java.lang.String str3 = i0Var3.f451053j;
        ?? r47 = 0;
        boolean z17 = i0Var3.f451054k.length() == 0;
        x03.t1 t1Var3 = this.f451113f;
        if (z17) {
            java.lang.String rawM3U8Content = i0Var3.f451053j;
            t1Var3.getClass();
            kotlin.jvm.internal.o.g(rawM3U8Content, "rawM3U8Content");
            java.lang.StringBuilder sb6 = t1Var3.f451128b;
            r26.e0.d(sb6);
            java.util.ArrayList arrayList = (java.util.ArrayList) t1Var3.f451129c;
            arrayList.clear();
            java.util.Map map = t1Var3.f451130d;
            ((java.util.LinkedHashMap) map).clear();
            java.util.Iterator it7 = new r26.t("\\r?\\n").g(rawM3U8Content, 0).iterator();
            int i18 = 0;
            x03.u1 u1Var = null;
            java.util.LinkedHashMap linkedHashMap = null;
            while (it7.hasNext()) {
                java.lang.String obj = r26.n0.u0((java.lang.String) it7.next()).toString();
                if (!(obj.length() == 0 ? true : r47)) {
                    if (r26.i0.y(obj, "#EXT-X-MEDIA-SEQUENCE:", r47)) {
                        java.lang.String substring = obj.substring(22);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        java.lang.Integer h17 = r26.h0.h(substring);
                        t1Var3.f451127a = h17 != null ? h17.intValue() : r47;
                        t1Var3.a(obj);
                    } else if (r26.i0.y(obj, "#EXT-X-TARGETDURATION:", r47)) {
                        java.lang.String substring2 = obj.substring(22);
                        kotlin.jvm.internal.o.f(substring2, "substring(...)");
                        java.lang.Double e17 = r26.g0.e(substring2);
                        if (e17 != null) {
                            e17.doubleValue();
                        }
                        t1Var3.a(obj);
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
                            t1Var3.a(obj);
                            i0Var2 = i0Var3;
                            t1Var2 = t1Var3;
                            linkedHashMap = linkedHashMap2;
                        } else {
                            it = it7;
                            if (r26.i0.y(obj, "#EXTINF:", r47)) {
                                u1Var = new x03.u1(0, 0.0d, null, null, null, 31, null);
                                u1Var.f451146a = t1Var3.f451127a + i18;
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
                                i0Var2 = i0Var3;
                                if (e18 != null) {
                                    double doubleValue = e18.doubleValue();
                                    t1Var2 = t1Var3;
                                    d17 = doubleValue;
                                } else {
                                    t1Var2 = t1Var3;
                                    d17 = 0.0d;
                                }
                                u1Var.f451147b = java.lang.Math.max(0.0d, d17);
                                u1Var.f451150e = linkedHashMap;
                                t1Var2.a(obj);
                            } else {
                                i0Var2 = i0Var3;
                                t1Var2 = t1Var3;
                                if (!r26.i0.y(obj, "#", false) && u1Var != null) {
                                    java.lang.String str5 = i18 + ".ts";
                                    kotlin.jvm.internal.o.g(str5, "<set-?>");
                                    u1Var.f451148c = str5;
                                    u1Var.f451149d = obj;
                                    map.put(str5, u1Var);
                                    arrayList.add(u1Var);
                                    obj = u1Var.f451148c;
                                    u1Var = null;
                                }
                                t1Var2.a(obj);
                            }
                        }
                        t1Var3 = t1Var2;
                        i0Var3 = i0Var2;
                        r47 = 0;
                        it7 = it;
                    }
                }
                i0Var2 = i0Var3;
                it = it7;
                t1Var2 = t1Var3;
                t1Var3 = t1Var2;
                i0Var3 = i0Var2;
                r47 = 0;
                it7 = it;
            }
            i0Var = i0Var3;
            t1Var = t1Var3;
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            i0Var.f451054k = sb7;
            com.tencent.mars.xlog.Log.i(this.f451112e, "[tryDownloadSegment] index: 0");
            b(t1Var.b(0));
        } else {
            i0Var = i0Var3;
            t1Var = t1Var3;
        }
        t1Var.getClass();
        return i0Var.f451054k;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onReadData(int i17, java.lang.String fileName, java.lang.String str, long j17, long j18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String a17 = x03.z1.f451178a.a(this.f451111d, fileName);
        if (!kotlin.jvm.internal.o.b(this.f451116i, a17) || j17 != this.f451117m || j18 != this.f451118n || this.f451119o != this.f451123s.f451051h) {
            java.util.Objects.toString(this.f451123s.f451045b);
            int i18 = this.f451123s.f451051h;
            this.f451117m = j17;
            this.f451118n = j18;
            this.f451116i = a17;
            this.f451119o = i18;
        }
        if (j18 <= 0) {
            return 0;
        }
        x03.f b17 = x03.x0.f451161d.a().f451164b.b(a17);
        long j19 = this.f451114g;
        long j27 = b17.f451012a;
        if (j19 != j27) {
            this.f451114g = j27;
            ((ku5.t0) ku5.t0.f312615d).B(new x03.r(this.f451123s));
        }
        if (b17.f451015d) {
            return (int) j18;
        }
        if (this.f451123s.f451051h == 6 || !((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).taskExist(a17)) {
            int i19 = this.f451123s.f451051h;
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
        x03.z1.f451178a.a(this.f451111d, fileName);
        java.util.Objects.toString(this.f451123s.f451045b);
        a(fileName, true);
        int i18 = this.f451115h;
        this.f451115h = i18 + 1;
        return i18;
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public int onStopReadData(int i17, java.lang.String fileName, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        x03.z1.f451178a.a(this.f451111d, fileName);
        java.util.Objects.toString(this.f451123s.f451045b);
        return this.f451115h;
    }
}

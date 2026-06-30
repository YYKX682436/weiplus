package uv2;

/* loaded from: classes10.dex */
public final class e implements uv2.m {

    /* renamed from: a, reason: collision with root package name */
    public static final uv2.e f431376a = new uv2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final long f431377b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f431378c;

    /* renamed from: d, reason: collision with root package name */
    public static final uv2.r f431379d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f431380e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f431381f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f431382g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f431383h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f431384i;

    static {
        long Ui;
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((qs2.q) ((w40.e) c17)).pj()) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_video_max_size_buffer, 130023424L);
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size, 943718400L) + Ui2;
            com.tencent.mars.xlog.Log.i("FinderConfig", "finder post expect video max size:" + Ui + ", buffer:" + Ui2);
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            long Ui3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_video_max_size_buffer_low, 130023424L);
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size_low, 943718400L) + Ui3;
            com.tencent.mars.xlog.Log.i("FinderConfig", "finder post expect video max size low:" + Ui + ", buffer:" + Ui3);
        }
        com.tencent.mars.xlog.Log.i("FinderPublishFeatureService", "[getPostExpectVideoMaxSize] maxSize:" + Ui);
        f431377b = Ui;
        i95.m c18 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        f431378c = ((qs2.q) ((w40.e) c18)).ij();
        f431379d = new uv2.r("FinderPostMediaProcessManager", 1);
        f431380e = new java.util.concurrent.ConcurrentHashMap();
        f431381f = new java.util.concurrent.ConcurrentHashMap();
        f431382g = new java.util.concurrent.ConcurrentHashMap();
        f431383h = jz5.h.b(uv2.d.f431375d);
        f431384i = jz5.h.b(uv2.a.f431366d);
    }

    @Override // uv2.m
    public void a(java.lang.String mediaId, uv2.n result) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f431381f;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(mediaId);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((uv2.m) it.next()).a(mediaId, result);
            }
        }
        concurrentHashMap.remove(mediaId);
        f431382g.put(mediaId, result);
    }

    @Override // uv2.m
    public void b(java.lang.String mediaId, float f17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        java.util.ArrayList arrayList = (java.util.ArrayList) f431381f.get(mediaId);
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((uv2.m) it.next()).b(mediaId, f17);
            }
        }
    }

    public final void c(java.util.List mediaList) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        java.util.Iterator it = mediaList.iterator();
        while (it.hasNext()) {
            java.lang.String i17 = f431376a.i((r45.mb4) it.next());
            com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[cancelProcess] originMediaId:" + i17);
            com.tencent.mm.plugin.vlog.model.f0 f0Var = (com.tencent.mm.plugin.vlog.model.f0) f431380e.remove(i17);
            if (f0Var != null) {
                com.tencent.mm.plugin.vlog.model.f0.b(f0Var, null, 1, null);
            }
            f431382g.remove(i17);
        }
    }

    public final boolean d(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.D).getValue()).r()).booleanValue()) {
            return false;
        }
        i95.m c17 = i95.n0.c(e42.e0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((h62.d) ((e42.e0) c17)).Ni(e42.c0.clicfg_sns_finder_post_p3_to_bt709_lut, 1) != 1) {
            return false;
        }
        java.lang.String t17 = r26.i0.t(((b92.u2) m()).aj(path), ";", ",", false);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int optInt = new org.json.JSONObject(t17).optInt("ffmpegColorPrimaries");
            r1 = optInt == 11 || optInt == 12;
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[isDisplayP3Video] result:" + r1 + " colorSpaceJsonStr:" + t17 + " path:" + path);
        return true;
    }

    public final boolean e(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, java.lang.String filePath) {
        r45.q23 video_tmpl_info;
        r45.ko6 ko6Var;
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObj.getFeedObject().getObjectDesc();
        if (objectDesc != null && (video_tmpl_info = objectDesc.getVideo_tmpl_info()) != null) {
            r45.ko6 ko6Var2 = video_tmpl_info.f383601w;
            java.lang.String str = ko6Var2 != null ? ko6Var2.f378884i : null;
            if (!(str == null || str.length() == 0)) {
                boolean j17 = com.tencent.mm.vfs.w6.j(filePath);
                long k17 = com.tencent.mm.vfs.w6.k(filePath);
                i95.m c17 = i95.n0.c(pp0.h0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String Ai = ((yy0.m0) ((pp0.h0) c17)).Ai(filePath);
                boolean b17 = kotlin.jvm.internal.o.b(str, Ai);
                if (!b17 && (ko6Var = video_tmpl_info.f383601w) != null) {
                    ko6Var.f378882g = 100;
                }
                com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoChecksumValid] same:" + b17 + " localId:" + finderObj.getLocalId() + " originalCheckSum:" + str + " checkSum:" + Ai + " filePath:" + filePath + " fileExists:" + j17 + " fileSize:" + k17);
                return b17;
            }
        }
        return false;
    }

    public final int f(java.lang.String str, int i17, int i18, com.tencent.mm.modelcontrol.VideoTransPara videoParams, boolean z17) {
        int i19;
        kotlin.jvm.internal.o.g(videoParams, "videoParams");
        long k17 = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 3L, k17);
        if (z17) {
            g0Var.C(1523L, 3L, k17);
        }
        long j17 = f431377b;
        if (k17 <= j17) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128033y3).getValue()).r()).intValue() != 1) {
                com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoNeedZip] no need zip");
                return 0;
            }
        }
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoNeedZip] need zip");
        g0Var.C(1253L, 4L, 1L);
        if (z17) {
            g0Var.C(1523L, 4L, 1L);
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String str2 = str + ".remux";
        if (str != null) {
            com.tencent.mm.modelvideo.APIVideoTransPara aPIVideoTransPara = new com.tencent.mm.modelvideo.APIVideoTransPara();
            aPIVideoTransPara.f71625d = i17;
            aPIVideoTransPara.f71626e = i18;
            aPIVideoTransPara.f71627f = videoParams.f71193f;
            aPIVideoTransPara.f71628g = videoParams.f71194g;
            aPIVideoTransPara.f71629h = videoParams.f71195h;
            aPIVideoTransPara.f71631m = videoParams.f71197m;
            aPIVideoTransPara.f71632n = videoParams.f71198n;
            aPIVideoTransPara.f71633o = videoParams.f71199o;
            aPIVideoTransPara.f71635q = videoParams.f71201q;
            aPIVideoTransPara.f71636r = videoParams.f71202r;
            aPIVideoTransPara.f71637s = videoParams.f71203s;
            aPIVideoTransPara.f71638t = videoParams.f71204t;
            aPIVideoTransPara.f71639u = videoParams.f71205u;
            aPIVideoTransPara.f71640v = videoParams.f71206v;
            aPIVideoTransPara.f71641w = videoParams.f71207w;
            aPIVideoTransPara.f71642x = videoParams.f71208x;
            aPIVideoTransPara.f71643y = videoParams.f71209y;
            aPIVideoTransPara.f71644z = videoParams.f71210z;
            aPIVideoTransPara.A = videoParams.A;
            aPIVideoTransPara.B = videoParams.B;
            aPIVideoTransPara.C = videoParams.C;
            aPIVideoTransPara.D = videoParams.D;
            aPIVideoTransPara.E = videoParams.E;
            aPIVideoTransPara.F = videoParams.F;
            aPIVideoTransPara.G = videoParams.G;
            aPIVideoTransPara.H = videoParams.H;
            aPIVideoTransPara.I = videoParams.I;
            aPIVideoTransPara.f71634p = videoParams.f71200p;
            aPIVideoTransPara.f71624J = videoParams.f71190J;
            aPIVideoTransPara.K = videoParams.K;
            aPIVideoTransPara.f71630i = videoParams.f71196i;
            i95.m c17 = i95.n0.c(c35.n.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            vf0.n1 n1Var = (vf0.n1) ((c35.n) c17);
            i19 = n1Var.Ai(str, str2, aPIVideoTransPara, false);
            if (i19 < 0) {
                i19 = n1Var.Ai(str, str2, aPIVideoTransPara, true);
            }
        } else {
            i19 = -1;
        }
        int i27 = i19;
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[checkVideoNeedZip] zip cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms, ret:" + i27);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        g0Var.C(1253L, 5L, elapsedRealtime2);
        if (z17) {
            g0Var.C(1523L, 5L, elapsedRealtime2);
        }
        if (i27 < 0) {
            g0Var.C(1253L, 6L, 1L);
            if (z17) {
                g0Var.C(1523L, 6L, 1L);
            }
            return -2;
        }
        com.tencent.mm.vfs.w6.w(str2, str);
        long k18 = com.tencent.mm.vfs.w6.k(str2);
        g0Var.C(1253L, 7L, k18);
        if (z17) {
            g0Var.C(1523L, 7L, k18);
        }
        return k18 > j17 ? -3 : 0;
    }

    public final float g(java.lang.String input, float f17, float f18, int i17, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(input, "input");
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.v2()) {
            return com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.a(input, f17, f18, i17, z17, z18);
        }
        return 0.0f;
    }

    public final qc0.e1 h() {
        return (qc0.e1) ((jz5.n) f431384i).getValue();
    }

    public final java.lang.String i(r45.mb4 media) {
        kotlin.jvm.internal.o.g(media, "media");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String string = media.getString(48);
        if (string == null) {
            string = "";
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(string.getBytes()));
        sb6.append('_');
        sb6.append(media.getLong(59));
        return sb6.toString();
    }

    public final java.lang.String j(r45.mb4 media, java.lang.String suffix) {
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        return com.tencent.mm.plugin.finder.assist.e9.f102132a.h(new mn2.g4(media, com.tencent.mm.plugin.finder.storage.y90.R, "xV99", 0, 0, null, false, null, 248, null), suffix);
    }

    public final java.util.List k(java.util.List mediaList) {
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = mediaList.iterator();
        while (it.hasNext()) {
            r45.mb4 mb4Var = (r45.mb4) it.next();
            if (mb4Var.getBoolean(13)) {
                arrayList.add(mb4Var);
            } else if (!hc2.l0.c(mb4Var)) {
                arrayList.add(mb4Var);
            }
        }
        return arrayList;
    }

    public final com.tencent.mm.modelcontrol.VideoTransPara l(boolean z17) {
        return z17 ? tu2.s.f422152a.i() : com.tencent.mm.plugin.finder.storage.t70.f127590a.K2();
    }

    public final bg0.v m() {
        return (bg0.v) ((jz5.n) f431383h).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027d  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l n(r45.mb4 r27, boolean r28, java.lang.String r29, com.tencent.mm.plugin.finder.report.n5 r30) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.e.n(r45.mb4, boolean, java.lang.String, com.tencent.mm.plugin.finder.report.n5):jz5.l");
    }

    public final boolean o(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        boolean z17 = false;
        if (!com.tencent.mm.vfs.w6.j(path)) {
            return false;
        }
        java.io.RandomAccessFile randomAccessFile = null;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            randomAccessFile = com.tencent.mm.vfs.w6.A(com.tencent.mm.vfs.z7.a(path), false);
            d61.a c17 = d61.c.c(randomAccessFile, new byte[8], d61.a.f226690f, 4194304L);
            long j17 = 8;
            long j18 = c17.f226710d + j17;
            long a17 = c17.a() - j17;
            com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[isMoovOptimize] cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms beginPos=" + j18 + " remains=" + a17);
            if (1 <= j18 && j18 < 129) {
                z17 = true;
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.t8.v1(randomAccessFile);
            throw th6;
        }
        com.tencent.mm.sdk.platformtools.t8.v1(randomAccessFile);
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if ((r2 == null || r2.length() == 0) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(r45.mb4 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "media"
            kotlin.jvm.internal.o.g(r9, r0)
            r0 = 21
            com.tencent.mm.protobuf.f r1 = r9.getCustom(r0)
            r45.h70 r1 = (r45.h70) r1
            r2 = 0
            if (r1 == 0) goto L1b
            java.util.LinkedList r1 = r1.f375897d
            if (r1 == 0) goto L1b
            java.lang.Object r1 = kz5.n0.Z(r1)
            r45.ho6 r1 = (r45.ho6) r1
            goto L1c
        L1b:
            r1 = r2
        L1c:
            com.tencent.mm.protobuf.f r3 = r9.getCustom(r0)
            r45.h70 r3 = (r45.h70) r3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L32
            java.util.LinkedList r3 = r3.f375897d
            if (r3 == 0) goto L32
            int r3 = r3.size()
            if (r3 != r4) goto L32
            r3 = r4
            goto L33
        L32:
            r3 = r5
        L33:
            if (r3 == 0) goto L93
            com.tencent.mm.protobuf.f r3 = r9.getCustom(r0)
            r45.h70 r3 = (r45.h70) r3
            if (r3 == 0) goto L4a
            r45.g70 r3 = r3.f375904n
            if (r3 == 0) goto L4a
            java.util.LinkedList r3 = r3.f374939e
            if (r3 == 0) goto L4a
            int r3 = r3.size()
            goto L4b
        L4a:
            r3 = r5
        L4b:
            if (r3 != 0) goto L93
            com.tencent.mm.protobuf.f r3 = r9.getCustom(r0)
            r45.h70 r3 = (r45.h70) r3
            if (r3 == 0) goto L5b
            boolean r3 = r3.f375907q
            if (r3 != 0) goto L5b
            r3 = r4
            goto L5c
        L5b:
            r3 = r5
        L5c:
            if (r3 == 0) goto L93
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r0)
            r45.h70 r9 = (r45.h70) r9
            if (r9 == 0) goto L69
            r45.tz6 r9 = r9.f375906p
            goto L6a
        L69:
            r9 = r2
        L6a:
            if (r9 != 0) goto L93
            if (r1 == 0) goto L93
            r45.wp6 r9 = r1.f376346t
            if (r9 == 0) goto L84
            if (r9 == 0) goto L76
            java.lang.String r2 = r9.f389379d
        L76:
            if (r2 == 0) goto L81
            int r9 = r2.length()
            if (r9 != 0) goto L7f
            goto L81
        L7f:
            r9 = r5
            goto L82
        L81:
            r9 = r4
        L82:
            if (r9 == 0) goto L93
        L84:
            long r2 = r1.f376336g
            long r6 = r1.f376335f
            long r2 = r2 - r6
            long r6 = r1.f376338i
            long r0 = r1.f376337h
            long r6 = r6 - r0
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L93
            goto L94
        L93:
            r4 = r5
        L94:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.e.p(r45.mb4):boolean");
    }

    public final void q(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, boolean z17, java.lang.String videoPath) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        r45.q23 video_tmpl_info;
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        if (!(videoPath.length() == 0)) {
            i95.m c17 = i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "optimize result: " + ((com.tencent.mm.feature.sight.api.ISightJNIService) c17).optimizeMP4VFS(videoPath) + ", isOptimize:" + o(videoPath) + " videoPath:" + videoPath);
        }
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[optimizeAndUpdateCheckSum] localId:" + finderObj.getLocalId() + " needCalcCheckSum:" + z17 + " videoPath:" + videoPath);
        if (!z17 || (objectDesc = finderObj.getFeedObject().getObjectDesc()) == null || (video_tmpl_info = objectDesc.getVideo_tmpl_info()) == null) {
            return;
        }
        r45.ko6 ko6Var = video_tmpl_info.f383601w;
        java.lang.String str = ko6Var != null ? ko6Var.f378884i : null;
        i95.m c18 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        java.lang.String Ai = ((yy0.m0) ((pp0.h0) c18)).Ai(videoPath);
        boolean b17 = kotlin.jvm.internal.o.b(str, Ai);
        r45.ko6 ko6Var2 = video_tmpl_info.f383601w;
        if (ko6Var2 != null) {
            ko6Var2.f378884i = Ai;
        }
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[calcCheckSum] isSame:" + b17 + " localId:" + finderObj.getLocalId() + " originalCheckSum:" + str + " newCheckSum:" + Ai + " filePath:" + videoPath);
    }

    public final uv2.n r(r45.mb4 media, boolean z17, java.lang.String outputPath, java.lang.String from, boolean z18, yz5.l progressCallback) {
        uv2.n nVar;
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        kotlin.jvm.internal.o.g(from, "from");
        kotlin.jvm.internal.o.g(progressCallback, "progressCallback");
        java.lang.String i17 = i(media);
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] originMediaId:" + i17 + " isLongVideo:" + z17 + " from:" + from + " originMediaUrl:" + media.getString(48) + " url:" + media.getString(0));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object remove = f431382g.remove(i17);
        h0Var.f310123d = remove;
        if (remove == null) {
            java.lang.Object obj = new java.lang.Object();
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            uv2.c cVar = new uv2.c(progressCallback, h0Var, obj, c0Var);
            java.lang.String i18 = i(media);
            com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[processMediaAsync] originMediaId:" + i18);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f431381f;
            java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(i18);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(cVar);
            concurrentHashMap.put(i18, arrayList);
            uv2.p pVar = new uv2.p(media, z17, outputPath, this);
            uv2.r rVar = f431379d;
            rVar.getClass();
            fp0.o oVar = rVar.f431412a;
            if (oVar.e(pVar)) {
                com.tencent.mars.xlog.Log.i("Finder.TaskExecutor", "[addTask] isInRunningTask");
            } else {
                oVar.a(pVar);
            }
            synchronized (obj) {
                if (!c0Var.f310112d) {
                    com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] wait originMediaId:" + i17);
                    try {
                        obj.wait();
                    } catch (java.lang.InterruptedException unused) {
                        com.tencent.mars.xlog.Log.e("LogPost.FinderMediaProcessManager", "[processMediaSync] wait interrupted originMediaId:" + i17);
                    }
                    com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] notify originMediaId:" + i17);
                }
            }
        }
        if (!z18 && (nVar = (uv2.n) h0Var.f310123d) != null && nVar.f431404d == 0 && nVar.f431402b.f175793a && !kotlin.jvm.internal.o.b(nVar.f431401a.f375902i.f376775d, outputPath)) {
            com.tencent.mars.xlog.Log.i("LogPost.FinderMediaProcessManager", "[processMediaSync] moveFile src:" + nVar.f431401a.f375902i.f376775d + " dest:" + outputPath);
            com.tencent.mm.vfs.w6.c(nVar.f431401a.f375902i.f376775d, outputPath);
            nVar.f431401a.f375902i.f376775d = outputPath;
        }
        uv2.n nVar2 = (uv2.n) h0Var.f310123d;
        return nVar2 == null ? new uv2.n(new r45.h70(), new com.tencent.mm.plugin.vlog.model.z(false, false, false, 0, false, false, false, 126, null), 0.0f, 0, 0, 0, 60, null) : nVar2;
    }

    public final void s(java.lang.String endReason, boolean z17, boolean z18, long j17, java.lang.String outputPath) {
        kotlin.jvm.internal.o.g(endReason, "endReason");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        i95.m c17 = i95.n0.c(pp0.l0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((yy0.m7) ((pp0.l0) c17)).nj(endReason, z17, z18, j17, outputPath);
    }

    public final int t(int i17) {
        return i17 % 2 != 0 ? i17 - 1 : i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(r45.mb4 r23, java.lang.String r24, r45.mb4 r25, float r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv2.e.u(r45.mb4, java.lang.String, r45.mb4, float, boolean):void");
    }
}

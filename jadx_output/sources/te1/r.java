package te1;

/* loaded from: classes13.dex */
public class r {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f417806m = new java.util.concurrent.atomic.AtomicInteger(10000);

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f417807n = new java.util.concurrent.atomic.AtomicInteger(10000);

    /* renamed from: c, reason: collision with root package name */
    public re1.b f417810c;

    /* renamed from: d, reason: collision with root package name */
    public int f417811d;

    /* renamed from: e, reason: collision with root package name */
    public java.net.ServerSocket f417812e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f417813f;

    /* renamed from: g, reason: collision with root package name */
    public final te1.v f417814g;

    /* renamed from: a, reason: collision with root package name */
    public int f417808a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f417809b = true;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f417815h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f417816i = new java.util.concurrent.ConcurrentHashMap(8, 0.75f, 2);

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f417817j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f417818k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Map f417819l = new java.util.concurrent.ConcurrentHashMap();

    public r() {
        long j17;
        java.lang.String b17 = qe1.a.a().b();
        ve1.g.p(4, "VideoProxy", "initCache, cache dir:" + qe1.a.a().b(), null);
        if (android.text.TextUtils.isEmpty(b17)) {
            this.f417810c = null;
            ((lm1.c) qe1.a.a().f362029n).g(-1);
            ((oe1.t1) qe1.a.a().f362030o).f344741a.f344748e = false;
        } else {
            if (!android.text.TextUtils.isEmpty(b17)) {
                try {
                    android.os.StatFs statFs = new android.os.StatFs(b17);
                    j17 = statFs.getAvailableBlocks() * statFs.getBlockSize();
                } catch (java.lang.Exception unused) {
                    j17 = -1;
                }
                long min = java.lang.Math.min(j17, qe1.a.a().f362025j);
                ve1.g.p(4, "VideoProxy", "initCache, cache availableSpace=" + min, null);
                re1.k kVar = new re1.k(min);
                ve1.p.b(new te1.m(this, b17, min, kVar), "VideoProxy");
                this.f417810c = new re1.m(new com.tencent.mm.vfs.r6(b17), kVar);
            }
            j17 = -1;
            long min2 = java.lang.Math.min(j17, qe1.a.a().f362025j);
            ve1.g.p(4, "VideoProxy", "initCache, cache availableSpace=" + min2, null);
            re1.k kVar2 = new re1.k(min2);
            ve1.p.b(new te1.m(this, b17, min2, kVar2), "VideoProxy");
            this.f417810c = new re1.m(new com.tencent.mm.vfs.r6(b17), kVar2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initCache, cache:");
        java.lang.String str = this.f417810c;
        sb6.append(str == null ? "null" : str);
        ve1.g.p(4, "VideoProxy", sb6.toString(), null);
        this.f417814g = new te1.v();
        this.f417813f = new ve1.n(10, 10, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue());
        try {
            java.net.ServerSocket serverSocket = new java.net.ServerSocket(ve1.g.b(5), 10, java.net.InetAddress.getByName("0.0.0.0"));
            this.f417812e = serverSocket;
            this.f417811d = serverSocket.getLocalPort();
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            new java.lang.Thread(new te1.q(this, countDownLatch), "video_proxy_wait_for_connection_thread").start();
            countDownLatch.await();
            ve1.g.p(4, "VideoProxy", "proxy server start success, port:" + this.f417811d, null);
            ((lm1.c) qe1.a.a().f362029n).g(0);
            ((oe1.t1) qe1.a.a().f362030o).getClass();
        } catch (java.io.IOException | java.lang.IllegalStateException | java.lang.InterruptedException e17) {
            ((java.util.concurrent.ThreadPoolExecutor) this.f417813f).shutdown();
            ve1.g.p(6, "VideoProxy", "proxy server start failed " + ve1.g.h(e17, false), null);
            ((lm1.c) qe1.a.a().f362029n).g(-2);
            ((oe1.t1) qe1.a.a().f362030o).f344741a.f344748e = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x057b, code lost:
    
        r44 = r1;
        r35 = r2;
        r9 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x09e4: MOVE (r20 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r23 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:447:0x09e3 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0a07 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x09ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x08be A[Catch: all -> 0x0944, TRY_LEAVE, TryCatch #17 {all -> 0x0944, blocks: (B:128:0x08b8, B:130:0x08be), top: B:127:0x08b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01e1 A[Catch: all -> 0x0193, Exception -> 0x0197, e -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #36 {e -> 0x019b, Exception -> 0x0197, all -> 0x0193, blocks: (B:165:0x0178, B:167:0x0181, B:172:0x01b3, B:173:0x01c6, B:177:0x01e1, B:181:0x01fa, B:184:0x020a, B:187:0x021a, B:189:0x022a), top: B:164:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01fa A[Catch: all -> 0x0193, Exception -> 0x0197, e -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #36 {e -> 0x019b, Exception -> 0x0197, all -> 0x0193, blocks: (B:165:0x0178, B:167:0x0181, B:172:0x01b3, B:173:0x01c6, B:177:0x01e1, B:181:0x01fa, B:184:0x020a, B:187:0x021a, B:189:0x022a), top: B:164:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x020a A[Catch: all -> 0x0193, Exception -> 0x0197, e -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #36 {e -> 0x019b, Exception -> 0x0197, all -> 0x0193, blocks: (B:165:0x0178, B:167:0x0181, B:172:0x01b3, B:173:0x01c6, B:177:0x01e1, B:181:0x01fa, B:184:0x020a, B:187:0x021a, B:189:0x022a), top: B:164:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0254 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x057b A[EDGE_INSN: B:428:0x057b->B:420:0x057b BREAK  A[LOOP:0: B:34:0x0136->B:67:0x052b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0965 A[Catch: all -> 0x09e7, TRY_LEAVE, TryCatch #33 {all -> 0x09e7, blocks: (B:75:0x095f, B:77:0x0965), top: B:74:0x095f }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x09c9 A[Catch: all -> 0x09e2, TRY_ENTER, TryCatch #32 {all -> 0x09e2, blocks: (B:151:0x0926, B:152:0x0943, B:97:0x09c9, B:98:0x09e1), top: B:25:0x0107 }] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3, types: [com.tencent.mm.vfs.r6] */
    /* JADX WARN: Type inference failed for: r17v4, types: [com.tencent.mm.vfs.r6] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v64 */
    /* JADX WARN: Type inference failed for: r17v65 */
    /* JADX WARN: Type inference failed for: r17v66 */
    /* JADX WARN: Type inference failed for: r17v69 */
    /* JADX WARN: Type inference failed for: r17v70 */
    /* JADX WARN: Type inference failed for: r17v71 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.vfs.r6 a(se1.g r46, se1.i r47, java.lang.String r48, te1.s r49) {
        /*
            Method dump skipped, instructions count: 2637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te1.r.a(se1.g, se1.i, java.lang.String, te1.s):com.tencent.mm.vfs.r6");
    }

    public java.lang.String b(java.lang.String str, boolean z17, boolean z18, java.lang.String str2, int i17) {
        java.lang.String str3;
        boolean z19;
        java.lang.String str4;
        boolean z27;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8 = str;
        if (qe1.a.a().f362018c && this.f417808a <= 3) {
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = (java.util.concurrent.ThreadPoolExecutor) this.f417813f;
            if (!threadPoolExecutor.isShutdown() && !threadPoolExecutor.isTerminated()) {
                if (android.webkit.URLUtil.isHttpUrl(str) || android.webkit.URLUtil.isHttpsUrl(str)) {
                    str3 = str8;
                    z19 = z18;
                } else {
                    int i18 = ve1.g.f436082a;
                    java.lang.String concat = (android.text.TextUtils.isEmpty(str) || !str8.startsWith("/")) ? str8 : "file://".concat(str8);
                    if (!android.text.TextUtils.isEmpty(concat) && concat.startsWith("file:///android_asset")) {
                        str8 = concat;
                    } else {
                        if (!(!android.text.TextUtils.isEmpty(concat) && concat.startsWith("android.resource://"))) {
                            return concat;
                        }
                    }
                    str3 = str8;
                    z19 = false;
                }
                if (!ve1.g.m(str3)) {
                    str4 = str2;
                    z27 = z19;
                } else {
                    if (!qe1.a.a().f362021f) {
                        ve1.g.p(4, "VideoProxy", "getUrl, hls proxy disabled", null);
                        return str3;
                    }
                    str4 = "application/vnd.apple.mpegurl";
                    z27 = false;
                }
                try {
                    str5 = java.net.URLEncoder.encode(str3, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    ve1.g.p(6, "VideoProxy", "invalid url " + ve1.g.h(e17, false), null);
                    str5 = "";
                }
                if (android.text.TextUtils.isEmpty(str5)) {
                    ve1.g.p(6, "VideoProxy", "url is empty " + str5, null);
                    return str3;
                }
                java.lang.String lastPathSegment = android.net.Uri.parse(str3).getLastPathSegment();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("http://127.0.0.1:" + this.f417811d);
                sb6.append("/");
                sb6.append(lastPathSegment);
                sb6.append("?url=");
                sb6.append(str5);
                java.lang.String sb7 = sb6.toString();
                if (z27) {
                    sb7 = sb7 + "&enableCache=1";
                }
                if (i17 == 90 || i17 == 10 || i17 == -1) {
                    sb7 = sb7 + "&priority=" + i17;
                }
                if (!android.text.TextUtils.isEmpty(str4)) {
                    try {
                        str6 = java.net.URLEncoder.encode(str4, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.io.UnsupportedEncodingException unused) {
                        ve1.g.p(6, "VideoProxy", "unable to encode contentType " + str4, null);
                        str6 = null;
                    }
                    if (!android.text.TextUtils.isEmpty(str6)) {
                        sb7 = sb7 + "&contentType=" + str6;
                    }
                }
                if (z17) {
                    str7 = java.lang.System.currentTimeMillis() + "" + f417806m.getAndIncrement();
                } else {
                    str7 = null;
                }
                if (str7 != null) {
                    sb7 = sb7 + "&id=" + str7;
                }
                java.lang.String str9 = sb7;
                if (this.f417809b) {
                    try {
                        str9 = str9 + "&secret=" + ve1.l.b("des", ve1.l.c(), ve1.g.u(str3));
                    } catch (java.lang.Exception e18) {
                        ve1.g.p(6, "VideoProxy", "encode failed:" + ve1.g.h(e18, false), null);
                        this.f417809b = false;
                    }
                }
                ve1.g.p(4, "VideoProxy", "getUrl, url:" + str3 + ", proxyUrl:" + str9, null);
                return str9;
            }
        }
        ve1.g.p(4, "VideoProxy", "getUrl, proxy disabled or server shutdown", null);
        ((oe1.t1) qe1.a.a().f362030o).f344741a.f344748e = false;
        return (android.text.TextUtils.isEmpty(str) || !str8.startsWith("/")) ? str8 : "file://".concat(str8);
    }

    public final te1.o c(se1.g gVar, se1.i iVar, java.lang.String str, java.lang.String str2, te1.s sVar, java.net.Socket socket, java.lang.String str3, long j17, long j18, long j19) {
        te1.v vVar = this.f417814g;
        java.util.Map map = this.f417815h;
        te1.o oVar = new te1.o(this, null);
        oVar.f417796a = j17;
        ve1.g.p(4, str2, "openDataSource, dataSpec=" + iVar.toString(), null);
        if (ve1.g.m(str)) {
            try {
                com.tencent.mm.vfs.r6 a17 = qe1.a.a().f362032q != null ? ((cg.a) qe1.a.a().f362032q).a(str) : null;
                if (a17 == null || !a17.m()) {
                    oVar.f417799d = a(gVar, iVar, str, sVar);
                } else {
                    oVar.f417799d = a17;
                }
                if (oVar.f417799d == null) {
                    if (sVar.f417828h == 90) {
                        oVar.f417796a = ve1.g.f(18, j18);
                        android.support.v4.media.f.a(((java.util.HashMap) map).get(str3));
                    }
                    ve1.g.p(4, str2, "openDataSource, localPlaylist generate fail, see previous logs", null);
                    try {
                        socket.close();
                    } catch (java.io.IOException e17) {
                        ve1.g.p(6, str2, "openDataSource, socket close exception", e17);
                    }
                    vVar.d(sVar);
                    if (sVar.a(2)) {
                        sVar.s(256);
                        ve1.g.p(4, str2, "openDataSource, videoRequest is interrupted:" + sVar, null);
                        sVar.c();
                    } else {
                        sVar.s(257);
                    }
                    oVar.f417797b = true;
                    return oVar;
                }
                ve1.g.p(4, str2, "openDataSource, localPlaylist generate success:" + oVar.f417799d.toString(), null);
                te1.n nVar = new te1.n(this);
                nVar.c(new se1.i(android.net.Uri.fromFile(new java.io.File(com.tencent.mm.vfs.w6.i(oVar.f417799d.u(), false))), iVar.f406773b, iVar.f406774c, iVar.f406775d, iVar.f406776e, iVar.f406777f, iVar.f406778g, iVar.f406779h));
                oVar.f417798c = nVar;
            } catch (te1.e e18) {
                ve1.g.p(6, "VideoProxy/" + sVar.f417826f, "openDataSource, localPlaylist generate livePlayListException " + e18, null);
                int i17 = e18.getCause() != null ? ((e18.getCause() instanceof se1.r) || (e18.getCause() instanceof se1.s)) ? 0 : 17 : 16;
                if (sVar.f417828h == 90 && i17 != 0) {
                    oVar.f417796a = ve1.g.f(i17, j18);
                    android.support.v4.media.f.a(((java.util.HashMap) map).get(str3));
                }
                try {
                    socket.close();
                } catch (java.io.IOException e19) {
                    ve1.g.p(6, str2, "openDataSource, socket close exception", e19);
                }
                vVar.d(sVar);
                if (sVar.a(2)) {
                    sVar.s(256);
                    ve1.g.p(4, str2, "openDataSource, videoRequest is interrupted:" + sVar, null);
                    sVar.c();
                } else {
                    sVar.s(257);
                }
                oVar.f417797b = true;
                return oVar;
            }
        } else {
            gVar.c(iVar);
        }
        return oVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:(2:466|467)|(4:469|470|472|473)|(53:475|476|477|(3:727|728|(7:739|740|741|742|(1:744)(1:751)|(2:746|747)(1:750)|748)(4:730|731|732|733))(2:479|480)|481|482|484|485|486|487|488|(4:490|491|492|493)(1:711)|494|495|(1:497)(1:693)|498|499|500|501|502|503|504|505|506|507|508|(4:509|510|511|(3:513|514|(4:516|517|518|(11:522|523|(5:573|574|575|576|577)(1:525)|526|527|(4:531|(1:533)(2:564|(1:566)(1:567))|534|(4:536|537|538|(2:540|(1:542))(5:551|552|553|554|555)))|568|552|553|554|555)(1:644))(1:648))(1:657))|591|(3:593|594|595)(1:643)|596|597|(1:599)|601|602|603|604|605|606|607|608|609|(2:615|(1:619))|620|445|76|(1:78)(1:(1:129))|79|(1:81)(2:98|(1:100)(2:101|(1:103)(2:104|(1:106)(2:107|(1:109)(2:110|(1:112)(2:113|(1:115)(2:116|(1:118)(2:119|(2:124|(1:126)(1:127))(1:123)))))))))|82|83|(3:85|1034|90)(1:97)|91|92)|481|482|484|485|486|487|488|(0)(0)|494|495|(0)(0)|498|499|500|501|502|503|504|505|506|507|508|(5:509|510|511|(0)(0)|555)|591|(0)(0)|596|597|(0)|601|602|603|604|605|606|607|608|609|(4:611|613|615|(2:617|619))|620|445|76|(0)(0)|79|(0)(0)|82|83|(0)(0)|91|92) */
    /* JADX WARN: Can't wrap try/catch for region: R(54:465|(2:466|467)|(4:469|470|472|473)|(53:475|476|477|(3:727|728|(7:739|740|741|742|(1:744)(1:751)|(2:746|747)(1:750)|748)(4:730|731|732|733))(2:479|480)|481|482|484|485|486|487|488|(4:490|491|492|493)(1:711)|494|495|(1:497)(1:693)|498|499|500|501|502|503|504|505|506|507|508|(4:509|510|511|(3:513|514|(4:516|517|518|(11:522|523|(5:573|574|575|576|577)(1:525)|526|527|(4:531|(1:533)(2:564|(1:566)(1:567))|534|(4:536|537|538|(2:540|(1:542))(5:551|552|553|554|555)))|568|552|553|554|555)(1:644))(1:648))(1:657))|591|(3:593|594|595)(1:643)|596|597|(1:599)|601|602|603|604|605|606|607|608|609|(2:615|(1:619))|620|445|76|(1:78)(1:(1:129))|79|(1:81)(2:98|(1:100)(2:101|(1:103)(2:104|(1:106)(2:107|(1:109)(2:110|(1:112)(2:113|(1:115)(2:116|(1:118)(2:119|(2:124|(1:126)(1:127))(1:123)))))))))|82|83|(3:85|1034|90)(1:97)|91|92)|777|481|482|484|485|486|487|488|(0)(0)|494|495|(0)(0)|498|499|500|501|502|503|504|505|506|507|508|(5:509|510|511|(0)(0)|555)|591|(0)(0)|596|597|(0)|601|602|603|604|605|606|607|608|609|(4:611|613|615|(2:617|619))|620|445|76|(0)(0)|79|(0)(0)|82|83|(0)(0)|91|92) */
    /* JADX WARN: Can't wrap try/catch for region: R(55:465|466|467|(4:469|470|472|473)|(53:475|476|477|(3:727|728|(7:739|740|741|742|(1:744)(1:751)|(2:746|747)(1:750)|748)(4:730|731|732|733))(2:479|480)|481|482|484|485|486|487|488|(4:490|491|492|493)(1:711)|494|495|(1:497)(1:693)|498|499|500|501|502|503|504|505|506|507|508|(4:509|510|511|(3:513|514|(4:516|517|518|(11:522|523|(5:573|574|575|576|577)(1:525)|526|527|(4:531|(1:533)(2:564|(1:566)(1:567))|534|(4:536|537|538|(2:540|(1:542))(5:551|552|553|554|555)))|568|552|553|554|555)(1:644))(1:648))(1:657))|591|(3:593|594|595)(1:643)|596|597|(1:599)|601|602|603|604|605|606|607|608|609|(2:615|(1:619))|620|445|76|(1:78)(1:(1:129))|79|(1:81)(2:98|(1:100)(2:101|(1:103)(2:104|(1:106)(2:107|(1:109)(2:110|(1:112)(2:113|(1:115)(2:116|(1:118)(2:119|(2:124|(1:126)(1:127))(1:123)))))))))|82|83|(3:85|1034|90)(1:97)|91|92)|777|481|482|484|485|486|487|488|(0)(0)|494|495|(0)(0)|498|499|500|501|502|503|504|505|506|507|508|(5:509|510|511|(0)(0)|555)|591|(0)(0)|596|597|(0)|601|602|603|604|605|606|607|608|609|(4:611|613|615|(2:617|619))|620|445|76|(0)(0)|79|(0)(0)|82|83|(0)(0)|91|92) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0f30, code lost:
    
        r81.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0f34, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0f35, code lost:
    
        ve1.g.p(r4, r2, r38, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0edf, code lost:
    
        r84.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0ee3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0ee4, code lost:
    
        r1 = r0;
        r12 = r67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0ee7, code lost:
    
        r18 = r1;
        r67 = r12;
        r13 = r34;
        r10 = r38;
        r11 = r61;
        r6 = r62;
        r9 = r63;
        r7 = r64;
        r1 = r68;
        r3 = r69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x1109, code lost:
    
        if (r33.A() != false) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x110f, code lost:
    
        if (r33.m() != false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x1111, code lost:
    
        ve1.g.o(4, r2, r3 + r33.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x1135, code lost:
    
        if (r33.o().startsWith(qe1.a.a().d()) != false) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x113b, code lost:
    
        if (r33.l() == false) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x113d, code lost:
    
        ve1.g.o(5, r2, r1 + r33.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x1151, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:?, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:?, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:?, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:?, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x10fa, code lost:
    
        r81.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x10fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x10ff, code lost:
    
        ve1.g.p(r4, r2, r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0be0, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0be1, code lost:
    
        r11 = r12;
        r12 = -99999;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0bf2, code lost:
    
        if ((r7 instanceof se1.t) != false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0bf4, code lost:
    
        ve1.g.o(4, r2, "uri:" + r84.l() + ", InvalidContent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0c16, code lost:
    
        if (r84.g() == 90) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0c18, code lost:
    
        r10 = -99999;
        r8 = ve1.g.f(10, -99999);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0c21, code lost:
    
        r31 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0c5a, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0c24, code lost:
    
        r10 = -99999;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0c61, code lost:
    
        r3 = r84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0d88, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0ed5, code lost:
    
        r67 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0c28, code lost:
    
        r10 = -99999;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0c2d, code lost:
    
        if ((r7 instanceof se1.w) != false) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0c2f, code lost:
    
        ve1.g.o(4, r2, "uri:" + r84.l() + ", MalformedResponse");
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0c51, code lost:
    
        if (r84.g() == 90) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0c53, code lost:
    
        r8 = ve1.g.f(12, -99999);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0c67, code lost:
    
        if ((r7 instanceof se1.r) != false) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0c69, code lost:
    
        r3 = r84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0c6d, code lost:
    
        r3.s(256);
        ve1.g.o(5, r2, "uri:" + r84.l() + " connect to server interrupted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0cb4, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0e8b, code lost:
    
        r67 = r7;
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0c8d, code lost:
    
        r3 = r84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0c91, code lost:
    
        if ((r7 instanceof se1.s) != false) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0c95, code lost:
    
        r3.s(256);
        ve1.g.o(5, r2, "uri:" + r84.l() + " read interrupted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0cbe, code lost:
    
        if ((r7 instanceof se1.x) != false) goto L807;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0d91, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0d95, code lost:
    
        if ((r7 instanceof se1.q) != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0d97, code lost:
    
        ve1.g.o(5, r2, "uri:" + r84.l() + ", read upstream error1: " + ve1.g.g(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0dc0, code lost:
    
        if (r84.g() == 90) goto L791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0dd1, code lost:
    
        if (r7.toString().toLowerCase().contains("unexpected end of stream") == false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0de7, code lost:
    
        r12 = ve1.g.f(r12, -99999);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0deb, code lost:
    
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0dd8, code lost:
    
        if (r7.getCause() != null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0de0, code lost:
    
        if ((r7.getCause() instanceof java.net.SocketTimeoutException) != false) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0de2, code lost:
    
        r12 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0de5, code lost:
    
        r12 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0def, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0e2c, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0e2d, code lost:
    
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0df3, code lost:
    
        if ((r8 instanceof se1.p) == false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0df9, code lost:
    
        ve1.g.o(5, r2, "uri:" + r84.l() + ", read upstream error2: " + ve1.g.g(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0e22, code lost:
    
        if (r84.g() == 90) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0e24, code lost:
    
        r12 = ve1.g.f(1404, -99999);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0e32, code lost:
    
        if ((r7 instanceof java.net.NoRouteToHostException) != false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0e34, code lost:
    
        ve1.g.o(5, r2, "uri:" + r84.l() + ", read upstream error3: " + ve1.g.g(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0e5d, code lost:
    
        if (r84.g() == 90) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0e5f, code lost:
    
        r12 = ve1.g.f(1, -99999);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0e68, code lost:
    
        if ((r7 instanceof java.io.InterruptedIOException) != false) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0e6c, code lost:
    
        r3.s(256);
        ve1.g.o(4, r2, "uri:" + r84.l() + " is interrupted by system");
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0e99, code lost:
    
        if (r7.getMessage().matches("(?i)^.*((ECONNRESET)|(EPIPE)|(reset)).*$") != false) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0e9b, code lost:
    
        ve1.g.o(5, r2, "response interrupted, client closed connection");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0ead, code lost:
    
        if (r7.toString().contains("write byteCount err") != false) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0eaf, code lost:
    
        ve1.g.o(5, r2, "response interrupted, socket write byteCount err");
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0eb6, code lost:
    
        ve1.g.o(5, r2, "uri:" + r3 + ", error occurred while sending data " + ve1.g.g(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x1092, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x1093, code lost:
    
        r16 = r7;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x1099, code lost:
    
        r10 = r38;
        r11 = r61;
        r6 = r62;
        r9 = r63;
        r7 = r64;
        r1 = r68;
        r3 = r69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x10cd, code lost:
    
        r18 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0e2b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x10a8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x10a9, code lost:
    
        r16 = r7;
        r13 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0cc0, code lost:
    
        ve1.g.o(5, r2, "uri:" + r84.l() + ", unable to connect server: " + ve1.g.g(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0ce9, code lost:
    
        if (r84.g() == 90) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0ceb, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0cef, code lost:
    
        if ((r8 instanceof re1.f) != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0cf1, code lost:
    
        r6 = ((re1.f) r8).g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0cfa, code lost:
    
        if ((r6 instanceof se1.n) != false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0cfc, code lost:
    
        r6 = ((se1.n) r6).h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0d27, code lost:
    
        if (r6 != null) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0d3f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0d43, code lost:
    
        if (r12 == false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0d45, code lost:
    
        r6 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0d7f, code lost:
    
        r31 = ve1.g.f(r6, -99999);
        r12 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0d48, code lost:
    
        r6 = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0d52, code lost:
    
        if (r6 != null) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0d54, code lost:
    
        r6 = r6.getActiveNetworkInfo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0d58, code lost:
    
        if (r6 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0d63, code lost:
    
        r12 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0d73, code lost:
    
        if (r12 != false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0d75, code lost:
    
        r13 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0d79, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0d77, code lost:
    
        r13 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0d61, code lost:
    
        r49 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0d69, code lost:
    
        ve1.g.p(5, "PlayerUtils", "isNetworkAvailable cant access ConnectivityManager missing permission?", null);
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0d42, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0d03, code lost:
    
        ve1.g.o(4, r2, "write response, cacheDataSource error:" + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0d26, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0d1c, code lost:
    
        if ((r8 instanceof se1.n) != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0d1e, code lost:
    
        r6 = ((se1.n) r8).h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0d66, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0d8c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0d8d, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0bec, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0bed, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0cb8, code lost:
    
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x10b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x10b1, code lost:
    
        r16 = r7;
        r13 = r34;
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0a35, code lost:
    
        r3 = (se1.v) r12;
        r13 = r3.f406828d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0a3a, code lost:
    
        r63 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0a40, code lost:
    
        r35 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0a44, code lost:
    
        if (r84.g() == 90) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0a48, code lost:
    
        if (r13 == 416) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0a4a, code lost:
    
        r10 = r2;
        r1 = r14;
        r16 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0a51, code lost:
    
        r12 = r1.c(r10, -1).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0a5d, code lost:
    
        if (r12.hasNext() != false) goto L819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0a5f, code lost:
    
        r83 = r12;
        r12 = (te1.s) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0a6d, code lost:
    
        if (r12.equals(r11) == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0a6f, code lost:
    
        monitor-enter(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0a70, code lost:
    
        r36 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0a72, code lost:
    
        r10 = r12.f417831k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0a77, code lost:
    
        if (r10 != (-1)) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0a79, code lost:
    
        monitor-enter(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0a7a, code lost:
    
        r10 = r12.f417831k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0a7c, code lost:
    
        monitor-exit(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0a7d, code lost:
    
        r23 = r10;
        r10 = r12.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0aa7, code lost:
    
        if (r23 != (-1)) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0ab1, code lost:
    
        r25 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0ab9, code lost:
    
        if (ve1.g.m(r82) == false) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0abb, code lost:
    
        r26 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0ac0, code lost:
    
        r11 = ve1.e.d(r4, r14, r23, r25, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0ace, code lost:
    
        if (r10.equals(te1.b.f417768c) != false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0ad0, code lost:
    
        ve1.g.o(6, r2, "file type should not be unknown");
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0ad6, code lost:
    
        ve1.g.o(4, r2, "write response, responseCode 416, totalLength=" + r8 + ", send response headers: " + ve1.g.v(r11, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0af9, code lost:
    
        r7.write(r11.getBytes(com.tencent.mapsdk.internal.rv.f51270c));
        r7.flush();
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0b08, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0b21, code lost:
    
        if (r11 != null) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0b59, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0b23, code lost:
    
        ve1.g.o(4, r2, "uri:" + r84.l() + ", InvalidResponseCode: \r\n" + ve1.e.a(r3.f406829e));
        r6 = ve1.g.i(r3.f406829e);
        r31 = ve1.g.f((long) r13, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0b53, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0b56, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0b57, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0b77, code lost:
    
        r18 = r1;
        r67 = r11;
        r13 = r34;
        r22 = r35;
        r10 = r38;
        r11 = r61;
        r6 = r62;
        r9 = r63;
        r7 = r64;
        r1 = r68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0b0a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0b0c, code lost:
    
        ve1.g.p(4, r2, "write response, workaround 416 error ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0b14, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0b15, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0b69, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0abe, code lost:
    
        r26 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0b1f, code lost:
    
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0a90, code lost:
    
        r12 = r83;
        r11 = r84;
        r10 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0a8e, code lost:
    
        r36 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0a97, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0a98, code lost:
    
        r1 = r0;
        r12 = r16;
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0a9f, code lost:
    
        r36 = r10;
        r10 = r19;
        r23 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0b17, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0b68, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0b19, code lost:
    
        r36 = r2;
        r1 = r14;
        r16 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0b5c, code lost:
    
        r36 = r2;
        r1 = r14;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0b63, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0b64, code lost:
    
        r35 = r1;
        r16 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0b6d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0b6e, code lost:
    
        r35 = r1;
        r63 = r10;
        r1 = r0;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0b91, code lost:
    
        r35 = r1;
        r63 = r10;
        r36 = r2;
        r1 = r14;
        r16 = r12;
        r12 = 6;
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0ba0, code lost:
    
        if ((r7 instanceof se1.u) != false) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0ba2, code lost:
    
        r12 = (se1.u) r7;
        ve1.g.o(4, r2, "uri:" + r84.l() + ", InvalidContentType: \r\n" + ve1.e.a(r12.f406827d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0bd0, code lost:
    
        if (r84.g() == 90) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0bd2, code lost:
    
        r12 = ve1.g.i(r12.f406827d);
        r31 = ve1.g.f(3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0bde, code lost:
    
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0be5, code lost:
    
        r78 = r12;
        r12 = r11;
        r10 = r78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0438, code lost:
    
        throw new se1.t("invalid content", r74);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0c5b, code lost:
    
        r3 = r84;
        r8 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d82, code lost:
    
        r67 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0d84, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0567, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0568, code lost:
    
        ve1.g.p(r4, r2, r38, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x055d, code lost:
    
        r4 = 5;
        ve1.g.o(5, r2, r62);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x05e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x05e6, code lost:
    
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r14 = r72;
        r22 = r1;
        r49 = r3;
        r3 = r62;
        r38 = r38;
        r8 = r69;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x05c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x05c5, code lost:
    
        r14 = r72;
        r22 = r1;
        r1 = r68;
        r11 = r6;
        r6 = r62;
        r3 = r69;
        r9 = "write response, total send ";
        r7 = " bytes, rangeStart=";
        r33 = r18;
        r67 = null;
        r18 = r0;
        r10 = r38;
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0629, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x062a, code lost:
    
        r85 = r1;
        r19 = r3;
        r20 = r12;
        r1 = r38;
        r3 = r62;
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r8 = r69;
        r14 = r72;
        r9 = r68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x06a4, code lost:
    
        r38 = r1;
        r1 = r83;
        r78 = r21;
        r22 = r85;
        r21 = r20;
        r20 = r18;
        r18 = r0;
        r23 = r78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0612, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0613, code lost:
    
        r85 = r1;
        r19 = r3;
        r20 = r12;
        r1 = r38;
        r3 = r62;
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r8 = r69;
        r14 = r72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0680, code lost:
    
        r7 = r0;
        r49 = r19;
        r22 = r85;
        r38 = r1;
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x05fe, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x05ff, code lost:
    
        r85 = r1;
        r20 = r12;
        r1 = r38;
        r3 = r62;
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r8 = r69;
        r14 = r72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0653, code lost:
    
        r11 = r6;
        r33 = r18;
        r67 = null;
        r6 = r3;
        r18 = r0;
        r3 = r8;
        r7 = r13;
        r13 = r20;
        r8 = r85;
        r78 = r10;
        r10 = r1;
        r1 = r9;
        r9 = r78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x04be, code lost:
    
        r72 = r7;
        r7 = r10;
        r21 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x06b8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x06b9, code lost:
    
        r85 = r1;
        r21 = r14;
        r1 = r38;
        r3 = r62;
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r14 = r7;
        r7 = r10;
        r10 = "write response, total send ";
        r8 = r69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x073d, code lost:
    
        r20 = r0;
        r19 = r83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x07aa, code lost:
    
        r38 = r1;
        r62 = r3;
        r69 = r8;
        r68 = r9;
        r33 = r18;
        r12 = r20;
        r8 = r21;
        r18 = true;
        r34 = 0;
        r1 = r85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x06f7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x06f8, code lost:
    
        r85 = r1;
        r21 = r14;
        r1 = r38;
        r3 = r62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0700, code lost:
    
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r14 = r7;
        r8 = r69;
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x06e4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x06e5, code lost:
    
        r85 = r1;
        r14 = r7;
        r1 = r38;
        r3 = r62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x06ec, code lost:
    
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r8 = r69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x06f4, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0788, code lost:
    
        r22 = r85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x06d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x06d2, code lost:
    
        r85 = r1;
        r14 = r7;
        r1 = r38;
        r3 = r62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x06d9, code lost:
    
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r8 = r69;
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x076c, code lost:
    
        r22 = r85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x070e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x070f, code lost:
    
        r85 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0711, code lost:
    
        r3 = r9;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0713, code lost:
    
        r21 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0724, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0725, code lost:
    
        r85 = r1;
        r83 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x071d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x071e, code lost:
    
        r85 = r1;
        r14 = r7;
        r3 = r9;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x0716, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x0717, code lost:
    
        r85 = r1;
        r14 = r7;
        r3 = r9;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0733, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0734, code lost:
    
        r85 = r1;
        r83 = r3;
        r3 = r9;
        r1 = r10;
        r18 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x072a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x072b, code lost:
    
        r85 = r1;
        r14 = r7;
        r3 = r9;
        r1 = r10;
        r18 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0743, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0744, code lost:
    
        r85 = r1;
        r3 = r9;
        r1 = r10;
        r31 = r11;
        r18 = r13;
        r21 = r14;
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r19 = r77;
        r11 = r84;
        r14 = r7;
        r8 = r69;
        r7 = r12;
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0772, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x0773, code lost:
    
        r85 = r1;
        r14 = r7;
        r3 = r9;
        r1 = r10;
        r31 = r11;
        r18 = r13;
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r8 = r69;
        r11 = r84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x078c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x078d, code lost:
    
        r85 = r1;
        r14 = r7;
        r3 = r9;
        r1 = r10;
        r31 = r11;
        r18 = r13;
        r10 = "write response, total send ";
        r13 = " bytes, rangeStart=";
        r9 = r68;
        r8 = r69;
        r7 = r12;
        r19 = r77;
        r11 = r84;
        r20 = r0;
        r21 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0f9e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0f30 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0edf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x1105  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x10fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0d29 A[Catch: all -> 0x0d66, TryCatch #56 {all -> 0x0d66, blocks: (B:272:0x0ced, B:274:0x0cf1, B:276:0x0cfc, B:278:0x0d29, B:280:0x0d2d, B:282:0x0d33, B:287:0x0d7a, B:290:0x0d48, B:292:0x0d54, B:294:0x0d5a, B:303:0x0d69, B:305:0x0d03, B:307:0x0d1a, B:309:0x0d1e), top: B:271:0x0ced }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0d48 A[Catch: all -> 0x0d66, TryCatch #56 {all -> 0x0d66, blocks: (B:272:0x0ced, B:274:0x0cf1, B:276:0x0cfc, B:278:0x0d29, B:280:0x0d2d, B:282:0x0d33, B:287:0x0d7a, B:290:0x0d48, B:292:0x0d54, B:294:0x0d5a, B:303:0x0d69, B:305:0x0d03, B:307:0x0d1a, B:309:0x0d1e), top: B:271:0x0ced }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0a35 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0b23 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x093d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x03a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x04e0 A[Catch: Exception -> 0x045f, all -> 0x04d3, IOException -> 0x04d5, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x045f, blocks: (B:577:0x03d7, B:527:0x03fb, B:531:0x0405, B:533:0x0409, B:534:0x0418, B:536:0x041c, B:538:0x041e, B:540:0x0426, B:543:0x042f, B:544:0x0438, B:551:0x0439, B:554:0x047f, B:564:0x0411, B:595:0x04c8, B:599:0x04e0), top: B:576:0x03d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:643:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x04be A[EDGE_INSN: B:657:0x04be->B:649:0x04be BREAK  A[LOOP:1: B:509:0x03a0->B:555:0x0489], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0f3d  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0f9a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0fc3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x101c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x106e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0fca  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.net.Socket r81, java.lang.String r82, java.io.OutputStream r83, te1.s r84, java.io.InputStream r85) {
        /*
            Method dump skipped, instructions count: 4434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te1.r.d(java.net.Socket, java.lang.String, java.io.OutputStream, te1.s, java.io.InputStream):void");
    }
}

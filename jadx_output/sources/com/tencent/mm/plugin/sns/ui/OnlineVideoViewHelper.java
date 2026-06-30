package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class OnlineVideoViewHelper {
    public boolean A;
    public final com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoConfigs B;
    public final java.lang.Object C;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166523a;

    /* renamed from: b, reason: collision with root package name */
    public int f166524b;

    /* renamed from: c, reason: collision with root package name */
    public int f166525c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f166526d;

    /* renamed from: e, reason: collision with root package name */
    public d61.k f166527e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback f166528f;

    /* renamed from: g, reason: collision with root package name */
    public r45.jj4 f166529g;

    /* renamed from: h, reason: collision with root package name */
    public int f166530h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f166531i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f166532j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f166533k;

    /* renamed from: l, reason: collision with root package name */
    public int f166534l;

    /* renamed from: m, reason: collision with root package name */
    public int f166535m;

    /* renamed from: n, reason: collision with root package name */
    public int f166536n;

    /* renamed from: o, reason: collision with root package name */
    public int f166537o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f166538p;

    /* renamed from: q, reason: collision with root package name */
    public int f166539q;

    /* renamed from: r, reason: collision with root package name */
    public int f166540r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f166541s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f166542t;

    /* renamed from: u, reason: collision with root package name */
    public int f166543u;

    /* renamed from: v, reason: collision with root package name */
    public long f166544v;

    /* renamed from: w, reason: collision with root package name */
    public long f166545w;

    /* renamed from: x, reason: collision with root package name */
    public long f166546x;

    /* renamed from: y, reason: collision with root package name */
    public long f166547y;

    /* renamed from: z, reason: collision with root package name */
    public int f166548z;

    /* loaded from: classes4.dex */
    public interface IVideoUICallback {
        int getPlayErrorCode();

        int getPlayVideoDuration();

        int getPlayVideoDurationByResume();

        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct getRptStruct();

        int getUiStayTime();
    }

    /* loaded from: classes4.dex */
    public static class VideoConfigs {

        /* renamed from: a, reason: collision with root package name */
        public int f166551a;

        /* renamed from: b, reason: collision with root package name */
        public int f166552b;

        /* renamed from: c, reason: collision with root package name */
        public int f166553c;

        private VideoConfigs() {
        }
    }

    /* loaded from: classes4.dex */
    public static class VideoRptStruct {

        /* renamed from: a, reason: collision with root package name */
        public long f166554a = 0;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f166555b = "";

        /* renamed from: c, reason: collision with root package name */
        public int f166556c = 0;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f166557d = "";

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f166558e = "";

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f166559f = "";

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f166560g = "";

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f166561h = "";

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f166562i = "";

        /* renamed from: j, reason: collision with root package name */
        public java.lang.String f166563j = "";

        /* renamed from: k, reason: collision with root package name */
        public int f166564k = 0;

        /* renamed from: l, reason: collision with root package name */
        public java.lang.String f166565l = "";
    }

    public OnlineVideoViewHelper(com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback) {
        java.lang.String str = "MicroMsg.OnlineVideoViewHelper[" + hashCode() + ']';
        this.f166523a = str;
        this.f166524b = 0;
        this.f166525c = 0;
        this.f166526d = null;
        this.f166539q = 0;
        this.f166541s = false;
        this.f166542t = false;
        this.f166543u = 0;
        this.A = false;
        this.C = new java.lang.Object();
        this.f166528f = iVideoUICallback;
        this.f166527e = new d61.k();
        this.f166526d = new java.util.HashMap();
        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoConfigs videoConfigs = new com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoConfigs();
        this.B = videoConfigs;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseConfig", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        videoConfigs.f166551a = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoPreloadSec", 5);
        videoConfigs.f166552b = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoDownloadSec", 1);
        videoConfigs.f166553c = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsVideoFullDownloadPercent", 101);
        com.tencent.mars.xlog.Log.i(str, "parseConfig preload[%d] downloadSec[%d], needFinish[%d]", java.lang.Integer.valueOf(videoConfigs.f166551a), java.lang.Integer.valueOf(videoConfigs.f166552b), java.lang.Integer.valueOf(videoConfigs.f166553c));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseConfig", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        o();
        this.A = false;
    }

    public final boolean a(int i17, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        pInt.value = java.lang.Math.max(i17, this.f166539q);
        int i18 = this.f166525c;
        if (i18 == 1) {
            pInt.value = i17;
            pInt2.value = this.f166540r + i17;
        }
        if (i18 == 2) {
            int i19 = i17 - 8;
            pInt.value = i19;
            if (i19 < 0) {
                pInt.value = 0;
            }
            pInt2.value = pInt.value + this.f166540r + 8;
        }
        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoConfigs videoConfigs = this.B;
        if (i18 == 3 || i18 == 4) {
            pInt.value = this.f166539q;
            pInt2.value = this.f166540r + i17 + 1 + videoConfigs.f166552b;
        }
        int i27 = pInt2.value;
        int i28 = this.f166534l;
        if (i27 >= i28 + 1) {
            pInt2.value = i28 + 1;
        }
        int i29 = pInt2.value;
        int i37 = pInt.value;
        if (i29 < i37) {
            pInt2.value = i37 + videoConfigs.f166552b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f166523a, "calcDownloadRange range[%d, %d] playTime[%d] playStatus[%d] cache[%d, %d]", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(pInt2.value), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f166525c), java.lang.Integer.valueOf(this.f166539q), java.lang.Integer.valueOf(this.f166540r));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcDownloadRange", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return true;
    }

    public boolean b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkCallbackMediaId", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(this.f166533k, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkCallbackMediaId", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r18) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.c(int):boolean");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        com.tencent.mars.xlog.Log.i(this.f166523a, "clear");
        this.A = true;
        o();
        synchronized (this.C) {
            try {
                this.f166528f = null;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        this.f166527e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final java.lang.Object[] e() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        long j17;
        java.lang.String str5;
        int i29;
        int i37;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.Object[] objArr = new java.lang.Object[15];
        synchronized (this.C) {
            try {
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = this.f166528f;
                if (iVideoUICallback != null) {
                    i29 = iVideoUICallback.getPlayVideoDuration();
                    i17 = this.f166528f.getUiStayTime();
                    i18 = this.f166528f.getPlayErrorCode();
                    i19 = this.f166528f.getRptStruct().f166556c;
                    str5 = this.f166528f.getRptStruct().f166555b;
                    j17 = this.f166528f.getRptStruct().f166554a;
                    str = this.f166528f.getRptStruct().f166557d;
                    str2 = this.f166528f.getRptStruct().f166558e;
                    str3 = this.f166528f.getRptStruct().f166559f;
                    i27 = this.f166528f.getPlayVideoDurationByResume();
                    i28 = this.f166528f.getRptStruct().f166564k;
                    str4 = this.f166528f.getRptStruct().f166565l;
                } else {
                    str = "";
                    str2 = "";
                    str3 = "";
                    str4 = "";
                    i17 = 0;
                    i18 = 0;
                    i19 = 0;
                    i27 = 0;
                    i28 = 0;
                    j17 = 0;
                    str5 = "";
                    i29 = 0;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        objArr[0] = java.lang.Integer.valueOf(i29);
        java.lang.String str6 = str4;
        int i38 = i27;
        if (this.f166546x <= 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f166546x = java.lang.System.currentTimeMillis();
        }
        long j18 = this.f166544v;
        java.lang.String str7 = str;
        if (j18 <= 0 || (i37 = (int) (this.f166546x - j18)) <= 0) {
            i37 = 0;
        }
        objArr[1] = java.lang.Integer.valueOf(i37);
        if (this.f166545w <= 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f166545w = java.lang.System.currentTimeMillis();
        }
        int i39 = (int) (this.f166545w - this.f166544v);
        if (i39 <= 0) {
            i39 = 0;
        }
        objArr[2] = java.lang.Integer.valueOf(i39);
        objArr[3] = java.lang.Integer.valueOf(this.f166543u);
        if (this.f166543u > 0) {
            int i47 = this.f166548z;
            if (i47 == 0) {
                long j19 = this.f166547y;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f166548z = (int) (i47 + (java.lang.System.currentTimeMillis() - j19));
            }
            objArr[4] = java.lang.Integer.valueOf(this.f166548z / this.f166543u);
        } else {
            objArr[4] = 0;
        }
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = java.lang.Integer.valueOf(i18);
        objArr[7] = java.lang.Integer.valueOf(i19);
        objArr[8] = str5;
        objArr[9] = java.lang.Long.valueOf(j17);
        objArr[10] = str7;
        objArr[11] = str2;
        objArr[12] = str3;
        objArr[13] = java.lang.Integer.valueOf(i38);
        objArr[14] = java.lang.Integer.valueOf(i28);
        objArr[15] = str6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createPlayVideoRpt", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        return objArr;
    }

    public void f(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        this.f166542t = false;
        java.lang.String str2 = this.f166523a;
        if (i17 <= -1 || i18 <= -1) {
            com.tencent.mars.xlog.Log.w(str2, "deal data available error offset[%d], length[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        if (b(str)) {
            java.lang.Integer num = (java.lang.Integer) this.f166526d.get(this.f166533k + i17 + "_" + i18);
            if (num == null || num.intValue() <= 0) {
                try {
                    this.f166539q = this.f166527e.d(i17, i18);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(str2, "deal data available file pos to video time error: " + e17.toString());
                }
            } else {
                this.f166539q = num.intValue();
            }
            com.tencent.mars.xlog.Log.i(str2, "deal data available. offset[%d] length[%d] cachePlayTime[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f166539q));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealDataAvailable", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void g(long j17, long j18, boolean z17) {
        d61.k kVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f166534l), this.f166533k, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f166544v)};
        java.lang.String str = this.f166523a;
        com.tencent.mars.xlog.Log.i(str, "deal moov ready moovPos %d, timeDuration %d, cdnMediaId %s startDownload[%d %d]", objArr);
        if (this.f166534l != 0) {
            com.tencent.mars.xlog.Log.w(str, "moov had callback, do nothing.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        long j19 = this.f166544v;
        if (j18 > j19) {
            j19 = j18;
        }
        this.f166544v = j19;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f166545w = java.lang.System.currentTimeMillis();
        try {
            kVar = this.f166527e;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "deal moov ready error: " + e17.toString());
        }
        if (kVar == null) {
            com.tencent.mars.xlog.Log.w(str, "parser is null, thread is error.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            return;
        }
        if (kVar.a(this.f166532j, j17)) {
            int i17 = this.f166527e.f226747f;
            this.f166534l = i17;
            com.tencent.mars.xlog.Log.i(str, "mp4 parse moov success. duration %d cdnMediaId %s isFastStart %b", java.lang.Integer.valueOf(i17), this.f166533k, java.lang.Boolean.valueOf(z17));
            if (!z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper = com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.this;
                        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = onlineVideoViewHelper.f166528f;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        if (iVideoUICallback != null && onlineVideoViewHelper.c(0)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                            com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback2 = onlineVideoViewHelper.f166528f;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                            if (iVideoUICallback2 != null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                boolean j27 = onlineVideoViewHelper.j();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                if (j27) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    onlineVideoViewHelper.k();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    onlineVideoViewHelper.q(true);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    onlineVideoViewHelper.f166541s = true;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$1");
                    }
                });
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            }
            if (this.f166537o == -1) {
                this.f166525c = 1;
            } else {
                this.f166525c = 2;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptMoovSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 204L, 1L, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptMoovSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        } else {
            com.tencent.mars.xlog.Log.w(str, "mp4 parse moov error. cdnMediaId %s", this.f166533k);
            t21.o2.Di().p(this.f166533k, 0, -1, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptMoovFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(354L, 205L, 1L, false);
            g0Var.d(13836, 402, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptMoovFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void h(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealProgressCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (b(str)) {
            this.f166535m = i18;
            this.f166536n = (i17 * 100) / i18;
            com.tencent.mars.xlog.Log.i(this.f166523a, "deal video[%s] progress callback[%d, %d]. downloadedPercent[%d]", this.f166533k, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f166535m), java.lang.Integer.valueOf(this.f166536n));
        }
        if (this.f166536n >= 100) {
            this.f166524b = 3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealProgressCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealStreamFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(this.f166525c), this.f166533k};
        java.lang.String str = this.f166523a;
        com.tencent.mars.xlog.Log.i(str, "deal stream finish. playStatus %d cdnMediaId %s", objArr);
        this.f166542t = false;
        this.f166524b = 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 206L, 1L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        int i17 = this.f166525c;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.w(str, "it had not moov callback and download finish start to play video.");
            l();
        } else if (i17 == 5) {
            com.tencent.mars.xlog.Log.w(str, "it had play error, it request all video data finish, start to play." + this.f166533k);
            l();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealStreamFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = this.f166528f;
                if (iVideoUICallback == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    return false;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                boolean z17 = ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) iVideoUICallback).f166460x1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mars.xlog.Log.i(this.f166523a, "isPlayAllowed: %s", java.lang.Boolean.toString(z17));
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) this.f166528f;
                onlineVideoView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                boolean z18 = onlineVideoView.f166460x1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                return z18;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlayAllowed", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("noteStartTimeStamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (this.f166546x == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f166546x = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("noteStartTimeStamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playOfflineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        com.tencent.mars.xlog.Log.i(this.f166523a, "play offline video %s ", this.f166533k);
        k();
        com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper = com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.this;
                boolean j17 = onlineVideoViewHelper.j();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                if (j17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = onlineVideoViewHelper.f166528f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    if (iVideoUICallback != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        onlineVideoViewHelper.q(false);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper$2");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playOfflineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        java.lang.String str = this.f166533k + "0_-1";
        java.util.HashMap hashMap = this.f166526d;
        if (!hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i(this.f166523a, "request all data. [%s]", this.f166533k);
            t21.o2.Di().p(this.f166533k, 0, -1, 0);
            hashMap.put(str, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptRequestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(354L, 207L, 1L, false);
            g0Var.d(13836, 403, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), "");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptRequestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        }
        this.f166525c = 5;
        this.f166538p = true;
        this.f166541s = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAllData", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            java.lang.String r0 = r12.f166523a
            java.lang.String r1 = "requestVideoData"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.pointers.PInt r3 = new com.tencent.mm.pointers.PInt
            r3.<init>()
            com.tencent.mm.pointers.PInt r4 = new com.tencent.mm.pointers.PInt
            r4.<init>()
            r5 = 0
            d61.k r6 = r12.f166527e     // Catch: java.lang.Exception -> L34
            boolean r13 = r6.b(r13, r14, r3, r4)     // Catch: java.lang.Exception -> L34
            if (r13 == 0) goto L4a
            int r13 = r4.value     // Catch: java.lang.Exception -> L34
            r6 = 81920(0x14000, float:1.14794E-40)
            int r13 = r13 + r6
            r4.value = r13     // Catch: java.lang.Exception -> L34
            com.tencent.mm.modelcdntran.l3 r13 = t21.o2.Di()     // Catch: java.lang.Exception -> L34
            java.lang.String r6 = r12.f166533k     // Catch: java.lang.Exception -> L34
            int r7 = r3.value     // Catch: java.lang.Exception -> L34
            int r8 = r4.value     // Catch: java.lang.Exception -> L34
            boolean r13 = r13.o(r6, r7, r8)     // Catch: java.lang.Exception -> L34
            goto L4b
        L34:
            r13 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "check video data error: "
            r6.<init>(r7)
            java.lang.String r13 = r13.toString()
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            com.tencent.mars.xlog.Log.e(r0, r13)
        L4a:
            r13 = r5
        L4b:
            if (r13 != 0) goto Lf1
            java.util.HashMap r6 = r12.f166526d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r12.f166533k
            r7.append(r8)
            java.lang.String r8 = "0_-1"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r7 = r6.containsKey(r7)
            if (r7 != 0) goto Lf6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r12.f166533k
            r7.append(r8)
            int r8 = r3.value
            r7.append(r8)
            java.lang.String r8 = "_"
            r7.append(r8)
            int r8 = r4.value
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            int r8 = r3.value
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            int r9 = r4.value
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r10 = r12.f166542t
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r15)
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9, r10, r11}
            java.lang.String r9 = "request video data [%d, %d] isRequestNow[%b] isSeek[%b]"
            com.tencent.mars.xlog.Log.i(r0, r9, r8)
            boolean r8 = r6.containsKey(r7)
            if (r8 != 0) goto Ldf
            boolean r8 = r12.f166542t
            if (r8 == 0) goto Lb1
            if (r15 == 0) goto Ldf
        Lb1:
            r15 = 1
            r12.f166542t = r15
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r6.put(r7, r14)
            com.tencent.mm.modelcdntran.l3 r14 = t21.o2.Di()
            java.lang.String r15 = r12.f166533k
            int r3 = r3.value
            int r4 = r4.value
            int r14 = r14.p(r15, r3, r4, r5)
            if (r14 == 0) goto Lf6
            r12.f166542t = r5
            r6.remove(r7)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            java.lang.String r15 = "requestVideoData not success %s"
            com.tencent.mars.xlog.Log.i(r0, r15, r14)
            goto Lf6
        Ldf:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "already request video : "
            r14.<init>(r15)
            r14.append(r7)
            java.lang.String r14 = r14.toString()
            com.tencent.mars.xlog.Log.i(r0, r14)
            goto Lf6
        Lf1:
            java.lang.String r14 = "already had video data."
            com.tencent.mars.xlog.Log.i(r0, r14)
        Lf6:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.n(int, int, boolean):boolean");
    }

    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        this.f166533k = "";
        this.f166537o = -1;
        this.f166539q = 0;
        this.f166534l = 0;
        this.f166543u = 0;
        this.f166525c = 0;
        this.f166524b = 0;
        this.f166538p = false;
        this.f166541s = false;
        this.f166542t = false;
        this.f166526d.clear();
        this.f166529g = null;
        this.f166530h = 0;
        this.f166531i = null;
        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoConfigs videoConfigs = this.B;
        if (videoConfigs != null) {
            this.f166540r = videoConfigs.f166551a;
        }
        this.f166545w = 0L;
        this.f166544v = 0L;
        this.f166548z = 0;
        long j17 = 0;
        this.f166547y = j17;
        this.f166546x = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public boolean p() {
        boolean z17;
        java.lang.String str;
        java.lang.String str2 = "stopStreamDownload";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopStreamDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166533k)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptVideoPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            java.lang.Object[] e17 = e();
            long j17 = 0;
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            new com.tencent.mm.pointers.PInt().value = 0;
            pInt.value = 0;
            int iOSNetType = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int max = java.lang.Math.max(((java.lang.Integer) e17[1]).intValue(), 0);
            int intValue = ((java.lang.Integer) e17[2]).intValue();
            int intValue2 = ((java.lang.Integer) e17[3]).intValue();
            int max2 = java.lang.Math.max(((java.lang.Integer) e17[4]).intValue(), 0);
            int intValue3 = ((java.lang.Integer) e17[5]).intValue();
            int intValue4 = ((java.lang.Integer) e17[6]).intValue();
            int intValue5 = ((java.lang.Integer) e17[7]).intValue();
            java.lang.String str3 = (java.lang.String) e17[8];
            int intValue6 = ((java.lang.Long) e17[9]).intValue();
            java.lang.String str4 = (java.lang.String) e17[10];
            java.lang.String str5 = (java.lang.String) e17[11];
            java.lang.String str6 = (java.lang.String) e17[12];
            long intValue7 = ((java.lang.Integer) e17[13]).intValue() * 1000;
            int intValue8 = ((java.lang.Integer) e17[14]).intValue();
            long k17 = com.tencent.mm.vfs.w6.k(str6);
            com.tencent.mm.autogen.mmdata.rpt.SnsOnlineVideoReportStruct snsOnlineVideoReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsOnlineVideoReportStruct();
            snsOnlineVideoReportStruct.f60659n = iOSNetType;
            snsOnlineVideoReportStruct.f60645g = j17;
            snsOnlineVideoReportStruct.K = j17;
            snsOnlineVideoReportStruct.f60643f = k17;
            snsOnlineVideoReportStruct.N = snsOnlineVideoReportStruct.b("SnsPublishid", str4, true);
            snsOnlineVideoReportStruct.f60639d = snsOnlineVideoReportStruct.b("SnsVideoUrl", str5, true);
            snsOnlineVideoReportStruct.f60649i = intValue7;
            snsOnlineVideoReportStruct.f60651j = max;
            snsOnlineVideoReportStruct.f60653k = intValue;
            snsOnlineVideoReportStruct.f60655l = intValue2;
            snsOnlineVideoReportStruct.f60657m = max2;
            snsOnlineVideoReportStruct.I = intValue3;
            snsOnlineVideoReportStruct.f60635J = intValue4;
            snsOnlineVideoReportStruct.V = intValue5;
            z17 = true;
            snsOnlineVideoReportStruct.W = snsOnlineVideoReportStruct.b("AutoPlaySessionID", str3, true);
            snsOnlineVideoReportStruct.X = intValue6;
            snsOnlineVideoReportStruct.f60676v0 = intValue8;
            snsOnlineVideoReportStruct.k();
            str = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptVideoPause", str);
            str2 = "stopStreamDownload";
        } else {
            boolean z18 = this.f166524b == 3;
            com.tencent.mars.xlog.Log.i(this.f166523a, "stop online download video %s isFinish %b percent %d", this.f166533k, java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(this.f166536n));
            com.tencent.mm.plugin.sns.model.l4.Pj().u(this.f166533k, e());
            if (this.f166536n >= this.B.f166553c && !z18) {
                com.tencent.mm.plugin.sns.model.l4.Pj().m(this.f166529g, this.f166530h, this.f166531i, false, false, 36, this.f166533k);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptStopDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 203L, 1L, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptStopDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            str = "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper";
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
        return z17;
    }

    public final void q(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = this.f166528f;
                if (iVideoUICallback != null) {
                    ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) iVideoUICallback).G(this.f166532j, z17);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiPrepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final boolean r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = this.f166528f;
                if (iVideoUICallback == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    return true;
                }
                boolean J2 = ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) iVideoUICallback).J();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                return J2;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiResumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
    }

    public final void s(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = this.f166528f;
                if (iVideoUICallback != null) {
                    ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) iVideoUICallback).M(i17, z17);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }

    public final void t(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
        synchronized (this.C) {
            try {
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback iVideoUICallback = this.f166528f;
                if (iVideoUICallback != null) {
                    ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) iVideoUICallback).a0(i17 * 1000);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiUpdateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
    }
}

package ok4;

/* loaded from: classes4.dex */
public final class w implements ok4.d, ok4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct f346044a;

    /* renamed from: b, reason: collision with root package name */
    public final long f346045b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346046c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f346047d;

    /* renamed from: e, reason: collision with root package name */
    public long f346048e;

    /* renamed from: f, reason: collision with root package name */
    public long f346049f;

    /* renamed from: g, reason: collision with root package name */
    public long f346050g;

    /* renamed from: h, reason: collision with root package name */
    public long f346051h;

    /* renamed from: i, reason: collision with root package name */
    public long f346052i;

    /* renamed from: j, reason: collision with root package name */
    public int f346053j;

    /* renamed from: k, reason: collision with root package name */
    public int f346054k;

    /* renamed from: l, reason: collision with root package name */
    public long f346055l;

    /* renamed from: m, reason: collision with root package name */
    public long f346056m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f346057n;

    /* renamed from: o, reason: collision with root package name */
    public long f346058o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f346059p;

    /* renamed from: q, reason: collision with root package name */
    public int f346060q;

    /* renamed from: r, reason: collision with root package name */
    public int f346061r;

    /* renamed from: s, reason: collision with root package name */
    public long f346062s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f346063t;

    public w(com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct struct, long j17, int i17) {
        kotlin.jvm.internal.o.g(struct, "struct");
        this.f346044a = struct;
        this.f346045b = j17;
        this.f346046c = i17;
    }

    @Override // ok4.d
    public void a(int i17) {
    }

    @Override // ok4.a
    public void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f346062s = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void c() {
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        tPVideoPlayReportStruct.f61066t = 0L;
        long j17 = this.f346062s;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        tPVideoPlayReportStruct.f61065s = java.lang.System.currentTimeMillis() - j17;
        ok4.u uVar = ok4.u.f346041a;
        java.lang.String str = tPVideoPlayReportStruct.f61053g;
        kotlin.jvm.internal.o.f(str, "getMediaId(...)");
        uVar.e(new ok4.j(tPVideoPlayReportStruct.S, str));
    }

    @Override // ok4.a
    public void d(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", "onDownloadProgress");
        ok4.u uVar = ok4.u.f346041a;
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        java.lang.String str = tPVideoPlayReportStruct.f61053g;
        kotlin.jvm.internal.o.f(str, "getMediaId(...)");
        uVar.e(new ok4.m(tPVideoPlayReportStruct.S, str, java.lang.Long.valueOf(j17)));
    }

    @Override // ok4.d
    public void e() {
        jz5.f0 f0Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f346051h = currentTimeMillis;
        boolean z18 = currentTimeMillis - this.f346055l < 300;
        this.f346057n = z18;
        if (!z18) {
            this.f346053j++;
        }
        ok4.u uVar = ok4.u.f346041a;
        java.lang.String str = this.f346044a.f61053g;
        kotlin.jvm.internal.o.f(str, "getMediaId(...)");
        com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct a17 = uVar.a(str);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "setVideoLoading >> " + str + ", " + a17.O);
            a17.O = a17.O + 1;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "setVideoLoadingCount >> " + str + ", but data is no find");
        }
    }

    @Override // ok4.a
    public void f(long j17, long j18) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long max = java.lang.Math.max(java.lang.System.currentTimeMillis() - this.f346062s, 0L);
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        tPVideoPlayReportStruct.f61070x = max;
        tPVideoPlayReportStruct.f61071y = j17;
        tPVideoPlayReportStruct.f61072z = j18;
        tPVideoPlayReportStruct.B = 1L;
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f346044a.f61053g + "]onSeek: " + i18);
        this.f346054k = this.f346054k + 1;
        this.f346057n = false;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f346055l = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.d
    public void h() {
        long j17 = this.f346051h;
        if (j17 > 0) {
            if (!this.f346057n) {
                long j18 = this.f346052i;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f346052i = j18 + (java.lang.System.currentTimeMillis() - j17);
            }
            this.f346051h = 0L;
        }
        this.f346057n = false;
    }

    @Override // ok4.a
    public void i() {
        com.tencent.mars.xlog.Log.w("MicroMsg.TPPlayerReporter", "onRequestAllData");
    }

    @Override // ok4.a
    public void j() {
        this.f346044a.f61056j = 5L;
    }

    @Override // ok4.a
    public void k() {
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f346044a.f61053g + "]onPrepare: isOnline=" + z17 + ", path=" + str);
        this.f346059p = str;
        this.f346063t = z17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f346058o = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void m() {
    }

    @Override // ok4.a
    public void n(int i17) {
        long j17 = i17;
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        tPVideoPlayReportStruct.f61066t = j17;
        long j18 = this.f346062s;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        tPVideoPlayReportStruct.f61065s = java.lang.System.currentTimeMillis() - j18;
    }

    @Override // ok4.a
    public void o() {
        this.f346044a.A = 0;
    }

    @Override // ok4.d
    public void onCompleted() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        sb6.append(tPVideoPlayReportStruct.f61053g);
        sb6.append("]onCompleted");
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        if (tPVideoPlayReportStruct.V <= 0) {
            long j17 = this.f346049f;
            if (j17 > 0) {
                long j18 = this.f346050g;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                this.f346050g = j18 + (java.lang.System.currentTimeMillis() - j17);
                this.f346049f = 0L;
            }
            x();
        }
    }

    @Override // ok4.d
    public void onError(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        sb6.append(tPVideoPlayReportStruct.f61053g);
        sb6.append("]onError: ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        tPVideoPlayReportStruct.f61058l = i17;
        long j17 = this.f346049f;
        if (j17 > 0) {
            long j18 = this.f346050g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f346050g = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f346049f = 0L;
        }
        x();
    }

    @Override // ok4.d
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f346044a.f61053g + "]onPause");
        long j17 = this.f346049f;
        if (j17 > 0) {
            long j18 = this.f346050g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f346050g = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f346049f = 0L;
        }
    }

    @Override // ok4.d
    public void onStart() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f346044a.f61053g + "]onStart");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f346049f = currentTimeMillis;
        if (this.f346048e == 0) {
            this.f346048e = currentTimeMillis;
        }
    }

    @Override // ok4.d
    public void onStop() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        sb6.append(tPVideoPlayReportStruct.f61053g);
        sb6.append("]onStop");
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        long j17 = this.f346049f;
        if (j17 > 0) {
            long j18 = this.f346050g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f346050g = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f346049f = 0L;
        }
        if (tPVideoPlayReportStruct.f61056j != 5) {
            if (this.f346062s <= 0) {
                tPVideoPlayReportStruct.f61056j = 3L;
            } else if (this.f346063t) {
                tPVideoPlayReportStruct.f61056j = 1L;
            } else {
                tPVideoPlayReportStruct.f61056j = 2L;
            }
        }
        x();
    }

    @Override // ok4.a
    public void p() {
    }

    @Override // ok4.d
    public void q() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", "[" + this.f346044a.f61053g + "]onSeekCompleted");
        long j17 = this.f346055l;
        if (j17 >= 0) {
            long j18 = this.f346056m;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f346056m = j18 + (java.lang.System.currentTimeMillis() - j17);
        }
    }

    @Override // ok4.a
    public void r() {
        this.f346044a.A = 2;
    }

    @Override // ok4.d
    public void s() {
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        if (tPVideoPlayReportStruct.f61060n > 0 || this.f346058o <= 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", "[" + tPVideoPlayReportStruct.f61053g + "]onFirstVideoFrame");
        long j17 = this.f346058o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        tPVideoPlayReportStruct.f61060n = java.lang.System.currentTimeMillis() - j17;
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
        int i18 = 0;
        if (i17 == 203) {
            int i19 = (int) j17;
            if (i19 == 1) {
                i18 = 2;
            } else if (i19 == 2) {
                i18 = 1;
            }
            this.f346060q = i18;
            return;
        }
        if (i17 != 204) {
            return;
        }
        int i27 = (int) j17;
        if (i27 == 101) {
            i18 = 2;
        } else if (i27 == 102) {
            i18 = 1;
        }
        this.f346061r = i18;
    }

    @Override // ok4.a
    public void u() {
    }

    public void v(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markRequestVideoFlag media id:");
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        sb6.append(tPVideoPlayReportStruct.f61053g);
        sb6.append(" flag:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.TPPlayerReporter", sb6.toString());
        tPVideoPlayReportStruct.T = tPVideoPlayReportStruct.b("ReqVideoFlag", str, true);
    }

    @Override // ok4.a
    public void w(long j17) {
        long iOSNetType = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        tPVideoPlayReportStruct.f61063q = iOSNetType;
        tPVideoPlayReportStruct.f61064r = j17 - this.f346062s;
    }

    public final void x() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f346044a;
        sb6.append(tPVideoPlayReportStruct.f61053g);
        sb6.append("]report: enter=");
        long j17 = this.f346045b;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
        if (this.f346047d) {
            return;
        }
        boolean z17 = true;
        this.f346047d = true;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        tPVideoPlayReportStruct.f61047d = java.lang.System.currentTimeMillis() - j17;
        int i17 = this.f346053j;
        if (i17 > 0) {
            tPVideoPlayReportStruct.f61062p = this.f346052i / i17;
            tPVideoPlayReportStruct.f61061o = i17;
        }
        tPVideoPlayReportStruct.f61057k = this.f346050g;
        int i18 = this.f346054k;
        if (i18 > 0) {
            tPVideoPlayReportStruct.N = i18;
            tPVideoPlayReportStruct.O = this.f346056m / i18;
        }
        tPVideoPlayReportStruct.f61059m = java.lang.Math.max(this.f346048e - this.f346058o, 0L);
        tPVideoPlayReportStruct.f61049e = this.f346046c;
        tPVideoPlayReportStruct.I = this.f346061r;
        tPVideoPlayReportStruct.K = this.f346060q;
        tPVideoPlayReportStruct.Y = java.lang.System.currentTimeMillis();
        ok4.f fVar = ok4.f.f345994a;
        java.lang.String str = tPVideoPlayReportStruct.f61053g;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        int i19 = -1;
        if (!z17) {
            java.util.HashMap hashMap = ok4.f.f345995b;
            java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
            if (num == null) {
                num = -1;
            }
            i19 = num.intValue();
            hashMap.remove(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPredictDataReport", "getPredictStatusToReport >> " + str + ", " + i19);
        }
        tPVideoPlayReportStruct.f61046c0 = i19;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310568a, null, new ok4.v(this, null), 2, null);
    }
}

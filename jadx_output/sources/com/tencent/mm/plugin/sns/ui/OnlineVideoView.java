package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class OnlineVideoView extends android.widget.RelativeLayout implements com.tencent.mm.pluginsdk.ui.tools.a4, com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback, c01.i {

    /* renamed from: j2, reason: collision with root package name */
    public static final /* synthetic */ int f166427j2 = 0;
    public android.widget.ImageView A;
    public xd4.t0 A1;
    public com.tencent.mm.pluginsdk.ui.tools.f4 B;
    public boolean B1;
    public android.widget.ProgressBar C;
    public java.lang.String C1;
    public com.tencent.mm.ui.widget.MMPinProgressBtn D;
    public long D1;
    public android.widget.TextView E;
    public long E1;
    public android.widget.ImageView F;
    public int F1;
    public volatile com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper G;
    public final boolean G1;
    public boolean H;
    public n34.b3 H1;
    public boolean I;
    public int I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f166428J;
    public com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback J1;
    public int K;
    public long K1;
    public int L;
    public int L1;
    public int M;
    public java.lang.String M1;
    public long N;
    public volatile boolean N1;
    public volatile boolean O1;
    public long P;
    public com.tencent.mars.cdn.CdnManager.VideoInfo P1;
    public int Q;
    public ok4.w Q1;
    public f25.m0 R;
    public ok4.c R1;
    public boolean S;
    public android.app.Activity S1;
    public boolean T;
    public boolean T1;
    public final com.tencent.mm.sdk.platformtools.n3 U;
    public final java.lang.Runnable U1;
    public int V;
    public final com.tencent.mm.sdk.platformtools.b4 V1;
    public long W;
    public final com.tencent.mm.sdk.platformtools.b4 W1;
    public final com.tencent.mm.plugin.sns.model.h0 X1;
    public final com.tencent.mm.sdk.event.IListener Y1;
    public final com.tencent.mm.sdk.event.IListener Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f166429a2;

    /* renamed from: b2, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.e4 f166430b2;

    /* renamed from: c2, reason: collision with root package name */
    public long f166431c2;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f166432d;

    /* renamed from: d2, reason: collision with root package name */
    public int f166433d2;

    /* renamed from: e, reason: collision with root package name */
    public int f166434e;

    /* renamed from: e2, reason: collision with root package name */
    public long f166435e2;

    /* renamed from: f, reason: collision with root package name */
    public boolean f166436f;

    /* renamed from: f2, reason: collision with root package name */
    public int f166437f2;

    /* renamed from: g, reason: collision with root package name */
    public boolean f166438g;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f166439g2;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f166440h;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f166441h2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f166442i;

    /* renamed from: i2, reason: collision with root package name */
    public java.util.List f166443i2;

    /* renamed from: l1, reason: collision with root package name */
    public int f166444l1;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Context f166445m;

    /* renamed from: n, reason: collision with root package name */
    public t21.v2 f166446n;

    /* renamed from: o, reason: collision with root package name */
    public r45.jj4 f166447o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f166448p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f166449p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f166450p1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f166451q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.s7 f166452r;

    /* renamed from: s, reason: collision with root package name */
    public int f166453s;

    /* renamed from: t, reason: collision with root package name */
    public int f166454t;

    /* renamed from: u, reason: collision with root package name */
    public int f166455u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f166456v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f166457w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback f166458x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f166459x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f166460x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RelativeLayout f166461y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f166462y0;

    /* renamed from: y1, reason: collision with root package name */
    public fk4.u f166463y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.RelativeLayout f166464z;

    /* renamed from: z1, reason: collision with root package name */
    public xd4.i0 f166465z1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.OnlineVideoView$8, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass8 implements java.lang.Runnable {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f166513d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f166514e;

        public AnonymousClass8(int i17, boolean z17) {
            this.f166513d = i17;
            this.f166514e = z17;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = Fj.k1(com.tencent.mm.plugin.sns.ui.OnlineVideoView.j(onlineVideoView));
            if (k17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
                return;
            }
            java.lang.String b17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView);
            java.lang.String k18 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView);
            int i17 = this.f166513d;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            boolean z17 = this.f166514e;
            com.tencent.mars.xlog.Log.i(b17, "fav download video[%s] farFromScene %d isFromMain %b", k18, valueOf, java.lang.Boolean.valueOf(z17));
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6327m = i17;
            c4Var.f6323i = (android.app.Activity) onlineVideoView.getActivityContext();
            qb4.a.e(doFavoriteEvent, k17);
            doFavoriteEvent.e();
            if (doFavoriteEvent.f54091h.f6433a == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                onlineVideoView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 225L, 1L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptFavVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                onlineVideoView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 226L, 1L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptFavVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
            if (z17) {
                com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = new com.tencent.mm.autogen.events.SnsFavFeedForDataReportEvent();
                k17.getLocalid();
                am.ov ovVar = snsFavFeedForDataReportEvent.f54806g;
                ovVar.getClass();
                ovVar.f7579a = ca4.z0.T(k17);
                snsFavFeedForDataReportEvent.e();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            onlineVideoView.f166455u = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = onlineVideoView.B;
            if (f4Var != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(f4Var.getF174598m())) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "%d had not set video path to play", java.lang.Integer.valueOf(onlineVideoView.hashCode()));
                    java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView), com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView));
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
                        onlineVideoView.G(o17, false);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
                    return;
                }
                if (!onlineVideoView.B.isPlaying()) {
                    onlineVideoView.B.start();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
                    return;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$8");
        }
    }

    /* loaded from: classes4.dex */
    public interface IDownloadListener {
    }

    /* loaded from: classes4.dex */
    public interface IVideoViewCallback {
        void a(int i17);

        void c(int i17);

        void onCompletion();
    }

    /* loaded from: classes4.dex */
    public interface IVideoViewCallbackEx extends com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback {
        void onPause();
    }

    /* loaded from: classes4.dex */
    public interface IVideoViewFirstFrameRenderCallback {
        void a();
    }

    public OnlineVideoView(android.content.Context context, boolean z17) {
        this(context, (android.util.AttributeSet) null);
    }

    public static /* synthetic */ java.lang.String b(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = onlineVideoView.f166432d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public static /* synthetic */ com.tencent.mm.sdk.platformtools.n3 c(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.sdk.platformtools.n3 n3Var = onlineVideoView.U;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return n3Var;
    }

    public static /* synthetic */ int d(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = onlineVideoView.F1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public static /* synthetic */ int e(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = onlineVideoView.f166454t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public static /* synthetic */ int f(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = onlineVideoView.f166455u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public static void g(final com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, final java.lang.String str, final boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.f166427j2;
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                onlineVideoView2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$dispatchDownloadFinish$2", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                if (onlineVideoView2.f166443i2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$2", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    return;
                }
                java.util.Iterator it = new java.util.ArrayList(onlineVideoView2.f166443i2).iterator();
                while (it.hasNext()) {
                    wd4.y2 y2Var = (wd4.y2) ((com.tencent.mm.plugin.sns.ui.OnlineVideoView.IDownloadListener) it.next());
                    y2Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3$isGranted$2$1");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadFinish, mediaPath: ");
                    java.lang.String str2 = str;
                    sb6.append(str2);
                    sb6.append(", success: ");
                    boolean z18 = z17;
                    sb6.append(z18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", sb6.toString());
                    if (kotlin.jvm.internal.o.b(str2, y2Var.f445068a)) {
                        y2Var.f445069b.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z18)));
                        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = y2Var.f445070c;
                        snsOnlineVideoActivity.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView3 = snsOnlineVideoActivity.f167325r;
                        if (onlineVideoView3 == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "removeDownloadListener, videoView is null");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            java.util.List list = onlineVideoView3.f166443i2;
                            if (list == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            } else {
                                ((java.util.ArrayList) list).remove(y2Var);
                                if (((java.util.ArrayList) onlineVideoView3.f166443i2).isEmpty()) {
                                    onlineVideoView3.f166443i2 = null;
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3$isGranted$2$1");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3$isGranted$2$1");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$dispatchDownloadFinish$2", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
        };
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            runnable.run();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    private java.lang.String getRelocatedVideoPath() {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f166451q);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return null;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
        if (timeLine == null || (a90Var = timeLine.ContentObj) == null || (linkedList = a90Var.f369840h) == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.w(this.f166432d, "getRelocatedVideoPath but no valid media found");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return null;
        }
        java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(this.f166448p, (r45.jj4) timeLine.ContentObj.f369840h.get(0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRelocatedVideoPath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public static /* synthetic */ android.widget.ProgressBar h(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        android.widget.ProgressBar progressBar = onlineVideoView.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return progressBar;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.MMPinProgressBtn i(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = onlineVideoView.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return mMPinProgressBtn;
    }

    public static /* synthetic */ java.lang.String j(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = onlineVideoView.f166451q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public static /* synthetic */ java.lang.String k(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = onlineVideoView.f166448p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public static /* synthetic */ void l(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public static /* synthetic */ java.lang.String m(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = onlineVideoView.M1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public static /* synthetic */ int n(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = onlineVideoView.L1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public static void o(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptSaveVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 222L, 1L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptSaveVideoFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public static /* synthetic */ int p(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = onlineVideoView.f166434e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public static void r(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        onlineVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSendVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i18 = onlineVideoView.f166454t;
        java.lang.String str = onlineVideoView.f166432d;
        if (i18 > 0) {
            com.tencent.mars.xlog.Log.w(str, "send video now, do nothing.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSendVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(onlineVideoView.f166448p, onlineVideoView.f166447o);
            if (!com.tencent.mm.vfs.w6.j(o17)) {
                o17 = onlineVideoView.getRelocatedVideoPath();
                com.tencent.mars.xlog.Log.w(str, "get relocated video path: " + o17);
            }
            com.tencent.mars.xlog.Log.i(str, "%d retransmit video req code %d, download finish path %s", java.lang.Integer.valueOf(onlineVideoView.hashCode()), java.lang.Integer.valueOf(i17), o17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
                onlineVideoView.f166454t = i17;
                onlineVideoView.S(true, 33, true);
                onlineVideoView.R();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptDownloadBySendVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 223L, 1L, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptDownloadBySendVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            } else {
                onlineVideoView.O(i17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSendVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public static /* synthetic */ r45.jj4 s(com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        r45.jj4 jj4Var = onlineVideoView.f166447o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return jj4Var;
    }

    public final void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("noteResumeVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f166435e2 = java.lang.System.currentTimeMillis();
        hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("noteResumeVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        hashCode();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.P = java.lang.System.currentTimeMillis();
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            this.f166448p = null;
            this.f166446n = null;
            if (this.N1) {
                this.N1 = false;
                com.tencent.mars.xlog.Log.i(this.f166432d, "%d logic unInit", java.lang.Integer.valueOf(hashCode()));
                y();
                z();
                this.B.stop();
                if (!(this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView)) {
                    this.f166429a2.dead();
                }
                this.Y1.dead();
                com.tencent.mm.plugin.sns.model.l4.Cj().v(this.X1);
                t();
                this.U.removeCallbacksAndMessages(null);
                if (this.G != null) {
                    this.G.p();
                    this.G.d();
                }
                fk4.u uVar = this.f166463y1;
                if (uVar != null) {
                    ((fk4.k) uVar).p();
                    this.f166463y1 = null;
                }
                xd4.t0 t0Var = this.A1;
                if (t0Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "release");
                    kotlinx.coroutines.z0.e(t0Var.f453709c, null, 1, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                }
                if (com.tencent.mm.booter.b.c() != null) {
                    ((com.tencent.mm.booter.b) com.tencent.mm.booter.b.c()).b();
                }
                if (this.R != null) {
                    ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.R);
                }
                this.R = null;
                r45.jj4 jj4Var = this.f166447o;
                if (jj4Var != null) {
                    ok4.u uVar2 = ok4.u.f346041a;
                    java.lang.String mediaId = jj4Var.f377855d;
                    ok4.e eVar = ok4.e.f345992d;
                    kotlin.jvm.internal.o.g(mediaId, "mediaId");
                    uVar2.e(new ok4.h(mediaId, eVar));
                }
                this.f166447o = null;
                this.G = null;
                this.M = 0;
                this.B1 = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unInit", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
        }
        this.f166460x1 = false;
        this.S = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        D(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void D(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        hashCode();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (this.S) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        this.I1 = i17;
        this.N = java.lang.System.currentTimeMillis();
        this.f166460x1 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.O1) {
            com.tencent.mars.xlog.Log.e(this.f166432d, "what are you doing guys!!! Would you like to invite everyone to eat pizza??? %s", new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(31L, 3L, 1L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            if (!this.N1) {
                this.N1 = true;
                com.tencent.mars.xlog.Log.i(this.f166432d, "%d logic init, create new helper and add listener.", java.lang.Integer.valueOf(hashCode()));
                this.f166460x1 = true;
                if (this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initTpPlayer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    ok4.w wVar = new ok4.w(new com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct(), this.N, 2);
                    this.Q1 = wVar;
                    r45.jj4 jj4Var = this.f166447o;
                    final java.lang.String str = jj4Var != null ? jj4Var.f377855d : "";
                    com.tencent.mars.xlog.Log.e("MicroMsg.TPPlayerReporter", "markMediaId media id:" + str);
                    com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = wVar.f346044a;
                    tPVideoPlayReportStruct.f61053g = tPVideoPlayReportStruct.b("MediaId", str, true);
                    this.R1 = new ok4.c(this.N);
                    this.Q1.f346044a.S = this.F1;
                    final com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) this.B;
                    boolean isInitialized = thumbPlayerVideoView.isInitialized();
                    java.lang.String str2 = this.f166432d;
                    if (isInitialized) {
                        com.tencent.mars.xlog.Log.w(str2, "init tp player but the previous stop operation seems not success");
                        this.B.stop();
                    }
                    thumbPlayerVideoView.f(this.R1);
                    thumbPlayerVideoView.f(this.Q1);
                    thumbPlayerVideoView.setProgressListener(new pk4.u0() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.3
                        @Override // pk4.u0
                        public void a(long j17) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$3");
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.a0((int) j17);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$3");
                        }
                    });
                    r45.jj4 jj4Var2 = this.f166447o;
                    if (jj4Var2 == null || this.f166448p == null) {
                        com.tencent.mars.xlog.Log.e(str2, "null check failed: media=%s, localId=%s", jj4Var2, this.f166448p);
                    } else {
                        final java.lang.String str3 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), this.f166447o.f377855d) + ca4.z0.R(this.f166447o);
                        this.f166465z1 = new xd4.i0(this.f166447o, this.f166453s, this.f166448p, this.R1, new xd4.g0() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.4
                            @Override // xd4.g0
                            public com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct b() {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$4");
                                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct rptStruct = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.getRptStruct();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$4");
                                return rptStruct;
                            }

                            @Override // xd4.g0
                            public long c() {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$4");
                                long playVideoDurationByResume = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.getPlayVideoDurationByResume();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$4");
                                return playVideoDurationByResume;
                            }
                        });
                        fk4.k kVar = new fk4.k(this.f166465z1);
                        this.f166463y1 = kVar;
                        kVar.b(this.Q1);
                        ((fk4.k) this.f166463y1).b(this.R1);
                        this.A1 = new xd4.t0(this.f166463y1, new xd4.p0() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.5
                            @Override // xd4.p0
                            public void a(com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "onMoovReady: downloader=%s", onlineVideoView.f166463y1);
                                if (videoInfo != null) {
                                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "svrflag:%s vf:%d ovf:%d reqFlag:%s path:%s", videoInfo.svrFlag, java.lang.Integer.valueOf(videoInfo.videoFormat), java.lang.Integer.valueOf(videoInfo.oriVideoFormat), videoInfo.requestFlag, videoInfo.videoPath);
                                }
                                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView) == null) {
                                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "when moovReady view is destroy");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                                    return;
                                }
                                java.lang.String mediaId = str;
                                if (videoInfo != null) {
                                    if (!android.text.TextUtils.isEmpty(videoInfo.requestFlag) && !videoInfo.requestFlag.equals(com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView).U)) {
                                        com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "video flag not equal,do nothing");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                                        return;
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    ok4.w wVar2 = onlineVideoView.Q1;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    wVar2.v(videoInfo.requestFlag);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    ok4.w wVar3 = onlineVideoView.Q1;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    java.lang.String str4 = videoInfo.svrFlag;
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markRspVideoFlag media id:");
                                    com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct2 = wVar3.f346044a;
                                    sb6.append(tPVideoPlayReportStruct2.f61053g);
                                    sb6.append(" flag:");
                                    sb6.append(str4);
                                    com.tencent.mars.xlog.Log.e("MicroMsg.TPPlayerReporter", sb6.toString());
                                    if (str4 != null && r26.i0.y(str4, "x", true)) {
                                        java.lang.String substring = str4.substring(1);
                                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                                        tPVideoPlayReportStruct2.R = tPVideoPlayReportStruct2.b("ToVideoFlag", substring, true);
                                    }
                                    ok4.u uVar = ok4.u.f346041a;
                                    int i18 = videoInfo.oriVideoFormat;
                                    int d17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.d(onlineVideoView);
                                    kotlin.jvm.internal.o.g(mediaId, "mediaId");
                                    uVar.e(new ok4.o(d17, mediaId, i18));
                                    java.lang.String reqFlag = videoInfo.requestFlag;
                                    java.lang.String repFlag = videoInfo.svrFlag;
                                    int d18 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.d(onlineVideoView);
                                    kotlin.jvm.internal.o.g(reqFlag, "reqFlag");
                                    kotlin.jvm.internal.o.g(repFlag, "repFlag");
                                    uVar.e(new ok4.n(d18, mediaId, reqFlag, repFlag));
                                    java.lang.String videoPath = videoInfo.videoPath;
                                    int d19 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.d(onlineVideoView);
                                    kotlin.jvm.internal.o.g(videoPath, "videoPath");
                                    uVar.e(new ok4.s(videoPath, mediaId, d19));
                                }
                                ok4.u uVar2 = ok4.u.f346041a;
                                int d27 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.d(onlineVideoView);
                                kotlin.jvm.internal.o.g(mediaId, "mediaId");
                                uVar2.e(new ok4.l(d27, mediaId));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                onlineVideoView.P1 = videoInfo;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                if (videoInfo != null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    if (onlineVideoView.G1) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        android.widget.TextView textView = onlineVideoView.E;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        textView.setText(java.lang.String.format("svrflag:%s vf:%d ovf:%d \n", videoInfo.svrFlag, java.lang.Integer.valueOf(videoInfo.videoFormat), java.lang.Integer.valueOf(videoInfo.oriVideoFormat)));
                                    }
                                }
                                fk4.u uVar3 = onlineVideoView.f166463y1;
                                if (uVar3 != null) {
                                    com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView2 = thumbPlayerVideoView;
                                    thumbPlayerVideoView2.setResourceDownloader(uVar3);
                                    thumbPlayerVideoView2.prepare();
                                    onlineVideoView.G(thumbPlayerVideoView2.getF174598m(), true);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMoovReady", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                            }

                            @Override // xd4.p0
                            public void onCompleted() {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "onCompleted");
                                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.e(onlineVideoView) > 0) {
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(onlineVideoView);
                                    int e17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.e(onlineVideoView);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView.O(e17);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                } else if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.f(onlineVideoView) > 0) {
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(onlineVideoView);
                                    int f17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.f(onlineVideoView);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z18 = onlineVideoView.f166456v;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView.U.post(new com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass8(f17, z18));
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z19 = onlineVideoView.f166457w;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    if (z19) {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(onlineVideoView);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView.L();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    } else {
                                        fk4.u uVar = onlineVideoView.f166463y1;
                                        if (uVar != null) {
                                            onlineVideoView.G(((fk4.k) uVar).n(), false);
                                        }
                                    }
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                xd4.t0 t0Var = onlineVideoView.A1;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                t0Var.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                                com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "stopProgressMonitor");
                                kotlinx.coroutines.r2 r2Var = t0Var.f453710d;
                                if (r2Var != null) {
                                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                                }
                                t0Var.f453710d = null;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(onlineVideoView);
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView.g(onlineVideoView, str3, true);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompleted", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                            }

                            @Override // xd4.p0
                            public void onError(java.lang.Exception exc) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), exc, "onError", new java.lang.Object[0]);
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView.g(onlineVideoView, str3, false);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                            }

                            @Override // xd4.p0
                            public void onProgress(float f17) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "onProgress: %f", java.lang.Float.valueOf(f17));
                                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).getVisibility() != 8) {
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).setVisibility(8);
                                }
                                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView) != null) {
                                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).getVisibility() != 0) {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).setVisibility(0);
                                    }
                                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).getMax() != 100 && f17 > 0.0f) {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).setMax(100);
                                    }
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).setProgress((int) f17);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$5");
                            }
                        });
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initTpPlayer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                } else {
                    this.G = new com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper(this);
                    com.tencent.mars.xlog.Log.i(this.f166432d, "onlineVideoHelper hash:%d", java.lang.Integer.valueOf(this.G.hashCode()));
                    this.f166429a2.alive();
                }
                this.Y1.alive();
                com.tencent.mm.plugin.sns.model.l4.Cj().c(this.X1);
                if (this.T) {
                    I();
                }
                if (com.tencent.mm.booter.b.c() != null) {
                    ((com.tencent.mm.booter.b) com.tencent.mm.booter.b.c()).a();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
        if (!this.f166438g) {
            Y();
        }
        this.S = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseByDataBlock", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d pauseByDataBlock", java.lang.Integer.valueOf(hashCode()));
        y();
        R();
        F();
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            this.f166460x1 = true;
            com.tencent.mars.xlog.Log.i(this.f166432d, "%d pauseByDataBlock and allowStart", java.lang.Integer.valueOf(hashCode()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseByDataBlock", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166460x1 = false;
        boolean isPlaying = this.B.isPlaying();
        java.lang.String str = this.f166432d;
        if (isPlaying) {
            com.tencent.mars.xlog.Log.i(str, "%d pause play", java.lang.Integer.valueOf(hashCode()));
            y();
            z();
        }
        this.B.pause();
        com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback iVideoViewCallback = this.f166458x;
        if (iVideoViewCallback instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx) {
            try {
                ((com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallbackEx) iVideoViewCallback).onPause();
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e(str, "the pause callback invalid!!");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void G(java.lang.String str, boolean z17) {
        ph3.o oVar;
        boolean o17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17), str};
        java.lang.String str2 = this.f166432d;
        com.tencent.mars.xlog.Log.i(str2, "%d prepare video isOnlinePlay %b filePath %s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w(str2, "%d prepare video but filepath is null.", java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        this.H = z17;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (f4Var != null) {
            if (this.M != -3) {
                if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
                    com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkNeedReset", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (this.H) {
                        gm0.j1.i();
                        o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, false);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNeedReset", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNeedReset", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        o17 = false;
                    }
                    videoPlayerTextureView.setNeedResetExtractor(o17);
                    ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) this.B).setIsOnlineVideoType(z17);
                }
                this.B.setOneTimeVideoTextureUpdateCallback(this.f166430b2);
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("TrackDataSource");
                r45.jj4 jj4Var = this.f166447o;
                M.putString("media-url", jj4Var == null ? "" : jj4Var.f377858g);
                r45.jj4 jj4Var2 = this.f166447o;
                M.putString("thumb-url", jj4Var2 != null ? jj4Var2.f377860i : "");
                M.putLong("prepare-ts", java.lang.System.currentTimeMillis());
                M.putString("prepare-path", str);
                com.tencent.mm.pluginsdk.ui.tools.f4 f4Var2 = this.B;
                if (f4Var2 instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                    if (!z17) {
                        f4Var2.setVideoPath(str);
                    }
                    if (!this.C1.equals(str)) {
                        X(true, 0.0f);
                    }
                } else {
                    f4Var2.setVideoPath(str);
                    W(true, 0.0f);
                }
            } else {
                com.tencent.mars.xlog.Log.i(str2, "%d prepare video reset source", java.lang.Integer.valueOf(hashCode()));
                com.tencent.mm.pluginsdk.ui.tools.f4 f4Var3 = this.B;
                if (f4Var3 instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
                    com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView2 = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var3;
                    com.tencent.mars.xlog.Log.i(videoPlayerTextureView2.f191448h, "%d reset source ", java.lang.Integer.valueOf(videoPlayerTextureView2.hashCode()));
                    ph3.k kVar = videoPlayerTextureView2.f191450m;
                    if (kVar != null && (oVar = kVar.f354428f) != null) {
                        java.lang.String j17 = oVar.j();
                        ph3.h hVar = oVar.f354446i;
                        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerImpl", "%s reset extractor time[%d]", j17, java.lang.Long.valueOf(hVar.f354390e));
                        ph3.p pVar = oVar.f354449l;
                        if (pVar != null) {
                            pVar.a(hVar.f354390e, -1L);
                            pVar.f();
                            pVar.f354408h = 0L;
                        }
                    }
                }
                M(this.L, true);
            }
        }
        n34.b3 b3Var = this.H1;
        if (b3Var != null) {
            b3Var.a(true);
        }
        if (this.G1) {
            r45.jj4 jj4Var3 = this.f166447o;
            if (jj4Var3 != null && jj4Var3.f377855d != null) {
                this.E.append("mediaId: " + this.f166447o.f377855d + "\n");
            }
            this.E.append(com.tencent.mm.plugin.sight.base.e.e(str));
            this.E.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideoPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        xd4.i0 i0Var = this.f166465z1;
        if (i0Var != null) {
            i0Var.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = this.f166432d;
        com.tencent.mars.xlog.Log.i(str, "requestAudioFocus: ");
        if (this.R != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.R);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.x.f259116c, new f25.f() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.6
            @Override // f25.f
            public void c(boolean z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "onPause: audio focus");
                onlineVideoView.setMute(true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
            }

            @Override // f25.f
            public void onResume() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "onResume: audio focus");
                if (j65.e.g()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.f166442i = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.B.setMute(false);
                } else {
                    onlineVideoView.setMute(false);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
            }

            @Override // f25.f
            public void onStop() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "onStop: ");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$6");
            }
        });
        this.R = m96;
        if (m96 == null || !((g25.e) m96).f267980c) {
            com.tencent.mars.xlog.Log.i(str, "requestAudioFocus: not gain focus");
            setMute(true);
        } else {
            com.tencent.mars.xlog.Log.i(str, "requestAudioFocus: gain focus");
            setMute(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public boolean J() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d resumeByDataGain", java.lang.Integer.valueOf(hashCode()));
        if (!this.f166460x1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return false;
        }
        if (this.B.isPlaying()) {
            z17 = true;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notePlayVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f166431c2 = java.lang.System.currentTimeMillis();
            hashCode();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notePlayVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            A();
            z17 = this.B.start();
            v();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeByDataGain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return z17;
    }

    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = this.f166432d;
        com.tencent.mars.xlog.Log.i(str, "resumePlay()");
        this.f166460x1 = true;
        if (!this.B.isPlaying()) {
            A();
            int duration = this.B.getDuration();
            int currentPosition = this.B.getCurrentPosition();
            if (currentPosition >= duration) {
                com.tencent.mars.xlog.Log.e(str, "the current position is more than duration, current = %d, duration = %d !!!", java.lang.Integer.valueOf(currentPosition), java.lang.Integer.valueOf(duration));
            }
            fk4.u uVar = this.f166463y1;
            if (uVar != null && !((fk4.k) uVar).h() && !((fk4.k) this.f166463y1).i()) {
                com.tencent.mars.xlog.Log.w(str, "the downloader has been stopped by another instance, restart it");
                ((fk4.k) this.f166463y1).o();
            }
            this.B.start();
            n34.b3 b3Var = this.H1;
            if (b3Var != null) {
                b3Var.u();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public final void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = getContext();
        m3.a aVar = new m3.a() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.9
            @Override // m3.a
            public void accept(java.lang.Object obj) {
                java.lang.String o17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                int i17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.f166427j2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                t21.v2 v2Var = onlineVideoView.f166446n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                if (v2Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    t21.v2 v2Var2 = onlineVideoView.f166446n;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    o17 = v2Var2.C;
                } else {
                    o17 = com.tencent.mm.plugin.sns.model.y6.o(com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView), com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView));
                }
                final java.lang.String str = o17;
                if (!bool.booleanValue() || android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    android.content.Context context2 = onlineVideoView.f166445m;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    android.content.Context context3 = onlineVideoView.f166445m;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    dp.a.makeText(context2, context3.getString(com.tencent.mm.R.string.k7a), 1).show();
                    com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.OnlineVideoView.j(onlineVideoView));
                    boolean booleanValue = bool.booleanValue();
                    ta4.e1 e1Var = ta4.e1.f416740a;
                    if (booleanValue) {
                        e1Var.c(com.tencent.mm.plugin.sns.ui.OnlineVideoView.m(onlineVideoView), com.tencent.mm.plugin.sns.ui.OnlineVideoView.n(onlineVideoView), "file_not_exist", k17, false, ta4.k.f416791f, false);
                    } else {
                        e1Var.c(com.tencent.mm.plugin.sns.ui.OnlineVideoView.m(onlineVideoView), com.tencent.mm.plugin.sns.ui.OnlineVideoView.n(onlineVideoView), com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_ALBUM, k17, false, ta4.k.f416791f, false);
                    }
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.o(onlineVideoView);
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), hashCode() + " save downloaded video fail, granted = " + bool + ", fullPath = " + str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.f166457w = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                } else {
                    final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.9.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9$1");
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass9 anonymousClass9 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass9.this;
                            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B;
                            if (f4Var != null) {
                                if (com.tencent.mm.sdk.platformtools.t8.K0(f4Var.getF174598m())) {
                                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d had not set video path to play", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode()));
                                    java.lang.String str2 = str;
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G(str2, false);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9$1");
                                    return;
                                }
                                if (!com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B.isPlaying()) {
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B.start();
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9$1");
                        }
                    };
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(onlineVideoView.getContext(), str, new zb0.a0() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.9.2
                        @Override // zb0.a0
                        public void a(java.lang.String str2, java.lang.String str3) {
                            java.lang.String Ni;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExportSuccess", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9$2");
                            com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.OnlineVideoView.j(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this));
                            if (com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.ui.OnlineVideoView.m(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this))) {
                                int n17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.n(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
                                if (n17 == 3) {
                                    Ni = ca4.z0.f40071d;
                                    kotlin.jvm.internal.o.d(Ni);
                                } else {
                                    Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
                                    kotlin.jvm.internal.o.d(Ni);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.report.SnsSaveImageVideoReporter");
                            } else {
                                Ni = com.tencent.mm.plugin.sns.ui.OnlineVideoView.m(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                            }
                            ta4.e1.f416740a.c(Ni, com.tencent.mm.plugin.sns.ui.OnlineVideoView.n(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "", k18, true, ta4.k.f416791f, false);
                            dp.a.makeText(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.getContext(), com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.getContext().getString(com.tencent.mm.R.string.k7b, q75.c.c(str3)), 1).show();
                            q75.c.f(str3, com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.getContext());
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView2.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptSaveVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 221L, 1L, false);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptSaveVideoSuc", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            final com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView3 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView3.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.10
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.tencent.mm.plugin.sns.storage.SnsInfo k19;
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView4 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                    try {
                                        k19 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.OnlineVideoView.j(onlineVideoView4));
                                    } catch (java.lang.Throwable th6) {
                                        com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView4), th6, "[-] Exception was thrown when report.", new java.lang.Object[0]);
                                    }
                                    if (k19 == null) {
                                        com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView4), "[-] Fail to get sns info, skip reporting. snsId:%s, url:%s", onlineVideoView4.getSnsId(), com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView4).f377858g);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                        return;
                                    }
                                    com.tencent.mm.app.t0 t0Var = new com.tencent.mm.app.t0(3, com.tencent.mm.app.s0.VIDEO, null);
                                    t0Var.f53779b = k19.getUserName();
                                    t0Var.f53781d = k19.field_snsId;
                                    t0Var.f53783f = com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView4).f377858g;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    int i18 = onlineVideoView4.f166444l1;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    t0Var.f53784g = i18;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    int i19 = onlineVideoView4.f166450p1;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    t0Var.f53785h = i19;
                                    t0Var.f53786i = com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView4).f377860i;
                                    t0Var.f53787j = onlineVideoView4.B.getDuration();
                                    t0Var.f53790m = com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView4).M;
                                    com.tencent.mm.app.u0.a(t0Var);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$10");
                                }
                            }, "SnsVideoExportReport");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExportAsync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView4 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView4.f166457w = false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d save downloaded video finish %d %s", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), str);
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.c(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this).post(runnable);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExportSuccess", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9$2");
                        }

                        @Override // zb0.a0
                        public void b(java.lang.String str2, java.lang.String str3) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExportFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9$2");
                            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass9 anonymousClass9 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass9.this;
                            com.tencent.mm.plugin.sns.storage.SnsInfo k18 = Fj.k1(com.tencent.mm.plugin.sns.ui.OnlineVideoView.j(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this));
                            ta4.e1 e1Var2 = ta4.e1.f416740a;
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                            e1Var2.c(com.tencent.mm.plugin.sns.ui.OnlineVideoView.m(onlineVideoView2), com.tencent.mm.plugin.sns.ui.OnlineVideoView.n(onlineVideoView2), "file_not_exist", k18, false, ta4.k.f416791f, false);
                            dp.a.makeText(onlineVideoView2.getContext(), onlineVideoView2.getContext().getString(com.tencent.mm.R.string.k7a), 1).show();
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.o(onlineVideoView2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView2.f166457w = false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView2), "%d save downloaded video finish %d %s", java.lang.Integer.valueOf(hashCode()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), str);
                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.c(onlineVideoView2).post(runnable);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExportFail", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9$2");
                        }
                    });
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("accept", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$9");
            }
        };
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.l(context, aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void M(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d seek second %d afterSeekPlay %b", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        N(i17 * 1000, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seek", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void N(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekByMs", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        hashCode();
        this.M = 0;
        v();
        this.B.a(i17, z17);
        U(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekByMs", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public final void O(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f166447o == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), this.f166447o.f377855d) + ca4.z0.U(this.f166447o);
        java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(this.f166448p, this.f166447o);
        boolean j17 = com.tencent.mm.vfs.w6.j(o17);
        java.lang.String str2 = this.f166432d;
        if (!j17) {
            o17 = getRelocatedVideoPath();
            com.tencent.mars.xlog.Log.w(str2, "get relocated video path: " + o17);
        }
        com.tencent.mm.sendtowework.VideoData videoData = new com.tencent.mm.sendtowework.VideoData(o17);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
        com.tencent.mars.xlog.Log.i(str2, "send video path %s reqCode %d finishPath: %s", str, java.lang.Integer.valueOf(i17), o17);
        if (android.text.TextUtils.isEmpty(o17)) {
            com.tencent.mars.xlog.Log.e(str2, "finish path is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        if (getActivityContext() instanceof androidx.appcompat.app.AppCompatActivity) {
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            jd5.c cVar = new jd5.c();
            cVar.q(ca4.z0.S(o17));
            cVar.o(str);
            cVar.r(o17);
            cVar.set(cVar.f43702d + 4, this.f166448p);
            n13.r rVar = new n13.r();
            rVar.f334117a = true;
            rVar.f334120d.f334139a = 7;
            ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(getActivityContext(), cVar, rVar);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("image_path", str);
            intent.putExtra("KEY_START_TIME", c01.id.c());
            intent.putExtra("Select_Data_Send_To_WeWork", videoData);
            intent.putExtra("content_type_forward_to_wework", 3);
            intent.putExtra("Retr_Msg_Type", 11);
            intent.putExtra("KEY_REPORT_PAGE_ID", 0);
            intent.putExtra("KEY_REPORT_SCENE_TYPE", 1);
            intent.putExtra("KEY_REPORT_MSG_TYPE", 43);
            j45.l.v(getActivityContext(), ".ui.transmit.SelectConversationUI", intent, i17);
        }
        this.f166454t = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(r45.jj4 r10, java.lang.String r11, int r12) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.OnlineVideoView.P(r45.jj4, java.lang.String, int):void");
    }

    @Override // c01.i
    public void P0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransientCanDuck", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public java.lang.String Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        try {
            if (this.f166447o != null) {
                stringBuffer.append("media: " + this.f166447o.f377855d);
            }
            if (this.f166448p != null) {
                stringBuffer.append("localId: " + this.f166448p);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f166432d, e17, "", new java.lang.Object[0]);
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return stringBuffer2;
    }

    public final void R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "showLoading(), delay=" + this.K1);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.U;
        java.lang.Runnable runnable = this.U1;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, this.K1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public final void S(boolean z17, int i17, boolean z18) {
        int i18;
        boolean z19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f166447o == null) {
            com.tencent.mars.xlog.Log.w(this.f166432d, "%d start download video but media is null.", java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        if (this.G == null && this.f166463y1 == null) {
            com.tencent.mars.xlog.Log.w(this.f166432d, "%d start download video but helper is null.", java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        if (this.f166447o.f377859h == 2) {
            com.tencent.mars.xlog.Log.w(this.f166432d, "%d it start download video, url type is weixin", java.lang.Integer.valueOf(hashCode()));
            this.f166434e = 3;
            com.tencent.mm.plugin.sns.model.l4.Cj().d(this.f166447o, 4, null, this.f166452r);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        if (z17 || !com.tencent.mm.plugin.sns.model.y6.a()) {
            com.tencent.mars.xlog.Log.i(this.f166432d, "%d it start offline download video", java.lang.Integer.valueOf(hashCode()));
            this.f166434e = 2;
            i18 = i17 != 0 ? i17 : 31;
            z19 = false;
        } else {
            com.tencent.mars.xlog.Log.i(this.f166432d, "%d it start online download video", java.lang.Integer.valueOf(hashCode()));
            this.f166434e = 1;
            i18 = i17 == 0 ? 30 : i17;
            z19 = true;
        }
        if (this.f166463y1 != null && this.A1 != null) {
            xd4.i0 i0Var = this.f166465z1;
            if (i0Var != null) {
                i0Var.n(i18);
                this.f166465z1.o(z19);
                r45.jj4 jj4Var = this.f166447o;
                if (jj4Var != null) {
                    ok4.u uVar = ok4.u.f346041a;
                    java.lang.String mediaId = jj4Var.f377855d;
                    java.lang.String e17 = this.f166465z1.e();
                    int i19 = this.F1;
                    kotlin.jvm.internal.o.g(mediaId, "mediaId");
                    uVar.e(new ok4.i(i19, mediaId, e17));
                }
            }
            ((fk4.k) this.f166463y1).o();
            r45.jj4 jj4Var2 = this.f166447o;
            if (jj4Var2 != null) {
                ok4.u uVar2 = ok4.u.f346041a;
                java.lang.String mediaId2 = jj4Var2.f377855d;
                int i27 = this.F1;
                kotlin.jvm.internal.o.g(mediaId2, "mediaId");
                uVar2.e(new ok4.p(i27, mediaId2));
                java.lang.String mediaId3 = this.f166447o.f377855d;
                int i28 = this.F1;
                kotlin.jvm.internal.o.g(mediaId3, "mediaId");
                uVar2.e(new ok4.k(i28, mediaId3, false));
            }
            int i29 = this.f166434e;
            if (i29 == 1) {
                xd4.t0 t0Var = this.A1;
                t0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("waitForMoovReady", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "waitForMoovReady");
                kotlinx.coroutines.l.d(t0Var.f453709c, null, null, new xd4.s0(new kotlin.jvm.internal.h0(), t0Var, null), 3, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("waitForMoovReady", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            } else if (i29 == 2) {
                this.A1.b();
                xd4.t0 t0Var2 = this.A1;
                t0Var2.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "startProgressMonitor");
                kotlinx.coroutines.r2 r2Var = t0Var2.f453710d;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                t0Var2.f453710d = kotlinx.coroutines.l.d(t0Var2.f453709c, null, null, new xd4.q0(t0Var2, null), 3, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            }
            if (z18) {
                R();
            }
        } else if (this.G != null) {
            com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper = this.G;
            r45.jj4 jj4Var3 = this.f166447o;
            int i37 = this.f166453s;
            java.lang.String str = this.f166448p;
            onlineVideoViewHelper.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            if (onlineVideoViewHelper.A) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            } else {
                onlineVideoViewHelper.f166529g = jj4Var3;
                onlineVideoViewHelper.f166530h = i37;
                onlineVideoViewHelper.f166531i = str;
                onlineVideoViewHelper.f166532j = com.tencent.mm.plugin.sns.model.y6.p(jj4Var3);
                onlineVideoViewHelper.f166533k = com.tencent.mm.plugin.sns.model.y6.c(i37, jj4Var3);
                if (com.tencent.mm.sdk.platformtools.t8.K0(onlineVideoViewHelper.f166532j) || com.tencent.mm.sdk.platformtools.t8.K0(onlineVideoViewHelper.f166533k)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                } else {
                    com.tencent.mars.xlog.Log.i(onlineVideoViewHelper.f166523a, "start online download video %s isPlayMode %b", onlineVideoViewHelper.f166533k, java.lang.Boolean.valueOf(z19));
                    com.tencent.mm.plugin.sns.model.l4.Pj().m(jj4Var3, i37, str, z19, true, i18, onlineVideoViewHelper.f166533k);
                    onlineVideoViewHelper.f166524b = 1;
                    onlineVideoViewHelper.f166544v = java.lang.System.currentTimeMillis();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptStartDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    if (z19) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 201L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 202L, 1L, false);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptStartDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w(this.f166432d, "onlineVideoHelper is null!!!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public boolean T(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str2 = this.f166432d;
        com.tencent.mars.xlog.Log.i(str2, "startDownload, mediaPath: %s", str);
        if (this.f166447o == null) {
            com.tencent.mars.xlog.Log.i(str2, "startDownload, media is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return false;
        }
        java.lang.String str3 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), this.f166447o.f377855d) + ca4.z0.R(this.f166447o);
        if (str.equals(str3)) {
            S(true, 33, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return true;
        }
        com.tencent.mars.xlog.Log.i(str2, "startDownload, curMediaPath: %s", str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "onGetVideoSize width:%d height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f166444l1 = i17;
        this.f166450p1 = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void U(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        if (!this.H) {
            this.W1.c(500L, 500L);
        } else if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.15
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$15");
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                    if (onlineVideoView.B != null && onlineVideoView.G != null) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G.c(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B.getCurrentPosition() / 1000);
                    }
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    com.tencent.mm.sdk.platformtools.b4 b4Var = onlineVideoView2.V1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    b4Var.c(500L, 500L);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$15");
                }
            });
        } else {
            this.V1.c(500L, 500L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    @Override // c01.i
    public void U5() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lossTransient", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void V() {
        ka4.n nVar;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3 = this.f166432d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        r45.jj4 jj4Var = this.f166447o;
        if (jj4Var == null || jj4Var.N) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        if (!(this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        r45.jj4 jj4Var2 = new r45.jj4();
        try {
            jj4Var2.parseFrom(this.f166447o.toByteArray());
            this.f166447o = jj4Var2;
            long playerBufferedDurationMs = ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) this.B).getPlayerBufferedDurationMs();
            long currentPosition = ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) this.B).getCurrentPosition();
            ka4.n nVar2 = ka4.n.f306147a;
            long j17 = playerBufferedDurationMs - currentPosition;
            r45.jj4 jj4Var3 = this.f166447o;
            t21.v2 v2Var = this.f166446n;
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.P1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "check enableSwitchDefine bufferMs:" + j17);
            if (!nVar2.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "enableSwitchDefine false by config");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                nVar = nVar2;
                str = str3;
                str2 = "switchDefine";
                i17 = 2;
            } else if (jj4Var3 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "enableSwitchDefine false by media null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                nVar = nVar2;
                str = str3;
                str2 = "switchDefine";
                i17 = 3;
            } else {
                float f17 = 1000;
                nVar = nVar2;
                if (jj4Var3.R * f17 <= ck4.a.f42533g) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "media duration:" + (jj4Var3.R * f17) + "ms < " + ck4.a.f42533g);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                    i17 = 4;
                    str = str3;
                    str2 = "switchDefine";
                } else {
                    str = str3;
                    str2 = "switchDefine";
                    if (j17 < ck4.a.f42531e + 3000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "bufferMs:" + j17 + " < " + ck4.a.f42530d + " return false");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                        i17 = 5;
                    } else if (!d11.s.Di(2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "current device not support hevc");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                        i17 = 6;
                    } else if (v2Var != null) {
                        java.lang.String str4 = v2Var.B;
                        if (str4 != null && r26.n0.B(str4, "V4", true)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "enable switch define by local video flag:" + v2Var.B);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                            i17 = 1;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                            i17 = 7;
                        }
                    } else {
                        java.lang.String str5 = videoInfo != null ? videoInfo.svrFlag : null;
                        if (str5 != null && r26.n0.B(str5, "V4", true)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadStrategy", "enable switch define by cdn video flag:" + str5);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                            i17 = 1;
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSwitchDefine", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
                            i17 = 8;
                        }
                    }
                }
            }
            ok4.w wVar = this.Q1;
            long currentPosition2 = getCurrentPosition();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSwitchDefine media id:");
            com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = wVar.f346044a;
            sb6.append(tPVideoPlayReportStruct.f61053g);
            sb6.append(" playMs:");
            sb6.append(currentPosition2);
            sb6.append(" result:");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TPPlayerReporter", sb6.toString());
            tPVideoPlayReportStruct.V = java.lang.System.currentTimeMillis();
            tPVideoPlayReportStruct.X = currentPosition2;
            tPVideoPlayReportStruct.f61045b0 = i17;
            if (i17 != 1) {
                if (!android.text.TextUtils.isEmpty(this.f166447o.U)) {
                    this.f166447o.U = "V2";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            r45.jj4 jj4Var4 = this.f166447o;
            objArr[1] = jj4Var4 != null ? jj4Var4.f377855d : "";
            objArr[2] = java.lang.Integer.valueOf(getCurrentPosition());
            com.tencent.mars.xlog.Log.i(str, "[%d]start switch define video %s playtime:%d", objArr);
            ok4.w wVar2 = this.Q1;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("markFromVideoFlag media id:");
            com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct2 = wVar2.f346044a;
            sb7.append(tPVideoPlayReportStruct2.f61053g);
            sb7.append(" flag:V4");
            com.tencent.mars.xlog.Log.e("MicroMsg.TPPlayerReporter", sb7.toString());
            tPVideoPlayReportStruct2.Q = tPVideoPlayReportStruct2.b("FromVideoFlag", "V4", true);
            this.Q1.v("V2");
            nVar.c(com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f166448p), this.f166447o, false);
            this.D1 = java.lang.System.currentTimeMillis();
            t21.v2 s17 = com.tencent.mm.plugin.sns.model.y6.s(this.f166447o);
            java.lang.String path = s17 != null ? s17.C : "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(path)) {
                com.tencent.mars.xlog.Log.i(str, "%d sns video already download finish, play now", java.lang.Integer.valueOf(hashCode()));
                if (this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                    if (!com.tencent.mm.vfs.w6.j(path)) {
                        path = getRelocatedVideoPath();
                        com.tencent.mars.xlog.Log.w(str, "get relocated video path: " + path);
                    }
                    if (com.tencent.mm.vfs.w6.j(path)) {
                        java.lang.String mediaId = this.f166448p + this.f166447o.U;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchDefineLocalVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        com.tencent.mars.xlog.Log.i(str, "switchDefineLocalVideo path:%s", path);
                        this.D1 = java.lang.System.currentTimeMillis();
                        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) this.B;
                        thumbPlayerVideoView.getClass();
                        kotlin.jvm.internal.o.g(mediaId, "mediaId");
                        kotlin.jvm.internal.o.g(path, "path");
                        com.tencent.mars.xlog.Log.i(thumbPlayerVideoView.f174596h, "switchDefineLocal, mediaId:" + mediaId + " path:" + path + ", isExists:" + com.tencent.mm.vfs.w6.j(path));
                        com.tencent.thumbplayer.api.TPVideoInfo.Builder builder = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
                        builder.fileId(mediaId);
                        builder.downloadParam(new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(mediaId, 0));
                        kk4.c cVar = thumbPlayerVideoView.f174597i;
                        if (cVar != null) {
                            java.lang.String i18 = com.tencent.mm.vfs.w6.i(path, false);
                            kotlin.jvm.internal.o.d(i18);
                            ((kk4.f0) cVar).switchDefinition(i18, 0L, builder.build(), 2);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchDefineLocalVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        ok4.u uVar = ok4.u.f346041a;
                        java.lang.String mediaId2 = this.f166447o.f377855d;
                        long j18 = this.D1;
                        kotlin.jvm.internal.o.g(mediaId2, "mediaId");
                        uVar.e(new ok4.r(mediaId2, j18));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        return;
                    }
                }
            }
            ok4.u uVar2 = ok4.u.f346041a;
            java.lang.String mediaId3 = this.f166447o.f377855d;
            long j19 = this.D1;
            kotlin.jvm.internal.o.g(mediaId3, "mediaId");
            uVar2.e(new ok4.r(mediaId3, j19));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchDefineOnlineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            if (this.f166447o == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchDefineOnlineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            } else if (android.text.TextUtils.isEmpty(this.f166448p)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchDefineOnlineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            } else {
                com.tencent.mars.xlog.Log.i(str, "switchDefineOnlineVideo");
                fk4.u uVar3 = this.f166463y1;
                if (uVar3 != null) {
                    ((fk4.k) uVar3).p();
                    this.f166463y1 = null;
                }
                this.f166465z1 = new xd4.i0(this.f166447o, this.f166453s, this.f166448p, this.R1, new xd4.g0() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.7
                    @Override // xd4.g0
                    public com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct b() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct rptStruct = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.getRptStruct();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provideUiReport", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                        return rptStruct;
                    }

                    @Override // xd4.g0
                    public long c() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                        long playVideoDurationByResume = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.getPlayVideoDurationByResume();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("providePlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$7");
                        return playVideoDurationByResume;
                    }
                });
                fk4.k kVar = new fk4.k(this.f166465z1);
                this.f166463y1 = kVar;
                kVar.b(this.Q1);
                ((fk4.k) this.f166463y1).b(this.R1);
                xd4.t0 t0Var = this.A1;
                fk4.u downloader = this.f166463y1;
                t0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                kotlin.jvm.internal.o.g(downloader, "downloader");
                t0Var.f453707a = downloader;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                this.C1 = ((fk4.k) this.f166463y1).n();
                S(false, 0, false);
                ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) this.B).setResourceDownloader(this.f166463y1);
                com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView2 = (com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) this.B;
                java.lang.String mediaId4 = ((fk4.k) this.f166463y1).f();
                fk4.u downloader2 = this.f166463y1;
                thumbPlayerVideoView2.getClass();
                kotlin.jvm.internal.o.g(mediaId4, "mediaId");
                kotlin.jvm.internal.o.g(downloader2, "downloader");
                fk4.l lVar = thumbPlayerVideoView2.L;
                java.lang.String str6 = thumbPlayerVideoView2.f174596h;
                if (lVar == null) {
                    com.tencent.mars.xlog.Log.w(str6, "switchDefineOnline return for resourceLoader is null.");
                } else {
                    com.tencent.mars.xlog.Log.i(str6, "switchDefineOnline, mediaId:".concat(mediaId4));
                    fk4.l lVar2 = thumbPlayerVideoView2.L;
                    kotlin.jvm.internal.o.d(lVar2);
                    lVar2.a(downloader2);
                    com.tencent.thumbplayer.api.TPVideoInfo.Builder builder2 = new com.tencent.thumbplayer.api.TPVideoInfo.Builder();
                    builder2.fileId(mediaId4);
                    builder2.downloadParam(new com.tencent.thumbplayer.api.proxy.TPDownloadParamData(mediaId4, 11));
                    kk4.c cVar2 = thumbPlayerVideoView2.f174597i;
                    if (cVar2 != null) {
                        ((kk4.f0) cVar2).switchDefinition("http://127.0.0.1/sns", 0L, builder2.build(), 2);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchDefineOnlineVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, "copy media error", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchDefine", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        }
    }

    @Override // c01.i
    public void V3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gain", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public final void W(final boolean z17, final float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.U.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.11
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                java.lang.String b17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(onlineVideoView.hashCode());
                boolean z18 = z17;
                java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z18);
                float f18 = f17;
                com.tencent.mars.xlog.Log.i(b17, "%d switch video model isVideoPlay %b %f", valueOf, valueOf2, java.lang.Float.valueOf(f18));
                android.view.View view = (android.view.View) onlineVideoView.B;
                if (z18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    android.widget.RelativeLayout relativeLayout = onlineVideoView.f166461y;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    relativeLayout.setAlpha(f18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    android.widget.RelativeLayout relativeLayout2 = onlineVideoView.f166461y;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    relativeLayout2.setVisibility(0);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(f18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView$11", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OnlineVideoView$11", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OnlineVideoView$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (f18 >= 1.0d) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        boolean z19 = onlineVideoView.f166441h2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        if (!z19) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            android.widget.ImageView imageView = onlineVideoView.A;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            imageView.setVisibility(8);
                        }
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    android.widget.RelativeLayout relativeLayout3 = onlineVideoView.f166461y;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    relativeLayout3.setVisibility(8);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OnlineVideoView$11", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    boolean z27 = onlineVideoView.f166439g2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (z27) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        android.widget.ImageView imageView2 = onlineVideoView.A;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        imageView2.setVisibility(0);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$11");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchVideoModel", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public final void X(boolean z17, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchVideoModelSync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d switch sync video model isVideoPlay %b %f", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17));
        android.view.View view = (android.view.View) this.B;
        if (z17) {
            this.f166461y.setAlpha(f17);
            this.f166461y.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (f17 >= 1.0d && !this.f166441h2) {
                this.A.setVisibility(8);
            }
        } else {
            this.f166461y.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OnlineVideoView", "switchVideoModelSync", "(ZF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f166439g2) {
                this.A.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchVideoModelSync", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public final void Y() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f166436f) {
            str = this.f166440h;
        } else {
            t21.v2 v2Var = this.f166446n;
            str = v2Var != null ? v2Var.C : com.tencent.mm.plugin.sns.model.y6.i(this.f166448p, this.f166447o);
        }
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d toggleVideo local id %s finish path %s isPreview %b", java.lang.Integer.valueOf(hashCode()), this.f166448p, str, java.lang.Boolean.valueOf(this.f166436f));
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i(this.f166432d, "%d sns video already download finish, play now", java.lang.Integer.valueOf(hashCode()));
            if (this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                if (!com.tencent.mm.vfs.w6.j(str)) {
                    str = getRelocatedVideoPath();
                    com.tencent.mars.xlog.Log.w(this.f166432d, "get relocated video path: " + str);
                }
                X(true, 0.0f);
            } else {
                W(true, 0.0f);
            }
            G(str, false);
            final java.lang.String str3 = this.f166432d;
            final r45.jj4 jj4Var = this.f166447o;
            final java.lang.String str4 = this.f166448p;
            final java.lang.String str5 = this.f166451q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkReportAdPathErr", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            if (jj4Var != null && jj4Var.N && (str2 = jj4Var.f377855d) != null && str != null && !str.contains(str2)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 40);
                com.tencent.mars.xlog.Log.e(str3, "toggleVideo, error ad videoPath,  mediaId = " + jj4Var.f377855d + ", media localId = " + jj4Var.f377870s + ", localId = " + str4 + ", realLocalId = " + str5 + ", path = " + str);
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.27
                    @Override // java.lang.Runnable
                    public void run() {
                        java.lang.String str6 = str5;
                        r45.jj4 jj4Var2 = jj4Var;
                        java.lang.String str7 = str3;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$27");
                        try {
                            com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str6);
                            if (k17 == null || !k17.isAd()) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("toggleVideo, error ad videoPath, snsInfo==null?");
                                sb6.append(k17 == null);
                                com.tencent.mars.xlog.Log.e(str7, sb6.toString());
                            } else {
                                java.lang.String t07 = ca4.z0.t0(k17.field_snsId);
                                java.lang.String aid = k17.getAid();
                                com.tencent.mars.xlog.Log.e(str7, "toggleVideo, error ad videoPath,  snsId = " + t07 + ", aid = " + aid + ", mediaId = " + jj4Var2.f377855d + ", media localId = " + jj4Var2.f377870s + ", localId = " + str4 + ", realLocalId = " + str6);
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append(jj4Var2.f377855d);
                                sb7.append("|");
                                sb7.append(aid);
                                ca4.e0.a("online_video_path_err", t07, 0, 0, sb7.toString());
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e(str7, "checkReportAdPathErr, exp=" + th6.toString());
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$27");
                    }
                });
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkReportAdPathErr", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            if (this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                X(false, 0.0f);
            } else {
                W(false, 0.0f);
            }
            S(false, 0, true);
            R();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toggleVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void Z(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uiTouchSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d ui touch seek second %d afterSeekPlay %b", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        boolean z18 = true;
        if (this.H) {
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
            if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var).a(i17 * 1000, z17);
            } else {
                com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper = this.G;
                onlineVideoViewHelper.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                int i18 = onlineVideoViewHelper.f166524b;
                if (i18 == 1) {
                    onlineVideoViewHelper.f166525c = 2;
                    com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                    com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
                    onlineVideoViewHelper.a(i17, pInt, pInt2);
                    if (onlineVideoViewHelper.n(pInt.value, pInt2.value, true)) {
                        onlineVideoViewHelper.f166537o = -1;
                        onlineVideoViewHelper.f166538p = false;
                        onlineVideoViewHelper.f166539q = pInt2.value;
                        onlineVideoViewHelper.f166525c = 3;
                        onlineVideoViewHelper.s(i17, z17);
                    } else {
                        onlineVideoViewHelper.f166537o = i17;
                        onlineVideoViewHelper.f166538p = true;
                        ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) onlineVideoViewHelper.f166528f).E();
                        z18 = false;
                    }
                } else if (i18 == 3) {
                    onlineVideoViewHelper.s(i17, z17);
                }
                com.tencent.mars.xlog.Log.i(onlineVideoViewHelper.f166523a, "seek video time %d, download status %d playStatus %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(onlineVideoViewHelper.f166524b), java.lang.Integer.valueOf(onlineVideoViewHelper.f166525c));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
            }
        } else {
            M(i17, z17);
        }
        if (z18) {
            U(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uiTouchSeek", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "abandonAudioFocus: ");
        if (this.R != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(this.R);
        }
        this.R = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void a0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback iVideoViewCallback = this.f166458x;
        if (iVideoViewCallback != null) {
            iVideoViewCallback.c(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoUI", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    @Override // c01.i
    public void g3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loss", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loss", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public android.content.Context getActivityContext() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivityContext", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        android.app.Activity activity = this.S1;
        if (activity != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivityContext", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return activity;
        }
        android.content.Context context = this.f166445m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivityContext", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return context;
    }

    public int getCurrentPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int currentPosition = this.B.getCurrentPosition();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return currentPosition;
    }

    public int getDuration() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (f4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return 0;
        }
        int duration = f4Var.getDuration();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return duration;
    }

    public java.lang.String getFilePath() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = this.f166462y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public java.lang.String getLocalId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = this.f166448p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback
    public int getPlayErrorCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayErrorCode", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = this.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayErrorCode", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback
    public int getPlayVideoDuration() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayVideoDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f166433d2 < 0) {
            this.f166433d2 = 0;
        }
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d get play video duration [%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f166433d2));
        int i17 = this.f166433d2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayVideoDuration", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback
    public int getPlayVideoDurationByResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f166437f2 < 0) {
            this.f166437f2 = 0;
        }
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d get play video duration by resume [%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f166437f2));
        int i17 = this.f166437f2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayVideoDurationByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public android.view.View getRoot() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        android.widget.RelativeLayout relativeLayout = this.f166461y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRoot", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return relativeLayout;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback
    public com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct getRptStruct() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRptStruct", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct videoRptStruct = new com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.VideoRptStruct();
        videoRptStruct.f166556c = this.V;
        videoRptStruct.f166555b = this.f166449p0;
        videoRptStruct.f166554a = this.W;
        videoRptStruct.f166557d = this.f166459x0;
        videoRptStruct.f166559f = this.f166462y0;
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = this.P1;
        if (videoInfo != null) {
            videoRptStruct.f166560g = videoInfo.requestFlag;
            videoRptStruct.f166561h = videoInfo.svrFlag;
        }
        videoRptStruct.f166562i = this.D1 + "";
        videoRptStruct.f166563j = this.E1 + "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHdVideoExptValue", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f166451q);
        if (k17 != null) {
            java.util.LinkedList linkedList = k17.getTimeLine().ContentObj.H;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.q86 q86Var = (r45.q86) it.next();
                    java.lang.String str = q86Var.f383762d;
                    new com.tencent.mm.plugin.sns.config.RCSnsVideoImproveQualityConfig().k();
                    if (str.equals("clicfg_sns_video_improve_quality_multi")) {
                        java.lang.String str2 = q86Var.f383763e;
                        try {
                            videoRptStruct.f166564k = java.lang.Integer.parseInt(str2);
                        } catch (java.lang.NumberFormatException unused) {
                            com.tencent.mars.xlog.Log.i(this.f166432d, "getHdVideoExptValue >> format error %s", str2);
                            videoRptStruct.f166564k = 0;
                        }
                    }
                }
            }
            java.util.LinkedList linkedList2 = k17.getTimeLine().ContentObj.f369840h;
            if (linkedList2 != null && !linkedList2.isEmpty() && ((r45.jj4) linkedList2.get(0)).H1 != null) {
                videoRptStruct.f166565l = ((r45.jj4) linkedList2.get(0)).H1.f375028e;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHdVideoExptValue", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRptStruct", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return videoRptStruct;
    }

    public int getScene() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = this.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public java.lang.String getSessionId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = this.f166449p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public java.lang.String getSessionIdSns() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionIdSns", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = this.M1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionIdSns", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public long getSessionTimestamp() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        long j17 = this.W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return j17;
    }

    public java.lang.String getSnsId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.String str = this.f166459x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return str;
    }

    public int getSnsScene() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        int i17 = this.L1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return i17;
    }

    public android.widget.ImageView getThumbView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        android.widget.ImageView imageView = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper.IVideoUICallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getUiStayTime() {
        /*
            r10 = this;
            java.lang.String r0 = "getUiStayTime"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.OnlineVideoView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            long r2 = r10.P
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 0
            if (r6 <= 0) goto L19
            long r8 = r10.N
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L19
            long r2 = r2 - r8
            int r2 = (int) r2
            goto L1a
        L19:
            r2 = r7
        L1a:
            if (r2 >= 0) goto L1d
            goto L1e
        L1d:
            r7 = r2
        L1e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.OnlineVideoView.getUiStayTime():int");
    }

    public android.view.View getVideoContainer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        android.widget.RelativeLayout relativeLayout = this.f166464z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoContainer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return relativeLayout;
    }

    public android.util.SizeF getVideoSize() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoSize", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        android.util.SizeF sizeF = new android.util.SizeF(this.f166444l1, this.f166450p1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoSize", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return sizeF;
    }

    public float getVideoSpeedRatio() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoSpeedRatio", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (!(f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoSpeedRatio", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return 0.0f;
        }
        float f17 = ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var).getF();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoSpeedRatio", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return f17;
    }

    public android.view.View getVideoView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        android.view.View view = (android.view.View) this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return view;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode())};
        java.lang.String str = this.f166432d;
        com.tencent.mars.xlog.Log.i(str, "%d on completion", objArr);
        com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback iVideoViewCallback = this.f166458x;
        if (iVideoViewCallback == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            if (fp.h.b(18) || !this.I) {
                M(0, true);
            } else {
                com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
                if (f4Var != null) {
                    java.lang.String f174598m = f4Var.getF174598m();
                    this.B.stop();
                    if (!com.tencent.mm.vfs.w6.j(f174598m)) {
                        java.lang.String relocatedVideoPath = getRelocatedVideoPath();
                        com.tencent.mars.xlog.Log.w(str, "dealCompletion: file path is out of date, old path: %s, new path: %s", f174598m, relocatedVideoPath);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(relocatedVideoPath)) {
                            com.tencent.mars.xlog.Log.e(str, "dealCompletion: invalid file");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        } else {
                            f174598m = relocatedVideoPath;
                        }
                    }
                    G(f174598m, this.H);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        } else {
            iVideoViewCallback.onCompletion();
        }
        n34.b3 b3Var = this.H1;
        if (b3Var != null) {
            b3Var.reset();
        }
        this.B1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d2  */
    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onError(int r25, int r26) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.OnlineVideoView.onError(int, int):void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.Q), java.lang.Integer.valueOf(this.L), java.lang.Boolean.toString(this.f166460x1)};
        java.lang.String str = this.f166432d;
        com.tencent.mars.xlog.Log.i(str, "%d onPrepared playErrorCode[%d] onErrorPlayTimeSec[%d] allowStart[%s]", objArr);
        this.Q = 0;
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
            f4Var.setOneTimeVideoTextureUpdateCallback(this.f166430b2);
            X(true, 0.0f);
            xd4.t0 t0Var = this.A1;
            if (t0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "stopProgressMonitor");
                kotlinx.coroutines.r2 r2Var = t0Var.f453710d;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                t0Var.f453710d = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopProgressMonitor", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            }
        }
        if (this.f166460x1) {
            int i17 = this.L;
            if (i17 > 0) {
                M(i17, true);
                this.L = 0;
            } else {
                int i18 = this.I1;
                if (i18 > 0) {
                    N(i18, true);
                    hashCode();
                    this.I1 = 0;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    this.M = 0;
                    v();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notePlayVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    this.f166431c2 = java.lang.System.currentTimeMillis();
                    hashCode();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notePlayVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    A();
                    this.B.start();
                    this.K = this.B.getDuration() / 1000;
                    n34.b3 b3Var = this.H1;
                    if (b3Var != null) {
                        b3Var.startPlay();
                    }
                    com.tencent.mars.xlog.Log.i(str, "%d start play duration %d sns local id %s ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.K), this.f166448p);
                    U(false);
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback iVideoViewCallback = this.f166458x;
                    if (iVideoViewCallback != null) {
                        iVideoViewCallback.a(this.K);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                }
            }
        }
        this.B1 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayTime", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return 0;
    }

    public void setAllowStart(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAllowStart", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166460x1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAllowStart", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setFilePath(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166462y0 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFilePath", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setFirstFrameRenderCallback(com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback iVideoViewFirstFrameRenderCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFirstFrameRenderCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.J1 = iVideoViewFirstFrameRenderCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFirstFrameRenderCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setMute(boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166442i = z17;
        f25.m0 m0Var = this.R;
        if (m0Var == null || ((g25.e) m0Var).f267980c) {
            z18 = true;
        } else {
            com.tencent.mars.xlog.Log.i(this.f166432d, "setMute: not gain focus");
            z18 = false;
        }
        this.B.setMute(!z18 || this.f166442i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setScene(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.V = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSeekBarHelperCallback(n34.b3 b3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSeekBarHelperCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.H1 = b3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSeekBarHelperCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSessionId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166449p0 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSessionIdSns(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSessionIdSns", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.M1 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSessionIdSns", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSessionTimestamp(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.W = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSessionTimestamp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setShowLoadingDelayTime(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowLoadingDelayTime", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (j17 < 0) {
            j17 = 0;
        }
        this.K1 = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowLoadingDelayTime", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSnsId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166459x0 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setSnsScene(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.L1 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsScene", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setThumbViewScaleType(android.widget.ImageView.ScaleType scaleType) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumbViewScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.A.setScaleType(scaleType);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbViewScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setThumbViewVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumbViewVisibility", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.A.setVisibility(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbViewVisibility", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setVideoCallback(com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewCallback iVideoViewCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166458x = iVideoViewCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (f4Var != null) {
            if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) f4Var).setScaleType(e1Var);
            } else if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoTextureView) f4Var).setScaleType(e1Var);
            } else if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var).setScaleType(e1Var);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoScaleType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setVideoSpeedRatio(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoSpeedRatio", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        java.lang.Object[] objArr = {java.lang.Float.valueOf(f17)};
        java.lang.String str = this.f166432d;
        com.tencent.mars.xlog.Log.i(str, "setVideoSpeedRatio value:%f", objArr);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.B;
        if (f4Var instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
            ((com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) f4Var).setVideoSpeedRatio(f17);
        } else {
            com.tencent.mars.xlog.Log.e(str, "set failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoSpeedRatio", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void setWindowType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWindowType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.F1 = i17;
        ok4.w wVar = this.Q1;
        if (wVar != null) {
            wVar.f346044a.S = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWindowType", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            return;
        }
        this.V1.d();
        this.W1.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearTimer", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public boolean u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        boolean z17 = this.f166438g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasError", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return z17;
    }

    public final void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mars.xlog.Log.i(this.f166432d, "hideLoading()");
        this.F.setImageBitmap(null);
        this.F.setVisibility(8);
        java.lang.Runnable runnable = this.U1;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.U;
        n3Var.removeCallbacks(runnable);
        n3Var.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.14
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$14");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).getVisibility() != 8) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "%d hide loading.", java.lang.Integer.valueOf(onlineVideoView.hashCode()));
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).setVisibility(8);
                }
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).getVisibility() != 8) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "%d hide progress.", java.lang.Integer.valueOf(onlineVideoView.hashCode()));
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$14");
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public boolean w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        boolean isPlaying = this.B.isPlaying();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        return isPlaying;
    }

    public void x(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAutoAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.T = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAutoAudioFocus", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public final void y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notePauseVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f166431c2 > 0) {
            long j17 = this.f166433d2;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f166433d2 = (int) (j17 + ((java.lang.System.currentTimeMillis() - this.f166431c2) / 1000));
        }
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d notePauseVideo playVideoDuration %d ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f166433d2));
        this.f166431c2 = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notePauseVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public void z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notePauseVideoByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (this.f166435e2 > 0) {
            this.f166437f2 = 0;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f166437f2 = (int) (0 + ((java.lang.System.currentTimeMillis() - this.f166435e2) / 1000));
        }
        com.tencent.mars.xlog.Log.i(this.f166432d, "%d notePauseVideoByResume playVideoDuration %d ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f166437f2));
        this.f166435e2 = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notePauseVideoByResume", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    public OnlineVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnlineVideoView(final android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String str = "MicroMsg.OnlineVideoView[" + hashCode() + ']';
        this.f166432d = str;
        this.f166434e = 0;
        this.f166436f = false;
        this.f166438g = false;
        this.f166442i = false;
        this.f166447o = null;
        this.f166457w = false;
        this.G = null;
        this.f166428J = false;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0L;
        this.P = 0L;
        this.Q = 0;
        this.T = true;
        this.U = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.V = 0;
        this.W = 0L;
        this.f166449p0 = "";
        this.f166459x0 = "";
        this.f166462y0 = "";
        this.f166444l1 = 0;
        this.f166450p1 = 0;
        this.f166460x1 = true;
        this.B1 = false;
        this.C1 = "";
        this.D1 = 0L;
        this.E1 = 0L;
        this.F1 = -1;
        gm0.j1.i();
        this.G1 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0)).intValue() == 1;
        this.H1 = null;
        this.I1 = 0;
        this.K1 = 0L;
        this.L1 = 0;
        this.M1 = "";
        this.N1 = false;
        this.O1 = false;
        this.T1 = false;
        this.U1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.13
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$13");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "%d show loading. downloadMode %d", java.lang.Integer.valueOf(onlineVideoView.hashCode()), java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.p(onlineVideoView)));
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.p(onlineVideoView) == 1) {
                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).getVisibility() != 0) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).setVisibility(0);
                    }
                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).getVisibility() != 8) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).setVisibility(8);
                    }
                }
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.p(onlineVideoView) == 2) {
                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).getVisibility() != 0) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).setVisibility(0);
                    }
                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).getVisibility() != 8) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).setVisibility(8);
                    }
                }
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.p(onlineVideoView) == 3) {
                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).getVisibility() != 0) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).setVisibility(0);
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView).a();
                    }
                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).getVisibility() != 8) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView).setVisibility(8);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$13");
            }
        };
        this.V1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.16
            @Override // com.tencent.mm.sdk.platformtools.a4
            public boolean onTimerExpired() {
                java.lang.Object obj;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$16");
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G == null || (obj = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B) == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$16");
                    return false;
                }
                if (((android.view.View) obj).getAlpha() < 1.0f) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "onlineVideoTimer switchVideoModel");
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.W(true, 1.0f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                }
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B.isPlaying()) {
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                }
                try {
                    com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G;
                    onlineVideoViewHelper.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStreaming", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(onlineVideoViewHelper.f166533k);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStreaming", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                    if (!z17) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$16");
                        return false;
                    }
                    int currentPosition = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B.getCurrentPosition();
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.a0(currentPosition);
                    boolean c17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G.c(currentPosition / 1000);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$16");
                    return c17;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "online video timer check error : " + e17.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$16");
                    return false;
                }
            }
        }, true);
        this.W1 = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.sdk.platformtools.a4() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.17
            @Override // com.tencent.mm.sdk.platformtools.a4
            public boolean onTimerExpired() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$17");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                java.lang.Object obj = onlineVideoView.B;
                if (obj == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$17");
                    return false;
                }
                if (((android.view.View) obj).getAlpha() < 1.0f) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "offlineVideoTimer switchVideoModel");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    onlineVideoView.W(true, 1.0f);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                }
                if (onlineVideoView.B.isPlaying()) {
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(onlineVideoView);
                    onlineVideoView.a0(onlineVideoView.B.getCurrentPosition());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$17");
                return true;
            }
        }, true);
        this.X1 = new com.tencent.mm.plugin.sns.model.h0() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.18
            @Override // com.tencent.mm.plugin.sns.model.h0
            public void onImageFinish(java.lang.String str2, int i18, boolean z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
            }

            @Override // com.tencent.mm.plugin.sns.model.h0
            public void onSetbg(java.lang.String str2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
            }

            @Override // com.tencent.mm.plugin.sns.model.h0
            public void onSightFinish(final java.lang.String str2, final boolean z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView.c(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this).postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.18.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18$1");
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass18 anonymousClass18 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass18.this;
                        java.lang.String b17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(onlineVideoView.hashCode());
                        boolean z18 = z17;
                        com.tencent.mars.xlog.Log.i(b17, "%d weixin download finish[%b], go to prepare video", valueOf, java.lang.Boolean.valueOf(z18));
                        if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView) != null && z18 && com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView).f377855d, str2)) {
                            java.lang.String k17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView);
                            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.plugin.sns.model.y6.f164773a;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                            com.tencent.mm.plugin.sns.model.y6.x(k17, "", 0);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postSnsVideo", "com.tencent.mm.plugin.sns.model.SnsVideoLogic");
                            java.lang.String i18 = com.tencent.mm.plugin.sns.model.y6.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView), com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView));
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
                                onlineVideoView.G(i18, false);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18$1");
                    }
                }, 100L);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
            }

            @Override // com.tencent.mm.plugin.sns.model.h0
            public void onThumbFinish(java.lang.String str2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$18");
            }
        };
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.Y1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsVideoMenuEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.19
            {
                this.__eventId = 413312424;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                com.tencent.mm.autogen.events.SnsVideoMenuEvent snsVideoMenuEvent2 = snsVideoMenuEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "%d sns video menu event local id[%s, %s], enable:%s", java.lang.Integer.valueOf(onlineVideoView.hashCode()), snsVideoMenuEvent2.f54852g.f6983d, com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView), java.lang.Boolean.valueOf(onlineVideoView.T1));
                am.ix ixVar = snsVideoMenuEvent2.f54852g;
                if (com.tencent.mm.sdk.platformtools.t8.D0(ixVar.f6983d, com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView)) && onlineVideoView.T1) {
                    int i18 = ixVar.f6980a;
                    if (i18 == 1) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.r(onlineVideoView, ixVar.f6984e);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                    } else {
                        java.lang.String str2 = onlineVideoView.f166432d;
                        if (i18 == 2) {
                            int i19 = ixVar.f6981b;
                            boolean z17 = ixVar.f6982c;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleFavVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            if (onlineVideoView.f166455u > 0) {
                                com.tencent.mars.xlog.Log.w(str2, "fav video now, do nothing.");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleFavVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            } else {
                                java.lang.String o17 = com.tencent.mm.plugin.sns.model.y6.o(onlineVideoView.f166448p, onlineVideoView.f166447o);
                                com.tencent.mars.xlog.Log.i(str2, "%d fav video req code %d fromMain %b, download finish path %s", java.lang.Integer.valueOf(onlineVideoView.hashCode()), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17), o17);
                                if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
                                    onlineVideoView.f166455u = i19;
                                    onlineVideoView.f166456v = z17;
                                    onlineVideoView.S(true, 35, true);
                                    onlineVideoView.R();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptDownloadByFavVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 224L, 1L, false);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptDownloadByFavVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView.U.post(new com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass8(i19, z17));
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleFavVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                        } else {
                            if (i18 == 3) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleSaveVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                java.lang.String o18 = com.tencent.mm.plugin.sns.model.y6.o(onlineVideoView.f166448p, onlineVideoView.f166447o);
                                com.tencent.mars.xlog.Log.i(str2, "%d save video, download finish path %s", java.lang.Integer.valueOf(onlineVideoView.hashCode()), o18);
                                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(onlineVideoView.f166451q);
                                if (k17 != null) {
                                    r45.p76 p76Var = k17.getTimeLine().bgmInfo;
                                    if (p76Var == null || !p76Var.f382816f || k17.getUserName().equals(c01.z1.r())) {
                                        com.tencent.mars.xlog.Log.e(str2, "handleSaveVideoEvent bgmInfo is null");
                                    } else {
                                        com.tencent.mars.xlog.Log.i(str2, "bgmInfo bgmType:%d, listenId:%s, isMajorOwned:%b", java.lang.Integer.valueOf(p76Var.f382814d), p76Var.f382815e, java.lang.Boolean.valueOf(p76Var.f382816f));
                                        android.content.Context activityContext = onlineVideoView.getActivityContext();
                                        int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                                        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activityContext);
                                        e4Var.d(com.tencent.mm.R.string.pan);
                                        e4Var.c();
                                        ta4.e1.f416740a.c(onlineVideoView.M1, onlineVideoView.L1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COPYRIGHT, k17, false, ta4.k.f416791f, false);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSaveVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e(str2, "handleSaveVideoEvent sns info is null");
                                }
                                if (com.tencent.mm.sdk.platformtools.t8.K0(o18)) {
                                    onlineVideoView.f166457w = true;
                                    onlineVideoView.S(true, 34, true);
                                    onlineVideoView.R();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptDownloadBySaveVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 220L, 1L, false);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptDownloadBySaveVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                } else {
                                    onlineVideoView.L();
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleSaveVideoEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                        }
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$19");
                return false;
            }
        };
        this.Z1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsFlipUIEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.20
            {
                this.__eventId = -1879000847;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsFlipUIEvent snsFlipUIEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                final com.tencent.mm.autogen.events.SnsFlipUIEvent snsFlipUIEvent2 = snsFlipUIEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                java.lang.String b17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(onlineVideoView.hashCode());
                java.lang.String str2 = snsFlipUIEvent2.f54810g.f7940c;
                java.lang.String k17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(onlineVideoView);
                am.sv svVar = snsFlipUIEvent2.f54810g;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(svVar.f7939b);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                boolean z17 = onlineVideoView.f166428J;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                com.tencent.mars.xlog.Log.i(b17, "%d sns flip ui event. local id[%s, %s] opcode %d hadUiEvent %b", valueOf, str2, k17, valueOf2, java.lang.Boolean.valueOf(z17));
                int i18 = svVar.f7939b;
                if (i18 == 2) {
                    android.content.Context context2 = svVar.f7938a;
                    if (context2 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        android.content.Context context3 = onlineVideoView.f166445m;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        if (context2 == context3) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView.f166428J = false;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unRegSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView.hashCode();
                            onlineVideoView.Z1.dead();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unRegSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView.B();
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                } else {
                    if (i18 == 1) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.c(onlineVideoView).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.20.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20$1");
                                java.lang.String str3 = snsFlipUIEvent2.f54810g.f7940c;
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass20 anonymousClass20 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass20.this;
                                boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(str3, com.tencent.mm.plugin.sns.ui.OnlineVideoView.k(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this));
                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                if (D0) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z18 = onlineVideoView2.f166428J;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    if (z18) {
                                        onlineVideoView2.requestLayout();
                                    } else {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView2.f166428J = true;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView2.C();
                                    }
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView2.f166428J = false;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4902", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView2.getClass();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unRegSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView2.hashCode();
                                    onlineVideoView2.Z1.dead();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unRegSnsFlipUiEvent", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView2.B();
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20$1");
                            }
                        });
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$20");
                return false;
            }
        };
        this.f166429a2 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnlineVideoEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.21
            {
                this.__eventId = -2133747774;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent2 = onlineVideoEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G == null) {
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d online video helper is null.", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode()));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                } else {
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "OnlineVideoEvent is received, the OnlineVideoEvent opcode is " + onlineVideoEvent2.f54588g.f6844a);
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "OnlineVideoEvent is received, the OnlineVideoEvent length is " + onlineVideoEvent2.f54588g.f6848e);
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "OnlineVideoEvent is received, the OnlineVideoEvent offset is " + onlineVideoEvent2.f54588g.f6847d);
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "OnlineVideoEvent is received, the OnlineVideoEvent mediaId is " + onlineVideoEvent2.f54588g.f6846c);
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "OnlineVideoEvent is received, the OnlineVideoEvent retCode is " + onlineVideoEvent2.f54588g.f6845b);
                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "OnlineVideoEvent is received, the OnlineVideoEvent startDownload is " + onlineVideoEvent2.f54588g.f6849f);
                    try {
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "online video callback error: " + e17.toString());
                    }
                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G.b(onlineVideoEvent2.f54588g.f6846c)) {
                        am.hn hnVar = onlineVideoEvent2.f54588g;
                        int i18 = hnVar.f6845b;
                        if (i18 == -21112) {
                            final com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                            onlineVideoView.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 218L, 1L, false);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            onlineVideoView.U.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.26
                                @Override // java.lang.Runnable
                                public void run() {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$26");
                                    java.lang.String b17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                                    java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode());
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z17 = onlineVideoView2.H;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    com.tencent.mars.xlog.Log.w(b17, "%d deal sns video change isOnlinePlay[%b]", valueOf, java.lang.Boolean.valueOf(z17));
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView3 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    boolean z18 = onlineVideoView3.H;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    if (z18) {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView4 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView4.y();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.B.stop();
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.t();
                                        java.lang.String p17 = com.tencent.mm.plugin.sns.model.y6.p(com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this));
                                        boolean h17 = com.tencent.mm.vfs.w6.h(p17);
                                        if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G != null) {
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G.p();
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G.d();
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView5 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                            onlineVideoView5.G = new com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper(onlineVideoView5);
                                        }
                                        fk4.u uVar = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.f166463y1;
                                        if (uVar != null) {
                                            ((fk4.k) uVar).p();
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.f166463y1 = null;
                                        }
                                        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d delete video file[%b] [%s]", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode()), java.lang.Boolean.valueOf(h17), p17);
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView6 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView6.M = 0;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView7 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView7.Y();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$26");
                                }
                            });
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealSnsVideoChange", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                        } else if (i18 == 0 || i18 == -21006) {
                            switch (hnVar.f6844a) {
                                case 1:
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G;
                                    am.hn hnVar2 = onlineVideoEvent2.f54588g;
                                    onlineVideoViewHelper.g(hnVar2.f6847d, hnVar2.f6849f, hnVar2.f6850g);
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5002", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    onlineVideoView2.H = true;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5002", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                    break;
                                case 2:
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper2 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G;
                                    am.hn hnVar3 = onlineVideoEvent2.f54588g;
                                    onlineVideoViewHelper2.f(hnVar3.f6846c, hnVar3.f6847d, hnVar3.f6848e);
                                    if (onlineVideoEvent2.f54588g.f6848e > 0) {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.U(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.U(true);
                                    break;
                                case 4:
                                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d download finish. cdnMediaId %s sendReqCode %d favFromScene %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode()), onlineVideoEvent2.f54588g.f6846c, java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.e(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this)), java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.f(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this)));
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G.i();
                                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.e(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this) <= 0) {
                                        if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.f(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this) <= 0) {
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView3 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            boolean z17 = onlineVideoView3.f166457w;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            if (!z17) {
                                                com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.U(true);
                                                break;
                                            } else {
                                                com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView4 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                onlineVideoView4.L();
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                                break;
                                            }
                                        } else {
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView5 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                            int f17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.f(onlineVideoView5);
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView6 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            boolean z18 = onlineVideoView6.f166456v;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView5.U.post(new com.tencent.mm.plugin.sns.ui.OnlineVideoView.AnonymousClass8(f17, z18));
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favDownloadedVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            break;
                                        }
                                    } else {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this);
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView7 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                        int e18 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.e(onlineVideoView7);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        onlineVideoView7.O(e18);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                        break;
                                    }
                                case 5:
                                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.p(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this) != 1) {
                                        if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.p(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this) == 2) {
                                            final com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView8 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                            am.hn hnVar4 = onlineVideoEvent2.f54588g;
                                            final int i19 = hnVar4.f6847d;
                                            final int i27 = hnVar4.f6848e;
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView8.getClass();
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            onlineVideoView8.U.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.12
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$12");
                                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView9 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                                                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView9) != null && com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView9).getVisibility() != 8) {
                                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.h(onlineVideoView9).setVisibility(8);
                                                    }
                                                    if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView9) != null) {
                                                        if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView9).getVisibility() != 0) {
                                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView9).setVisibility(0);
                                                        }
                                                        java.lang.String b17 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView9);
                                                        java.lang.Integer valueOf = java.lang.Integer.valueOf(onlineVideoView9.hashCode());
                                                        int i28 = i19;
                                                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i28);
                                                        int i29 = i27;
                                                        com.tencent.mars.xlog.Log.i(b17, "%d update progress %d %d", valueOf, valueOf2, java.lang.Integer.valueOf(i29));
                                                        if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView9).getMax() != i29 && i29 > 0) {
                                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView9).setMax(i29);
                                                        }
                                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.i(onlineVideoView9).setProgress(i28);
                                                    }
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$12");
                                                }
                                            });
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                                            break;
                                        }
                                    } else {
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper3 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G;
                                        am.hn hnVar5 = onlineVideoEvent2.f54588g;
                                        onlineVideoViewHelper3.h(hnVar5.f6846c, hnVar5.f6847d, hnVar5.f6848e);
                                        break;
                                    }
                                    break;
                                case 6:
                                    com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper4 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G;
                                    onlineVideoViewHelper4.getClass();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealHadDupVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    com.tencent.mars.xlog.Log.i(onlineVideoViewHelper4.f166523a, "deal had dup video. cdnMediaId %s", onlineVideoViewHelper4.f166533k);
                                    onlineVideoViewHelper4.l();
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealHadDupVideo", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                                    break;
                                default:
                                    com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d unknown event opcode %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode()), java.lang.Integer.valueOf(onlineVideoEvent2.f54588g.f6844a));
                                    break;
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                        } else {
                            com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d stream download online video error. retCode %d ", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode()), java.lang.Integer.valueOf(onlineVideoEvent2.f54588g.f6845b));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                        }
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$21");
                return false;
            }
        };
        this.f166430b2 = new com.tencent.mm.pluginsdk.ui.tools.e4() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.22
            @Override // com.tencent.mm.pluginsdk.ui.tools.e4
            public void v() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22");
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "%d on texture update.", java.lang.Integer.valueOf(onlineVideoView.hashCode()));
                try {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback iVideoViewFirstFrameRenderCallback = onlineVideoView.J1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (iVideoViewFirstFrameRenderCallback != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback iVideoViewFirstFrameRenderCallback2 = onlineVideoView.J1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        iVideoViewFirstFrameRenderCallback2.a();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5202", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.J1 = null;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5202", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    }
                    if (onlineVideoView.B instanceof com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.X(true, 1.0f);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.W(true, 1.0f);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "texture view update. error " + e17.toString());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$22");
            }
        };
        ph3.b bVar = new ph3.b() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.23
            @Override // ph3.b
            public long a() {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnlineCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this), "%d sns video get online cache", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.hashCode()));
                gm0.j1.i();
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VIDEO_NEED_RESET_EXTRACTOR_BOOLEAN, java.lang.Boolean.TRUE);
                try {
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    boolean z17 = onlineVideoView.H;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5000", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (z17 && com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G != null) {
                        com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper onlineVideoViewHelper = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this.G;
                        onlineVideoViewHelper.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        long j17 = onlineVideoViewHelper.f166539q;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoViewHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnlineCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                        return j17;
                    }
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnlineCacheSec", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$23");
                return 0L;
            }
        };
        this.f166439g2 = true;
        this.f166441h2 = false;
        this.f166443i2 = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        this.f166445m = context;
        com.tencent.mars.xlog.Log.i(str, "%d ui init view, isAd=%s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.toString(false));
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        from.inflate(com.tencent.mm.R.layout.cuy, this);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p0l);
        this.f166461y = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.f487563p06);
        this.f166464z = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.oy7);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.oyr)).setVisibility(8);
        this.D = (com.tencent.mm.ui.widget.MMPinProgressBtn) findViewById(com.tencent.mm.R.id.f487558p01);
        this.C = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.ozc);
        this.E = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p0r);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldUseTp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_sns_tp, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldUseTp", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
        if (fj6) {
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView thumbPlayerVideoView = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerVideoView(context);
            this.B = thumbPlayerVideoView;
            thumbPlayerVideoView.setLoopStartCallback(new pk4.t0() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.1
                @Override // pk4.t0
                public void a() {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoopStart", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$1");
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "onLoopStart");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    n34.b3 b3Var = onlineVideoView.H1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (b3Var != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        n34.b3 b3Var2 = onlineVideoView.H1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        b3Var2.reset();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        n34.b3 b3Var3 = onlineVideoView.H1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        b3Var3.a(true);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoopStart", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$1");
                }
            });
            this.B.setOnInfoCallback(new com.tencent.mm.pluginsdk.ui.tools.b4() { // from class: com.tencent.mm.plugin.sns.ui.OnlineVideoView.2
                @Override // com.tencent.mm.pluginsdk.ui.tools.b4
                public void k(int i18, int i19) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$2");
                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = com.tencent.mm.plugin.sns.ui.OnlineVideoView.this;
                    if (i18 == 701) {
                        onlineVideoView.B1 = true;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.R();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    } else if (i18 == 702) {
                        onlineVideoView.B1 = false;
                        com.tencent.mm.plugin.sns.ui.OnlineVideoView.l(onlineVideoView);
                    } else if (i18 == 3) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        int i27 = com.tencent.mm.plugin.sns.ui.OnlineVideoView.f166427j2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        long j17 = onlineVideoView.D1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        long j18 = currentTimeMillis - j17;
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        onlineVideoView.E1 = currentTimeMillis2;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.OnlineVideoView.b(onlineVideoView), "finish switch define ,cost:%d", java.lang.Long.valueOf(j18));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        ok4.w wVar = onlineVideoView.Q1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSwitchDefineFinish media id:");
                        com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = wVar.f346044a;
                        sb6.append(tPVideoPlayReportStruct.f61053g);
                        com.tencent.mars.xlog.Log.e("MicroMsg.TPPlayerReporter", sb6.toString());
                        tPVideoPlayReportStruct.W = java.lang.System.currentTimeMillis();
                        if (com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView) != null) {
                            ok4.u uVar = ok4.u.f346041a;
                            java.lang.String mediaId = com.tencent.mm.plugin.sns.ui.OnlineVideoView.s(onlineVideoView).f377855d;
                            kotlin.jvm.internal.o.g(mediaId, "mediaId");
                            uVar.e(new ok4.q(mediaId, (int) j18));
                        }
                        xd4.i0 i0Var = onlineVideoView.f166465z1;
                        if (i0Var != null) {
                            i0Var.m();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        if (onlineVideoView.G1) {
                            db5.t7.makeText(context, java.lang.String.format("码率切换完成，耗时:%d", java.lang.Long.valueOf(j18)), 1).show();
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ui.OnlineVideoView$2");
                }
            });
            this.I = false;
            com.tencent.mars.xlog.Log.i(str, "initView, use ThumbPlayerVideoView");
        } else {
            d11.s.fj();
            d11.s.Ai();
            this.I = true;
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = new com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView(context, null);
            this.B = videoPlayerTextureView;
            videoPlayerTextureView.setIOnlineCache(bVar);
            ((com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView) this.B).setOpenWithNoneSurface(true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 148L, 1L, false);
            com.tencent.mars.xlog.Log.i(str, "initView, use VideoPlayerTextureView");
        }
        this.B.setVideoCallback(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        int generateViewId = android.view.View.generateViewId();
        ((android.view.View) this.B).setId(generateViewId);
        this.f166461y.addView((android.view.View) this.B, layoutParams);
        this.F = new android.widget.ImageView(context);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(6, generateViewId);
        layoutParams2.addRule(8, generateViewId);
        this.f166461y.addView(this.F, layoutParams2);
        this.F.setVisibility(8);
        X(false, 0.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }
}

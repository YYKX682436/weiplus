package cw2;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.FinderVideoLayout f223578a;

    /* renamed from: b, reason: collision with root package name */
    public final ey2.v2 f223579b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f223580c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f223581d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f223582e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f223583f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f223584g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f223585h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f223586i;

    /* renamed from: j, reason: collision with root package name */
    public long f223587j;

    /* renamed from: k, reason: collision with root package name */
    public int f223588k;

    /* renamed from: l, reason: collision with root package name */
    public float f223589l;

    public b0(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, ey2.v2 videoStateVM) {
        kotlin.jvm.internal.o.g(finderVideoLayout, "finderVideoLayout");
        kotlin.jvm.internal.o.g(videoStateVM, "videoStateVM");
        this.f223578a = finderVideoLayout;
        this.f223579b = videoStateVM;
        this.f223580c = "FinderAutoSeekManager";
        this.f223581d = jz5.h.b(cw2.x.f224100d);
        this.f223582e = jz5.h.b(cw2.s.f223985d);
        this.f223583f = jz5.h.b(cw2.w.f224073d);
        this.f223584g = jz5.h.b(cw2.v.f224054d);
        this.f223585h = jz5.h.b(cw2.t.f224012d);
        this.f223586i = jz5.h.b(cw2.u.f224034d);
        this.f223588k = 1;
        this.f223589l = 1.0f;
    }

    public static final void i(cw2.b0 b0Var, int i17, cw2.h8 h8Var, ey2.q2 q2Var) {
        cw2.da videoView;
        cw2.h8 h8Var2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        if (q2Var == null || (videoView = b0Var.f223578a.getVideoView()) == null) {
            return;
        }
        cw2.da daVar = (videoView instanceof com.tencent.mm.plugin.finder.video.FinderFluentVideoView) ^ true ? videoView : null;
        if (daVar != null) {
            long currentPlayMs = daVar.getCurrentPlayMs();
            cw2.bb e17 = b0Var.e(q2Var);
            cw2.bb c17 = q2Var.f257486i ? e17 : b0Var.c(i17, q2Var, new cw2.bb(e17.f223606a, e17.f223607b, "onVideoPlay"), q2Var.f257484g);
            long j17 = c17.f223606a;
            if (j17 > 0) {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = b0Var.f223578a;
                b0Var.a(daVar, j17, !finderVideoLayout.G(), c17.f223607b);
                cw2.ca seekBarLayout = finderVideoLayout.getSeekBarLayout();
                if (seekBarLayout != null) {
                    long j18 = 1000;
                    seekBarLayout.p((int) (j17 / j18), (int) (h8Var.f223747c.f330002e.getLong(24) / j18));
                }
                cw2.ca seekBarLayout2 = finderVideoLayout.getSeekBarLayout();
                if (seekBarLayout2 != null) {
                    seekBarLayout2.setProgress(q2Var.f257480c);
                }
                bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
                if (bulletLifecycle != null) {
                    h8Var2 = null;
                    bb2.y2.r(bulletLifecycle, (int) (j17 / 1000), false, 2, null);
                } else {
                    h8Var2 = null;
                }
                if (h8Var.f223751g) {
                    h8Var2 = h8Var;
                }
                if (h8Var2 != null) {
                    ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
                    com.tencent.mm.plugin.finder.storage.FeedData feedData2 = h8Var2.f223745a;
                    if (videoPlayBehavior != null) {
                        long expectId = feedData2.getExpectId();
                        java.lang.String dupFlag = feedData2.getDupFlag();
                        mn2.g4 g4Var = h8Var2.f223747c;
                        long j19 = 1000;
                        feedData = feedData2;
                        ((ec2.h) videoPlayBehavior).d(expectId, dupFlag, g4Var.f330002e, (int) (currentPlayMs / j19), (int) (j17 / j19), g4Var);
                    } else {
                        feedData = feedData2;
                    }
                    long j27 = 1000;
                    b0Var.f223578a.R(feedData.getExpectId(), daVar.getVideoMediaId(), (int) (currentPlayMs / j27), (int) (j17 / j27));
                }
                com.tencent.mars.xlog.Log.i(b0Var.f223580c, "onPlayVideoSeekTo: auto seek silently, feedId = " + pm0.v.u(q2Var.f257478a) + ", curPlayMs:" + currentPlayMs + ", seekTimeMs:" + j17 + " cacheSeekTimeMs:" + e17);
            }
        }
    }

    public final java.lang.Boolean a(cw2.da daVar, long j17, boolean z17, int i17) {
        boolean z18 = daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy;
        java.lang.Boolean bool = null;
        if (z18) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = z18 ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar : null;
            if (finderThumbPlayerProxy != null) {
                bool = java.lang.Boolean.valueOf(finderThumbPlayerProxy.f0(j17, z17, i17));
            }
        } else if (daVar != null) {
            bool = java.lang.Boolean.valueOf(daVar.r(j17 / 1000.0d, true, this.f223588k));
        }
        com.tencent.mars.xlog.Log.i(this.f223580c, "doSeekToMs ret:" + bool + " time:" + j17 + " afterSeekPlay:" + z17 + " mode:" + i17);
        return bool;
    }

    public final void b(float f17) {
        com.tencent.mars.xlog.Log.i(this.f223580c, "doSetPlaySpeed " + f17);
        cw2.da videoView = this.f223578a.getVideoView();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.setPlaySpeed(f17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cw2.bb c(int r19, ey2.q2 r20, cw2.bb r21, long r22) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.b0.c(int, ey2.q2, cw2.bb, long):cw2.bb");
    }

    public final float d(cw2.h8 h8Var, ey2.q2 q2Var) {
        r45.qj2 qj2Var;
        r45.bn2 dramaInfo = h8Var.f223745a.getDramaInfo();
        java.lang.Long valueOf = (dramaInfo == null || (qj2Var = (r45.qj2) dramaInfo.getCustom(0)) == null) ? null : java.lang.Long.valueOf(qj2Var.getLong(0));
        cw2.da videoView = this.f223578a.getVideoView();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        float a17 = this.f223579b.a(valueOf, finderThumbPlayerProxy != null ? java.lang.Integer.valueOf(finderThumbPlayerProxy.getCommentScene()) : null);
        if (a17 > 0.0f) {
            return a17;
        }
        if (q2Var != null) {
            return q2Var.f257483f;
        }
        return 1.0f;
    }

    public final cw2.bb e(ey2.q2 q2Var) {
        mn2.g4 g4Var;
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223578a;
        long videoDurationMs = finderVideoLayout.getVideoDurationMs();
        long j17 = 0;
        if (videoDurationMs == 0) {
            cw2.h8 g17 = g();
            videoDurationMs = (g17 == null || (g4Var = g17.f223747c) == null || (mb4Var = g4Var.f330002e) == null) ? 0L : mb4Var.getLong(24);
        }
        cw2.da videoView = finderVideoLayout.getVideoView();
        if (videoView != null) {
            if (!(!(videoView instanceof com.tencent.mm.plugin.finder.video.FinderFluentVideoView))) {
                videoView = null;
            }
            if (videoView != null) {
                long j18 = q2Var.f257481d;
                long j19 = videoDurationMs - 1000;
                if (j18 >= 0) {
                    j17 = j18 > j19 ? j19 : j18;
                }
                return new cw2.bb(j17, q2Var.f257485h, "getCacheSeekTimeMs");
            }
        }
        j17 = -1;
        return new cw2.bb(j17, q2Var.f257485h, "getCacheSeekTimeMs");
    }

    public final boolean f() {
        return ((java.lang.Boolean) ((jz5.n) this.f223581d).getValue()).booleanValue();
    }

    public final cw2.h8 g() {
        return this.f223578a.getPlayInfo();
    }

    public final void h(java.lang.String mediaId) {
        if (this.f223587j > 0) {
            com.tencent.mars.xlog.Log.i(this.f223580c, "onPlaySeekTo startPlayTime:" + this.f223587j + " playSpeedRatio:" + this.f223589l);
            com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            android.support.v4.media.f.a(com.tencent.mm.plugin.finder.report.s5.f125350b.get(mediaId));
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223578a;
            a(finderVideoLayout.getVideoView(), this.f223587j, true, this.f223588k);
            bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
            if (bulletLifecycle != null) {
                bb2.y2.r(bulletLifecycle, (int) (this.f223587j / 1000), false, 2, null);
            }
            b(this.f223589l);
            this.f223587j = 0L;
            this.f223588k = 1;
            this.f223589l = 1.0f;
        }
    }
}

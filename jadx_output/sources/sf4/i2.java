package sf4;

/* loaded from: classes4.dex */
public final class i2 implements com.tencent.mm.pluginsdk.ui.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407494d;

    public i2(sf4.j2 j2Var) {
        this.f407494d = j2Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        sf4.j2 j2Var = this.f407494d;
        j2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoEnded: " + str + ", meidiaId:" + str2);
        com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct storyPreviewReportStruct = mf4.d.f326163d;
        storyPreviewReportStruct.f60933s = storyPreviewReportStruct.f60933s + 1;
        if4.h hVar = j2Var.f407504f;
        if (hVar == null || !mf4.b.f326142a.a()) {
            return;
        }
        long j17 = hVar.f291254b;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = mf4.b.f326144c;
        if (map.containsKey(valueOf)) {
            android.support.v4.media.f.a(map.get(java.lang.Long.valueOf(j17)));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        sf4.j2 j2Var = this.f407494d;
        j2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onGetVideoSize: " + str + ", " + j2Var.f407502d + ", meidiaId:" + str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        this.f407494d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onError: " + str + ", meidiaId:" + str2 + ", errorMsg:" + str3 + ", what:" + i17 + ", extra:" + i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        bool.booleanValue();
        sf4.j2 j2Var = this.f407494d;
        j2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoWaiting: " + str + ", meidiaId:" + str2);
        if4.h hVar = j2Var.f407504f;
        if (hVar != null) {
            long j17 = mf4.c.f326152d;
            long j18 = hVar.f291254b;
            if (j17 > 0 && j18 != 0 && j18 == 0 && mf4.c.f326151c <= 0 && mf4.c.f326150b > 0) {
                mf4.c.f326159k = true;
            }
            if (mf4.b.f326142a.a()) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j18);
                java.util.Map map = mf4.b.f326144c;
                if (map.containsKey(valueOf)) {
                    android.support.v4.media.f.a(map.get(java.lang.Long.valueOf(j18)));
                }
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        this.f407494d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onVideoPause: " + str + ", meidiaId:" + str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        sf4.j2 j2Var = this.f407494d;
        j2Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoViewCallback onVideoPlay: ");
        sb6.append(str);
        sb6.append(' ');
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = j2Var.f407499a;
        sb6.append(storyVideoView != null ? storyVideoView.getSessionId() : null);
        sb6.append(", ");
        sb6.append(j2Var.f407502d);
        sb6.append(", meidiaId:");
        sb6.append(str2);
        sb6.append(", isVideoPause:false");
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        r26.i0.q(str, j2Var.f407502d, false, 2, null);
        if4.h hVar = j2Var.f407504f;
        if (hVar != null) {
            long j17 = mf4.c.f326152d;
            long j18 = hVar.f291254b;
            if (j17 > 0) {
                long j19 = mf4.c.f326151c;
                long j27 = mf4.c.f326150b;
                if (j18 != 0 && j18 == 0 && j19 <= 0 && j27 > 0) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    mf4.c.f326151c = java.lang.System.currentTimeMillis() - j27;
                    mf4.c.f326157i = java.lang.System.currentTimeMillis();
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryBrowseIDKeyStat", "canPlay " + mf4.c.f326151c);
                    mf4.c.f326159k = false;
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.C(988L, 34L, mf4.c.f326151c);
                    g0Var.C(988L, 35L, 1L);
                    g0Var.C(988L, 71L, mf4.c.f326151c);
                    g0Var.C(988L, 70L, 1L);
                    if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) || com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                        g0Var.C(988L, 73L, mf4.c.f326151c);
                        g0Var.C(988L, 72L, 1L);
                    }
                    long j28 = mf4.c.f326151c;
                    if (j28 <= 400) {
                        g0Var.C(988L, 100L, j28);
                    } else if (j28 <= 800) {
                        g0Var.C(988L, 101L, j28);
                    } else if (j28 <= 1600) {
                        g0Var.C(988L, 102L, j28);
                    } else if (j28 <= 3200) {
                        g0Var.C(988L, 103L, j28);
                    } else if (j28 <= 5000) {
                        g0Var.C(988L, 104L, j28);
                    } else {
                        g0Var.C(988L, 105L, j28);
                    }
                }
            }
            if (mf4.b.f326142a.a()) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j18);
                java.util.Map map = mf4.b.f326144c;
                map.containsKey(valueOf);
                android.support.v4.media.f.a(map.get(java.lang.Long.valueOf(j18)));
                if (j18 == mf4.b.f326143b && map.containsKey(java.lang.Long.valueOf(j18))) {
                    android.support.v4.media.f.a(map.get(java.lang.Long.valueOf(j18)));
                }
            }
            sf4.u1 u1Var = sf4.u1.f407583a;
            if (sf4.u1.f407597o != j18) {
                sf4.u1.f407597o = j18;
                if (sf4.u1.f407585c != 0) {
                    sf4.o1 o1Var = sf4.u1.f407593k;
                    if (o1Var != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "resetWalk");
                        o1Var.f407542e = o1Var.f407538a;
                        o1Var.f407543f = o1Var.f407539b;
                        o1Var.f407544g = 0;
                    }
                    u1Var.m(true);
                }
            }
            java.lang.String username = hVar.f291256d;
            kotlin.jvm.internal.o.g(username, "username");
            nf4.g g17 = ef4.w.f252468t.g();
            nf4.f L0 = g17.L0(username);
            boolean t07 = L0.t0();
            long j29 = L0.field_readId;
            long j37 = L0.field_syncId;
            if (j29 == j37) {
                return;
            }
            L0.field_readId = j37;
            L0.field_readTime = c01.id.c();
            boolean b17 = g17.b1(L0);
            boolean t08 = L0.t0();
            if (b17 && t07 && !t08) {
                g17.doNotify("notify_story_read", 1, L0);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        sf4.j2 j2Var = this.f407494d;
        j2Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoViewCallback onVideoWaitingEnd: ");
        sb6.append(str);
        sb6.append(' ');
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = j2Var.f407499a;
        sb6.append(storyVideoView != null ? storyVideoView.getSessionId() : null);
        sb6.append(", ");
        sb6.append(j2Var.f407502d);
        sb6.append(", meidiaId:");
        sb6.append(str2);
        sb6.append(", isVideoPause:false");
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        r26.i0.q(str, j2Var.f407502d, false, 2, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        this.f407494d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "videoViewCallback onPrepared: " + str + ", meidiaId:" + str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        this.f407494d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "onVideoFirstFrameDraw: " + str + ", meidiaId:" + str2);
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
    }
}

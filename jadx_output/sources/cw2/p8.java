package cw2;

/* loaded from: classes2.dex */
public final class p8 implements cw2.i9 {

    /* renamed from: d, reason: collision with root package name */
    public final float f223940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223941e;

    public p8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223941e = finderVideoLayout;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f223940d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127813lg).getValue()).r()).floatValue();
    }

    @Override // cw2.i9
    public void B(nk4.c data) {
        ec2.g videoPlayBehavior;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        if (finderVideoLayout.getPlayInfo() == null || (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(33);
        fVar.f250965j = data.f338064a;
        fVar.f250966k = data.f338066c;
        fVar.f260936c = data;
        ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
    }

    @Override // cw2.i9
    public void C(nk4.q data) {
        ec2.g videoPlayBehavior;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        if (finderVideoLayout.getPlayInfo() == null || (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(29);
        fVar.f250965j = data.f338064a;
        fVar.f260936c = data;
        ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    @Override // cw2.fb
    public void D(r45.mb4 mb4Var, long j17) {
        lw2.m videoScaleCleanHelper;
        android.util.Size size;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            cw2.b0 b0Var = finderVideoLayout.E;
            mn2.g4 g4Var = playInfo.f223747c;
            java.lang.String string = g4Var.f330002e.getString(9);
            if (string == null) {
                string = "";
            }
            b0Var.getClass();
            com.tencent.mars.xlog.Log.i(b0Var.f223580c, "onFirstFrameRender " + b0Var.f());
            boolean f17 = b0Var.f();
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = b0Var.f223578a;
            if (f17) {
                if (b0Var.f223587j <= 0) {
                    finderVideoLayout2.y("onVideoFirstFrameDraw");
                } else {
                    cw2.da videoView = finderVideoLayout2.getVideoView();
                    com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
                    if ((finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getOnSeekCompleteListener() : null) == null) {
                        cw2.da videoView2 = finderVideoLayout2.getVideoView();
                        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                        if (finderThumbPlayerProxy2 != null) {
                            finderThumbPlayerProxy2.setOnSeekCompleteListener(new cw2.y(b0Var));
                        }
                    }
                }
                if (b0Var.g() != null) {
                    b0Var.h(string);
                }
            } else {
                finderVideoLayout2.y("onVideoFirstFrameDraw");
            }
            com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
            java.lang.String string2 = g4Var.f330002e.getString(9);
            if (string2 == null) {
                string2 = "";
            }
            s5Var.a(string2, true);
            finderVideoLayout.p2("", playInfo.f223746b);
            ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
                long expectId = feedData.getExpectId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.g4 g4Var2 = playInfo.f223747c;
                ((ec2.h) videoPlayBehavior).a(expectId, dupFlag, g4Var2.f330002e, g4Var2, j17);
            }
            java.lang.Object videoView3 = finderVideoLayout.getVideoView();
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = videoView3 instanceof android.view.View ? (android.view.View) videoView3 : null;
            if (finderThumbPlayerProxy3 == null || (videoScaleCleanHelper = finderVideoLayout.getVideoScaleCleanHelper()) == null || !((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128027xf).getValue()).r()).booleanValue() || videoScaleCleanHelper.e() == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("FinderVideoScaleCleanUIC", "onFirstFrameRender");
            videoScaleCleanHelper.f321586k = true;
            android.content.Context context = videoScaleCleanHelper.f321576a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            videoScaleCleanHelper.f321577b = new lw2.o(context);
            com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout e17 = videoScaleCleanHelper.e();
            if (e17 != null) {
                e17.setOnInterceptTouchEventCallback(new lw2.e(videoScaleCleanHelper));
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f18 = videoScaleCleanHelper.f();
                com.tencent.mm.plugin.finder.video.FinderInterceptHorizontalLinearLayout newSeekBarTouchArea = f18 != null ? f18.getNewSeekBarTouchArea() : null;
                if (newSeekBarTouchArea != null) {
                    newSeekBarTouchArea.setOnInterceptTouchEventCallback(new lw2.f(videoScaleCleanHelper));
                }
                e17.setOnScaleDetector(new lw2.g(videoScaleCleanHelper, e17));
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4 = finderThumbPlayerProxy3 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? finderThumbPlayerProxy3 : null;
            if (finderThumbPlayerProxy4 == null || (size = finderThumbPlayerProxy4.getVideoResolutionSize()) == null) {
                size = new android.util.Size(finderThumbPlayerProxy3.getWidth(), finderThumbPlayerProxy3.getHeight());
            }
            lw2.o oVar = videoScaleCleanHelper.f321577b;
            if (oVar != null) {
                oVar.a("bindAnimateView view: " + finderThumbPlayerProxy3);
                oVar.f321605o = finderThumbPlayerProxy3;
                oVar.K = size;
                finderThumbPlayerProxy3.post(new lw2.n(oVar, finderThumbPlayerProxy3, size));
            }
            lw2.o oVar2 = videoScaleCleanHelper.f321577b;
            if (oVar2 != null) {
                oVar2.f();
            }
            lw2.o oVar3 = videoScaleCleanHelper.f321577b;
            if (oVar3 != null) {
                oVar3.f321597g = new lw2.h(videoScaleCleanHelper);
            }
            if (oVar3 != null) {
                oVar3.f321596f = videoScaleCleanHelper.f321586k && videoScaleCleanHelper.f321585j;
            }
        }
    }

    @Override // cw2.fb
    public void F(r45.mb4 mb4Var) {
        cw2.e4 e4Var;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
            if (videoPlayBehavior != null) {
                long expectId = feedData.getExpectId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.g4 g4Var = playInfo.f223747c;
                r45.mb4 mb4Var2 = g4Var.f330002e;
                ec2.f fVar = new ec2.f(2);
                fVar.f250965j = expectId;
                fVar.f250966k = dupFlag;
                fVar.f250962g = g4Var;
                fVar.f250961f = mb4Var2;
                ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
            }
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = new com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent();
            long expectId2 = feedData.getExpectId();
            am.fa faVar = feedMegaVideoAnimPlayEvent.f54249g;
            faVar.f6658a = expectId2;
            faVar.f6661d = true;
            feedMegaVideoAnimPlayEvent.e();
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar longVideoSeekBar = finderVideoLayout.getLongVideoSeekBar();
            if (longVideoSeekBar != null && (e4Var = longVideoSeekBar.playStatusListener) != null) {
                e4Var.d();
            }
            finderVideoLayout.f130709g.T6(feedData.getExpectId());
        }
        bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.F(mb4Var);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView = finderVideoLayout.getVideoView();
        cw2.wa f130607n = videoView != null ? videoView.getF130607n() : null;
        cw2.da videoView2 = finderVideoLayout.getVideoView();
        java.lang.Long valueOf = videoView2 != null ? java.lang.Long.valueOf(videoView2.getCurrentPlayMs()) : null;
        if (jVar.wi(f130607n, "onReplay")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            eu2.b0 b0Var = (eu2.b0) c18;
            if (b0Var.Vi(f130607n, "onReplay")) {
                return;
            }
            b0Var.rj(f130607n, true, null, valueOf);
            b0Var.pj();
        }
    }

    @Override // cw2.fb
    public void G(r45.mb4 mb4Var) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        finderVideoLayout.setPreRenderFirstFrame(true);
        finderVideoLayout.y("onBgPrepared");
        java.lang.String fTPPTag = finderVideoLayout.getFTPPTag();
        if (mb4Var == null || (str = mb4Var.getString(9)) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i(fTPPTag, "onBgPrepared ".concat(str));
    }

    @Override // cw2.fb
    public void J(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        ec2.g videoPlayBehavior;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo == null || (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
        long id6 = feedData.getId();
        java.lang.String dupFlag = feedData.getDupFlag();
        mn2.g4 video = playInfo.f223747c;
        r45.mb4 mb4Var2 = video.f330002e;
        int playAdapterPosition = finderVideoLayout.getPlayAdapterPosition();
        kotlin.jvm.internal.o.g(video, "video");
        ec2.f fVar = new ec2.f(23);
        fVar.f250960e = waVar;
        fVar.f250965j = id6;
        fVar.f250966k = dupFlag;
        fVar.f250961f = mb4Var2;
        fVar.f250969n = playAdapterPosition;
        fVar.f250962g = video;
        fVar.f250975t = i17;
        ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
    }

    @Override // cw2.fb
    public void b(float f17) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.b(f17);
        }
        cw2.ca seekBarLayout = finderVideoLayout.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.b(f17);
        }
    }

    @Override // cw2.fb
    public void d(r45.mb4 mb4Var, cw2.wa waVar, int i17) {
        ec2.g videoPlayBehavior;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo == null || (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
        long id6 = feedData.getId();
        java.lang.String dupFlag = feedData.getDupFlag();
        mn2.g4 video = playInfo.f223747c;
        r45.mb4 mb4Var2 = video.f330002e;
        int playAdapterPosition = finderVideoLayout.getPlayAdapterPosition();
        kotlin.jvm.internal.o.g(video, "video");
        ec2.f fVar = new ec2.f(22);
        fVar.f250960e = waVar;
        fVar.f250965j = id6;
        fVar.f250966k = dupFlag;
        fVar.f250961f = mb4Var2;
        fVar.f250969n = playAdapterPosition;
        fVar.f250962g = video;
        fVar.f250975t = i17;
        ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
    }

    @Override // cw2.fb
    public void e(r45.mb4 mb4Var, int i17, int i18, nk4.r rVar) {
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            cw2.da videoView = finderVideoLayout.getVideoView();
            int currentPlaySecond = videoView != null ? videoView.getCurrentPlaySecond() : 0;
            ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
            if (videoPlayBehavior != null) {
                long expectId = feedData.getExpectId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.g4 g4Var = playInfo.f223747c;
                r45.mb4 mb4Var2 = g4Var.f330002e;
                ec2.f fVar = new ec2.f(3);
                fVar.f250963h = i17;
                fVar.f250964i = i18;
                fVar.f250962g = g4Var;
                fVar.f250965j = expectId;
                fVar.f250966k = dupFlag;
                fVar.f250961f = mb4Var2;
                fVar.f260936c = rVar;
                ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
            }
            r45.dd4 dd4Var = playInfo.f223754j;
            if (dd4Var != null) {
                if (!(dd4Var.getInteger(3) > 0 && dd4Var.getInteger(2) >= 0 && dd4Var.getInteger(3) > dd4Var.getInteger(2))) {
                    dd4Var = null;
                }
                if (dd4Var != null && currentPlaySecond >= dd4Var.getInteger(3) / 1000) {
                    cw2.da videoView2 = finderVideoLayout.getVideoView();
                    com.tencent.mm.plugin.finder.video.FinderCropVideoView finderCropVideoView = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderCropVideoView ? (com.tencent.mm.plugin.finder.video.FinderCropVideoView) videoView2 : null;
                    if (finderCropVideoView != null && (f4Var = finderCropVideoView.f189748q) != null) {
                        f4Var.a(0.0d, true);
                    }
                    com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = new com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent();
                    am.fa faVar = feedMegaVideoAnimPlayEvent.f54249g;
                    faVar.f6659b = true;
                    faVar.f6658a = feedData.getLocalId();
                    faVar.f6661d = true;
                    feedMegaVideoAnimPlayEvent.e();
                }
            }
            if (!(mb4Var != null && mb4Var.getInteger(10) == 3) && currentPlaySecond == com.tencent.mm.plugin.finder.storage.t70.f127590a.q2() - ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127589J).getValue()).intValue()) {
                com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent2 = new com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent();
                boolean z17 = feedData.getLocalId() != 0;
                am.fa faVar2 = feedMegaVideoAnimPlayEvent2.f54249g;
                faVar2.f6659b = z17;
                faVar2.f6658a = z17 ? feedData.getLocalId() : feedData.getFeedId();
                feedMegaVideoAnimPlayEvent2.e();
            }
            finderVideoLayout.c0(-1L, -1L);
        }
        bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
        if (bulletLifecycle != null) {
            cw2.fb.w(bulletLifecycle, mb4Var, i17, i18, null, 8, null);
        }
    }

    @Override // cw2.i9
    public void f(nk4.d data) {
        ec2.g videoPlayBehavior;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        if (finderVideoLayout.getPlayInfo() == null || (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(31);
        fVar.f250965j = data.f338064a;
        fVar.f250966k = data.f338066c;
        fVar.f260936c = data;
        ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
    }

    @Override // cw2.fb
    public void g(r45.mb4 mb4Var, nk4.t tVar) {
        ec2.g videoPlayBehavior;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo == null || (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
        long expectId = feedData.getExpectId();
        java.lang.String dupFlag = feedData.getDupFlag();
        mn2.g4 video = playInfo.f223747c;
        r45.mb4 mb4Var2 = video.f330002e;
        kotlin.jvm.internal.o.g(video, "video");
        ec2.f fVar = new ec2.f(20);
        fVar.f250961f = mb4Var2;
        fVar.f250962g = video;
        fVar.f250965j = expectId;
        fVar.f250966k = dupFlag;
        fVar.f250968m = playInfo.f223749e;
        fVar.f250977v = tVar;
        ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
    }

    @Override // cw2.fb
    public void h(r45.mb4 mb4Var) {
        java.util.LinkedList videoCallBackList;
        cw2.h8 playInfo = this.f223941e.getPlayInfo();
        if (playInfo != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
            cq.k1.a();
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127849ng).getValue()).r()).booleanValue()) {
                cw2.da videoView = finderVideoLayout.getVideoView();
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
                if (finderThumbPlayerProxy != null && finderThumbPlayerProxy.f130665r) {
                    finderVideoLayout.y("onPlay");
                }
            }
            ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                long expectId = playInfo.f223745a.getExpectId();
                java.lang.String dupFlag = playInfo.f223745a.getDupFlag();
                mn2.g4 g4Var = playInfo.f223747c;
                ((ec2.h) videoPlayBehavior).c(expectId, dupFlag, g4Var.f330002e, playInfo.f223749e, g4Var, playInfo.f223745a);
            }
            cw2.b0 b0Var = finderVideoLayout.E;
            java.lang.String string = playInfo.f223747c.f330002e.getString(9);
            if (string == null) {
                string = "";
            }
            b0Var.getClass();
            com.tencent.mars.xlog.Log.i(b0Var.f223580c, "onPlaySeekTo " + b0Var.f());
            if (!b0Var.f()) {
                b0Var.h(string);
            }
            videoCallBackList = finderVideoLayout.getVideoCallBackList();
            java.util.Iterator it = videoCallBackList.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).onVideoPlay();
            }
        }
        bb2.y2 bulletLifecycle = this.f223941e.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.h(mb4Var);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView2 = this.f223941e.getVideoView();
        cw2.wa f130607n = videoView2 != null ? videoView2.getF130607n() : null;
        cw2.da videoView3 = this.f223941e.getVideoView();
        java.lang.Long valueOf = videoView3 != null ? java.lang.Long.valueOf(videoView3.getCurrentPlayMs()) : null;
        if (jVar.wi(f130607n, "onPlay")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            eu2.b0 b0Var2 = (eu2.b0) c18;
            if (b0Var2.Vi(f130607n, "onPlay")) {
                return;
            }
            b0Var2.rj(f130607n, true, null, valueOf);
        }
    }

    @Override // cw2.fb
    public void n(r45.mb4 mb4Var, nk4.a aVar) {
        java.util.LinkedList videoCallBackList;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
            if (videoPlayBehavior != null) {
                long expectId = feedData.getExpectId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.g4 g4Var = playInfo.f223747c;
                ((ec2.h) videoPlayBehavior).b(expectId, dupFlag, g4Var.f330002e, playInfo.f223749e, g4Var, aVar);
            }
            videoCallBackList = finderVideoLayout.getVideoCallBackList();
            java.util.Iterator it = videoCallBackList.iterator();
            while (it.hasNext()) {
                ((cw2.ea) it.next()).onVideoPause();
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout.X(finderVideoLayout, feedData.getFeedId(), false, false, 0, 14, null);
        }
        bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.n(mb4Var, aVar);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView = finderVideoLayout.getVideoView();
        cw2.wa f130607n = videoView != null ? videoView.getF130607n() : null;
        cw2.da videoView2 = finderVideoLayout.getVideoView();
        java.lang.Long valueOf = videoView2 != null ? java.lang.Long.valueOf(videoView2.getCurrentPlayMs()) : null;
        if (jVar.wi(f130607n, "onPause")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            eu2.b0 b0Var = (eu2.b0) c18;
            if (b0Var.Vi(f130607n, "onPause")) {
                return;
            }
            b0Var.rj(f130607n, false, null, valueOf);
            b0Var.oj();
        }
    }

    @Override // cw2.i9
    public void p(nk4.j data) {
        ec2.g videoPlayBehavior;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        if (finderVideoLayout.getPlayInfo() == null || (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) == null) {
            return;
        }
        ec2.f fVar = new ec2.f(30);
        fVar.f250965j = data.f338064a;
        fVar.f250966k = data.f338066c;
        fVar.f260936c = data;
        ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
    }

    @Override // cw2.fb
    public void s(cw2.wa waVar, nk4.a aVar) {
        if (waVar != null) {
            cu2.x xVar = cu2.x.f222449a;
            so2.i3 c17 = cu2.x.c(xVar, waVar.f224096c, false, false, false, 14, null);
            if (!c17.field_hasPlayed) {
                c17.field_hasPlayed = true;
                java.lang.String field_mediaId = c17.field_mediaId;
                kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
                so2.i3 c18 = cu2.x.c(xVar, field_mediaId, false, false, false, 14, null);
                c18.field_hasPlayed = true;
                xVar.i(field_mediaId, c18, false);
            }
            ec2.g videoPlayBehavior = this.f223941e.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = waVar.f224099f;
                long id6 = feedData.getId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.j4 video = waVar.f224098e;
                kotlin.jvm.internal.o.g(video, "video");
                ec2.f fVar = new ec2.f(6);
                fVar.f250965j = id6;
                fVar.f250966k = dupFlag;
                fVar.f250961f = waVar.f224097d;
                fVar.f250962g = video;
                fVar.f250978w = aVar;
                ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
            }
        }
    }

    @Override // cw2.fb
    public void t(long j17, long j18, long j19, java.lang.String str, int i17, bu2.h0 mediaHWInfo, java.lang.String specFormat) {
        int i18;
        boolean z17;
        long j27;
        ec2.g videoPlayBehavior;
        kotlin.jvm.internal.o.g(mediaHWInfo, "mediaHWInfo");
        kotlin.jvm.internal.o.g(specFormat, "specFormat");
        int i19 = mediaHWInfo.f24518c;
        int i27 = mediaHWInfo.f24517b;
        float f17 = mediaHWInfo.f24516a;
        if (j18 <= 0 || j17 <= 0) {
            i18 = i19;
            z17 = false;
        } else {
            r45.mb4 mb4Var = mediaHWInfo.f24519d;
            if (mb4Var == null || java.lang.Float.isNaN(f17) || i27 <= 0 || i19 <= 0) {
                i18 = i19;
                com.tencent.mars.xlog.Log.i("Finder.VideoLayout", "checkNeedResizeVideoView: needResize: true, mediaHWRatio: " + f17 + ", mediaHeight: " + i27 + ", mediaWidth: " + i18 + ", maxRadioMedia: " + mb4Var);
                z17 = true;
            } else {
                double d17 = j18 / j17;
                boolean z18 = d17 - ((double) f17) > ((double) this.f223940d);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkNeedResizeVideoView: needResize: ");
                sb6.append(z18);
                sb6.append(", videoRatio: ");
                sb6.append(d17);
                sb6.append(", mediaHWRatio: ");
                sb6.append(f17);
                sb6.append(", mediaHeight: ");
                sb6.append(i27);
                sb6.append(", mediaWidth: ");
                i18 = i19;
                sb6.append(i18);
                sb6.append(", maxRadioMedia: ");
                sb6.append(mb4Var);
                com.tencent.mars.xlog.Log.i("Finder.VideoLayout", sb6.toString());
                z17 = z18;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.VideoLayout", "needResizeAndNotify: width: %s, height: %s, feedId: %s, feedPosition: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), pm0.v.u(j19), java.lang.Integer.valueOf(i17));
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127831mg).getValue()).r()).booleanValue() || (videoPlayBehavior = this.f223941e.getVideoPlayBehavior()) == null) {
                j27 = j18;
            } else {
                ec2.f fVar = new ec2.f(32);
                fVar.f250965j = j19;
                j27 = j18;
                fVar.D = new android.util.Size((int) j17, (int) j27);
                ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
            }
            i95.m c18 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127795kg).getValue()).r()).booleanValue()) {
                com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayerSizeMonitorStruct finderVideoPlayerSizeMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderVideoPlayerSizeMonitorStruct();
                finderVideoPlayerSizeMonitorStruct.f58074d = finderVideoPlayerSizeMonitorStruct.b("feed_id", pm0.v.u(j19), true);
                finderVideoPlayerSizeMonitorStruct.f58075e = finderVideoPlayerSizeMonitorStruct.b("feed_bitrate_level", specFormat, true);
                finderVideoPlayerSizeMonitorStruct.f58076f = i18;
                finderVideoPlayerSizeMonitorStruct.f58077g = i27;
                finderVideoPlayerSizeMonitorStruct.f58078h = (int) j17;
                finderVideoPlayerSizeMonitorStruct.f58079i = (int) j27;
                finderVideoPlayerSizeMonitorStruct.f58080j = j17 != 0 ? (int) ((f17 - (j27 / j17)) * 100) : Integer.MIN_VALUE;
                finderVideoPlayerSizeMonitorStruct.k();
            }
        }
    }

    @Override // cw2.fb
    public void u(r45.mb4 mb4Var, long j17, kz2.a aVar) {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            com.tencent.mm.plugin.finder.report.s5 s5Var = com.tencent.mm.plugin.finder.report.s5.f125349a;
            mn2.g4 video = playInfo.f223747c;
            java.lang.String string = video.f330002e.getString(9);
            if (string == null) {
                string = "";
            }
            boolean z17 = false;
            s5Var.a(string, false);
            java.lang.String fTPPTag = finderVideoLayout.getFTPPTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFirstVideoFrameRendered] videoView=");
            cw2.da videoView = finderVideoLayout.getVideoView();
            sb6.append(videoView != null ? java.lang.Integer.valueOf(videoView.hashCode()) : null);
            sb6.append(" mediaId=");
            sb6.append(playInfo.f223746b);
            com.tencent.mars.xlog.Log.i(fTPPTag, sb6.toString());
            com.tencent.mm.plugin.finder.report.e1 e1Var = com.tencent.mm.plugin.finder.report.e1.f125004a;
            cw2.h8 playInfo2 = finderVideoLayout.getPlayInfo();
            java.lang.Long valueOf = (playInfo2 == null || (feedData = playInfo2.f223745a) == null) ? null : java.lang.Long.valueOf(feedData.getId());
            if (valueOf != null) {
                valueOf.longValue();
                com.tencent.mm.plugin.finder.report.d1 a17 = e1Var.a(valueOf.longValue());
                if ((a17.f124990c > 0 || a17.f124988a > 0) && a17.f124993f == 0) {
                    z17 = true;
                }
                com.tencent.mm.plugin.finder.report.d1 d1Var = z17 ? a17 : null;
                if (d1Var != null) {
                    d1Var.f124993f = c01.id.c();
                    com.tencent.mm.plugin.finder.report.e1.f125006c.add(d1Var);
                    com.tencent.mm.plugin.finder.report.e1.f125005b.clear();
                }
            }
            ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData2 = playInfo.f223745a;
                long expectId = feedData2.getExpectId();
                java.lang.String dupFlag = feedData2.getDupFlag();
                r45.mb4 mb4Var2 = video.f330002e;
                kotlin.jvm.internal.o.g(video, "video");
                ec2.f fVar = new ec2.f(19);
                fVar.f250961f = mb4Var2;
                fVar.f250965j = expectId;
                fVar.f250966k = dupFlag;
                fVar.f250962g = video;
                fVar.f250976u = j17;
                fVar.f250979x = aVar;
                ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
            }
        }
        bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.u(mb4Var, j17, aVar);
        }
    }

    @Override // cw2.fb
    public void v(r45.mb4 mb4Var, long j17, long j18) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223941e;
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        if (playInfo != null) {
            finderVideoLayout.W = j17;
            long j19 = finderVideoLayout.f130716p0;
            if (j17 >= j19) {
                j19 = j17;
            }
            finderVideoLayout.f130716p0 = j19;
            finderVideoLayout.c0(j17, j18);
            ec2.g videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
                long expectId = feedData.getExpectId();
                java.lang.String dupFlag = feedData.getDupFlag();
                mn2.g4 video = playInfo.f223747c;
                r45.mb4 mb4Var2 = video.f330002e;
                kotlin.jvm.internal.o.g(video, "video");
                ec2.f fVar = new ec2.f(24);
                fVar.f250963h = (int) j17;
                fVar.f250964i = (int) j18;
                fVar.f250962g = video;
                fVar.f250965j = expectId;
                fVar.f250966k = dupFlag;
                fVar.f250961f = mb4Var2;
                ((ec2.h) videoPlayBehavior).f250982a.a(fVar);
            }
        }
        bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.v(mb4Var, j17, j18);
        }
        i95.m c17 = i95.n0.c(du2.j.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        du2.j jVar = (du2.j) c17;
        cw2.da videoView = finderVideoLayout.getVideoView();
        cw2.wa f130607n = videoView != null ? videoView.getF130607n() : null;
        cw2.da videoView2 = finderVideoLayout.getVideoView();
        java.lang.Long valueOf = videoView2 != null ? java.lang.Long.valueOf(videoView2.getCurrentPlayMs()) : null;
        if (jVar.wi(f130607n, "onPlayProgressMs")) {
            i95.m c18 = i95.n0.c(eu2.b0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            du2.l lVar = eu2.b0.I;
            ((eu2.b0) c18).fj(f130607n, valueOf, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r7 != 3) goto L43;
     */
    @Override // cw2.fb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(r45.mb4 r17, cw2.wa r18, int r19, nk4.e r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.p8.x(r45.mb4, cw2.wa, int, nk4.e):void");
    }
}

package o74;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, i64.k0, com.tencent.mm.plugin.sns.ui.y4 {
    public com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic B;
    public android.view.View C;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f343574t;

    /* renamed from: u, reason: collision with root package name */
    public o74.i f343575u;

    /* renamed from: w, reason: collision with root package name */
    public n74.j1 f343577w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.v f343578x;

    /* renamed from: y, reason: collision with root package name */
    public a44.k f343579y;

    /* renamed from: z, reason: collision with root package name */
    public int f343580z;

    /* renamed from: q, reason: collision with root package name */
    public boolean f343571q = true;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f343572r = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f343573s = false;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f343576v = null;
    public final android.view.View.OnClickListener A = new o74.g(this);
    public final boolean D = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.e();

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public boolean D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return true;
    }

    public void F() {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "doPause: %s Ad Video doPause", this);
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f343574t)) {
            com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f343578x;
            if (vVar != null) {
                vVar.g();
            }
        } else {
            o74.i iVar = this.f343575u;
            if (iVar != null && iVar.f169269f0 != null) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f343574t;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
                if (bsVar != null && (l1Var = bsVar.f168036b) != null && (b1Var = l1Var.f169702c) != null && snsInfo != null) {
                    b1Var.q(snsInfo.field_snsId);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.y4
    public void F3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.B;
        if (commonShakeLogic != null) {
            commonShakeLogic.F3();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    public final void G(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (baseViewHolder == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "initCommonShakeLogic, viewHolder==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return;
        }
        android.view.View view = this.C;
        if (view instanceof android.widget.FrameLayout) {
            frameLayout = (android.widget.FrameLayout) view;
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "initCommonShakeLogic, shakeViewContainer err");
            frameLayout = null;
        }
        android.widget.FrameLayout frameLayout2 = frameLayout;
        android.view.View view2 = baseViewHolder.f169301v0;
        android.app.Activity activity = this.f169249f;
        if (activity == null || frameLayout2 == null || view2 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "initCommonShakeLogic, params err");
        } else {
            this.B = new com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic(activity, frameLayout2, view2, 0, new o74.h(this, baseViewHolder));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    public final void H(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "setVideoStatusIvVisibility: setVideoStatusIvVisibility is " + i17 + ", isPlaying is " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "setVideoStatusIvVisibility: %s, but isPlaying", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        } else {
            baseViewHolder.f169269f0.f168419i.setVisibility(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        }
    }

    public void I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "showPlayBtn: try show play btn, isPlayingSight is false");
        o74.i iVar = this.f343575u;
        if (iVar != null && iVar.f169269f0 != null) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "showPlayBtn: show play btn");
            this.f343575u.f169269f0.f168419i.setVisibility(0);
            this.f343575u.f169269f0.f168420j.setVisibility(8);
            this.f343575u.f169269f0.f168419i.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
            this.f343575u.f169269f0.f168419i.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "play, pos=" + i17);
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f343574t)) {
            if (this.f343578x != null) {
                xd4.o0.d().j();
                xd4.g.a().d(this);
                this.f343578x.i();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return;
        }
        if (this.f343571q) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (baseViewHolder == null) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "playOnlineVideo: the holder is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            } else {
                r45.jj4 a17 = n74.x1.a(baseViewHolder);
                java.lang.String c17 = n74.x1.c(baseViewHolder);
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(baseViewHolder.f169268f);
                i64.b1 b17 = n74.x1.b(this.f169251h);
                java.lang.String str = baseViewHolder.f169268f;
                if (a17 == null || c17 == null || k17 == null) {
                    com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "playOnlineVideo: the media, timelineId, sns info is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                } else {
                    xd4.g.a().c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "hidePlayBtn: try hide play btn");
                    o74.i iVar = this.f343575u;
                    if (iVar != null && iVar.f169269f0 != null) {
                        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "hidePlayBtn: hide play btn");
                        this.f343575u.f169269f0.f168419i.setVisibility(8);
                        this.f343575u.f169269f0.f168420j.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) baseViewHolder.f169269f0.f168414d.findViewById(com.tencent.mm.R.id.ncu);
                    com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "playOnlineVideo: position is " + i17 + ", timelineId is " + c17);
                    z74.h hVar = new z74.h("SnsAd.AdSightTimeLineItem");
                    hVar.a(frameLayout);
                    hVar.b(a17);
                    hVar.c(k17);
                    hVar.d(str);
                    hVar.g(c17);
                    hVar.f(b17);
                    hVar.e(1, new o74.f(this));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f343574t) && (vVar = this.f343578x) != null) {
            vVar.b();
        }
        java.lang.String T = ca4.z0.T(this.f343574t);
        if (T == null || T.equals(str)) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "onAdRemoved:" + str);
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "onAdRemoved, curSnsId=" + T + ", snsId=" + str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 123);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "onUIPause");
        F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        android.view.View view = this.f343576v;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f343576v.getMeasuredWidth() + i17, this.f343576v.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        this.f169249f.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.f343575u = (o74.i) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.csn);
            android.view.ViewStub viewStub2 = (android.view.ViewStub) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.f485318ha2);
            if (!baseViewHolder.f169267e0) {
                baseViewHolder.f169269f0.f168414d = viewStub2.inflate();
                baseViewHolder.f169267e0 = true;
            }
        } else {
            baseViewHolder.f169269f0.f168414d = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.n_5);
            baseViewHolder.f169267e0 = true;
        }
        com.tencent.mm.plugin.sns.ui.g9 g9Var = baseViewHolder.f169269f0;
        g9Var.f168418h = g9Var.f168414d.findViewById(com.tencent.mm.R.id.bkg);
        com.tencent.mm.plugin.sns.ui.g9 g9Var2 = baseViewHolder.f169269f0;
        g9Var2.f168416f = (android.widget.ImageView) g9Var2.f168418h.findViewById(com.tencent.mm.R.id.f487295o70);
        baseViewHolder.f169269f0.f168418h.setOnClickListener(this.A);
        com.tencent.mm.plugin.sns.ui.g9 g9Var3 = baseViewHolder.f169269f0;
        g9Var3.f168419i = (android.widget.ImageView) g9Var3.f168414d.findViewById(com.tencent.mm.R.id.nhn);
        com.tencent.mm.plugin.sns.ui.g9 g9Var4 = baseViewHolder.f169269f0;
        g9Var4.f168420j = (com.tencent.mm.ui.widget.MMPinProgressBtn) g9Var4.f168414d.findViewById(com.tencent.mm.R.id.lbi);
        com.tencent.mm.plugin.sns.ui.g9 g9Var5 = baseViewHolder.f169269f0;
        g9Var5.f168422l = (android.widget.TextView) g9Var5.f168414d.findViewById(com.tencent.mm.R.id.dgp);
        com.tencent.mm.plugin.sns.ui.g9 g9Var6 = baseViewHolder.f169269f0;
        g9Var6.f168421k = (android.widget.TextView) g9Var6.f168414d.findViewById(com.tencent.mm.R.id.dhd);
        com.tencent.mm.plugin.sns.ui.g9 g9Var7 = baseViewHolder.f169269f0;
        g9Var7.f168423m = (android.widget.ImageView) g9Var7.f168414d.findViewById(com.tencent.mm.R.id.nar);
        this.f343575u.D0 = (android.view.ViewStub) baseViewHolder.f169269f0.f168414d.findViewById(com.tencent.mm.R.id.n4i);
        this.f343575u.F0 = (android.view.ViewStub) baseViewHolder.f169301v0.findViewById(com.tencent.mm.R.id.g6y);
        o74.i iVar = this.f343575u;
        android.view.View view = baseViewHolder.f169269f0.f168414d;
        iVar.G0 = view;
        this.C = view.findViewById(com.tencent.mm.R.id.qgn);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        int i19;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        n74.j1 j1Var;
        i64.b1 b1Var;
        int i27;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        int i28;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeVideoPlayer", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        this.f343571q = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeVideoPlayer", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (timeLineObject != null && (str3 = timeLineObject.Id) != null) {
            this.f343572r = str3;
        }
        r45.a90 a90Var = timeLineObject.ContentObj;
        r45.jj4 jj4Var = (a90Var == null || a90Var.f369840h.size() < 1) ? null : (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
        if (nsVar.f170044p && this.f343571q) {
            l44.c0.b(nsVar.f170025a, jj4Var);
        }
        java.lang.Object tag = baseViewHolder.f169269f0.f168416f.getTag();
        if (tag instanceof java.lang.String) {
            java.lang.String str4 = (java.lang.String) tag;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4) || !str4.equals(this.f343572r)) {
                a84.y0.p(baseViewHolder.f169269f0.f168416f, false);
                baseViewHolder.f169269f0.f168416f.setImageDrawable(null);
            }
        } else {
            a84.y0.p(baseViewHolder.f169269f0.f168416f, false);
            baseViewHolder.f169269f0.f168416f.setImageDrawable(null);
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = nsVar.f170025a;
        this.f343574t = snsInfo2;
        if (snsInfo2 != null && !snsInfo2.isAd()) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSightTimeLineItem", "error ad snsInfo, id=" + ca4.z0.t0(this.f343574t.field_snsId));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 121);
            ca4.q.c("error ad snsInfo", new java.lang.RuntimeException("normalSightItem"));
        }
        boolean f17 = xd4.o0.d().f(timeLineObject.Id);
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "ad fillItem, videoItem, pos=" + i17 + ", snsId=" + timeLineObject.Id + ", isPlayingVideo=" + f17 + ", hash=" + hashCode());
        android.widget.ImageView imageView = baseViewHolder.f169269f0.f168419i;
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        baseViewHolder.f169269f0.a(timeLineObject, i17, nsVar.f170036h, nsVar.f170044p);
        baseViewHolder.f169269f0.f168421k.setVisibility(8);
        baseViewHolder.f169269f0.f168423m.setVisibility(8);
        baseViewHolder.f169269f0.f168426p = baseViewHolder.A;
        r45.a90 a90Var2 = timeLineObject.ContentObj;
        if (a90Var2 == null || a90Var2.f369840h.size() < 1) {
            i19 = i17;
            str = "fillItem";
            str2 = "SnsAd.AdSightTimeLineItem";
        } else {
            long nanoTime = java.lang.System.nanoTime();
            m44.a.g(jj4Var);
            boolean D = hj6.D(jj4Var);
            com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "fillItem: isMediaSightExist %b duration %s", java.lang.Boolean.valueOf(D), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
            if (D) {
                if (hj6.E(jj4Var)) {
                    H(baseViewHolder, 0, f17);
                    baseViewHolder.f169269f0.f168420j.setVisibility(8);
                    baseViewHolder.f169269f0.f168419i.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
                    baseViewHolder.f169269f0.f168419i.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
                } else if (hj6.B(jj4Var)) {
                    H(baseViewHolder, 8, f17);
                    baseViewHolder.f169269f0.f168420j.setVisibility(8);
                } else if (!nsVar.f170044p || hj6.v(nsVar.f170025a) > 5) {
                    hj6.V(jj4Var);
                    H(baseViewHolder, 0, f17);
                    baseViewHolder.f169269f0.f168420j.setVisibility(8);
                    baseViewHolder.f169269f0.f168419i.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
                    baseViewHolder.f169269f0.f168419i.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
                } else if (!this.f343573s) {
                    com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "fillItem: mIsForbidShowPlayBtn is false and showPlayBtn");
                    I();
                }
            } else if (hj6.C(jj4Var)) {
                H(baseViewHolder, 8, f17);
                baseViewHolder.f169269f0.f168420j.setVisibility(0);
                baseViewHolder.f169269f0.f168420j.a();
            } else if (nsVar.f170044p && hj6.v(nsVar.f170025a) == 5) {
                hj6.U(jj4Var);
                H(baseViewHolder, 8, f17);
                baseViewHolder.f169269f0.f168420j.setVisibility(0);
                baseViewHolder.f169269f0.f168420j.a();
            } else if (hj6.z(jj4Var)) {
                baseViewHolder.f169269f0.f168420j.setVisibility(8);
                baseViewHolder.f169269f0.f168419i.setImageResource(com.tencent.mm.R.raw.shortvideo_play_icon_err);
                H(baseViewHolder, 0, f17);
            } else {
                hj6.V(jj4Var);
                H(baseViewHolder, 0, f17);
                baseViewHolder.f169269f0.f168420j.setVisibility(8);
                baseViewHolder.f169269f0.f168419i.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
                baseViewHolder.f169269f0.f168419i.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
                if (nsVar.f170044p) {
                    i28 = 4;
                } else {
                    i28 = 4;
                    if (hj6.x(nsVar.f170025a) == 4) {
                        baseViewHolder.f169269f0.f168421k.setVisibility(0);
                    }
                }
                if (nsVar.f170044p && hj6.v(nsVar.f170025a) == i28) {
                    baseViewHolder.f169269f0.f168421k.setVisibility(0);
                }
            }
            boolean k07 = ca4.m0.k0(baseViewHolder.timeLineObject);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = nsVar.f170025a;
            com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo3.getAdXml();
            if (adXml.adContentStyle != 0) {
                str = "fillItem";
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2056, 15);
            } else {
                str = "fillItem";
            }
            int width = ((android.view.WindowManager) this.f169249f.getSystemService("window")).getDefaultDisplay().getWidth();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = baseViewHolder.timeLineObject;
            android.app.Activity activity = this.f169249f;
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView asyncNormalTextView = baseViewHolder.f169280l;
            jz5.l a17 = o74.d.f343566a.a(k07, snsInfo3, adXml, width, timeLineObject2, activity);
            android.util.Pair pair = new android.util.Pair((java.lang.Integer) a17.f302833d, (java.lang.Integer) a17.f302834e);
            int i29 = adXml.adMediaDisplayMode;
            if (i29 == 1 || i29 == 2) {
                asyncNormalTextView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(((java.lang.Integer) pair.first).intValue(), -2));
            }
            if (this.f343577w == null) {
                this.f343577w = new n74.j1();
            }
            int r17 = ca4.m0.r(snsInfo3, 0, 0);
            if (r17 == 1) {
                baseViewHolder.f169269f0.f168423m.setVisibility(0);
                baseViewHolder.f169269f0.f168423m.setImageResource(com.tencent.mm.R.drawable.bpt);
            } else if (r17 == 2) {
                baseViewHolder.f169269f0.f168423m.setVisibility(0);
                baseViewHolder.f169269f0.f168423m.setImageResource(com.tencent.mm.R.drawable.csw);
            }
            int intValue = ((java.lang.Integer) pair.first).intValue();
            int intValue2 = ((java.lang.Integer) pair.second).intValue();
            this.f343580z = intValue;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillItem: isVerticalAdVideo is ");
            sb6.append(k07);
            sb6.append(", snsId is ");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = nsVar.f170025a;
            sb6.append(snsInfo4 == null ? "" : java.lang.Long.valueOf(snsInfo4.field_snsId));
            sb6.append(", smallSide is ");
            sb6.append(intValue);
            sb6.append(", smallHeight is ");
            sb6.append(intValue2);
            com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", sb6.toString());
            android.view.ViewGroup.LayoutParams layoutParams = baseViewHolder.f169269f0.f168422l.getLayoutParams();
            layoutParams.width = intValue;
            layoutParams.height = intValue2;
            baseViewHolder.f169269f0.f168422l.setLayoutParams(layoutParams);
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) baseViewHolder.f169269f0.f168414d.findViewById(com.tencent.mm.R.id.ncu);
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.width = intValue;
            layoutParams2.height = intValue2;
            frameLayout.setLayoutParams(layoutParams2);
            android.view.View findViewById = baseViewHolder.f169269f0.f168414d.findViewById(com.tencent.mm.R.id.f487296o71);
            findViewById.setLayoutParams(new android.widget.FrameLayout.LayoutParams(layoutParams));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams3 = baseViewHolder.f169269f0.f168418h.getLayoutParams();
            layoutParams3.width = -2;
            layoutParams3.height = -2;
            baseViewHolder.f169269f0.f168418h.setLayoutParams(layoutParams3);
            this.f343576v = frameLayout;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = this.f343574t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (bsVar == null || (l1Var = bsVar.f168036b) == null || (b1Var = l1Var.f169702c) == null) {
                b1Var = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (b1Var != null) {
                java.lang.String T = ca4.z0.T(snsInfo5);
                if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                    b1Var.a(T, this);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f343574t)) {
                n74.j1 j1Var2 = this.f343577w;
                if (j1Var2 != null) {
                    j1Var2.a(this.f169249f, this.f343574t, baseViewHolder.f169269f0.f168414d, 0);
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo6 = this.f343574t;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                if (baseViewHolder instanceof o74.i) {
                    o74.i iVar = (o74.i) baseViewHolder;
                    android.view.ViewStub viewStub = iVar.D0;
                    if (viewStub != null && iVar.E0 == null) {
                        iVar.E0 = (com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer) a84.y0.h(viewStub);
                    }
                    if (iVar.E0 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                        str2 = "SnsAd.AdSightTimeLineItem";
                        i19 = i17;
                    } else {
                        iVar.f169269f0.f168419i.setVisibility(8);
                        iVar.f169269f0.f168420j.setVisibility(8);
                        com.tencent.mm.plugin.sns.ui.g9 g9Var = iVar.f169269f0;
                        g9Var.f168418h.setTag(g9Var);
                        a84.y0.o(iVar.E0, intValue, intValue2);
                        a84.y0.o(iVar.f169269f0.f168418h, intValue, intValue2);
                        if (this.f343578x == null) {
                            this.f343578x = new com.tencent.mm.plugin.sns.ad.widget.living.v(iVar.E0);
                        }
                        str2 = "SnsAd.AdSightTimeLineItem";
                        this.f343578x.d(snsInfo6, 0, jj4Var, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
                    }
                } else {
                    str2 = "SnsAd.AdSightTimeLineItem";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                i19 = i17;
            } else {
                str2 = "SnsAd.AdSightTimeLineItem";
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f343575u.E0;
                if (adLivingStreamContainer != null) {
                    adLivingStreamContainer.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f343578x;
                if (vVar != null) {
                    vVar.h();
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView b17 = xd4.o0.d().b(timeLineObject.Id);
                com.tencent.mars.xlog.Log.i(str2, "fillItem: fill item view check videoView reAttach, tlObjId:%s, vv:%s, count:%s", timeLineObject.Id, b17, java.lang.Integer.valueOf(frameLayout.getChildCount()));
                if (frameLayout.getChildCount() == 1 && (frameLayout.getChildAt(0) instanceof android.widget.ImageView)) {
                    frameLayout.removeAllViews();
                    com.tencent.mars.xlog.Log.i(str2, "fillItem: find thumbView then remove it %s", timeLineObject.Id);
                }
                if (frameLayout.getChildCount() == 1 && (frameLayout.getChildAt(0) instanceof com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView)) {
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = (com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView) frameLayout.getChildAt(0);
                    if (!timeLineObject.Id.equals(snsTimelineVideoView.f170641m2)) {
                        frameLayout.removeAllViews();
                        com.tencent.mars.xlog.Log.i(str2, "fillItem: find diff id then remove it %s %s", timeLineObject.Id, snsTimelineVideoView.f170641m2);
                    }
                }
                if (b17 == null || frameLayout.getChildCount() != 0) {
                    if (!f17 && frameLayout.getChildCount() > 0 && !xd4.o0.d().e(timeLineObject.Id)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        frameLayout.removeViewAt(0);
                        com.tencent.mars.xlog.Log.i(str2, "fillItem: item remove video view cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    }
                } else if (b17.getParent() != null && b17.getParent() != frameLayout) {
                    b17.f170645q2 = true;
                    ((android.view.ViewGroup) b17.getParent()).removeView(b17);
                    b17.setVisibility(0);
                    b17.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                    frameLayout.addView(b17, new android.widget.FrameLayout.LayoutParams(-1, -1));
                    com.tencent.mars.xlog.Log.i(str2, "fillItem: reAttach success");
                }
                if (b17 != null) {
                    java.lang.String str5 = baseViewHolder.f169268f;
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = baseViewHolder.timeLineObject;
                    b17.P(jj4Var, str5, timeLineObject3 == null ? 0 : timeLineObject3.CreateTime);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("fillItem: videoView setVideoData, position is ");
                    i27 = i17;
                    sb7.append(i27);
                    sb7.append(", tlObj Id is ");
                    sb7.append(timeLineObject.Id);
                    com.tencent.mars.xlog.Log.i(str2, sb7.toString());
                } else {
                    i27 = i17;
                    com.tencent.mars.xlog.Log.w(str2, "fillItem: SnsVideoViewMgr can not return video view, position is " + i27 + ", tlObj Id is " + timeLineObject.Id);
                }
                a84.y0.o(baseViewHolder.f169269f0.f168416f, intValue, intValue2);
                baseViewHolder.f169269f0.f168416f.requestLayout();
                com.tencent.mm.plugin.sns.model.i1 hj7 = com.tencent.mm.plugin.sns.model.l4.hj();
                android.widget.ImageView imageView2 = baseViewHolder.f169269f0.f168416f;
                int hashCode = this.f169249f.hashCode();
                com.tencent.mm.storage.s7 d17 = com.tencent.mm.storage.s7.d();
                d17.f195313b = timeLineObject.CreateTime;
                i19 = i27;
                hj7.l0(jj4Var, imageView2, -1, hashCode, d17);
                baseViewHolder.f169269f0.f168416f.setTag(this.f343572r);
                a84.y0.p(baseViewHolder.f169269f0.f168416f, true);
                com.tencent.mm.plugin.sns.ui.g9 g9Var2 = baseViewHolder.f169269f0;
                g9Var2.f168418h.setTag(g9Var2);
                if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.R(jj4Var))) {
                    bsVar.f168036b.f169702c.z(nsVar.f170038j, (int) jj4Var.R, true);
                    l44.c0.e();
                } else {
                    bsVar.f168036b.f169702c.z(nsVar.f170038j, (int) jj4Var.R, false);
                }
                bsVar.f168036b.f169702c.y(nsVar.f170038j, !nsVar.f170044p ? com.tencent.mm.plugin.sns.model.l4.hj().x(nsVar.f170025a) != 5 : com.tencent.mm.plugin.sns.model.l4.hj().v(nsVar.f170025a) != 5, 1);
            }
            if (this.f343575u != null) {
                if (this.f343579y == null) {
                    this.f343579y = new a44.k(this.f343575u.F0, baseViewHolder.f169286o);
                }
                this.f343579y.g(baseViewHolder.f169269f0.f168418h.getContext(), this.f343574t, intValue);
            }
        }
        if (!com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f343574t) && (j1Var = this.f343577w) != null) {
            j1Var.a(this.f169249f, this.f343574t, baseViewHolder.f169269f0.f168414d, 0);
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo7 = this.f343574t;
        int i37 = this.f343580z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        try {
            if (this.D && com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.d(snsInfo7)) {
                if (this.B == null) {
                    G(baseViewHolder);
                }
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.B;
                if (commonShakeLogic != null) {
                    commonShakeLogic.j(snsInfo7, snsInfo7.getAdInfo().commonShakeInfo, i19, i37);
                }
            } else {
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic2 = this.B;
                if (commonShakeLogic2 != null) {
                    commonShakeLogic2.j(snsInfo7, null, i19, i37);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str2, "refreshCommonShakeView, exp=" + e17);
            ca4.q.c("refreshCommonShakeView, normalSight", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        g(nsVar, 3);
        if (baseViewHolder.f169280l != null && (snsInfo = this.f343574t) != null) {
            if (a84.p.b(150432, snsInfo.getAdInfo()) || a84.p.a(this.f343574t)) {
                baseViewHolder.f169280l.setOnNormalClickListener(new o74.e(this, baseViewHolder));
            } else {
                baseViewHolder.f169280l.setOnNormalClickListener(null);
            }
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo8 = this.f343574t;
        if (snsInfo8 != null && snsInfo8.isAdForbidAutoPlay()) {
            I();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "pause");
        F();
        if (!com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f343574t)) {
            I();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSightTimeLineItem", "stop: %s Ad Video stop", this);
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f343574t) && (vVar = this.f343578x) != null) {
            vVar.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return "AdNormalSightTimeLineItem";
    }
}

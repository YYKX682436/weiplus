package dc4;

/* loaded from: classes4.dex */
public final class p extends dc4.v {
    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView A;
    public boolean B;
    public boolean C;
    public final z74.c D;
    public final dc4.n E;
    public s74.o2 F;
    public android.view.ViewGroup G;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.TimeLineObject f228797p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f228798q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f228799r;

    /* renamed from: s, reason: collision with root package name */
    public final i64.b1 f228800s;

    /* renamed from: t, reason: collision with root package name */
    public final android.app.Activity f228801t;

    /* renamed from: u, reason: collision with root package name */
    public final int f228802u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f228803v;

    /* renamed from: w, reason: collision with root package name */
    public final rl5.r f228804w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f228805x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f228806y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f228807z;

    public p(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var, rl5.r rVar) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        this.f228797p = timeLineObject;
        this.f228798q = snsInfo;
        this.f228799r = iVar;
        this.f228800s = b1Var;
        this.f228801t = mActivity;
        this.f228802u = i17;
        this.f228803v = k4Var;
        this.f228804w = rVar;
        this.f228806y = jz5.h.b(new dc4.l(this));
        this.f228807z = jz5.h.b(new dc4.m(this));
        this.D = new dc4.o(this);
        this.E = new dc4.n(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2008, 6);
        this.f228805x = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (view2 != null) {
            view2.requestLayout();
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228798q;
        this.f228832e = snsInfo;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228797p;
        this.f228831d = timeLineObject;
        if ((timeLineObject != null ? timeLineObject.Id : null) != null) {
            kotlin.jvm.internal.o.d(timeLineObject != null ? timeLineObject.Id : null);
        }
        android.view.ViewGroup viewGroup = this.G;
        android.app.Activity activity = this.f228801t;
        if (viewGroup == null) {
            this.G = (android.view.ViewGroup) com.tencent.mm.ui.id.b(activity).inflate(com.tencent.mm.R.layout.f489522cu1, (android.view.ViewGroup) null);
        }
        int m17 = m();
        jz5.g gVar = this.f228806y;
        i64.b1 b1Var = this.f228800s;
        if (m17 == 5 || m() == 15) {
            r45.jj4 o17 = o();
            if (o17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            l44.c0.b(this.f228832e, o17);
            this.C = s74.x2.g() && a84.p.c(this.f228832e);
            if (b1Var != null) {
                java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), o17.f377855d);
                kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
                java.lang.String R = ca4.z0.R(o17);
                kotlin.jvm.internal.o.f(R, "getSnsSightName(...)");
                if (com.tencent.mm.vfs.w6.j(d17.concat(R))) {
                    b1Var.z(this.f228832e.field_snsId, (int) o17.R, true);
                    l44.c0.e();
                } else {
                    b1Var.z(this.f228832e.field_snsId, (int) o17.R, false);
                }
                b1Var.y(this.f228832e.field_snsId, com.tencent.mm.plugin.sns.model.l4.hj().v(this.f228832e) == 5, 1);
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView((android.content.Context) activity, true);
            this.A = snsTimelineVideoView;
            snsTimelineVideoView.x(false);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = this.A;
            if (snsTimelineVideoView2 != null) {
                snsTimelineVideoView2.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView3 = this.A;
            if (snsTimelineVideoView3 != null) {
                snsTimelineVideoView3.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            a84.y0.o(this.A, -1, -1);
            a84.y0.p(this.A, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ((jz5.n) gVar).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            a84.y0.b(viewGroup2, this.A, 0);
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView4 = this.A;
            if (snsTimelineVideoView4 != null) {
                snsTimelineVideoView4.setUICallback(new dc4.j(this));
            }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView5 = this.A;
            if (snsTimelineVideoView5 != null) {
                z74.e eVar = new z74.e(this.f228832e, snsTimelineVideoView5, b1Var, 4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                boolean z17 = this.C;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                if (z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoCallbackHelper", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                    eVar.f470595f = this.E;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoCallbackHelper", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                    z74.c cVar = this.D;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                    eVar.f470594e = cVar;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoCallbackListener", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineAdVideoCallback");
                }
                snsTimelineVideoView5.setVideoCallback(eVar);
            }
        }
        com.tencent.mm.plugin.sns.ui.g9 g9Var = new com.tencent.mm.plugin.sns.ui.g9();
        this.f228835h = g9Var;
        g9Var.f168418h = this.G;
        g9Var.f168419i = p();
        com.tencent.mm.plugin.sns.ui.g9 g9Var2 = this.f228835h;
        java.lang.String localid = snsInfo != null ? snsInfo.getLocalid() : null;
        if (localid == null) {
            localid = "";
        }
        g9Var2.a(timeLineObject, 0, localid, snsInfo != null ? snsInfo.isAd() : false);
        if (this.F == null) {
            int j17 = s74.q4.f404513a.j(activity);
            androidx.lifecycle.y yVar = activity instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) activity : null;
            android.view.View itemRootView = this.f228836i;
            int i17 = this.f228802u;
            if (b1Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            dc4.k kVar = new dc4.k(this);
            com.tencent.mm.plugin.sns.model.k4 k4Var = this.f228803v;
            kotlin.jvm.internal.o.f(itemRootView, "itemRootView");
            int f17 = j17 - (i65.a.f(activity, com.tencent.mm.R.dimen.i_) * 2);
            android.app.Activity activity2 = this.f228801t;
            android.view.ViewGroup viewGroup3 = this.f228805x;
            if (viewGroup3 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            android.view.ViewGroup viewGroup4 = this.G;
            if (viewGroup4 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) ((jz5.n) gVar).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            if (viewGroup5 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
                return;
            }
            this.F = new s74.o2("DynamicViewDetail", yVar, itemRootView, i17, b1Var, kVar, k4Var, new s74.p2(itemRootView, f17, activity2, viewGroup3, viewGroup4, viewGroup5, this, this.f228799r, this.f228804w, -1));
        }
        s74.o2 o2Var = this.F;
        if (o2Var != null) {
            boolean z18 = this.f228839o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o2Var.B = z18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        s74.o2 o2Var2 = this.F;
        if (o2Var2 != null) {
            o2Var2.f(snsInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.tencent.mm.plugin.sns.ad.widget.living.v R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        super.g();
        com.tencent.mars.xlog.Log.i("AdDynamicViewDetailItem", "onPause");
        if (this.F != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        com.tencent.mm.plugin.sns.ad.widget.living.u uVar = com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228798q;
        if (uVar.a(snsInfo)) {
            com.tencent.mars.xlog.Log.i("AdDynamicViewDetailItem", "pause pausePlayerStream");
            s74.o2 o2Var = this.F;
            if (o2Var != null && (R = o2Var.R()) != null) {
                R.g();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
            return;
        }
        if (this.B) {
            com.tencent.mars.xlog.Log.i("AdDynamicViewDetailItem", "pausePlay");
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.A;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.F();
            }
            i64.b1 b1Var = this.f228800s;
            if (b1Var != null) {
                b1Var.q(snsInfo != null ? snsInfo.field_snsId : 0L);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
    }

    @Override // dc4.v
    public void i() {
        s74.o2 o2Var;
        com.tencent.mm.plugin.sns.ad.widget.living.v R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        super.i();
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f228798q) && (o2Var = this.F) != null && (R = o2Var.R()) != null) {
            R.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007c  */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.p.j():void");
    }

    public final s74.o2 l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdComponent", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        s74.o2 o2Var = this.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdComponent", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return o2Var;
    }

    public final int m() {
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228797p;
        int i17 = (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null) ? 0 : a90Var.f369837e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return i17;
    }

    public final android.view.ViewGroup n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMainContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        android.view.ViewGroup viewGroup = this.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMainContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return viewGroup;
    }

    public final r45.jj4 o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        r45.jj4 jj4Var = null;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f228797p;
        if ((timeLineObject != null ? timeLineObject.ContentObj : null) != null && timeLineObject.ContentObj.f369840h.size() >= 1) {
            jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return jj4Var;
    }

    public final android.widget.ImageView p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f228807z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ui.detail.item.AdDynamicViewDetailItem");
        return imageView;
    }
}

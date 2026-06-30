package dc4;

/* loaded from: classes4.dex */
public class u extends dc4.v implements i64.k0 {
    public android.view.ViewStub A;
    public a44.k B;
    public final android.widget.TextView C;
    public android.view.View E;
    public com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic F;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f228819p;

    /* renamed from: q, reason: collision with root package name */
    public final i64.b1 f228820q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f228821r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView f228822s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f228823t;

    /* renamed from: u, reason: collision with root package name */
    public n74.j1 f228824u;

    /* renamed from: v, reason: collision with root package name */
    public int f228825v;

    /* renamed from: w, reason: collision with root package name */
    public int f228826w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewStub f228827x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f228828y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.v f228829z;
    public final android.os.Handler D = new android.os.Handler(android.os.Looper.getMainLooper());
    public final boolean G = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.e();

    public u(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var, android.widget.TextView textView) {
        this.f228831d = timeLineObject;
        this.f228832e = snsInfo;
        this.f228838n = iVar;
        this.f228820q = b1Var;
        snsInfo.getLocalid();
        this.C = textView;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView l(dc4.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = uVar.f228822s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        return snsTimelineVideoView;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033c  */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r20, android.view.View r21) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.u.c(android.view.View, android.view.View):void");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f228832e) && (vVar = this.f228829z) != null) {
            vVar.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }

    @Override // dc4.v
    public void g() {
        boolean a17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        try {
            a17 = com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f228832e);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "onPause, isAdUseOnlineVideoView=" + this.f228821r + ", isAdLivingStream=" + a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdNormalSightDetailItem", "onPause, exp=" + th6.toString());
        }
        if (a17) {
            this.f228829z.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
            return;
        }
        if (this.f228821r && (snsTimelineVideoView = this.f228822s) != null) {
            snsTimelineVideoView.F();
        }
        i64.b1 b1Var = this.f228820q;
        if (b1Var != null && (snsInfo = this.f228832e) != null) {
            b1Var.q(snsInfo.field_snsId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }

    @Override // dc4.v
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.F;
        if (commonShakeLogic != null) {
            commonShakeLogic.F3();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }

    @Override // dc4.v
    public void j() {
        n74.j1 j1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        this.f228832e = com.tencent.mm.plugin.sns.storage.l1.a(this.f228832e.getSnsId());
        com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "refreshView, hash=" + hashCode());
        r45.a90 a90Var = this.f228831d.ContentObj;
        r45.jj4 jj4Var = (a90Var == null || a90Var.f369840h.size() < 1) ? null : (r45.jj4) this.f228831d.ContentObj.f369840h.get(0);
        if (jj4Var != null) {
            m44.a.g(jj4Var);
            if (this.f228821r) {
                l44.c0.b(this.f228832e, jj4Var);
            }
        }
        r45.a90 a90Var2 = this.f228831d.ContentObj;
        if (a90Var2 != null && a90Var2.f369840h.size() >= 1) {
            if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f228832e)) {
                n74.j1 j1Var2 = this.f228824u;
                if (j1Var2 != null) {
                    j1Var2.a(this.f228819p, this.f228832e, this.f228833f, m());
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228832e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
                if (this.f228828y == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
                } else {
                    this.f228835h.f168419i.setVisibility(8);
                    this.f228835h.f168420j.setVisibility(8);
                    this.f228823t.setVisibility(8);
                    if (this.f228829z == null) {
                        this.f228829z = new com.tencent.mm.plugin.sns.ad.widget.living.v(this.f228828y);
                    }
                    this.f228829z.d(snsInfo, ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) this.f228819p).G7(), jj4Var, java.lang.Integer.valueOf(this.f228825v), java.lang.Integer.valueOf(this.f228826w));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f228832e;
                if (snsInfo2 != null && !snsInfo2.isAdForbidAutoPlay()) {
                    l44.b3.f316041a.h(this.f228832e);
                    this.f228829z.i();
                }
            } else {
                if (com.tencent.mm.plugin.sns.model.l4.hj().D(jj4Var)) {
                    if (com.tencent.mm.plugin.sns.model.l4.hj().E(jj4Var)) {
                        this.f228835h.f168419i.setVisibility(0);
                        this.f228835h.f168420j.setVisibility(8);
                        this.f228835h.f168419i.setImageDrawable(i65.a.i(this.f228819p, com.tencent.mm.R.raw.shortvideo_play_btn));
                    } else if (com.tencent.mm.plugin.sns.model.l4.hj().B(jj4Var)) {
                        this.f228835h.f168419i.setVisibility(8);
                        this.f228835h.f168420j.setVisibility(8);
                    } else if (!this.f228832e.isAd() || com.tencent.mm.plugin.sns.model.l4.hj().v(this.f228832e) > 5) {
                        com.tencent.mm.plugin.sns.model.l4.hj().V(jj4Var);
                        this.f228835h.f168419i.setVisibility(0);
                        this.f228835h.f168420j.setVisibility(8);
                        this.f228835h.f168419i.setImageDrawable(i65.a.i(this.f228819p, com.tencent.mm.R.raw.shortvideo_play_btn));
                    } else {
                        this.f228835h.f168419i.setVisibility(8);
                        this.f228835h.f168420j.setVisibility(8);
                    }
                } else if (com.tencent.mm.plugin.sns.model.l4.hj().C(jj4Var)) {
                    this.f228835h.f168419i.setVisibility(8);
                    this.f228835h.f168420j.setVisibility(0);
                    this.f228835h.f168420j.a();
                } else if (this.f228832e.isAd() && com.tencent.mm.plugin.sns.model.l4.hj().v(this.f228832e) == 5) {
                    com.tencent.mm.plugin.sns.model.l4.hj().U(jj4Var);
                    this.f228835h.f168419i.setVisibility(8);
                    this.f228835h.f168420j.setVisibility(0);
                    this.f228835h.f168420j.a();
                } else {
                    com.tencent.mm.plugin.sns.model.l4.hj().V(jj4Var);
                    this.f228835h.f168419i.setVisibility(0);
                    this.f228835h.f168420j.setVisibility(8);
                    this.f228835h.f168419i.setImageDrawable(i65.a.i(this.f228819p, com.tencent.mm.R.raw.shortvideo_play_btn));
                }
                boolean z17 = this.f228821r;
                i64.b1 b1Var = this.f228820q;
                if (z17) {
                    if (this.f228822s == null) {
                        a84.y0.c(this.f228823t);
                        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView(this.f228819p, true);
                        this.f228822s = snsTimelineVideoView;
                        snsTimelineVideoView.x(false);
                        this.f228822s.setVideoScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
                        this.f228822s.setThumbViewScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                        a84.y0.o(this.f228822s, -1, -1);
                        a84.y0.p(this.f228822s, true);
                        a84.y0.b(this.f228823t, this.f228822s, 0);
                        this.f228822s.setUICallback(new dc4.q(this));
                        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView2 = this.f228822s;
                        snsTimelineVideoView2.setVideoCallback(new z74.e(this.f228832e, snsTimelineVideoView2, b1Var, 1));
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "refreshView, new OnLineVideoView, hash=" + this.f228822s.hashCode() + ", innerType=" + this.f228822s.getInnerVideoView());
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "refreshView, OnLineVideoView.hash=" + this.f228822s.hashCode() + ", hasErr=" + this.f228822s.u());
                    }
                    this.f228822s.setMute(true);
                    this.f228822s.P(jj4Var, this.f228832e.getLocalid(), this.f228832e.getTimeLine().CreateTime);
                    this.f228822s.a();
                    android.os.Handler handler = this.D;
                    handler.removeCallbacksAndMessages(null);
                    handler.postDelayed(new dc4.r(this), 250L);
                    a84.y0.p(this.f228835h.f168420j, false);
                    if (this.f228822s.u()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AdNormalSightDetailItem", "play video error " + jj4Var.f377855d + " " + jj4Var.f377858g + " " + jj4Var.f377860i);
                        com.tencent.mm.plugin.sns.model.l4.hj().V(jj4Var);
                        a84.y0.p(this.f228835h.f168419i, true);
                        a84.y0.p(this.f228835h.f168420j, false);
                        this.f228835h.f168419i.setImageDrawable(i65.a.i(this.f228819p, com.tencent.mm.R.raw.shortvideo_play_btn));
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1910, 1);
                    }
                }
                if (b1Var != null) {
                    if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.R(jj4Var))) {
                        b1Var.z(this.f228832e.field_snsId, (int) jj4Var.R, true);
                        l44.c0.e();
                    } else {
                        b1Var.z(this.f228832e.field_snsId, (int) jj4Var.R, false);
                    }
                    b1Var.y(this.f228832e.field_snsId, com.tencent.mm.plugin.sns.model.l4.hj().v(this.f228832e) == 5, 1);
                }
            }
        }
        if (!com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f228832e) && (j1Var = this.f228824u) != null) {
            j1Var.a(this.f228819p, this.f228832e, this.f228833f, m());
        }
        if (this.B == null) {
            this.B = new a44.k(this.A, this.f228834g);
        }
        this.B.g(this.f228819p, this.f228832e, this.f228825v);
        int i17 = this.f228825v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        try {
            if (this.G && com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.d(this.f228832e)) {
                if (this.F == null) {
                    n();
                }
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.F;
                if (commonShakeLogic != null) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f228832e;
                    commonShakeLogic.j(snsInfo3, snsInfo3.getAdInfo().commonShakeInfo, 0, i17);
                }
            } else {
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic2 = this.F;
                if (commonShakeLogic2 != null) {
                    commonShakeLogic2.j(this.f228832e, null, 0, i17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdNormalSightDetailItem", "refreshCommonShakeView, exp=" + e17);
            ca4.q.c("refreshCommonShakeView, normalSightDetail", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = this.f228832e;
        if ((snsInfo4 != null && a84.p.b(150432, snsInfo4.getAdInfo())) || a84.p.a(this.f228832e)) {
            this.C.setOnClickListener(new dc4.s(this));
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = this.f228832e;
        if (snsInfo5 != null && snsInfo5.isAdForbidAutoPlay()) {
            o();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }

    public final int m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        i64.b1 b1Var = this.f228820q;
        if (b1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
            return 1;
        }
        int i17 = b1Var.f289095j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        return i17;
    }

    public final void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f228833f.findViewById(com.tencent.mm.R.id.qgn);
        android.view.View view = this.f228833f;
        android.content.Context context = this.f228819p;
        if (context == null || frameLayout == null || view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdNormalSightDetailItem", "initCommonShakeLogic, clickView==null");
        } else {
            this.F = new com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic(context, frameLayout, view, 1, new dc4.t(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }

    public final void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.AdNormalSightDetailItem", "showPlayBtn");
        android.view.View view = this.E;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/AdNormalSightDetailItem", "showPlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/detail/item/AdNormalSightDetailItem", "showPlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
    }
}

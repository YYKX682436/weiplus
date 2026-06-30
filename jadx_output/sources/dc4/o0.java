package dc4;

/* loaded from: classes4.dex */
public class o0 extends dc4.v implements z84.i, z84.h, i64.k0 {
    public android.view.ViewGroup A;
    public android.view.ViewGroup B;
    public q74.z C;
    public z84.k D;
    public w64.n E;
    public android.view.ViewStub F;
    public android.graphics.Point G;
    public d94.g H;
    public android.widget.FrameLayout I;
    public android.view.View L;
    public q74.d0 M;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f228786p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f228787q;

    /* renamed from: r, reason: collision with root package name */
    public int f228788r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f228789s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView f228790t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f228791u;

    /* renamed from: v, reason: collision with root package name */
    public final i64.b1 f228792v;

    /* renamed from: x, reason: collision with root package name */
    public q74.b1 f228794x;

    /* renamed from: y, reason: collision with root package name */
    public final q74.b0 f228795y;

    /* renamed from: z, reason: collision with root package name */
    public w64.n f228796z;

    /* renamed from: w, reason: collision with root package name */
    public final z74.i f228793w = new z74.i();

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Rect f228785J = new android.graphics.Rect();
    public final android.graphics.Point K = new android.graphics.Point();
    public final int[] N = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public final int[] R = new int[2];
    public final d94.a S = new dc4.m0(this);

    public o0(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var) {
        this.f228831d = timeLineObject;
        this.f228832e = snsInfo;
        this.f228838n = iVar;
        this.f228792v = b1Var;
        this.f228795y = new q74.b0(2);
    }

    public static /* synthetic */ int[] l(dc4.o0 o0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    public static /* synthetic */ android.graphics.Rect m(dc4.o0 o0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        android.graphics.Rect rect = o0Var.f228785J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return rect;
    }

    public static /* synthetic */ int[] n(dc4.o0 o0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.P;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    public static /* synthetic */ int[] o(dc4.o0 o0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    public static /* synthetic */ int[] p(dc4.o0 o0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        int[] iArr = o0Var.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return iArr;
    }

    @Override // z84.h
    public void a(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            q74.b0 b0Var = this.f228795y;
            if (b0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = b0Var.d(i17);
                if (d17 != null) {
                    d17.f360393f++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            q(view, this.f228832e, i17);
            q74.b0 b0Var = this.f228795y;
            if (b0Var != null) {
                b0Var.g(i17);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            s(view, view2);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardDetailItem", "the init view failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228832e;
            if (snsInfo != null) {
                java.lang.String T = ca4.z0.T(snsInfo);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.f228795y);
                }
            }
            q74.d0 d0Var = this.M;
            if (d0Var != null) {
                d0Var.c();
            }
            q74.b1 b1Var = this.f228794x;
            if (b1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f360428k.removeCallbacksAndMessages(null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            com.tencent.mm.plugin.sns.storage.ADXml adXml = this.f228832e.getAdXml();
            boolean z17 = (adXml == null || adXml.touchParticleAnimConfig == null || this.I == null) ? false : true;
            int totalTouchDuration = (int) this.f228790t.getTotalTouchDuration();
            int totalTouchCount = this.f228790t.getTotalTouchCount();
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView = this.f228790t;
            adSlideRecyclerView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            com.tencent.mars.xlog.Log.i("AdSlideRecyclerView", "reset");
            adSlideRecyclerView.f163211c2 = 0L;
            adSlideRecyclerView.f163213e2 = 0L;
            adSlideRecyclerView.f163212d2 = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            a84.t0.a(new q74.v(this.f228832e, 2, totalTouchDuration, totalTouchCount, z17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardDetailItem", "reportTouchDuration, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // z84.h
    public void f(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemProductClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        q74.b0 b0Var = this.f228795y;
        if (b0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            q74.a0 d17 = b0Var.d(i17);
            if (d17 != null) {
                d17.f360401n++;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemProductClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            super.g();
            q74.b1 b1Var = this.f228794x;
            if (b1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f360419b = false;
                z74.i iVar = b1Var.f360420c;
                if (iVar != null) {
                    try {
                        iVar.d();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f228791u;
            if (cardLayoutManager != null) {
                cardLayoutManager.o();
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        q74.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            s34.a1 a1Var = this.f228832e.getAdXml().adSliderFullCardInfo;
            if (s34.z0.d(this.f228832e) && this.M == null) {
                this.M = new q74.d0(this.f228786p, r(), this.f228789s, this.f228836i, this.f228792v, this.f228796z, this.f228790t, this);
            }
            q74.d0 d0Var = this.M;
            if (d0Var != null && (b1Var = this.f228794x) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSlideFullCardBreakFrameLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f360424g = d0Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSlideFullCardBreakFrameLogic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                this.M.a(this.f228832e);
            }
            if (a1Var != null && a1Var.overSlideJumpInfo != null) {
                if (this.E == null) {
                    this.E = new w64.n(this.f228786p, r(), this.f228792v, null, null);
                }
                if (this.C == null) {
                    q74.c0 c0Var = new q74.c0();
                    c0Var.f360431a = this.f228790t;
                    c0Var.f360432b = this.F;
                    c0Var.f360433c = this.f228794x;
                    c0Var.f360434d = this.f228791u;
                    c0Var.f360435e = this.D;
                    c0Var.f360436f = this.E;
                    c0Var.f360437g = this.f228795y;
                    c0Var.f360438h = this.G;
                    c0Var.f360439i = this.f228788r;
                    this.C = new q74.z(this.f228786p, c0Var);
                }
            }
            q74.z zVar = this.C;
            if (zVar != null) {
                zVar.d(this.f228832e, a1Var);
            }
            q74.t0.a(this.f228787q, this.A, this.B, null, this.f228788r, r());
            if (this.f228794x != null) {
                l44.b3.f316041a.h(this.f228832e);
                this.f228794x.l(this.f228791u);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    public void q(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        s34.a1 a1Var = snsInfo.getAdXml().adSliderFullCardInfo;
        java.util.List<s34.x0> list = a1Var.resInfoList;
        if (list == null || list.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        s34.x0 x0Var = a1Var.resInfoList.get(i17);
        if (x0Var == null || x0Var.clickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        int a17 = a1Var.a(i17);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = x0Var.clickActionInfo;
        adClickActionInfo.f162569a = 3;
        this.f228796z.o(adClickActionInfo, snsInfo, a17);
        this.f228796z.k(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }

    public final int r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        i64.b1 b1Var = this.f228792v;
        if (b1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return 1;
        }
        int i17 = b1Var.f289095j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        return i17;
    }

    public void s(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        d94.f fVar;
        android.widget.FrameLayout frameLayout;
        android.view.View view3;
        android.view.ViewStub viewStub;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        if (view == null || (snsInfo = this.f228832e) == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardDetailItem", "the content view is null??? the init view can't complete!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        s34.a1 a1Var = this.f228832e.getAdXml().adSliderFullCardInfo;
        if (a1Var == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardDetailItem", "the adSliderFullCardInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            return;
        }
        q74.b0 b0Var = this.f228795y;
        if (b0Var != null) {
            b0Var.f(this.f228832e, r(), a1Var);
        }
        this.f228787q = view;
        this.f228786p = view.getContext();
        this.f228789s = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view.findViewById(com.tencent.mm.R.id.n5p);
        this.f228790t = (com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView) view.findViewById(com.tencent.mm.R.id.n5o);
        this.F = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.qpg);
        this.A = (android.view.ViewGroup) this.f228836i.findViewById(com.tencent.mm.R.id.n_6);
        this.B = (android.view.ViewGroup) this.f228836i.findViewById(com.tencent.mm.R.id.afc);
        this.L = this.f228836i.findViewById(com.tencent.mm.R.id.f482668kq);
        if (this.f228790t != null) {
            this.f228788r = q74.t0.c(this.f228786p, r(), this.f228839o);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin += i65.a.b(this.f228786p, 8);
                view.setLayoutParams(layoutParams2);
            }
            this.f228790t.setHasFixedSize(true);
            this.f228791u = new com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager(this.f228790t);
            q74.b1 b1Var = new q74.b1(this.f228793w, b0Var, r());
            this.f228794x = b1Var;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f228832e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            b1Var.f360421d = snsInfo2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            z84.k kVar = new z84.k(i65.a.b(this.f228786p, 12), i65.a.b(this.f228786p, 8));
            this.D = kVar;
            this.f228791u.D(kVar);
            this.f228791u.E(this.f228794x);
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f228791u;
            int r17 = r();
            cardLayoutManager.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            cardLayoutManager.f163798y = r17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            this.f228790t.setLayoutManager(this.f228791u);
            this.f228796z = new w64.n(this.f228786p, r(), this.f228792v, null, new dc4.n0(this));
            q74.x0 x0Var = new q74.x0(this.f228790t, this.f228832e, new w64.n(this.f228786p, r(), this.f228792v, null, new dc4.n0(this)));
            x0Var.y(this.f228788r);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            android.graphics.Point point = new android.graphics.Point(x0Var.f360566n, x0Var.f360567o);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            this.G = point;
            x0Var.setHasStableIds(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            x0Var.f360563h = this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemActionBtnClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            x0Var.f360564i = this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemActionBtnClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            this.f228790t.setAdapter(x0Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        i64.b1 b1Var2 = this.f228792v;
        if (b1Var2 != null) {
            java.lang.String T = ca4.z0.T(this.f228832e);
            if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                b1Var2.a(T, this);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        try {
            com.tencent.mm.plugin.sns.storage.ADXml adXml = this.f228832e.getAdXml();
            if (adXml == null || adXml.touchParticleAnimConfig == null) {
                this.f228790t.setTouchEventProxy(null);
                fVar = null;
            } else {
                if (this.I == null && (view3 = this.f228837m) != null && (viewStub = (android.view.ViewStub) view3.findViewById(com.tencent.mm.R.id.f482637jv)) != null) {
                    this.I = (android.widget.FrameLayout) viewStub.inflate();
                }
                if (this.H == null && (frameLayout = this.I) != null) {
                    this.H = new d94.g(this.f228786p, frameLayout, this.S, 2);
                }
                fVar = adXml.touchParticleAnimConfig;
                this.f228790t.setTouchEventProxy(this.H);
            }
            d94.g gVar = this.H;
            if (gVar != null) {
                gVar.b(fVar);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardDetailItem", "touch anim exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
    }
}

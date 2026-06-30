package p74;

/* loaded from: classes4.dex */
public final class f extends dc4.v implements i64.k0, p74.a {
    public w64.n A;
    public p74.o B;
    public p74.i C;
    public w64.n D;
    public android.view.ViewStub E;
    public int F;
    public android.view.ViewStub G;
    public a44.k H;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f352534p;

    /* renamed from: q, reason: collision with root package name */
    public final i64.b1 f352535q;

    /* renamed from: r, reason: collision with root package name */
    public final android.app.Activity f352536r;

    /* renamed from: s, reason: collision with root package name */
    public final int f352537s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f352538t;

    /* renamed from: u, reason: collision with root package name */
    public int f352539u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView f352540v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager f352541w;

    /* renamed from: x, reason: collision with root package name */
    public final z74.i f352542x;

    /* renamed from: y, reason: collision with root package name */
    public p74.w f352543y;

    /* renamed from: z, reason: collision with root package name */
    public final q74.b0 f352544z;

    public f(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        this.f352534p = snsInfo;
        this.f352535q = b1Var;
        this.f352536r = mActivity;
        this.f352537s = i17;
        this.f352542x = new z74.i();
        this.F = 1;
        this.f228831d = timeLineObject;
        this.f228832e = snsInfo;
        this.f228838n = iVar;
        this.f352544z = new q74.b0(2);
    }

    @Override // p74.a
    public void M(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            l(null, this.f228832e, i17);
            q74.b0 b0Var = this.f352544z;
            if (b0Var != null) {
                b0Var.g(i17);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardDetailItem", "onItemClick error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            m(view, view2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardDetailItem", "initView error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        java.lang.String uxinfo;
        java.lang.Integer num;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f352534p;
        q74.b0 b0Var = this.f352544z;
        if (snsInfo != null) {
            try {
                java.lang.String T = ca4.z0.T(snsInfo);
                if (!android.text.TextUtils.isEmpty(T) && kotlin.jvm.internal.o.b(T, str)) {
                    a84.t0.a(b0Var);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardDetailItem", "onAdRemoved error: " + th6.getMessage());
            }
        }
        if (snsInfo != null && (uxinfo = snsInfo.getUxinfo()) != null) {
            if (b0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                int i17 = b0Var.f360416i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                num = java.lang.Integer.valueOf(i17);
            } else {
                num = null;
            }
            a84.t0.a(new ca4.a(uxinfo, 2, 1569, null, num, 8, null));
        }
        p74.w wVar = this.f352543y;
        if (wVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.f352615i.removeCallbacksAndMessages(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        }
        if (b0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            b0Var.f360417j = -1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        z74.i iVar = this.f352542x;
        if (iVar != null) {
            iVar.j();
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView = this.f352540v;
        int totalTouchDuration = adSlideCardRecyclerView != null ? (int) adSlideCardRecyclerView.getTotalTouchDuration() : 0;
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView2 = this.f352540v;
        int totalTouchCount = adSlideCardRecyclerView2 != null ? adSlideCardRecyclerView2.getTotalTouchCount() : 0;
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView3 = this.f352540v;
        if (adSlideCardRecyclerView3 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardRecyclerView", "reset");
            adSlideCardRecyclerView3.f163206b2 = 0L;
            adSlideCardRecyclerView3.f163208d2 = 0L;
            adSlideCardRecyclerView3.f163207c2 = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        }
        a84.t0.a(new q74.v(this.f352534p, 1, totalTouchDuration, totalTouchCount, false));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            super.g();
            p74.w wVar = this.f352543y;
            if (wVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                wVar.f352611e = false;
                z74.i iVar = wVar.f352607a;
                if (iVar != null) {
                    iVar.d();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager = this.f352541w;
            if (adSlideCardLayoutManager != null) {
                adSlideCardLayoutManager.o();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardDetailItem", "onPause error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        java.util.List<s34.x0> list;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228832e;
            s34.a1 a1Var = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adSliderFullCardInfo;
            this.F = p74.k.d((a1Var == null || (list = a1Var.resInfoList) == null) ? null : (s34.x0) kz5.n0.Z(list));
            if ((a1Var != null ? a1Var.overSlideJumpInfo : null) != null) {
                if (this.D == null) {
                    this.D = new w64.n(this.f352536r, this.f352537s, this.f352535q, null, null);
                }
                if (this.B == null) {
                    p74.d dVar = new p74.d();
                    dVar.f352526a = this.f352540v;
                    dVar.f352527b = this.E;
                    dVar.f352528c = this.f352543y;
                    dVar.f352529d = this.f352541w;
                    dVar.f352530e = this.C;
                    dVar.f352531f = this.D;
                    dVar.f352532g = this.f352544z;
                    this.B = new p74.o(this.f352536r, dVar, this.F);
                }
            }
            p74.o oVar = this.B;
            if (oVar != null) {
                oVar.c(this.f228832e, a1Var, this.F);
            }
            p74.k.a(this.f352538t, null, null, null, this.f352539u, this.f352537s);
            p74.w wVar = this.f352543y;
            if (wVar != null) {
                wVar.l(this.f352541w);
            }
            if (this.H == null) {
                this.H = new a44.k(this.G, this.f228834g);
            }
            a44.k kVar = this.H;
            if (kVar != null) {
                android.view.View view = this.f228837m;
                kVar.g(view != null ? view.getContext() : null, this.f228832e, this.f352539u);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardDetailItem", "refreshView error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    public final void l(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager = this.f352541w;
        int p17 = adSlideCardLayoutManager != null ? adSlideCardLayoutManager.p() : -1;
        if (i17 > p17 && p17 >= 0) {
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager2 = this.f352541w;
            if (adSlideCardLayoutManager2 != null) {
                adSlideCardLayoutManager2.F();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f352534p;
        s34.a1 a1Var = (snsInfo2 == null || (adXml = snsInfo2.getAdXml()) == null) ? null : adXml.adSliderFullCardInfo;
        if (a1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        s34.x0 x0Var = a1Var.resInfoList.get(i17);
        if (x0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = x0Var.clickActionInfo;
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        adClickActionInfo.f162569a = 3;
        w64.n nVar = this.A;
        if (nVar != null) {
            nVar.o(adClickActionInfo, snsInfo, i17);
        }
        w64.n nVar2 = this.A;
        if (nVar2 != null) {
            nVar2.k(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }

    public final void m(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        if (view == null || (snsInfo = this.f228832e) == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdSlideCardDetailItem", "initViewInternal: contentView or snsInfo or adXml is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f228832e;
        s34.a1 a1Var = (snsInfo2 == null || (adXml = snsInfo2.getAdXml()) == null) ? null : adXml.adSliderFullCardInfo;
        if (a1Var == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdSlideCardDetailItem", "initViewInternal: adSliderFullCardInfo is null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
            return;
        }
        this.f228834g = view2;
        q74.b0 b0Var = this.f352544z;
        int i17 = this.f352537s;
        if (b0Var != null) {
            b0Var.f(this.f228832e, i17, a1Var);
        }
        this.f352538t = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        this.f352540v = (com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView) view.findViewById(com.tencent.mm.R.id.v7t);
        this.E = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.v7f);
        if (this.f352540v != null) {
            this.f352539u = p74.k.b(this.f352536r, i17, this.f228839o);
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView = this.f352540v;
            if (adSlideCardRecyclerView != null) {
                adSlideCardRecyclerView.setHasFixedSize(true);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView2 = this.f352540v;
            if (adSlideCardRecyclerView2 != null) {
                adSlideCardRecyclerView2.setOverScrollMode(2);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView3 = this.f352540v;
            if (adSlideCardRecyclerView3 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
                return;
            }
            this.f352541w = new com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager(adSlideCardRecyclerView3);
            p74.w wVar = new p74.w(this.f352542x, b0Var, i17);
            this.f352543y = wVar;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f228832e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.f352614h = snsInfo3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            java.util.List<s34.x0> list = a1Var.resInfoList;
            int d17 = p74.k.d(list != null ? (s34.x0) kz5.n0.Z(list) : null);
            this.F = d17;
            p74.j c17 = p74.k.c(d17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            float f17 = c17.f352564a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            float f18 = c17.f352565b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
            p74.i iVar = new p74.i(f17, f18, 28.0f, 24.0f, this.F, 0.0f, 0.0f, 96, null);
            this.C = iVar;
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager = this.f352541w;
            if (adSlideCardLayoutManager != null) {
                adSlideCardLayoutManager.D(iVar);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager2 = this.f352541w;
            if (adSlideCardLayoutManager2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                adSlideCardLayoutManager2.f163798y = 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSource", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager3 = this.f352541w;
            if (adSlideCardLayoutManager3 != null) {
                adSlideCardLayoutManager3.E(this.f352543y);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager4 = this.f352541w;
            if (adSlideCardLayoutManager4 != null) {
                adSlideCardLayoutManager4.C(false);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView4 = this.f352540v;
            if (adSlideCardRecyclerView4 != null) {
                adSlideCardRecyclerView4.setLayoutManager(this.f352541w);
            }
            this.A = new w64.n(this.f352536r, this.f352537s, this.f352535q, null, new p74.e(this));
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView5 = this.f352540v;
            kotlin.jvm.internal.o.d(adSlideCardRecyclerView5);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = this.f228832e;
            kotlin.jvm.internal.o.d(snsInfo4);
            p74.c cVar = new p74.c(adSlideCardRecyclerView5, snsInfo4);
            cVar.setHasStableIds(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            cVar.f352524h = this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView6 = this.f352540v;
            if (adSlideCardRecyclerView6 != null) {
                adSlideCardRecyclerView6.setAdapter(cVar);
            }
        }
        this.G = (android.view.ViewStub) this.f228836i.findViewById(com.tencent.mm.R.id.g6y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        i64.b1 b1Var = this.f352535q;
        if (b1Var != null) {
            java.lang.String T = ca4.z0.T(this.f228832e);
            if (!android.text.TextUtils.isEmpty(T) && !kotlin.jvm.internal.o.b(T, "0")) {
                b1Var.a(T, this);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardDetailItem");
    }
}

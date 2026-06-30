package dc4;

/* loaded from: classes4.dex */
public class x0 extends dc4.v implements z84.i, i64.k0 {
    public w74.h A;
    public w74.c C;
    public final w74.b D;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f228854p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f228855q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f228856r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f228857s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f228858t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f228859u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout f228860v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f228861w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f228862x;

    /* renamed from: y, reason: collision with root package name */
    public final i64.b1 f228863y;

    /* renamed from: z, reason: collision with root package name */
    public final z74.i f228864z = new z74.i();
    public final w74.d B = new w74.d();

    public x0(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var) {
        this.f228831d = timeLineObject;
        this.f228832e = snsInfo;
        this.f228838n = iVar;
        this.f228863y = b1Var;
        this.D = new w74.b(2);
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            l(view, this.f228832e);
            w74.b bVar = this.D;
            if (bVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                w74.a d17 = bVar.d(i17);
                if (d17 != null) {
                    d17.f443509d++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            m(view, view2);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.TopicCardDetail", "the init view failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f228832e;
            if (snsInfo != null) {
                java.lang.String T = ca4.z0.T(snsInfo);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.D);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            super.g();
            w74.h hVar = this.A;
            if (hVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                hVar.f443552b = false;
                z74.i iVar = hVar.f443553c;
                if (iVar != null) {
                    try {
                        iVar.d();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            }
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f228862x;
            if (cardLayoutManager != null) {
                cardLayoutManager.o();
            }
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        try {
            w74.h hVar = this.A;
            if (hVar != null) {
                hVar.g(this.f228862x);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    public void l(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        android.content.Context context = this.f228854p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        v64.c a17 = v64.a.a(5, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        if (a17 != null) {
            v64.d dVar = new v64.d();
            i64.b1 b1Var = this.f228863y;
            if (b1Var != null) {
                dVar.a("sns_ad_statistic", b1Var);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            if (b1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = b1Var.f289095j;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = 1;
            }
            a17.a(view, i17, snsInfo, dVar);
        }
        w74.c cVar = this.C;
        if (cVar != null) {
            cVar.a(snsInfo, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }

    public void m(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        if (view == null || (snsInfo = this.f228832e) == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDetail", "the content view is null??? the init view can't complete!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            return;
        }
        s34.h0 h0Var = this.f228832e.getAdXml().adFinderTopicInfo;
        if (h0Var == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.TopicCardDetail", "the adFinderTopicInfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            return;
        }
        i64.b1 b1Var = this.f228863y;
        w74.b bVar = this.D;
        if (bVar != null) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f228832e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            if (b1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = b1Var.f289095j;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSource", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
                i17 = 1;
            }
            bVar.e(snsInfo2, i17, h0Var);
        }
        this.f228854p = view.getContext();
        this.f228855q = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view.findViewById(com.tencent.mm.R.id.n3c);
        this.f228856r = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.n3b);
        this.f228858t = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n39);
        this.f228859u = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n3a);
        this.f228860v = (com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout) view.findViewById(com.tencent.mm.R.id.n38);
        this.f228861w = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.n37);
        this.f228857s = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.n3_);
        android.widget.ImageView imageView = this.f228858t;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.raw.sns_ad_finder_topic_item_rear_flag);
        }
        android.view.ViewGroup viewGroup = this.f228857s;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new dc4.w0(this));
        }
        a84.y0.l(this.f228859u, h0Var.f402653c);
        a84.y0.l(this.f228861w, h0Var.f402654d);
        com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout stackUpLayout = this.f228860v;
        if (stackUpLayout != null) {
            stackUpLayout.setStackUpWidthSize(i65.a.b(this.f228854p, 6));
            int b17 = i65.a.b(this.f228854p, 20);
            com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout stackUpLayout2 = this.f228860v;
            stackUpLayout2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            stackUpLayout2.f163879e = b17;
            stackUpLayout2.f163880f = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            this.B.c(this.f228860v, this.f228832e);
        }
        if (this.f228855q != null) {
            float b18 = i65.a.b(this.f228854p, 8);
            this.f228855q.b(b18, b18, 0.0f, 0.0f);
        }
        if (this.f228856r != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetRecyclerViewLayoutParams", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f228856r;
            if (recyclerView != null && (layoutParams = recyclerView.getLayoutParams()) != null) {
                layoutParams.height = i65.a.b(this.f228854p, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetRecyclerViewLayoutParams", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
            this.f228862x = new com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager(this.f228856r);
            w74.h hVar = new w74.h(this.f228864z, bVar);
            this.A = hVar;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f228832e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            hVar.f443554d = snsInfo3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            this.f228862x.D(new z84.g(i65.a.b(this.f228854p, 12), i65.a.b(this.f228854p, 8)));
            this.f228862x.E(this.A);
            this.f228856r.setLayoutManager(this.f228862x);
            w74.e eVar = new w74.e(this.f228856r, this.f228832e);
            eVar.setHasStableIds(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            eVar.f443538h = this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            this.f228856r.setAdapter(eVar);
        }
        android.content.Context context = this.f228854p;
        if (context instanceof android.app.Activity) {
            w74.c cVar = new w74.c((android.app.Activity) context, this.f228861w, this.f228856r);
            this.C = cVar;
            cVar.a(this.f228832e, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        if (b1Var != null) {
            java.lang.String T = ca4.z0.T(this.f228832e);
            if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                b1Var.a(T, this);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViewInternal", "com.tencent.mm.plugin.sns.ui.detail.item.TopicCardDetailItem");
    }
}

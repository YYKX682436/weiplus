package n94;

/* loaded from: classes4.dex */
public final class a extends android.widget.FrameLayout implements tc4.s0 {

    /* renamed from: d, reason: collision with root package name */
    public h94.c f335920d;

    /* renamed from: e, reason: collision with root package name */
    public l94.n f335921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
    }

    @Override // tc4.s0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }

    @Override // tc4.s0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }

    @Override // tc4.s0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }

    @Override // tc4.s0
    public boolean f(in5.s0 holder, zc4.b item, int i17) {
        h94.a r17;
        l94.n nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measure", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        xc4.p n17 = item.n();
        java.lang.String str = null;
        h94.c cVar = n17 instanceof h94.c ? (h94.c) n17 : null;
        if (cVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measure", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        h94.a r18 = cVar.r1();
        java.lang.String d17 = r18 != null ? r18.d() : null;
        boolean z17 = false;
        if (d17 == null || d17.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        } else {
            h94.a r19 = cVar.r1();
            java.lang.String d18 = r19 != null ? r19.d() : null;
            h94.c cVar2 = this.f335920d;
            if (cVar2 != null && (r17 = cVar2.r1()) != null) {
                str = r17.d();
            }
            z17 = !kotlin.jvm.internal.o.b(d18, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        }
        this.f335920d = cVar;
        if (this.f335921e == null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            l94.n nVar2 = new l94.n(context);
            this.f335921e = nVar2;
            addView(nVar2.d());
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("WsFoldAdItem", "item changed");
            h94.a r110 = cVar.r1();
            if (r110 != null && (nVar = this.f335921e) != null) {
                nVar.c(r110);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measure", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return z17;
    }

    @Override // tc4.s0
    public java.lang.Object g(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return f0Var;
    }

    @Override // tc4.s0
    public zc4.b getImproveListItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return null;
    }

    @Override // tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return f0Var;
    }

    @Override // tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        return "WsFoldAdItem";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        h94.a r17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
        super.onAttachedToWindow();
        h94.c cVar = this.f335920d;
        if (cVar != null && (r17 = cVar.r1()) != null) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            f94.a aVar = (f94.a) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(f94.a.class);
            aVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            if (getParent() == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f260531e;
                if (concurrentHashMap != null) {
                }
                java.lang.String viewId = r17.d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerView$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                k94.j jVar = aVar.f260532d;
                jVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                kotlin.jvm.internal.o.g(viewId, "viewId");
                if (viewId.length() == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                } else {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.vpm);
                    java.util.HashMap hashMap = jVar.f305961a;
                    java.lang.Object obj = hashMap.get(viewId);
                    if (obj == null) {
                        obj = new k94.h(viewId, this, viewGroup, null);
                        hashMap.put(viewId, obj);
                    }
                    k94.h hVar = (k94.h) obj;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
                    hVar.f305952e = new java.lang.ref.WeakReference(this);
                    hVar.f305953f = new java.lang.ref.WeakReference(viewGroup);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewTrackingItem");
                    jVar.d(hVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerView", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerView$default", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager");
                k94.c cVar2 = k94.c.f305940a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                k94.c.f305941b.put(r17.d(), new k94.b(false, 0L, 0L, false, 15, null));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdExposeStatistic");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdAdded", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.wsfold.ui.feed.WsFoldAdItem");
    }
}

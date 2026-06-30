package l94;

/* loaded from: classes4.dex */
public final class b0 extends l94.e implements k94.g {

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f317322h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f317323i;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f317324j;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.Handler f317325k;

    /* renamed from: l, reason: collision with root package name */
    public long f317326l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f317327m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f317328n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f317329o;

    /* renamed from: p, reason: collision with root package name */
    public int f317330p;

    /* renamed from: q, reason: collision with root package name */
    public int f317331q;

    /* renamed from: r, reason: collision with root package name */
    public int f317332r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context) {
        super("WsFoldRecyclerAdComponent", context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f317325k = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f317326l = 1700L;
        this.f317327m = new l94.w(this);
        this.f317328n = "";
    }

    public static final float n(l94.b0 b0Var) {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        b0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        androidx.recyclerview.widget.RecyclerView recyclerView = b0Var.f317322h;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager scaleLayoutManager = layoutManager instanceof com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager ? (com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager) layoutManager : null;
        if (scaleLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            f17 = 0.0f;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollRange", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            int i17 = scaleLayoutManager.f163985p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollRange", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snapToNearest", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            float b17 = a06.d.b(scaleLayoutManager.f163984o / scaleLayoutManager.f163985p) * scaleLayoutManager.f163985p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snapToNearest", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            float f18 = scaleLayoutManager.f163984o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            float f19 = f18 - b17;
            float f27 = i17;
            if (f19 > f27 * 0.5f) {
                b17 += f27;
            } else if (f19 < (-i17) * 0.5f) {
                b17 -= f27;
            }
            f17 = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$calcSnapTarget", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        return f17;
    }

    @Override // k94.g
    public void a(java.lang.String viewId, k94.i status, double d17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(status, "status");
        if (!kotlin.jvm.internal.o.b(viewId, this.f317328n)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i(h(), "feed become visible");
        } else if (ordinal == 1) {
            com.tencent.mars.xlog.Log.i(h(), "feed become invisible");
            q(viewId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            r(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        } else if (ordinal == 3) {
            com.tencent.mars.xlog.Log.i(h(), "feed material ratio become changed, exposureRatio is " + d17);
            if (d17 < 1.0d) {
                p();
            } else {
                s();
            }
        } else if (ordinal == 4) {
            com.tencent.mars.xlog.Log.i(h(), "feed removed");
            p();
            android.animation.ValueAnimator valueAnimator = this.f317324j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            q(viewId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewVisibilityChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e(h(), "the fold sns info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        java.util.LinkedList linkedList = b17.f372071d;
        boolean z17 = false;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e(h(), "the fold media info list is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        if (!(linkedList == null || linkedList.isEmpty())) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    z17 = true;
                    break;
                } else if (((r45.i96) it.next()) == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    break;
                }
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkMediaInfoListNotNull", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e(h(), "the internal fold media info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        this.f317328n = adInfo.d();
        android.content.Context context = f();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        f94.a aVar = (f94.a) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(f94.a.class);
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibilityManager", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibilityManager", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        aVar.f260532d.a(this);
        int size = linkedList.size();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f317322h;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            android.content.Context context2 = recyclerView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager scaleLayoutManager = new com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager(context2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRealItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            scaleLayoutManager.f163982m = size;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRealItemCount", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            recyclerView.setLayoutManager(scaleLayoutManager);
            m94.b bVar = new m94.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
            bVar.f325068d = linkedList;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleRecyclerAdapter");
            recyclerView.setAdapter(bVar);
        }
        int i17 = b17.f372087w;
        if (i17 > 0) {
            this.f317326l = i17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        r(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToCenter$default", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupListeners", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        if (!this.f317329o) {
            this.f317329o = true;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f317322h;
            if (recyclerView2 != null) {
                recyclerView2.P(new l94.x(this));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f317322h;
            if (recyclerView3 != null) {
                recyclerView3.setOnClickListener(new l94.y(b17, adInfo));
            }
            androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f317322h;
            if (recyclerView4 != null) {
                recyclerView4.i(new l94.z(this));
            }
            java.lang.Object f17 = f();
            androidx.lifecycle.y yVar = f17 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) f17 : null;
            if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
                mo133getLifecycle.a(new androidx.lifecycle.v() { // from class: com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$4

                    /* renamed from: d, reason: collision with root package name */
                    public boolean f163972d;

                    @Override // androidx.lifecycle.v
                    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$4");
                        kotlin.jvm.internal.o.g(source, "source");
                        kotlin.jvm.internal.o.g(event, "event");
                        l94.b0 b0Var = l94.b0.this;
                        b0Var.h();
                        event.toString();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTraceId$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                        int i18 = l94.a0.f317321a[event.ordinal()];
                        if (i18 == 1) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            b0Var.p();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            android.animation.ValueAnimator valueAnimator = b0Var.f317324j;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            source.mo133getLifecycle().c(this);
                        } else if (i18 == 2) {
                            this.f163972d = true;
                            b0Var.r(false);
                        } else if (i18 == 3) {
                            if (this.f163972d) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                                b0Var.s();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                            }
                            this.f163972d = false;
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$4");
                    }
                });
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupListeners", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        s();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(f());
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -1));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -1;
            frameLayout.setLayoutParams(layoutParams2);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = new androidx.recyclerview.widget.RecyclerView(frameLayout.getContext(), null);
        recyclerView.setOverScrollMode(2);
        this.f317322h = recyclerView;
        c44.a.l();
        c44.a.l();
        frameLayout.addView(recyclerView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        return frameLayout;
    }

    public final void o(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        android.animation.ValueAnimator valueAnimator = this.f317324j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (ca4.n0.c(f())) {
            com.tencent.mars.xlog.Log.w(h(), "animateSnapToPx, but activity is finish");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f317322h;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager scaleLayoutManager = layoutManager instanceof com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager ? (com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager) layoutManager : null;
        if (scaleLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        float f18 = scaleLayoutManager.f163984o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        e0Var.f310115d = f18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        float f19 = scaleLayoutManager.f163984o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f19, f17);
        ofFloat.setDuration(700L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f));
        ofFloat.addUpdateListener(new l94.u(e0Var, this));
        ofFloat.addListener(new l94.v(this));
        ofFloat.start();
        this.f317324j = ofFloat;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        this.f317325k.removeCallbacks(this.f317327m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void q(java.lang.String traceId) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        if (this.f317330p == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        kotlin.jvm.internal.o.g(traceId, "traceId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f94.a.f260531e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdInfoMap$cp", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC");
        h94.a aVar = concurrentHashMap != null ? (h94.a) concurrentHashMap.get(traceId) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFoldAdInfo", "com.tencent.mm.plugin.sns.ad.wsfold.WsFoldAdBizUIC$Companion");
        if (aVar == null || (str = aVar.e()) == null) {
            str = "";
        }
        a84.t0.a(new ca4.a(str, 3, 1570, null, java.lang.Integer.valueOf(this.f317330p), 8, null));
        this.f317330p = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void r(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        p();
        android.animation.ValueAnimator valueAnimator = this.f317324j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f317322h;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager scaleLayoutManager = layoutManager instanceof com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager ? (com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager) layoutManager : null;
        if (scaleLayoutManager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f317322h;
        java.lang.Object adapter = recyclerView2 != null ? recyclerView2.getAdapter() : null;
        m94.b bVar = adapter instanceof m94.b ? (m94.b) adapter : null;
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        int x17 = (1073741823 - (1073741823 % bVar.x())) + (!z17 ? scaleLayoutManager.n() : 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(x17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(scaleLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent", "resetToCenter", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        int intValue2 = ((java.lang.Integer) arrayList.get(1)).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        scaleLayoutManager.f163986q = intValue;
        scaleLayoutManager.f163987r = intValue2;
        scaleLayoutManager.requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        yj0.a.f(scaleLayoutManager, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent", "resetToCenter", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToCenter", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }

    public final void s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        p();
        if (this.f317330p > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        if (ca4.n0.c(f())) {
            com.tencent.mars.xlog.Log.w(h(), "scheduleAutoScroll, but activity is finish");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f317322h;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        m94.b bVar = adapter instanceof m94.b ? (m94.b) adapter : null;
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            return;
        }
        if (!this.f317323i && bVar.x() > 1) {
            this.f317325k.postDelayed(this.f317327m, this.f317326l);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scheduleAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
    }
}

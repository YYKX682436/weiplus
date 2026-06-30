package com.tencent.mm.plugin.sns.ad.widget.recyclerview;

/* loaded from: classes4.dex */
public class CardLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public int f163780d;

    /* renamed from: h, reason: collision with root package name */
    public int f163784h;

    /* renamed from: p, reason: collision with root package name */
    public final z84.a f163789p;

    /* renamed from: r, reason: collision with root package name */
    public z84.d f163791r;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f163793t;

    /* renamed from: u, reason: collision with root package name */
    public z84.c f163794u;

    /* renamed from: y, reason: collision with root package name */
    public int f163798y;

    /* renamed from: e, reason: collision with root package name */
    public int f163781e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f163782f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final int f163783g = 3;

    /* renamed from: i, reason: collision with root package name */
    public int f163785i = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f163786m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public float f163787n = 0.0f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f163788o = true;

    /* renamed from: q, reason: collision with root package name */
    public int f163790q = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f163795v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f163796w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f163797x = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f163799z = true;

    /* renamed from: s, reason: collision with root package name */
    public final z84.e f163792s = new z84.e(this);

    public CardLayoutManager(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f163793t = recyclerView;
        if (recyclerView == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.CardLayoutManager", "the layout manager will not work properly, because of null recycler view!!!");
            return;
        }
        recyclerView.setOnFlingListener(new z84.b(this));
        this.f163789p = new z84.a(recyclerView.getContext(), this);
        com.tencent.mars.xlog.Log.i("SnsAd.CardLayoutManager", "new CardLayoutManager, and recyclerView hashCode is " + recyclerView.hashCode());
    }

    public void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z84.a aVar = this.f163789p;
            if (aVar != null) {
                aVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollImmediately", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                android.os.Handler handler = aVar.f470762d;
                if (handler != null) {
                    aVar.a();
                    handler.sendEmptyMessage(0);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollImmediately", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void B(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("scrollToNextItemDelay: millis=");
            sb6.append(j17);
            sb6.append(", mCardRecyclerViewScrollHelper=");
            z84.a aVar = this.f163789p;
            sb6.append(aVar != null);
            com.tencent.mars.xlog.Log.i("SnsAd.CardLayoutManager", sb6.toString());
            if (aVar != null && j17 > 0) {
                aVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delayScroll", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                android.os.Handler handler = aVar.f470762d;
                if (handler != null) {
                    aVar.a();
                    handler.sendEmptyMessageDelayed(0, j17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delayScroll", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void C(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f163799z = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void D(z84.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayoutHelper", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f163791r = dVar;
        if (dVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            dVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            dVar.f470767c = this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLayoutHelper", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void E(z84.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f163794u = cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void F() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("smoothScrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (this.f163795v && (recyclerView = this.f163793t) != null && recyclerView.isAttachedToWindow()) {
            int i17 = this.f163786m + 1;
            this.f163797x = 1;
            com.tencent.mars.xlog.Log.i("SnsAd.CardLayoutManager", "smoothScrollToNextItem: scrolling to position " + i17);
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f163793t;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager", "smoothScrollToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView2.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/CardLayoutManager", "smoothScrollToNextItem", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        } else {
            com.tencent.mars.xlog.Log.w("SnsAd.CardLayoutManager", "smoothScrollToNextItem: conditions not met, skip scrolling");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollToNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public int G(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i18 = this.f163784h;
        if (i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
        if (i17 >= 0) {
            int i19 = i17 % i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i19;
        }
        if (i17 % i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
        int i27 = i18 + (i17 % i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("virtualPositionToAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return i27;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        boolean z17 = this.f163781e > 0 && this.f163782f > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return z17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return layoutParams;
    }

    public void m(androidx.recyclerview.widget.z2 z2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        z84.d dVar = this.f163791r;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        android.view.View f17 = z2Var.f(0);
        dVar.a(f17);
        addView(f17);
        measureChildWithMargins(f17, 0, 0);
        this.f163781e = getDecoratedMeasuredWidth(f17);
        this.f163782f = getDecoratedMeasuredHeight(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibleCount", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        dVar.f470768d = this.f163783g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibleCount", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        int i17 = this.f163781e;
        int i18 = this.f163782f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        dVar.f470765a = i17;
        dVar.f470766b = i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateChildViewSize", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public final int n(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (!this.f163799z && i17 == this.f163784h - 1 && this.f163790q == 2) {
            this.f163790q = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        }
        int i18 = this.f163790q;
        this.f163790q = 0;
        if (i18 == 2) {
            int i19 = i17 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i19;
        }
        if (i18 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        }
        if (q() < 0.5f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        }
        int i27 = i17 + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateFixedPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return i27;
    }

    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelScrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z84.a aVar = this.f163789p;
            if (aVar != null) {
                aVar.a();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelScrollToNextItemDelay", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        super.onDetachedFromWindow(recyclerView, z2Var);
        if (this.f163798y == 0) {
            this.f163780d = 0;
            this.f163786m = Integer.MIN_VALUE;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int b17;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        this.f163795v = false;
        if (h3Var == null || z2Var == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.CardLayoutManager", "the state or recycler is null!!! Right?");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        try {
            b17 = h3Var.b();
            this.f163784h = b17;
            z17 = h3Var.f12065g;
        } catch (java.lang.Throwable unused) {
        }
        if (b17 != 0 && !z17) {
            if (this.f163781e == -1 || this.f163782f == -1) {
                m(z2Var);
            }
            detachAndScrapAttachedViews(z2Var);
            x(z2Var, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        removeAndRecycleAllViews(z2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutCompleted", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            super.onLayoutCompleted(h3Var);
            if (!this.f163795v) {
                y(this.f163786m, this.f163785i, 0);
            }
            this.f163795v = true;
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutCompleted", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z84.d dVar = this.f163791r;
            if (dVar == null || !dVar.c(z2Var, h3Var, i17, i18)) {
                super.onMeasure(z2Var, h3Var, i17, i18);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            z(i17);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public int p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            if (this.f163795v) {
                int G = G(this.f163786m);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                return G;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return -1;
    }

    public float q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i17 = this.f163781e;
        if (i17 <= 0 || this.f163782f <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0.0f;
        }
        int i18 = this.f163780d;
        if (i18 >= 0) {
            float f17 = ((i18 % i17) * 1.0f) / i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return f17;
        }
        if (i18 % i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0.0f;
        }
        float f18 = (((i18 % i17) * 1.0f) / i17) + 1.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewScrollPercent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return f18;
    }

    public int r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i17 = this.f163781e;
        if (i17 <= 0 || this.f163782f <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
        int floor = (int) java.lang.Math.floor((this.f163780d * 1.0d) / i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return floor;
    }

    public int s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int r17 = r();
        boolean z17 = this.f163799z;
        int i17 = this.f163783g;
        if (z17) {
            int i18 = r17 + i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i18;
        }
        int min = java.lang.Math.min(r17 + i17, this.f163784h - 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return min;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        z84.e eVar = this.f163792s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            android.util.SparseBooleanArray sparseBooleanArray = eVar.f470769a;
            if (sparseBooleanArray == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            } else {
                for (int i18 = 0; i18 < sparseBooleanArray.size(); i18++) {
                    sparseBooleanArray.put(sparseBooleanArray.keyAt(i18), false);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reverseValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            }
            this.f163780d += i17;
            if (!this.f163799z) {
                int t17 = t(this.f163784h - 1) + (i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 64) * 2);
                int i19 = this.f163780d;
                if (i19 > t17) {
                    this.f163780d = t17;
                } else if (i19 < 0) {
                    this.f163780d = 0;
                }
            }
            detachAndScrapAttachedViews(z2Var);
            x(z2Var, i17);
            eVar.a(z2Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return i17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (h3Var == null || this.f163781e == 0 || this.f163782f == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } else if (h3Var.b() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } else {
            recyclerView.smoothScrollBy(t(i17) - this.f163780d, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("smoothScrollToPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        }
    }

    public int t(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i18 = i17 * this.f163781e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return i18;
    }

    public androidx.recyclerview.widget.f2 u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerViewAdapter", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        try {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f163793t;
            if (recyclerView != null) {
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerViewAdapter", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                return adapter;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerViewAdapter", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return null;
    }

    public androidx.recyclerview.widget.k3 v(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f163793t;
        if (recyclerView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return null;
        }
        try {
            for (int childCount = recyclerView.getChildCount() - 1; childCount >= 0; childCount--) {
                android.view.View childAt = recyclerView.getChildAt(childCount);
                if (recyclerView.u0(childAt) == i17) {
                    androidx.recyclerview.widget.k3 w07 = recyclerView.w0(childAt);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                    return w07;
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHolderByAdapterPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return null;
    }

    public boolean w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCurrentLastItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int r17 = r();
        boolean z17 = (s() - r17) + 1 == 1 && r17 == this.f163784h - 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCurrentLastItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        return z17;
    }

    public void x(androidx.recyclerview.widget.z2 z2Var, int i17) {
        int i18;
        z84.e eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (this.f163784h == 0 || this.f163781e <= 0 || this.f163782f <= 0 || this.f163791r == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            return;
        }
        int r17 = r();
        int s17 = s();
        float q17 = q();
        this.f163791r.d();
        int i19 = (s17 - r17) + 1;
        if (this.f163787n > 0.5f && q17 < 0.5f && i17 < 0) {
            q17 = 0.5f;
        }
        int i27 = r17;
        while (i27 <= s17) {
            int G = G(i27);
            if (G >= 0 && G < this.f163784h) {
                android.view.View f17 = z2Var.f(G);
                this.f163791r.a(f17);
                if (f17 != null && (eVar = this.f163792s) != null) {
                    addView(f17, 0);
                    measureChildWithMargins(f17, 0, 0);
                    i18 = s17;
                    this.f163791r.b(this.f163780d, q17, f17, i27 - r17, i17, i19);
                    eVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPositionValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
                    android.util.SparseBooleanArray sparseBooleanArray = eVar.f470769a;
                    if (sparseBooleanArray != null) {
                        sparseBooleanArray.append(G, true);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPositionValue", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
                    i27++;
                    s17 = i18;
                }
            }
            i18 = s17;
            i27++;
            s17 = i18;
        }
        this.f163787n = q17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVisibleItemPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int i28 = this.f163786m;
        if (i28 != r17) {
            this.f163785i = i28;
            this.f163786m = r17;
            this.f163796w = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVisibleItemPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutChildView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public final void y(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        boolean z17 = this.f163796w;
        z84.c cVar = this.f163794u;
        if (z17 && cVar != null && i17 != Integer.MIN_VALUE) {
            cVar.a(this, G(i17), i18 != Integer.MIN_VALUE ? G(i18) : -1, i19);
        }
        this.f163796w = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyVisibleItemChanged", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }

    public void z(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInternal", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        super.onScrollStateChanged(i17);
        z84.c cVar = this.f163794u;
        if (cVar != null) {
            cVar.b(this, i17);
        }
        if (i17 == 0) {
            if (this.f163788o) {
                y(this.f163786m, this.f163785i, 1);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateAndScrollToFixedTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                int n17 = n(r());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                this.f163793t.smoothScrollBy(t(n17) - this.f163780d, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateAndScrollToFixedTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                this.f163788o = true;
            }
        } else if (i17 == 1) {
            this.f163788o = false;
            z84.d dVar = this.f163791r;
            if (this.f163797x == 1 && dVar != null) {
                float q17 = q();
                dVar.d();
                if (q17 > 0.5f) {
                    this.f163796w = true;
                    this.f163797x = 0;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInternal", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
    }
}

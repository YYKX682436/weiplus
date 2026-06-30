package com.tencent.mm.plugin.finder.view.indictor;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0014&'B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0016R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator;", "Landroidx/recyclerview/widget/RecyclerView;", "Lym5/o1;", "", "isShow", "Ljz5/f0;", "setShowOnlyOneIndicator", "", "count", "setCount", "getCount", ya.b.INDEX, "setCurrentIndex", "getCurrentIndex", "Landroid/view/View;", "getView", "Lym5/n1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSelectedPageListener", "getOnSelectedPageListener", "Lnx2/e;", "b2", "Lnx2/e;", "getSliderAdapter", "()Lnx2/e;", "sliderAdapter", "Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "c2", "Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "getSliderLayoutManager", "()Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "sliderLayoutManager", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "nx2/f", "SliderLayoutManager", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMediaGestureIndicator extends androidx.recyclerview.widget.RecyclerView implements ym5.o1 {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public final nx2.e sliderAdapter;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator.SliderLayoutManager sliderLayoutManager;

    /* renamed from: d2, reason: collision with root package name */
    public ym5.n1 f132354d2;

    /* renamed from: e2, reason: collision with root package name */
    public int f132355e2;

    /* renamed from: f2, reason: collision with root package name */
    public int f132356f2;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator$SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    public static final class SliderLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

        /* renamed from: v, reason: collision with root package name */
        public final float f132357v;

        /* renamed from: w, reason: collision with root package name */
        public androidx.recyclerview.widget.RecyclerView f132358w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SliderLayoutManager(android.content.Context context) {
            super(context);
            kotlin.jvm.internal.o.g(context, "context");
            Q(0);
            this.f132357v = 50.0f;
        }

        public final void W() {
            float width = getWidth() / 2.0f;
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = getChildAt(i17);
                kotlin.jvm.internal.o.d(childAt);
                float sqrt = 1 - (((float) java.lang.Math.sqrt(java.lang.Math.abs(width - ((getDecoratedLeft(childAt) + getDecoratedRight(childAt)) / 2.0f)) / getWidth())) * 0.66f);
                childAt.setScaleX(sqrt);
                childAt.setScaleY(sqrt);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView recyclerView) {
            super.onAttachedToWindow(recyclerView);
            kotlin.jvm.internal.o.d(recyclerView);
            this.f132358w = recyclerView;
            androidx.recyclerview.widget.p1 p1Var = new androidx.recyclerview.widget.p1();
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f132358w;
            if (recyclerView2 != null) {
                p1Var.b(recyclerView2);
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 state) {
            kotlin.jvm.internal.o.g(state, "state");
            super.onLayoutChildren(z2Var, state);
            W();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onScrollStateChanged(int i17) {
            super.onScrollStateChanged(i17);
            if (i17 == 0) {
                androidx.recyclerview.widget.RecyclerView recyclerView = this.f132358w;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                int right = recyclerView.getRight();
                androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f132358w;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                int left = (right - recyclerView2.getLeft()) / 2;
                androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f132358w;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                int left2 = left + recyclerView3.getLeft();
                androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f132358w;
                if (recyclerView4 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                int childCount = recyclerView4.getChildCount();
                int i18 = Integer.MAX_VALUE;
                for (int i19 = 0; i19 < childCount; i19++) {
                    androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f132358w;
                    if (recyclerView5 == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    android.view.View childAt = recyclerView5.getChildAt(i19);
                    int abs = java.lang.Math.abs((getDecoratedLeft(childAt) + ((getDecoratedRight(childAt) - getDecoratedLeft(childAt)) / 2)) - left2);
                    if (abs < i18) {
                        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f132358w;
                        if (recyclerView6 == null) {
                            kotlin.jvm.internal.o.o("recyclerView");
                            throw null;
                        }
                        recyclerView6.v0(childAt);
                        i18 = abs;
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
            if (this.f11867d != 0) {
                return 0;
            }
            int scrollHorizontallyBy = super.scrollHorizontallyBy(i17, z2Var, h3Var);
            W();
            return scrollHorizontallyBy;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
            kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
            com.tencent.mm.plugin.finder.view.indictor.a aVar = new com.tencent.mm.plugin.finder.view.indictor.a(this, recyclerView.getContext());
            aVar.f12049a = i17;
            startSmoothScroll(aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMediaGestureIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        nx2.e eVar = new nx2.e();
        this.sliderAdapter = eVar;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator.SliderLayoutManager sliderLayoutManager = new com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator.SliderLayoutManager(context2);
        this.sliderLayoutManager = sliderLayoutManager;
        setAdapter(eVar);
        setLayoutManager(sliderLayoutManager);
        setHasFixedSize(true);
        setClipToPadding(false);
    }

    @Override // ym5.o1
    /* renamed from: getCount, reason: from getter */
    public int getF132355e2() {
        return this.f132355e2;
    }

    /* renamed from: getCurrentIndex, reason: from getter */
    public int getF132356f2() {
        return this.f132356f2;
    }

    /* renamed from: getOnSelectedPageListener, reason: from getter */
    public ym5.n1 getF132354d2() {
        return this.f132354d2;
    }

    public final nx2.e getSliderAdapter() {
        return this.sliderAdapter;
    }

    public final com.tencent.mm.plugin.finder.view.indictor.FinderMediaGestureIndicator.SliderLayoutManager getSliderLayoutManager() {
        return this.sliderLayoutManager;
    }

    @Override // ym5.o1
    public android.view.View getView() {
        return this;
    }

    @Override // ym5.o1
    public void setCount(int i17) {
        this.f132355e2 = i17;
        setCurrentIndex(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(java.lang.Integer.valueOf(i18));
        }
        nx2.e eVar = this.sliderAdapter;
        eVar.getClass();
        java.util.ArrayList arrayList2 = eVar.f341340d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        eVar.notifyDataSetChanged();
    }

    @Override // ym5.o1
    public void setCurrentIndex(int i17) {
        int i18 = this.f132356f2;
        nx2.e eVar = this.sliderAdapter;
        eVar.notifyItemChanged(i18);
        this.f132356f2 = i17;
        eVar.f341341e = i17;
        eVar.notifyItemChanged(i17);
        int i19 = i18 + (i17 - i18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator", "setCurrentIndex", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/finder/view/indictor/FinderMediaGestureIndicator", "setCurrentIndex", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }

    @Override // ym5.o1
    public void setOnSelectedPageListener(ym5.n1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f132354d2 = listener;
    }

    @Override // ym5.o1
    public void setShowOnlyOneIndicator(boolean z17) {
    }
}

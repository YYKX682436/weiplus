package com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/wsfold/ui/component/recycler/ScaleLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ScaleLayoutManager extends androidx.recyclerview.widget.RecyclerView.LayoutManager {

    /* renamed from: d, reason: collision with root package name */
    public final int f163976d;

    /* renamed from: e, reason: collision with root package name */
    public final int f163977e;

    /* renamed from: f, reason: collision with root package name */
    public final int f163978f;

    /* renamed from: g, reason: collision with root package name */
    public int f163979g;

    /* renamed from: h, reason: collision with root package name */
    public int f163980h;

    /* renamed from: i, reason: collision with root package name */
    public int f163981i;

    /* renamed from: m, reason: collision with root package name */
    public int f163982m;

    /* renamed from: n, reason: collision with root package name */
    public int f163983n;

    /* renamed from: o, reason: collision with root package name */
    public float f163984o;

    /* renamed from: p, reason: collision with root package name */
    public int f163985p;

    /* renamed from: q, reason: collision with root package name */
    public int f163986q;

    /* renamed from: r, reason: collision with root package name */
    public int f163987r;

    /* renamed from: s, reason: collision with root package name */
    public int f163988s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.l f163989t;

    public ScaleLayoutManager(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f163976d = c44.b.a(16);
        this.f163977e = c44.b.a(40);
        this.f163978f = c44.b.a(8);
        this.f163985p = 1;
        this.f163986q = -1;
        this.f163989t = j94.b.c(context, 0, 0, 6, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollHorizontally */
    public boolean getF98486n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollHorizontally", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canScrollVertically", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canScrollVertically", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateDefaultLayoutParams", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return layoutParams;
    }

    public final void m(androidx.recyclerview.widget.z2 z2Var) {
        float f17;
        float f18;
        float f19;
        float f27;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fill", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        jz5.l lVar = this.f163989t;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        if (intValue == 0 || intValue2 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fill", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        detachAndScrapAttachedViews(z2Var);
        float f28 = this.f163984o / this.f163985p;
        float floor = f28 - ((float) java.lang.Math.floor(f28));
        int floor2 = this.f163983n + ((int) java.lang.Math.floor(r2));
        int i18 = this.f163978f;
        float f29 = intValue;
        float f37 = (f29 / 2.0f) - ((((this.f163979g / 2.0f) + i18) + (this.f163980h / 2.0f)) * floor);
        int p17 = p(floor);
        o(z2Var, floor2, f37, p17, intValue2);
        float f38 = p17 / 2.0f;
        float f39 = f37 + f38;
        int i19 = 1;
        while (true) {
            f17 = 1.0f;
            f18 = 0.0f;
            if (f39 >= f29 || i19 > this.f163982m + 2) {
                break;
            }
            int p18 = p(e06.p.e(java.lang.Math.abs(i19 - floor), 0.0f, 1.0f));
            float f47 = p18 / 2.0f;
            float f48 = f39 + i18 + f47;
            if (f48 - f47 < f29) {
                i17 = i19;
                o(z2Var, floor2 + i19, f48, p18, intValue2);
            } else {
                i17 = i19;
            }
            f39 = f48 + f47;
            i19 = i17 + 1;
        }
        float f49 = f37 - f38;
        int i27 = -1;
        while (f49 > f18 && (-i27) <= this.f163982m + 2) {
            int p19 = p(e06.p.e(java.lang.Math.abs(i27 - floor), f18, f17));
            float f57 = p19 / 2.0f;
            float f58 = (f49 - i18) - f57;
            if (f58 + f57 > f18) {
                f19 = f18;
                f27 = f17;
                o(z2Var, floor2 + i27, f58, p19, intValue2);
            } else {
                f19 = f18;
                f27 = f17;
            }
            f49 = f58 - f57;
            i27--;
            f18 = f19;
            f17 = f27;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fill", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }

    public final int n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentRealIndex", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        if (this.f163982m <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentRealIndex", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return 0;
        }
        int b17 = this.f163983n + a06.d.b(this.f163984o / this.f163985p);
        int i17 = this.f163982m;
        int i18 = ((b17 % i17) + i17) % i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentRealIndex", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return i18;
    }

    public final void o(androidx.recyclerview.widget.z2 z2Var, int i17, float f17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        if (i17 < 0 || i17 >= this.f163988s) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        android.view.View f18 = z2Var.f(i17);
        kotlin.jvm.internal.o.f(f18, "getViewForPosition(...)");
        addView(f18);
        int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
        f18.measure(makeMeasureSpec, makeMeasureSpec);
        int b17 = a06.d.b(f17 - (i18 / 2.0f));
        int i27 = (i19 - i18) / 2;
        layoutDecorated(f18, b17, i27, b17 + i18, i27 + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutItem", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        int b17 = state.b();
        this.f163988s = b17;
        if (this.f163982m == 0 || b17 == 0) {
            removeAndRecycleAllViews(recycler);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        jz5.l lVar = this.f163989t;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        if (intValue == 0 || intValue2 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return;
        }
        int i17 = intValue2 - (this.f163976d * 2);
        this.f163979g = i17;
        int i18 = intValue2 - (this.f163977e * 2);
        this.f163980h = i18;
        this.f163981i = i18 - i17;
        this.f163985p = i17 + this.f163978f;
        int i19 = this.f163986q;
        if (i19 >= 0) {
            this.f163983n = i19;
            this.f163984o = this.f163987r;
            this.f163986q = -1;
            this.f163987r = 0;
        }
        m(recycler);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayoutChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }

    public final int p(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lerpSize", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        int b17 = a06.d.b(this.f163979g + (this.f163981i * f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lerpSize", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return b17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 recycler, androidx.recyclerview.widget.h3 state) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        kotlin.jvm.internal.o.g(recycler, "recycler");
        kotlin.jvm.internal.o.g(state, "state");
        if (i17 == 0 || this.f163982m == 0 || this.f163985p <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
            return 0;
        }
        this.f163984o += i17;
        m(recycler);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollHorizontallyBy", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        return i17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToPosition", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/recycler/ScaleLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        int intValue2 = ((java.lang.Integer) arrayList.get(1)).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        this.f163986q = intValue;
        this.f163987r = intValue2;
        requestLayout();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToPositionWithOffset", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
        yj0.a.f(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/recycler/ScaleLayoutManager", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToPosition", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager");
    }
}

package l94;

/* loaded from: classes4.dex */
public final class x implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public float f317402d;

    /* renamed from: e, reason: collision with root package name */
    public float f317403e;

    /* renamed from: f, reason: collision with root package name */
    public long f317404f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f317405g;

    /* renamed from: h, reason: collision with root package name */
    public final int f317406h = c44.b.a(10);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l94.b0 f317407i;

    public x(l94.b0 b0Var) {
        this.f317407i = b0Var;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        int actionMasked = e17.getActionMasked();
        l94.b0 b0Var = this.f317407i;
        if (actionMasked == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            b0Var.f317323i = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            b0Var.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$cancelAutoScroll", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            android.animation.ValueAnimator valueAnimator = b0Var.f317324j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnapAnimator$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f317402d = e17.getX();
            this.f317403e = e17.getY();
            this.f317405g = true;
            this.f317404f = java.lang.System.currentTimeMillis();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = rv6.getLayoutManager();
            com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager scaleLayoutManager = layoutManager instanceof com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager ? (com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager) layoutManager : null;
            int n17 = scaleLayoutManager != null ? scaleLayoutManager.n() : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            b0Var.f317331q = n17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
        } else {
            int actionMasked2 = e17.getActionMasked();
            int i17 = this.f317406h;
            if (actionMasked2 == 2) {
                float abs = java.lang.Math.abs(e17.getX() - this.f317402d);
                float abs2 = java.lang.Math.abs(e17.getY() - this.f317403e);
                float f17 = i17;
                if (abs > f17 || abs2 > f17) {
                    this.f317405g = false;
                }
            } else if (e17.getActionMasked() == 1 || e17.getActionMasked() == 3) {
                if (rv6.getScrollState() == 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    b0Var.f317323i = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    float n18 = l94.b0.n(b0Var);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    b0Var.o(n18);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                }
                if (this.f317405g && e17.getAction() == 1) {
                    float abs3 = java.lang.Math.abs(e17.getX() - this.f317402d);
                    float abs4 = java.lang.Math.abs(e17.getY() - this.f317403e);
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f317404f;
                    float f18 = i17;
                    if (abs3 < f18 && abs4 < f18 && currentTimeMillis < 200) {
                        rv6.performClick();
                    }
                }
                this.f317405g = false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRequestDisallowInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRequestDisallowInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$1");
    }
}

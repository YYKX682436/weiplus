package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/PassThroughRecyclerView;", "Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveRecyclerView;", "", "o2", "Ljz5/g;", "getTouchSlop", "()I", "touchSlop", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PassThroughRecyclerView extends com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView {

    /* renamed from: k2, reason: collision with root package name */
    public float f166566k2;

    /* renamed from: l2, reason: collision with root package name */
    public float f166567l2;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f166568m2;

    /* renamed from: n2, reason: collision with root package name */
    public boolean f166569n2;

    /* renamed from: o2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g touchSlop;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassThroughRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.touchSlop = jz5.h.b(new com.tencent.mm.plugin.sns.ui.n7(this));
    }

    private final int getTouchSlop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTouchSlop", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        int intValue = ((java.lang.Number) this.touchSlop.getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTouchSlop", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        return intValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void L0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        this.f166568m2 = !canScrollVertically(-1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        kotlin.jvm.internal.o.g(e17, "e");
        int actionMasked = e17.getActionMasked();
        if (actionMasked == 5) {
            this.f166569n2 = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return false;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f166569n2 = false;
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(e17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return onInterceptTouchEvent;
        }
        if (this.f166569n2 || e17.getPointerCount() >= 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return false;
        }
        if (actionMasked == 0) {
            this.f166566k2 = e17.getY();
            this.f166567l2 = e17.getX();
            this.f166568m2 = !canScrollVertically(-1);
        } else if (actionMasked == 2) {
            float abs = java.lang.Math.abs(e17.getX() - this.f166567l2);
            float abs2 = java.lang.Math.abs(e17.getY() - this.f166566k2);
            if (abs > getTouchSlop() && abs > abs2 * 1.2d) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
                return true;
            }
            if (this.f166568m2 && e17.getY() - this.f166566k2 > getTouchSlop() && abs2 > abs) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
                return false;
            }
        }
        boolean onInterceptTouchEvent2 = super.onInterceptTouchEvent(e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        return onInterceptTouchEvent2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        kotlin.jvm.internal.o.g(e17, "e");
        int action = e17.getAction();
        if (action == 0) {
            this.f166566k2 = e17.getY();
            this.f166568m2 = !canScrollVertically(-1);
        } else if (action == 2 && this.f166568m2 && e17.getY() - this.f166566k2 > 0.0f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.PassThroughRecyclerView");
        return onTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassThroughRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.touchSlop = jz5.h.b(new com.tencent.mm.plugin.sns.ui.n7(this));
    }
}

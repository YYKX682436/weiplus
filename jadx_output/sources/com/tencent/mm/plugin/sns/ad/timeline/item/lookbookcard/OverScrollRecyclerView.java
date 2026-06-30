package com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0006¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/OverScrollRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "isActive", "Ljz5/f0;", "setActive", "", "maxDistance", "setMaxOverScrollDistance", "Lv74/a1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnOverScrollActionListener", "getCurrentOverScrollDistance", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OverScrollRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public int f163243b2;

    /* renamed from: c2, reason: collision with root package name */
    public float f163244c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f163245d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f163246e2;

    /* renamed from: f2, reason: collision with root package name */
    public int f163247f2;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f163248g2;

    /* renamed from: h2, reason: collision with root package name */
    public v74.a1 f163249h2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverScrollRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        boolean z17 = false;
        if (!this.f163248g2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            g1(motionEvent.getRawX());
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        return dispatchTouchEvent;
    }

    public final void g1(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOnActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        boolean canScrollHorizontally = canScrollHorizontally(1);
        com.tencent.mars.xlog.Log.i("OverScrollRecyclerView", "onDown, canScroll=" + canScrollHorizontally);
        this.f163244c2 = f17;
        this.f163246e2 = canScrollHorizontally;
        this.f163245d2 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    public final int getCurrentOverScrollDistance() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        int i17 = -((int) getTranslationX());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        return i17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17) {
            g1(motionEvent.getRawX());
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        return onInterceptTouchEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r3 != 3) goto L55;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setActive(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        com.tencent.mars.xlog.Log.i("OverScrollRecyclerView", "setActive, isActive=" + z17);
        this.f163248g2 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    public final void setMaxOverScrollDistance(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        this.f163243b2 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxOverScrollDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    public final void setOnOverScrollActionListener(v74.a1 listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnOverScrollActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f163249h2 = listener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnOverScrollActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f163243b2 = i65.a.b(getContext(), 64);
        this.f163246e2 = true;
        this.f163248g2 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
        this.f163247f2 = android.view.ViewConfiguration.getTouchSlop();
        com.tencent.mars.xlog.Log.i("OverScrollRecyclerView", "init, touchSlop=" + this.f163247f2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView");
    }
}

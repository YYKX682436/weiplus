package com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "getTotalTouchDuration", "", "getTotalTouchCount", "Lp74/p;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setTouchActionListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdSlideCardRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public long f163206b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f163207c2;

    /* renamed from: d2, reason: collision with root package name */
    public long f163208d2;

    /* renamed from: e2, reason: collision with root package name */
    public p74.p f163209e2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdSlideCardRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        kotlin.jvm.internal.o.g(e17, "e");
        if (e17.getAction() == 0) {
            this.f163208d2 = java.lang.System.currentTimeMillis();
            if (this.f163209e2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic$mTouchActionListener$1");
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        return dispatchTouchEvent;
    }

    public final int getTotalTouchCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        int i17 = this.f163207c2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        return i17;
    }

    public final long getTotalTouchDuration() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        long j17 = this.f163206b2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01e9  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setTouchActionListener(p74.p pVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
        this.f163209e2 = pVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSlideCardRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}

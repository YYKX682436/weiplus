package com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard;

/* loaded from: classes4.dex */
public class AdSlideRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public d94.b f163210b2;

    /* renamed from: c2, reason: collision with root package name */
    public long f163211c2;

    /* renamed from: d2, reason: collision with root package name */
    public int f163212d2;

    /* renamed from: e2, reason: collision with root package name */
    public long f163213e2;

    /* renamed from: f2, reason: collision with root package name */
    public q74.u f163214f2;

    public AdSlideRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163210b2 = null;
        this.f163211c2 = 0L;
        this.f163212d2 = 0;
        this.f163213e2 = 0L;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        if (motionEvent.getAction() == 0) {
            d94.b bVar = this.f163210b2;
            if (bVar != null) {
                ((d94.g) bVar).a(motionEvent);
            }
            this.f163213e2 = java.lang.System.currentTimeMillis();
            q74.u uVar = this.f163214f2;
            if (uVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1");
                q74.z.a(((q74.y) uVar).f360570a);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActionDown", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic$mTouchActionListener$1");
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return dispatchTouchEvent;
    }

    public int getTotalTouchCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        com.tencent.mars.xlog.Log.i("AdSlideRecyclerView", "totalCount:" + this.f163212d2);
        int i17 = this.f163212d2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalTouchCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return i17;
    }

    public long getTotalTouchDuration() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        com.tencent.mars.xlog.Log.i("AdSlideRecyclerView", "totalDuration:" + this.f163211c2);
        long j17 = this.f163211c2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01f2  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setTouchActionListener(q74.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        this.f163214f2 = uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchActionListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
    }

    public void setTouchEventProxy(d94.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchEventProxy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
        this.f163210b2 = bVar;
        com.tencent.mars.xlog.Log.i("AdSlideRecyclerView", "setTouchEventProxy:" + bVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchEventProxy", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
    }

    public AdSlideRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163210b2 = null;
        this.f163211c2 = 0L;
        this.f163212d2 = 0;
        this.f163213e2 = 0L;
    }
}

package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f149117d;

    public z0(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView) {
        this.f149117d = segmentClipRecyclerThumbBarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f149117d;
        androidx.recyclerview.widget.RecyclerView recyclerView = segmentClipRecyclerThumbBarView.f148917p;
        kotlin.jvm.internal.o.d(recyclerView);
        int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        java.lang.Double d17 = segmentClipRecyclerThumbBarView.getMediaItemStartTimeMsPositionMap().get(segmentClipRecyclerThumbBarView.f148910f);
        if (d17 == null) {
            d17 = java.lang.Double.valueOf(0.0d);
        }
        double doubleValue = d17.doubleValue();
        double d18 = doubleValue / segmentClipRecyclerThumbBarView.f148912h;
        double d19 = computeHorizontalScrollRange > 0 ? d18 * computeHorizontalScrollRange : 0.0d;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = segmentClipRecyclerThumbBarView.f148917p;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(-((int) d19)));
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            z17 = false;
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$refreshUIAfterDurationUpdate$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$refreshUIAfterDurationUpdate$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        } else {
            z17 = false;
        }
        if (segmentClipRecyclerThumbBarView.a() > segmentClipRecyclerThumbBarView.f148908d ? true : z17) {
            segmentClipRecyclerThumbBarView.d(z17, "", segmentClipRecyclerThumbBarView.f148922u);
        } else {
            java.lang.String r17 = i65.a.r(segmentClipRecyclerThumbBarView.getContext(), com.tencent.mm.R.string.lrs);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
            segmentClipRecyclerThumbBarView.d(true, r17, segmentClipRecyclerThumbBarView.f148922u);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.RecyclerThumbBarView", "startLoad: ScrollOffset=" + d19 + ", scrollRange=" + computeHorizontalScrollRange + ", startTimeMsOfSegment=" + doubleValue + ", startTimeScrollPercent=" + d18);
    }
}

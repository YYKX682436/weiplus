package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f149110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView) {
        super(2);
        this.f149110d = segmentClipRecyclerThumbBarView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f149110d;
        androidx.recyclerview.widget.RecyclerView recyclerView = segmentClipRecyclerThumbBarView.f148917p;
        if (recyclerView != null) {
            recyclerView.post(new com.tencent.mm.plugin.mmsight.segment.x0(segmentClipRecyclerThumbBarView, bitmap));
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f149007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView) {
        super(2);
        this.f149007d = segmentClipRecyclerThumbBarView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f149007d;
        androidx.recyclerview.widget.RecyclerView recyclerView = segmentClipRecyclerThumbBarView.f148917p;
        if (recyclerView != null) {
            recyclerView.post(new com.tencent.mm.plugin.mmsight.segment.c1(segmentClipRecyclerThumbBarView, longValue, bitmap));
        }
        return jz5.f0.f302826a;
    }
}

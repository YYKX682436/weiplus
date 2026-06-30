package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f148997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f148998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f148999f;

    public c1(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView, long j17, android.graphics.Bitmap bitmap) {
        this.f148997d = segmentClipRecyclerThumbBarView;
        this.f148998e = j17;
        this.f148999f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        int indexOf;
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f148997d;
        java.util.Iterator it = segmentClipRecyclerThumbBarView.f148926y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.mm.plugin.mmsight.segment.p0 p0Var = (com.tencent.mm.plugin.mmsight.segment.p0) obj;
            if ((p0Var instanceof com.tencent.mm.plugin.mmsight.segment.u0) && ((com.tencent.mm.plugin.mmsight.segment.u0) p0Var).f149091b == this.f148998e) {
                break;
            }
        }
        com.tencent.mm.plugin.mmsight.segment.p0 p0Var2 = (com.tencent.mm.plugin.mmsight.segment.p0) obj;
        if (p0Var2 == null || (indexOf = segmentClipRecyclerThumbBarView.f148926y.indexOf(p0Var2)) < 0) {
            return;
        }
        p0Var2.f149071a = this.f148999f;
        segmentClipRecyclerThumbBarView.B.notifyItemChanged(indexOf);
    }
}

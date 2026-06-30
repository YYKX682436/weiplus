package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f149102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f149103e;

    public x0(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView, android.graphics.Bitmap bitmap) {
        this.f149102d = segmentClipRecyclerThumbBarView;
        this.f149103e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mmsight.segment.t0 t0Var = this.f149102d.B;
        t0Var.f149088e = this.f149103e;
        t0Var.notifyDataSetChanged();
    }
}

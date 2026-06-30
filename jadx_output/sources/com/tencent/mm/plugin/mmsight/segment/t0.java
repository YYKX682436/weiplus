package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class t0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmsight.segment.q0 f149087d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f149088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f149089f;

    public t0(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView, com.tencent.mm.plugin.mmsight.segment.q0 q0Var) {
        this.f149089f = segmentClipRecyclerThumbBarView;
        this.f149087d = q0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f149089f.f148926y.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.mmsight.segment.r0 holder = (com.tencent.mm.plugin.mmsight.segment.r0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f149089f;
        com.tencent.mm.plugin.mmsight.segment.p0 p0Var = (com.tencent.mm.plugin.mmsight.segment.p0) segmentClipRecyclerThumbBarView.f148926y.get(i17);
        boolean z17 = p0Var instanceof com.tencent.mm.plugin.mmsight.segment.u0;
        android.widget.ImageView imageView = holder.f149084d;
        if (!z17) {
            if (p0Var instanceof com.tencent.mm.plugin.mmsight.segment.s0) {
                imageView.setImageBitmap(p0Var.f149071a);
                return;
            }
            return;
        }
        if (p0Var.f149071a != null) {
            if (!r1.isRecycled()) {
                imageView.setImageBitmap(p0Var.f149071a);
                return;
            }
            return;
        }
        if (this.f149088e != null && (!r1.isRecycled())) {
            imageView.setImageBitmap(this.f149088e);
        }
        java.util.HashSet hashSet = segmentClipRecyclerThumbBarView.f148927z;
        long j17 = ((com.tencent.mm.plugin.mmsight.segment.u0) p0Var).f149091b;
        if (hashSet.contains(java.lang.Long.valueOf(j17))) {
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.q0 q0Var = this.f149087d;
        if (q0Var != null) {
            java.util.List c17 = kz5.b0.c(java.lang.Long.valueOf(j17));
            c17.toString();
            com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView2 = ((com.tencent.mm.plugin.mmsight.segment.e1) q0Var).f149011a;
            com.tencent.mm.plugin.mmsight.segment.d1 d1Var = new com.tencent.mm.plugin.mmsight.segment.d1(segmentClipRecyclerThumbBarView2);
            rm5.k kVar = segmentClipRecyclerThumbBarView2.f148925x;
            if (kVar != null) {
                ((rm5.h) kVar).a(c17, d1Var);
            }
        }
        hashSet.add(java.lang.Long.valueOf(j17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.widget.ImageView imageView = new android.widget.ImageView(parent.getContext());
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f149089f;
        imageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(segmentClipRecyclerThumbBarView.f148914m, segmentClipRecyclerThumbBarView.f148913i));
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        return new com.tencent.mm.plugin.mmsight.segment.r0(imageView);
    }
}

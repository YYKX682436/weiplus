package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f148981d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f148982e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f148983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f148984g;

    /* renamed from: h, reason: collision with root package name */
    public int f148985h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f148984g = segmentClipRecyclerThumbBarView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f148983f = obj;
        this.f148985h |= Integer.MIN_VALUE;
        return this.f148984g.c(null, this);
    }
}

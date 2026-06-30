package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f171320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f171321e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f171322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171323g;

    /* renamed from: h, reason: collision with root package name */
    public int f171324h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f171323g = snsAdBreakFrameVideoView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$1");
        this.f171322f = obj;
        this.f171324h |= Integer.MIN_VALUE;
        java.lang.Object c17 = this.f171323g.c(0L, false, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$seek$1");
        return c17;
    }
}

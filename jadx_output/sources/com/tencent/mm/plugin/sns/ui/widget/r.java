package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f171253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk4.c f171254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kk4.c cVar, com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171254e = cVar;
        this.f171255f = snsAdBreakFrameVideoView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        com.tencent.mm.plugin.sns.ui.widget.r rVar = new com.tencent.mm.plugin.sns.ui.widget.r(this.f171254e, this.f171255f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171253d;
        if (i17 != 0 && i17 != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
            throw illegalStateException;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        while (((kk4.f0) this.f171254e).getCurrentPositionMs() <= 0) {
            this.f171253d = 1;
            if (kotlinx.coroutines.k1.b(16L, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
                return aVar;
            }
        }
        this.f171255f.h(false);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2$1");
        return f0Var;
    }
}

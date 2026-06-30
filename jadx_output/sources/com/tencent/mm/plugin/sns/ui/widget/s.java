package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f171260d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f171261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kk4.c f171262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kk4.c cVar, com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171262f = cVar;
        this.f171263g = snsAdBreakFrameVideoView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        com.tencent.mm.plugin.sns.ui.widget.s sVar = new com.tencent.mm.plugin.sns.ui.widget.s(this.f171262f, this.f171263g, continuation);
        sVar.f171261e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171260d;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f171263g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f171261e;
            com.tencent.mm.plugin.sns.ui.widget.r rVar = new com.tencent.mm.plugin.sns.ui.widget.r(this.f171262f, snsAdBreakFrameVideoView, null);
            this.f171261e = y0Var;
            this.f171260d = 1;
            obj = kotlinx.coroutines.a4.c(100L, rVar, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((jz5.f0) obj) == null) {
            com.tencent.mars.xlog.Log.w("SnsAdBreakFrameVideoView", "it is timeout, the tp player is trouble maker!!!!");
            snsAdBreakFrameVideoView.h(false);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$hideThumbViewWhenFirstFrameRender$2");
        return f0Var;
    }
}

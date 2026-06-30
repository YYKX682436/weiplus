package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f171301d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f171302e;

    /* renamed from: f, reason: collision with root package name */
    public int f171303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.y0 f171304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171305h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.plugin.sns.ui.widget.y0 y0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171304g = y0Var;
        this.f171305h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        com.tencent.mm.plugin.sns.ui.widget.x0 x0Var = new com.tencent.mm.plugin.sns.ui.widget.x0(this.f171304g, this.f171305h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        return x0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171303f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.widget.y0 y0Var = this.f171304g;
            this.f171301d = y0Var;
            java.lang.String str = this.f171305h;
            this.f171302e = str;
            this.f171303f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            y0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
            y0Var.f171317d.setOnPrepared(new com.tencent.mm.plugin.sns.ui.widget.v0(rVar));
            rVar.m(new com.tencent.mm.plugin.sns.ui.widget.w0(y0Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy");
            y0Var.f171317d.setVideoPath(str);
            if (rVar.j() == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoViewKtProxy$prepare$2");
        return f0Var;
    }
}

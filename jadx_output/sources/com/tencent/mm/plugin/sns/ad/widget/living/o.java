package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f163743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer f163744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f163744e = adLivingStreamContainer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        com.tencent.mm.plugin.sns.ad.widget.living.o oVar = new com.tencent.mm.plugin.sns.ad.widget.living.o(this.f163744e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.widget.living.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        s34.f0 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f163743d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer = this.f163744e;
            s34.g0 b18 = com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer.b(adLivingStreamContainer);
            if (b18 == null || (b17 = b18.b()) == null || (str = b17.a()) == null) {
                str = "";
            }
            this.f163743d = 1;
            obj = com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer.e(adLivingStreamContainer, str, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$setBackgroundViews$1$2$wallPaperBitmapDefer$1");
        return obj;
    }
}

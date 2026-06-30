package q74;

/* loaded from: classes4.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q74.s0 f360472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f360473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(q74.s0 s0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360472e = s0Var;
        this.f360473f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        q74.k0 k0Var = new q74.k0(this.f360472e, this.f360473f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        return k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        java.lang.Object invokeSuspend = ((q74.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360471d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            q74.s0 s0Var = this.f360472e;
            int intValue = ((java.lang.Number) ((kotlinx.coroutines.flow.h3) q74.s0.f(s0Var)).getValue()).intValue();
            int i18 = this.f360473f;
            if (intValue == 1) {
                q74.s0.b(s0Var, i18);
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
                return f0Var;
            }
            kotlinx.coroutines.flow.j2 f17 = q74.s0.f(s0Var);
            q74.j0 j0Var = new q74.j0(s0Var, i18);
            this.f360471d = 1;
            if (((kotlinx.coroutines.flow.h3) f17).a(j0Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.d dVar = new jz5.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doStatusTwoAnimNoPAG$1");
        throw dVar;
    }
}

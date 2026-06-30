package t74;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.g f416132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t74.g gVar, t74.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416132d = gVar;
        this.f416133e = w1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        t74.f fVar = new t74.f(this.f416132d, this.f416133e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        java.lang.Object invokeSuspend = ((t74.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = t74.g.f416136f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInitAnimIsCanceled$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1");
        boolean z17 = this.f416132d.f416137d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInitAnimIsCanceled$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
            return f0Var;
        }
        t74.w1.A(this.f416133e, 1.0f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doBackPageAnim$expandAnimSet$1$1$onAnimationEnd$1");
        return f0Var;
    }
}

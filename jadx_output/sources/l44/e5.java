package l44;

/* loaded from: classes3.dex */
public final class e5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f316124d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        l44.e5 e5Var = new l44.e5(this.f316124d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        return e5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        java.lang.Object invokeSuspend = ((l44.e5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isBrandAdded(this.f316124d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        return valueOf;
    }
}

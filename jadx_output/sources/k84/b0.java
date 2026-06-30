package k84;

/* loaded from: classes4.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f304948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f304949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(k84.q1 q1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304949e = q1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        k84.b0 b0Var = new k84.b0(this.f304949e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        return b0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        ((k84.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        pz5.a aVar2 = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        return aVar2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f304948d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            k84.q1 q1Var = this.f304949e;
            kotlinx.coroutines.flow.j2 z17 = k84.q1.z(q1Var);
            k84.a0 a0Var = new k84.a0(q1Var);
            this.f304948d = 1;
            if (((kotlinx.coroutines.flow.h3) z17).a(a0Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.d dVar = new jz5.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindComponentModel$3");
        throw dVar;
    }
}

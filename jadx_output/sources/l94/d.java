package l94;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f317336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l94.e f317337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h94.a f317338f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l94.e eVar, h94.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f317337e = eVar;
        this.f317338f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        l94.d dVar = new l94.d(this.f317337e, this.f317338f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        ((l94.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        pz5.a aVar = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        pz5.a aVar2 = pz5.a.f359186d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        return aVar2;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f317336d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l94.b bVar = l94.e.f317340e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getViewEvent$cp", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            kotlinx.coroutines.flow.n2 n2Var = l94.e.f317342g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getViewEvent$cp", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewEvent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$Companion");
            l94.c cVar = new l94.c(this.f317337e, this.f317338f);
            this.f317336d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) n2Var;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, cVar, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.d dVar = new jz5.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$bindData$2");
        throw dVar;
    }
}

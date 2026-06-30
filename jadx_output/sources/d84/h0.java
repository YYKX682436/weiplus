package d84;

/* loaded from: classes3.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f227070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f227071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f227071e = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        d84.h0 h0Var = new d84.h0(this.f227071e, continuation);
        h0Var.f227070d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        return h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        d84.h0 h0Var = (d84.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) this.f227070d, kotlinx.coroutines.q1.f310570c, null, new d84.g0(this.f227071e, null), 2, null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$requestDynamicData$2");
        return f0Var;
    }
}

package p44;

/* loaded from: classes4.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p44.o0 f351806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f351807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p44.o0 o0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f351806e = o0Var;
        this.f351807f = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        p44.k0 k0Var = new p44.k0(this.f351806e, this.f351807f, continuation);
        k0Var.f351805d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        return k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        p44.k0 k0Var = (p44.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f351805d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        kotlinx.coroutines.r0 r0Var = this.f351806e.f351830t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl");
        kotlinx.coroutines.l.d(y0Var, p0Var.plus(r0Var), null, new p44.j0(this.f351807f, null), 2, null);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$3");
        return f0Var;
    }
}

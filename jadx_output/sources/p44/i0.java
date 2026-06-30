package p44;

/* loaded from: classes4.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f351797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f351798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p44.r f351799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p44.o0 f351800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f351801h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, p44.r rVar, p44.o0 o0Var, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f351798e = snsInfo;
        this.f351799f = rVar;
        this.f351800g = o0Var;
        this.f351801h = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        p44.i0 i0Var = new p44.i0(this.f351798e, this.f351799f, this.f351800g, this.f351801h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        return i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        java.lang.Object invokeSuspend = ((p44.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f351797d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.j e17 = i64.o.f289257d.e(a84.d0.c(this.f351798e));
            p44.h0 h0Var = new p44.h0(this.f351799f, this.f351800g, this.f351801h);
            this.f351797d = 1;
            if (((kotlinx.coroutines.flow.h3) e17).a(h0Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2");
        return f0Var;
    }
}

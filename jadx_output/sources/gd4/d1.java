package gd4;

/* loaded from: classes4.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270674d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd4.c2 f270676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.d0 f270677g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f270678h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.s1 f270679i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f270680m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(gd4.c2 c2Var, com.tencent.mm.plugin.sns.storage.d0 d0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.sns.storage.s1 s1Var, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270676f = c2Var;
        this.f270677g = d0Var;
        this.f270678h = h0Var;
        this.f270679i = s1Var;
        this.f270680m = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        gd4.d1 d1Var = new gd4.d1(this.f270676f, this.f270677g, this.f270678h, this.f270679i, this.f270680m, continuation);
        d1Var.f270675e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        return d1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        java.lang.Object invokeSuspend = ((gd4.d1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270674d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f270675e;
            gd4.c2 c2Var = this.f270676f;
            c2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayCommandFlow", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            kotlinx.coroutines.flow.j i18 = kotlinx.coroutines.flow.l.i(c2Var.f270611f);
            gd4.c1 c1Var = new gd4.c1(this.f270676f, this.f270677g, this.f270678h, y0Var, this.f270679i, this.f270680m);
            this.f270674d = 1;
            if (i18.a(c1Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1");
        return f0Var;
    }
}

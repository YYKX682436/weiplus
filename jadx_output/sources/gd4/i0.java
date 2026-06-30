package gd4;

/* loaded from: classes4.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gd4.v0 f270720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f270721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f270722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f270723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(gd4.v0 v0Var, kotlin.jvm.internal.e0 e0Var, float f17, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270720e = v0Var;
        this.f270721f = e0Var;
        this.f270722g = f17;
        this.f270723h = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        gd4.i0 i0Var = new gd4.i0(this.f270720e, this.f270721f, this.f270722g, this.f270723h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        java.lang.Object invokeSuspend = ((gd4.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270719d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gd4.v0 v0Var = this.f270720e;
            gd4.h0 h0Var = new gd4.h0(v0Var);
            float f17 = this.f270721f.f310115d;
            long j17 = f17;
            int min = java.lang.Math.min((int) (f17 - this.f270722g), 2000);
            this.f270719d = 1;
            if (gd4.b.c(v0Var, h0Var, j17, 50L, min, 0, 0, this, 48, null) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f270719d = 2;
        if (this.f270723h.emit(bool, this) == aVar) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
            return aVar;
        }
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return f0Var2;
    }
}

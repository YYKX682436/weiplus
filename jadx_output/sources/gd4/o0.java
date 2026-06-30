package gd4;

/* loaded from: classes4.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270798d;

    /* renamed from: e, reason: collision with root package name */
    public int f270799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd4.p0 f270800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gd4.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270800f = p0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
        this.f270798d = obj;
        this.f270799e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f270800f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
        return emit;
    }
}

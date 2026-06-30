package gd4;

/* loaded from: classes4.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270756d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd4.n0 f270758f;

    /* renamed from: g, reason: collision with root package name */
    public int f270759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(gd4.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270758f = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$emit$1");
        this.f270757e = obj;
        this.f270759g |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f270758f.a(0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$seekJob$1$3$emit$1");
        return a17;
    }
}

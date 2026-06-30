package gd4;

/* loaded from: classes4.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270801d;

    /* renamed from: e, reason: collision with root package name */
    public int f270802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd4.p1 f270803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(gd4.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270803f = p1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
        this.f270801d = obj;
        this.f270802e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f270803f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$1$2$1");
        return emit;
    }
}

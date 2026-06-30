package gd4;

/* loaded from: classes4.dex */
public final class x1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270870d;

    /* renamed from: e, reason: collision with root package name */
    public int f270871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd4.y1 f270872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(gd4.y1 y1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270872f = y1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4$2$1");
        this.f270870d = obj;
        this.f270871e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f270872f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$4$2$1");
        return emit;
    }
}

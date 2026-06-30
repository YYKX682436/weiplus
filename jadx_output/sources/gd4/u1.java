package gd4;

/* loaded from: classes4.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270855d;

    /* renamed from: e, reason: collision with root package name */
    public int f270856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gd4.v1 f270857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(gd4.v1 v1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270857f = v1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3$2$1");
        this.f270855d = obj;
        this.f270856e |= Integer.MIN_VALUE;
        java.lang.Object emit = this.f270857f.emit(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$invokeSuspend$$inlined$map$3$2$1");
        return emit;
    }
}

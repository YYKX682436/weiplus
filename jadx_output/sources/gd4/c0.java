package gd4;

/* loaded from: classes4.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270638d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270639e;

    /* renamed from: f, reason: collision with root package name */
    public long f270640f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270641g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gd4.d0 f270642h;

    /* renamed from: i, reason: collision with root package name */
    public int f270643i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(gd4.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270642h = d0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1$emit$1");
        this.f270641g = obj;
        this.f270643i |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f270642h.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$1$emit$1");
        return a17;
    }
}

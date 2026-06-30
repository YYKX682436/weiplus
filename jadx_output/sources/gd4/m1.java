package gd4;

/* loaded from: classes4.dex */
public final class m1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270760d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270761e;

    /* renamed from: f, reason: collision with root package name */
    public int f270762f;

    /* renamed from: g, reason: collision with root package name */
    public long f270763g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270764h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gd4.n1 f270765i;

    /* renamed from: m, reason: collision with root package name */
    public int f270766m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(gd4.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270765i = n1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$emit$1");
        this.f270764h = obj;
        this.f270766m |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f270765i.a(0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$seekJob$1$5$emit$1");
        return a17;
    }
}

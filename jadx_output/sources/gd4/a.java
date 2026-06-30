package gd4;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270586d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270587e;

    /* renamed from: f, reason: collision with root package name */
    public long f270588f;

    /* renamed from: g, reason: collision with root package name */
    public long f270589g;

    /* renamed from: h, reason: collision with root package name */
    public int f270590h;

    /* renamed from: i, reason: collision with root package name */
    public int f270591i;

    /* renamed from: m, reason: collision with root package name */
    public int f270592m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270593n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gd4.b f270594o;

    /* renamed from: p, reason: collision with root package name */
    public int f270595p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gd4.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270594o = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController$delayForAdjust$1");
        this.f270593n = obj;
        this.f270595p |= Integer.MIN_VALUE;
        java.lang.Object b17 = this.f270594o.b(null, 0L, 0L, 0, 0, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController$delayForAdjust$1");
        return b17;
    }
}

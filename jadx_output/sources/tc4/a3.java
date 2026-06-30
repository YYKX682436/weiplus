package tc4;

/* loaded from: classes4.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417277d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.c3 f417279f;

    /* renamed from: g, reason: collision with root package name */
    public int f417280g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(tc4.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417279f = c3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$onViewRecycled$1");
        this.f417278e = obj;
        this.f417280g |= Integer.MIN_VALUE;
        java.lang.Object g17 = this.f417279f.g(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$onViewRecycled$1");
        return g17;
    }
}

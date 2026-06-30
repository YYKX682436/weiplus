package tc4;

/* loaded from: classes4.dex */
public final class d3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417313d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.h3 f417315f;

    /* renamed from: g, reason: collision with root package name */
    public int f417316g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(tc4.h3 h3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417315f = h3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$1");
        this.f417314e = obj;
        this.f417316g |= Integer.MIN_VALUE;
        java.lang.Object E = this.f417315f.E(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$loadCustomItemInfo$1");
        return E;
    }
}

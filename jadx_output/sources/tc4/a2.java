package tc4;

/* loaded from: classes4.dex */
public final class a2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417273d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.d2 f417275f;

    /* renamed from: g, reason: collision with root package name */
    public int f417276g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(tc4.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417275f = d2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$1");
        this.f417274e = obj;
        this.f417276g |= Integer.MIN_VALUE;
        java.lang.Object C = this.f417275f.C(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemLoad$itemLoad$1");
        return C;
    }
}

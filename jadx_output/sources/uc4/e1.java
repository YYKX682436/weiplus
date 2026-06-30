package uc4;

/* loaded from: classes4.dex */
public final class e1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f426393d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f426394e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f426395f;

    /* renamed from: g, reason: collision with root package name */
    public int f426396g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f426397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uc4.f1 f426398i;

    /* renamed from: m, reason: collision with root package name */
    public int f426399m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(uc4.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f426398i = f1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick$onBindViewHolder$1");
        this.f426397h = obj;
        this.f426399m |= Integer.MIN_VALUE;
        java.lang.Object K = uc4.f1.K(this.f426398i, null, null, 0, false, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick$onBindViewHolder$1");
        return K;
    }
}

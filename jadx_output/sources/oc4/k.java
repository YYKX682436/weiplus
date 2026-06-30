package oc4;

/* loaded from: classes4.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f344347d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f344348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC f344349f;

    /* renamed from: g, reason: collision with root package name */
    public int f344350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f344349f = improveUnreadUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$1");
        this.f344348e = obj;
        this.f344350g |= Integer.MIN_VALUE;
        java.lang.Object onScrollStateChanged = this.f344349f.onScrollStateChanged(null, null, 0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$onScrollStateChanged$1");
        return onScrollStateChanged;
    }
}

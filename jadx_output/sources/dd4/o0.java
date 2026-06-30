package dd4;

/* loaded from: classes4.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229031d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f229033f;

    /* renamed from: g, reason: collision with root package name */
    public int f229034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229033f = flexibleVideoView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestFullDownload$1");
        this.f229032e = obj;
        this.f229034g |= Integer.MIN_VALUE;
        java.lang.Object t17 = this.f229033f.t(0, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestFullDownload$1");
        return t17;
    }
}

package fc4;

/* loaded from: classes4.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f261166d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f261167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc4.j0 f261168f;

    /* renamed from: g, reason: collision with root package name */
    public int f261169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(fc4.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f261168f = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$startDownload$1");
        this.f261167e = obj;
        this.f261169g |= Integer.MIN_VALUE;
        java.lang.Object R6 = this.f261168f.R6(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleShareUIC$startDownload$1");
        return R6;
    }
}

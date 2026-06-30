package y94;

/* loaded from: classes10.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f460368d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f460369e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f460370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y94.h0 f460371g;

    /* renamed from: h, reason: collision with root package name */
    public int f460372h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(y94.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f460371g = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin$exportVideo$1");
        this.f460370f = obj;
        this.f460372h |= Integer.MIN_VALUE;
        java.lang.Object z17 = this.f460371g.z(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsExportPlugin$exportVideo$1");
        return z17;
    }
}

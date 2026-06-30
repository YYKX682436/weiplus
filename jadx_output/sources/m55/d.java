package m55;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f324325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f324326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rm5.v f324327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f324328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, kotlin.jvm.internal.c0 c0Var, rm5.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2);
        this.f324325d = j17;
        this.f324326e = c0Var;
        this.f324327f = vVar;
        this.f324328g = continuation;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f324325d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("export finished, success:");
        sb6.append(booleanValue);
        sb6.append(", errCode:");
        sb6.append(intValue);
        sb6.append(", cost:");
        sb6.append(elapsedRealtime);
        sb6.append(", isCallbackInvoked:");
        kotlin.jvm.internal.c0 c0Var = this.f324326e;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCompositionRemuxChain", sb6.toString());
        if (!c0Var.f310112d) {
            if (!booleanValue) {
                this.f324327f.d();
            }
            if (booleanValue && intValue == 0) {
                intValue = 0;
            } else if (intValue == 0) {
                intValue = -1;
            }
            int i17 = intValue;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f324328g.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(i17 == 0 ? og3.h.f345165e : og3.h.f345164d, i17, null, null, 8, null)));
        }
        return jz5.f0.f302826a;
    }
}

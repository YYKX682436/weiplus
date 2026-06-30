package u64;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f424973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f424974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f424975f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.l lVar, int i17, r45.mr5 mr5Var) {
        super(1);
        this.f424973d = lVar;
        this.f424974e = i17;
        this.f424975f = mr5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
        try {
            this.f424973d.hashCode();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("CgiRequestHelper", "requestCgiAsync canceled " + this.f424974e + ' ' + this.f424975f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper$requestPullAd$1$1$invokeSuspend$$inlined$requestCgiAsync$1$2");
        return f0Var;
    }
}

package i64;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f289214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f289216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yz5.l lVar, int i17, r45.mr5 mr5Var) {
        super(1);
        this.f289214d = lVar;
        this.f289215e = i17;
        this.f289216f = mr5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$2");
        try {
            this.f289214d.hashCode();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("CgiRequestHelper", "requestCgiAsync canceled " + this.f289215e + ' ' + this.f289216f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$2");
        return f0Var;
    }
}

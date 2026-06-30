package i64;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f289211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlinx.coroutines.q qVar) {
        super(1);
        this.f289211d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$1");
        k64.b it = (k64.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        try {
            ((kotlinx.coroutines.r) this.f289211d).resumeWith(kotlin.Result.m521constructorimpl(it));
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("CgiRequestHelper", e17, "resume error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.model.AdContinuousCountModelManager$requestNumberTitle$$inlined$requestCgiAsync$default$1$1");
        return f0Var;
    }
}

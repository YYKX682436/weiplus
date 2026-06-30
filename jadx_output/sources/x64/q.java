package x64;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f452318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlinx.coroutines.q qVar) {
        super(1);
        this.f452318d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
        k64.b it = (k64.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        try {
            ((kotlinx.coroutines.r) this.f452318d).resumeWith(kotlin.Result.m521constructorimpl(it));
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("CgiRequestHelper", e17, "resume error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1$1");
        return f0Var;
    }
}

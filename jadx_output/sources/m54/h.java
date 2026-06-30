package m54;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f324269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlinx.coroutines.q qVar) {
        super(2);
        this.f324269d = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2$1$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        m54.y ele = (m54.y) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2$1$1");
        kotlin.jvm.internal.o.g(ele, "ele");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f324269d).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.valueOf(booleanValue), ele)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$suspendRequest$2$1$1");
        return f0Var;
    }
}

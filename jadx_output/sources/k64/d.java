package k64;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f304588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yz5.l lVar) {
        super(1);
        this.f304588d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
        k64.b r17 = (k64.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
        kotlin.jvm.internal.o.g(r17, "r");
        this.f304588d.invoke(r17);
        com.tencent.mars.xlog.Log.i("CgiRequestHelper", "callback no weak ref is invoke!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$2");
        return f0Var;
    }
}

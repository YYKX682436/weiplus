package k64;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f304596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f304596d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
        k64.b r17 = (k64.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
        kotlin.jvm.internal.o.g(r17, "r");
        yz5.l lVar = (yz5.l) this.f304596d.get();
        if (lVar != null) {
            lVar.invoke(r17);
        }
        java.lang.String str = lVar == null ? "null" : "func";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper");
        com.tencent.mars.xlog.Log.i("IPCCgiRequestHelper", "callback ref is invoke ".concat(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiRequestHelper$requestCgi$1");
        return f0Var;
    }
}

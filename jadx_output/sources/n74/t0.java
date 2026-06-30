package n74;

/* loaded from: classes4.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f335432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f335433e;

    public t0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.util.List list, int i17) {
        this.f335432d = snsInfo;
        this.f335433e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n74.u0 u0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$preload$1");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f335432d;
        java.util.List list = this.f335433e;
        try {
            u0Var = n74.u0.f335437a;
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWeappPreRenderHelper", th6);
        }
        if (n74.u0.a(u0Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$preload$1");
        } else {
            n74.u0.b(u0Var, snsInfo, list, 1045);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$preload$1");
        }
    }
}

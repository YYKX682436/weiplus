package p34;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351694e;

    public r(p34.s sVar, java.lang.String str, java.lang.String str2) {
        this.f351693d = str;
        this.f351694e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.SnsAdService$1$1");
        ((qv.c0) ((bc0.i) i95.n0.c(bc0.i.class))).getClass();
        java.lang.String businessType = this.f351693d;
        kotlin.jvm.internal.o.g(businessType, "businessType");
        o25.s.f342582a.b(businessType, "", this.f351694e, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.SnsAdService$1$1");
    }
}

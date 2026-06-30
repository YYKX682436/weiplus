package o54;

/* loaded from: classes4.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final o54.o f343159d = new o54.o();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils$report$1");
        try {
            o54.p pVar = o54.p.f343160a;
            o54.p.a(pVar, "video/avc");
            o54.p.a(pVar, "video/hevc");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils$report$1");
    }
}

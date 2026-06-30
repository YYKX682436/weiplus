package com.tencent.mm.plugin.performance.jectl;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.jectl.JeVersion$JeService f152999d;

    public b(com.tencent.mm.plugin.performance.jectl.JeVersion$JeService jeVersion$JeService) {
        this.f152999d = jeVersion$JeService;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17 = com.tencent.mm.plugin.performance.jectl.JeVersion$JeService.f152995d;
        com.tencent.mm.plugin.performance.jectl.JeVersion$JeService jeVersion$JeService = this.f152999d;
        jeVersion$JeService.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.performance.jectl.a.f152996a;
        final int o17 = o4Var.o("JV_KEY_CRASH_TIMES_INT", 0);
        com.tencent.mm.app.MMCrashReportContents.W.f(new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.performance.jectl.JeVersion$JeService$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                int i18 = com.tencent.mm.plugin.performance.jectl.JeVersion$JeService.f152995d;
                return "JeService crashed for " + (o17 + 1) + " times";
            }
        });
        com.tencent.mm.app.i4.a(new com.tencent.mm.plugin.performance.jectl.c(jeVersion$JeService));
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JeVersion", th6, "JeCtl.version", new java.lang.Object[0]);
            str = "Exception";
        }
        if (o4Var.o("JV_KEY_CRASH_TIMES_INT", 0) > 3) {
            o4Var.D("JV_KEY_LAST_JE_VERSION_STRING", "CrashTooManyTimes");
            o4Var.D("JV_KEY_LAST_FINGERPRINT_STRING", android.os.Build.FINGERPRINT);
            jeVersion$JeService.stopSelf();
        } else {
            str = fp.q.b("xperf") ? com.tencent.matrix.mallctl.MallCtl.c() : "no_xperf";
            o4Var.D("JV_KEY_LAST_JE_VERSION_STRING", str);
            o4Var.D("JV_KEY_LAST_FINGERPRINT_STRING", android.os.Build.FINGERPRINT);
            com.tencent.mm.plugin.performance.jectl.a.b(str);
            jeVersion$JeService.stopSelf();
        }
    }
}

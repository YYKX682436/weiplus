package com.tencent.mm.plugin.performance.jectl;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f152996a = com.tencent.mm.sdk.platformtools.o4.M("diagnostic_storage");

    /* renamed from: b, reason: collision with root package name */
    public static final long f152997b = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f152998c;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f152998c = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.PostSyncTaskEvent>(a0Var) { // from class: com.tencent.mm.plugin.performance.jectl.JeVersion$1

            /* renamed from: d, reason: collision with root package name */
            public long f152994d = com.tencent.mm.plugin.performance.jectl.a.f152996a.q("JV_KEY_LAST_REPORT_TIME_MILLIS_LONG", 0);

            {
                this.__eventId = -790196534;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.PostSyncTaskEvent postSyncTaskEvent) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = currentTimeMillis - this.f152994d;
                com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "currentMillis - mLastReportTimeMillis = %s", java.lang.Long.valueOf(j17));
                if (j17 < com.tencent.mm.plugin.performance.jectl.a.f152997b) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "not report");
                } else {
                    this.f152994d = currentTimeMillis;
                    com.tencent.mm.plugin.performance.jectl.a.f152996a.B("JV_KEY_LAST_REPORT_TIME_MILLIS_LONG", currentTimeMillis);
                    try {
                        com.tencent.mm.plugin.performance.jectl.a.a();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JeVersion", th6, "", new java.lang.Object[0]);
                    }
                }
                return false;
            }
        };
    }

    public static void a() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f152996a;
        if (!android.os.Build.FINGERPRINT.equalsIgnoreCase(o4Var.u("JV_KEY_LAST_FINGERPRINT_STRING", ""))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "finger print changed");
            com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "reportJeVersionHard");
            com.tencent.mm.sdk.platformtools.x2.f193071a.startService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.performance.jectl.JeVersion$JeService.class));
            return;
        }
        java.lang.String u17 = o4Var.u("JV_KEY_LAST_JE_VERSION_STRING", "");
        if (!android.text.TextUtils.isEmpty(u17)) {
            b(u17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "lastVersion is empty");
        com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "reportJeVersionHard");
        com.tencent.mm.sdk.platformtools.x2.f193071a.startService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.performance.jectl.JeVersion$JeService.class));
    }

    public static void b(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.tencent.mars.smc.IDKey(1446, 20, 1));
        int i17 = str.startsWith("5.1.0") ? 21 : str.startsWith("5.0.1") ? 22 : str.startsWith("4.4.0") ? 23 : str.startsWith("4.") ? 24 : str.startsWith("3.") ? 25 : str.startsWith("64-bit") ? 26 : str.startsWith("Error") ? 27 : str.startsWith("Exception") ? 28 : str.startsWith("CrashTooManyTimes") ? 29 : 30;
        com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "je version = %s", str);
        arrayList.add(new com.tencent.mars.smc.IDKey(1446, i17, 1));
        jx3.f.INSTANCE.b(arrayList, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JeVersion", "report done");
    }
}

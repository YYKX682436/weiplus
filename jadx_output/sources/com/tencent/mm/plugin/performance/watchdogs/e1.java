package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class e1 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog f153040d;

    public e1(com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog threadWatchDog) {
        this.f153040d = threadWatchDog;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "MicroMsg.ThreadWatchDog";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        java.lang.String report;
        int i19;
        int i27;
        com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog threadWatchDog = this.f153040d;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        try {
            i17 = threadWatchDog.mProcessThreadCount;
            threadWatchDog.mLastProcessThreadCount = i17;
            i18 = threadWatchDog.mJavaThreadCount;
            threadWatchDog.mLastJavaThreadCount = i18;
            threadWatchDog.mProcessThreadCount = com.tencent.mm.plugin.performance.watchdogs.b1.b();
            java.util.Collection a17 = com.tencent.mm.plugin.performance.watchdogs.b1.a();
            java.util.Iterator it = a17.iterator();
            int i28 = 0;
            while (it.hasNext()) {
                i28 += ((com.tencent.mm.plugin.performance.watchdogs.z0) it.next()).a();
            }
            threadWatchDog.mJavaThreadCount = i28;
            report = threadWatchDog.report();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            i19 = threadWatchDog.mJavaThreadCount;
            i27 = threadWatchDog.mProcessThreadCount;
            if (report == null) {
                report = a17.toString();
            }
            com.tencent.mm.plugin.performance.watchdogs.ThreadWatchDog.dumpThreadCountInfo("ui", uptimeMillis2, i19, i27, report);
        } finally {
            try {
            } finally {
            }
        }
    }
}

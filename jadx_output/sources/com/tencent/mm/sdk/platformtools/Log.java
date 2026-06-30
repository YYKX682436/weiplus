package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public abstract class Log extends com.tencent.mars.xlog.Log {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f192413a = 0;

    static {
        com.tencent.mars.xlog.Log.level = 6;
    }

    public static void a(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
        if (logImp == null || logImp.getLogLevel(0L) > 1) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append("  ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.logImp.logI(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), sb6.toString());
    }

    public static void b(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
        if (logImp == null || logImp.getLogLevel(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        com.tencent.mars.xlog.Log.logImp.logD(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    public static void c(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
        if (logImp == null || logImp.getLogLevel(0L) > 2) {
            return;
        }
        if (objArr != null && objArr.length != 0) {
            str2 = java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append("  ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.logImp.logI(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), sb6.toString());
    }

    public static void g(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
        if (logImp == null || logImp.getLogLevel(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        com.tencent.mars.xlog.Log.logImp.logI(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    public static void h(java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.LogImp logImp = com.tencent.mars.xlog.Log.logImp;
        if (logImp == null || logImp.getLogLevel(0L) > 4) {
            return;
        }
        java.lang.String format = (objArr == null || objArr.length == 0) ? str2 : java.lang.String.format(java.util.Locale.CHINA, str2, objArr);
        if (format == null) {
            format = "";
        }
        com.tencent.mars.xlog.Log.logImp.logW(0L, str, "", "", android.os.Process.myTid(), android.os.Process.myPid(), java.lang.Thread.currentThread().getId(), android.os.Looper.getMainLooper().getThread().getId(), format + "  " + android.util.Log.getStackTraceString(th6));
    }

    public static com.tencent.mars.xlog.Log.LogImp j(com.tencent.mars.xlog.Log.LogImp logImp) {
        final java.util.ArrayList<com.tencent.mars.xlog.Log.PendingLog> closeAndGetPendingLogs;
        com.tencent.mars.xlog.Log.LogImp logImp2 = com.tencent.mars.xlog.Log.logImp;
        com.tencent.mars.xlog.Log.logImp = logImp;
        com.tencent.mars.xlog.Log.debugLog = null;
        if ((logImp2 instanceof com.tencent.mars.xlog.Log.PendingLogImp) && (closeAndGetPendingLogs = ((com.tencent.mars.xlog.Log.PendingLogImp) logImp2).closeAndGetPendingLogs(logImp)) != null) {
            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.platformtools.o2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.Iterator it = closeAndGetPendingLogs.iterator();
                    while (it.hasNext()) {
                        com.tencent.mars.xlog.Log.i("PendingLogs", ((com.tencent.mars.xlog.Log.PendingLog) it.next()).formatLog());
                    }
                }
            });
        }
        return logImp2;
    }
}

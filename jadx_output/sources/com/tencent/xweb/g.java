package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f220283a = new java.lang.Object();

    public static boolean a(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            by5.c4.c("FileReaderCrashDetector", "isRecentCrashed fileExt is empty");
            return false;
        }
        java.lang.String lowerCase = str.toLowerCase();
        synchronized (f220283a) {
            android.content.SharedPreferences b17 = by5.d4.b();
            if (b17 == null) {
                by5.c4.c("FileReaderCrashDetector", "isRecentCrashed sp is null");
                return false;
            }
            long j17 = b17.getLong(lowerCase + "_count", 0L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lowerCase);
            sb6.append("_time");
            return j17 >= 3 && java.lang.System.currentTimeMillis() - b17.getLong(sb6.toString(), 0L) < 86400000;
        }
    }

    public static void b(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            by5.c4.c("FileReaderCrashDetector", "onFinish param is empty");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        synchronized (f220283a) {
            android.content.SharedPreferences b17 = by5.d4.b();
            if (b17 == null) {
                by5.c4.c("FileReaderCrashDetector", "onFinish sp is null");
                return;
            }
            android.content.SharedPreferences.Editor edit = b17.edit();
            if (edit == null) {
                by5.c4.c("FileReaderCrashDetector", "onFinish editor is null");
                return;
            }
            edit.putLong(lowerCase + "_count", 0L);
            edit.putLong(lowerCase + "_time", java.lang.System.currentTimeMillis());
            edit.commit();
        }
    }

    public static void c(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            by5.c4.c("FileReaderCrashDetector", "onStart param is empty");
            return;
        }
        java.lang.String lowerCase = str.toLowerCase();
        synchronized (f220283a) {
            android.content.SharedPreferences b17 = by5.d4.b();
            if (b17 == null) {
                by5.c4.c("FileReaderCrashDetector", "onStart sp is null");
                return;
            }
            long j17 = b17.getLong(lowerCase + "_count", 0L);
            android.content.SharedPreferences.Editor edit = b17.edit();
            if (edit == null) {
                by5.c4.c("FileReaderCrashDetector", "onStart editor is null");
                return;
            }
            edit.putLong(lowerCase + "_count", j17 + 1);
            edit.putLong(lowerCase + "_time", java.lang.System.currentTimeMillis());
            edit.commit();
        }
    }

    public static void d(java.lang.String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        synchronized (f220283a) {
            android.content.SharedPreferences b17 = by5.d4.b();
            if (b17 == null) {
                by5.c4.c("FileReaderCrashDetector", "resetCrashInfo sp is null");
                return;
            }
            android.content.SharedPreferences.Editor edit = b17.edit();
            if (edit == null) {
                by5.c4.c("FileReaderCrashDetector", "resetCrashInfo editor is null");
                return;
            }
            for (java.lang.String str : strArr) {
                if (str != null && !str.isEmpty()) {
                    java.lang.String lowerCase = str.toLowerCase();
                    edit.remove(lowerCase + "_count");
                    edit.remove(lowerCase + "_time");
                }
            }
            edit.commit();
        }
    }
}

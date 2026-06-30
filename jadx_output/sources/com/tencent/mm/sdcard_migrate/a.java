package com.tencent.mm.sdcard_migrate;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.sdcard_migrate.c {
    public final void a(int i17, java.lang.String str, java.lang.Throwable th6, java.lang.String str2, java.lang.Object... objArr) {
        java.lang.String str3;
        java.lang.String str4 = "[@" + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.ENGLISH).format(new java.util.Date()) + "|" + com.tencent.mm.sdcard_migrate.g.f192345a + "]";
        if (objArr == null || objArr.length == 0) {
            str3 = str4 + str2;
        } else {
            str3 = str4 + java.lang.String.format(str2, objArr);
        }
        if (th6 != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            th6.printStackTrace(printWriter);
            printWriter.flush();
            str3 = str3 + "\n" + stringWriter.toString();
            printWriter.close();
        }
        boolean[] zArr = com.tencent.mm.sdcard_migrate.g.f192347c;
        synchronized (zArr) {
            if (zArr[0]) {
                com.tencent.mm.sdcard_migrate.g.a(i17, str, str3);
            } else if (i17 != 3) {
                com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps extStorageMigrateMonitor$PendingOps = com.tencent.mm.sdcard_migrate.g.f192348d;
                extStorageMigrateMonitor$PendingOps.getClass();
                extStorageMigrateMonitor$PendingOps.f192338e.add(new com.tencent.mm.sdcard_migrate.f(i17, str, str3));
            }
        }
    }
}

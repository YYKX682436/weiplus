package com.tencent.mm.sdcard_migrate;

/* loaded from: classes12.dex */
public abstract class h {
    public static boolean a(java.lang.String str) {
        java.lang.String absolutePath;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("key_is_migrated_");
        java.io.File file = new java.io.File(str);
        try {
            absolutePath = file.getCanonicalPath();
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr = {str};
            com.tencent.mm.sdcard_migrate.a aVar = (com.tencent.mm.sdcard_migrate.a) com.tencent.mm.sdcard_migrate.g.f192349e;
            aVar.getClass();
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtStorageMigrateStatus", th6, "[-] Fail to get canonical path for: %s", objArr);
            aVar.a(6, "MicroMsg.ExtStorageMigrateStatus", th6, "[-] Fail to get canonical path for: %s", objArr);
            absolutePath = file.getAbsolutePath();
        }
        sb6.append(absolutePath);
        return com.tencent.mm.sdk.platformtools.o4.M("extmig_status_memo_storage").getBoolean(sb6.toString(), false);
    }
}

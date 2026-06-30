package x52;

/* loaded from: classes15.dex */
public abstract class f {
    public static java.lang.String a() {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return "-1";
        }
        java.lang.String c17 = c52.c.c("mmkv_key_hellsess_dtail_RptChe_" + h17);
        if (c17 == null || c17.isEmpty()) {
            return null;
        }
        return c17;
    }

    public static java.lang.String b() {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return "-1";
        }
        java.lang.String c17 = c52.c.c("mmkv_key_hellsess_merge_RptChe_" + h17);
        if (c17 == null || c17.isEmpty()) {
            return null;
        }
        return c17;
    }

    public static java.lang.String c() {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return "-1";
        }
        java.lang.String c17 = c52.c.c("mmkv_key_hellSenubARptChe_" + h17);
        if (c17 == null || c17.isEmpty()) {
            return null;
        }
        return c17;
    }

    public static void d(java.lang.String str) {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            c52.c.e("mmkv_key_hellsess_dtail_RptChe_" + h17, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportCache", e17, "HellSessionReportCache.writeBackOfFlow", new java.lang.Object[0]);
        }
    }

    public static void e(java.lang.String str) {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            c52.c.e("mmkv_key_hellsess_merge_RptChe_" + h17, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportCache", e17, "HellSessionReportCache.writeBackOfFlow", new java.lang.Object[0]);
        }
    }

    public static void f(java.lang.String str) {
        int h17 = b52.b.h();
        if (h17 == 0) {
            return;
        }
        if (str == null) {
            str = "";
        }
        try {
            c52.c.e("mmkv_key_hellSenubARptChe_" + h17, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportCache", e17, "writeBackOfSessionUBA.writeBackOfFlow", new java.lang.Object[0]);
        }
    }

    public static void g(java.lang.String str) {
        java.lang.String str2;
        if (str == null || str.isEmpty()) {
            return;
        }
        java.lang.String a17 = a();
        if (a17 == null || a17.isEmpty()) {
            d(java.lang.System.currentTimeMillis() + "@" + str);
            return;
        }
        if ("-1".equals(a17)) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionReportCache", "storeSessionDetail not login");
            return;
        }
        if (a17.split("@").length <= 1) {
            str2 = a17 + "@" + str;
        } else {
            str2 = a17 + "|" + str;
        }
        d(str2);
    }

    public static void h(java.lang.String str) {
        java.lang.String str2;
        if (str == null || str.isEmpty()) {
            return;
        }
        java.lang.String b17 = b();
        if (b17 == null || b17.isEmpty()) {
            e(java.lang.System.currentTimeMillis() + "@" + str);
            return;
        }
        if ("-1".equals(b17)) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionReportCache", "storeSessionDetail not login");
            return;
        }
        if (b17.split("@").length <= 1) {
            str2 = b17 + "@" + str;
        } else {
            str2 = b17 + "|" + str;
        }
        e(str2);
    }

    public static void i(java.lang.String str) {
        java.lang.String str2;
        if (str == null || str.isEmpty()) {
            return;
        }
        java.lang.String c17 = c();
        if (c17 == null || c17.isEmpty()) {
            f(java.lang.System.currentTimeMillis() + "@" + str);
            return;
        }
        if ("-1".equals(c17)) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.HellSessionReportCache", "storeFlow not login");
            return;
        }
        if (c17.split("@").length <= 1) {
            str2 = c17 + "@" + str;
        } else {
            str2 = c17 + "|" + str;
        }
        f(str2);
    }
}

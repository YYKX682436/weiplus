package k91;

/* loaded from: classes4.dex */
public abstract class o1 {
    public static java.lang.String a(java.lang.String str) {
        return java.lang.String.format("%s#NotifyMessageStatus", str);
    }

    public static java.lang.String b(java.lang.String str, int i17) {
        return com.tencent.mm.plugin.appbrand.app.r9.Ui() == null ? "" : com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(java.lang.String.format("%s_%s_config", str, java.lang.Integer.valueOf(i17)), "");
    }

    public static void c(java.lang.String str, int i17, int i18) {
        if (com.tencent.mm.plugin.appbrand.app.r9.Ui() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.app.r9.Ui().P2(java.lang.String.format("%s_%s_local_version", str, java.lang.Integer.valueOf(i17)), i18 + "");
    }

    public static void d(java.lang.String str, int i17, int i18) {
        if (com.tencent.mm.plugin.appbrand.app.r9.Ui() == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.app.r9.Ui().P2(java.lang.String.format("%s_%s_server_version", str, java.lang.Integer.valueOf(i17)), i18 + "");
    }
}

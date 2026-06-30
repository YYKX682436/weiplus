package wo;

/* loaded from: classes14.dex */
public abstract class k1 {
    public static void a(int i17) {
        wo.b1 b1Var = wo.n1.f447742f;
        if (b1Var != null) {
            ((com.tencent.mm.plugin.appbrand.app.va) b1Var).getClass();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1132L, i17, 1L, false);
        }
    }

    public static void b(int i17, wo.j1 j1Var) {
        if (j1Var == null) {
            j1Var = new wo.j1();
        }
        java.lang.String str = j1Var.f447733f;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%d,%d,%d,%d,%d,%b,%s,%s,%s,%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447738b).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447739c).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447740d).size()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447741e).size()), java.lang.Boolean.valueOf(j1Var.f447729b), j1Var.f447731d, j1Var.f447732e, str != null ? str.replace(",", ";") : "", j1Var.f447730c);
        java.util.Map map = wo.n1.f447738b;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxyUtils", "reportKVImpl xSwitch:[%s], reportKey:[%d], kv:[%s]", java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), format);
    }

    public static void c(int i17, java.lang.String str) {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447738b).size());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447739c).size());
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447740d).size());
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) wo.n1.f447741e).size());
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String format = java.lang.String.format(locale, "%d,%d,%d,%d,%d,%b,%s,%s,%s,%s", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, bool, "", "", "", str);
        java.util.Map map = wo.n1.f447738b;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxyUtils", "reportKVImpl xSwitch:[%s], reportKey:[%d], kv:[%s]", bool, java.lang.Integer.valueOf(i17), format);
    }
}

package n81;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f335604a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Long f335605b;

    public static final boolean a(java.lang.String[] args) {
        java.lang.String str;
        java.lang.String obj;
        java.lang.Integer h17;
        java.lang.String str2;
        java.lang.String obj2;
        java.lang.Long j17;
        kotlin.jvm.internal.o.g(args, "args");
        if ((args.length == 0) || !kotlin.jvm.internal.o.b(args[0], "//appbrand_clean") || args.length < 2) {
            return false;
        }
        java.lang.String str3 = args[1];
        int hashCode = str3.hashCode();
        if (hashCode == -1298848381) {
            if (str3.equals("enable") && (str = (java.lang.String) kz5.z.U(args, 2)) != null && (obj = r26.n0.u0(str).toString()) != null && (h17 = r26.h0.h(obj)) != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(h17.intValue() > 0);
                f335604a = valueOf;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCleanConfig", "cmd override: enable=%b", valueOf);
                return true;
            }
            return false;
        }
        if (hashCode == 94746189) {
            if (str3.equals("clear")) {
                f335604a = null;
                f335605b = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCleanConfig", "cmd override cleared");
                return true;
            }
            return false;
        }
        if (hashCode != 1883284325 || !str3.equals("expired_seconds") || (str2 = (java.lang.String) kz5.z.U(args, 2)) == null || (obj2 = r26.n0.u0(str2).toString()) == null || (j17 = r26.h0.j(obj2)) == null) {
            return false;
        }
        long longValue = j17.longValue();
        if (longValue < 1) {
            longValue = 1;
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(longValue);
        f335605b = valueOf2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCleanConfig", "cmd override: expiredSeconds=%d", valueOf2);
        return true;
    }
}

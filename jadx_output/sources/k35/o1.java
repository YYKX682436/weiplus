package k35;

/* loaded from: classes11.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f303942a = new java.util.concurrent.ConcurrentHashMap();

    public static java.lang.String a(android.content.Context context) {
        uk.b b17;
        uk.c cVar;
        java.lang.String b18 = b(context);
        java.lang.String str = null;
        if (b18 == null) {
            return null;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b18);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            return null;
        }
        java.util.Map map = f303942a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) map;
        if (concurrentHashMap.containsKey(b18)) {
            return (java.lang.String) concurrentHashMap.get(b18);
        }
        synchronized (map) {
            if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(b18)) {
                return (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).get(b18);
            }
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion <= 29 && (b17 = uk.b.b(b18)) != null && (cVar = b17.f428482b) != null) {
                str = cVar.f428483d;
            }
            if (android.text.TextUtils.isEmpty(str)) {
                str = com.tencent.mm.vfs.w6.p(b18);
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(b18, str);
            }
            return str;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UpdateUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}

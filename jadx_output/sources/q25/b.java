package q25;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f359822a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f359823b;

    static {
        new java.util.HashMap();
        f359823b = java.util.regex.Pattern.compile(" +");
    }

    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        q25.a aVar;
        java.lang.String[] split = f359823b.split(str);
        java.util.HashMap hashMap = f359822a;
        synchronized (hashMap) {
            aVar = (q25.a) hashMap.get(split[0]);
        }
        if (aVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UnifiedCommandProcessor", "Command: %s", split[0]);
        return aVar.a(context, split, str2);
    }

    public static void b(q25.a aVar, java.lang.String... strArr) {
        synchronized (f359822a) {
            for (java.lang.String str : strArr) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UnifiedCommandProcessor", "Registered command: %s", str);
            }
        }
    }

    public static void c(java.lang.String... strArr) {
        synchronized (f359822a) {
            for (java.lang.String str : strArr) {
                f359822a.remove(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.UnifiedCommandProcessor", "Unregistered command: %s", str);
            }
        }
    }
}

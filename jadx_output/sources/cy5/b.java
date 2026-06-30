package cy5;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f224878a = new java.util.HashMap();

    public static synchronized cy5.a a(java.lang.String str) {
        cy5.a aVar;
        synchronized (cy5.b.class) {
            java.util.HashMap hashMap = f224878a;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new cy5.a(str));
            }
            aVar = (cy5.a) hashMap.get(str);
        }
        return aVar;
    }
}

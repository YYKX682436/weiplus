package d21;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f225782a = new java.util.HashMap();

    public static void b(java.lang.String str, d21.a aVar) {
        iz5.a.d(null, str);
        iz5.a.d(null, aVar);
        java.util.HashMap hashMap = f225782a;
        synchronized (hashMap) {
            hashMap.put(str.toLowerCase(), aVar);
        }
    }

    public abstract d21.c a(java.util.Map map, com.tencent.mm.storage.f9 f9Var);
}

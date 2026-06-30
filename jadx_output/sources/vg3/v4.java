package vg3;

/* loaded from: classes11.dex */
public abstract class v4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f436761a = new java.util.concurrent.ConcurrentHashMap();

    public static void a(int i17, vg3.w4 w4Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f436761a;
        iz5.a.g(null, concurrentHashMap.get(java.lang.Integer.valueOf(i17)) == null);
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), w4Var);
    }
}

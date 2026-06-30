package pi;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f354500a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f354501b = new java.util.concurrent.ConcurrentHashMap();

    public static pi.e a(int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f354500a;
        java.lang.Throwable th6 = (java.lang.Throwable) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (th6 == null) {
            return new pi.e();
        }
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) f354501b;
        pi.e eVar = (pi.e) concurrentHashMap2.get(stackTraceString);
        if (eVar != null) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
            eVar.f354499b++;
            return eVar;
        }
        pi.e eVar2 = new pi.e(stackTraceString);
        eVar2.f354499b++;
        concurrentHashMap2.put(stackTraceString, eVar2);
        concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
        return eVar2;
    }
}

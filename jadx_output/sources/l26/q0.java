package l26;

/* loaded from: classes14.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f315269a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f315270b = new java.util.concurrent.atomic.AtomicInteger(0);

    public final int a(java.lang.String keyQualifiedName) {
        int intValue;
        kotlin.jvm.internal.o.g(keyQualifiedName, "keyQualifiedName");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f315269a;
        l26.p0 p0Var = new l26.p0(this);
        kotlin.jvm.internal.o.g(concurrentHashMap, "<this>");
        java.lang.Integer num = (java.lang.Integer) concurrentHashMap.get(keyQualifiedName);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            java.lang.Integer num2 = (java.lang.Integer) concurrentHashMap.get(keyQualifiedName);
            if (num2 == null) {
                java.lang.Object invoke = p0Var.invoke(keyQualifiedName);
                concurrentHashMap.putIfAbsent(keyQualifiedName, java.lang.Integer.valueOf(((java.lang.Number) invoke).intValue()));
                num2 = (java.lang.Integer) invoke;
            }
            kotlin.jvm.internal.o.d(num2);
            intValue = num2.intValue();
        }
        return intValue;
    }
}

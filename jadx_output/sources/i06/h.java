package i06;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final i06.a f286652a = i06.b.a(i06.f.f286630d);

    /* renamed from: b, reason: collision with root package name */
    public static final i06.a f286653b = i06.b.a(i06.g.f286647d);

    static {
        i06.b.a(i06.c.f286610d);
        i06.b.a(i06.e.f286624d);
        i06.b.a(i06.d.f286617d);
    }

    public static final i06.k1 a(java.lang.Class jClass) {
        java.lang.Object putIfAbsent;
        kotlin.jvm.internal.o.g(jClass, "jClass");
        i06.i iVar = (i06.i) f286652a;
        iVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = iVar.f286658b;
        java.lang.Object obj = concurrentHashMap.get(jClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(jClass, (obj = iVar.f286657a.invoke(jClass)))) != null) {
            obj = putIfAbsent;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (i06.k1) obj;
    }
}

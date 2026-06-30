package pf5;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final pf5.z f353948a = new pf5.z();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f353949b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f353950c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.reflect.Field f353951d;

    static {
        java.lang.reflect.Field declaredField = androidx.lifecycle.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        f353951d = declaredField;
    }

    public final pf5.v a(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        return new pf5.v(activity, new pf5.x(activity));
    }

    public final pf5.v b(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        return new pf5.v(fragment, new pf5.w(fragment));
    }
}

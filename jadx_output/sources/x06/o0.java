package x06;

/* loaded from: classes15.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n16.c f451282a;

    /* renamed from: b, reason: collision with root package name */
    public static final n16.b f451283b;

    static {
        n16.c cVar = new n16.c("kotlin.jvm.JvmField");
        f451282a = cVar;
        n16.b.l(cVar);
        n16.b.l(new n16.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f451283b = n16.b.e("kotlin/jvm/internal/RepeatableContainer");
    }

    public static final java.lang.String a(java.lang.String propertyName) {
        kotlin.jvm.internal.o.g(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + m26.a.a(propertyName);
    }

    public static final java.lang.String b(java.lang.String propertyName) {
        java.lang.String a17;
        kotlin.jvm.internal.o.g(propertyName, "propertyName");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set");
        if (c(propertyName)) {
            a17 = propertyName.substring(2);
            kotlin.jvm.internal.o.f(a17, "substring(...)");
        } else {
            a17 = m26.a.a(propertyName);
        }
        sb6.append(a17);
        return sb6.toString();
    }

    public static final boolean c(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        if (!r26.i0.y(name, "is", false) || name.length() == 2) {
            return false;
        }
        char charAt = name.charAt(2);
        return kotlin.jvm.internal.o.i(97, charAt) > 0 || kotlin.jvm.internal.o.i(charAt, 122) > 0;
    }
}

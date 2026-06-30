package h73;

/* loaded from: classes13.dex */
public abstract class e {
    public static final android.os.Bundle a(h73.f... pairs) {
        kotlin.jvm.internal.o.g(pairs, "pairs");
        android.os.Bundle bundle = new android.os.Bundle();
        for (h73.f fVar : pairs) {
            fVar.getClass();
            fVar.f279491a.invoke(bundle);
        }
        return bundle;
    }

    public static final h73.f b(java.lang.String str, java.lang.String value) {
        kotlin.jvm.internal.o.g(str, "<this>");
        kotlin.jvm.internal.o.g(value, "value");
        return new h73.f(new h73.d(str, value));
    }

    public static final void c(android.os.Bundle bundle, java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(bundle, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        bundle.putInt(key, i17);
    }

    public static final void d(android.os.Bundle bundle, java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(bundle, "<this>");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        bundle.putString(key, value);
    }
}

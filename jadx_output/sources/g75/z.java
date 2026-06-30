package g75;

/* loaded from: classes11.dex */
public class z extends j75.a {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f269407e = jz5.h.b(g75.y.f269406d);

    @Override // j75.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public final java.lang.Object d(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return f().get(key);
    }

    public final boolean e(java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object obj = f().get(key);
        return obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : z17;
    }

    public final java.util.HashMap f() {
        return (java.util.HashMap) ((jz5.n) this.f269407e).getValue();
    }

    public final int g(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object obj = f().get(key);
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Number) obj).intValue();
        }
        throw new java.lang.IllegalArgumentException(key);
    }

    public final long h(java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object obj = f().get(key);
        return obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : j17;
    }

    public final java.lang.Object i(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object d17 = d(key);
        if (d17 != null) {
            return d17;
        }
        throw new java.lang.IllegalArgumentException(key);
    }

    public final java.lang.String j(java.lang.String key, java.lang.String defaultValue) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        java.lang.Object obj = f().get(key);
        return obj instanceof java.lang.String ? (java.lang.String) obj : defaultValue;
    }

    public final java.lang.String k(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object obj = f().get(key);
        if ((obj instanceof java.lang.String) && (!r26.n0.N((java.lang.CharSequence) obj))) {
            return (java.lang.String) obj;
        }
        throw new java.lang.IllegalArgumentException(key);
    }

    public final void l(java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(key, "key");
        f().put(key, obj);
    }
}

package ib;

/* loaded from: classes15.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f290021a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Type f290022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f290023c;

    public a() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof java.lang.Class)) {
            java.lang.reflect.Type a17 = com.google.gson.internal.e.a(((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f290022b = a17;
            this.f290021a = com.google.gson.internal.e.e(a17);
            this.f290023c = a17.hashCode();
            return;
        }
        throw new java.lang.RuntimeException("Missing type parameter.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof ib.a) {
            if (com.google.gson.internal.e.c(this.f290022b, ((ib.a) obj).f290022b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f290023c;
    }

    public final java.lang.String toString() {
        return com.google.gson.internal.e.h(this.f290022b);
    }

    public a(java.lang.reflect.Type type) {
        type.getClass();
        java.lang.reflect.Type a17 = com.google.gson.internal.e.a(type);
        this.f290022b = a17;
        this.f290021a = com.google.gson.internal.e.e(a17);
        this.f290023c = a17.hashCode();
    }
}

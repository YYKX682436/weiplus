package i06;

/* loaded from: classes12.dex */
public final class r2 implements java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type[] f286741d;

    /* renamed from: e, reason: collision with root package name */
    public final int f286742e;

    public r2(java.lang.reflect.Type[] types) {
        kotlin.jvm.internal.o.g(types, "types");
        this.f286741d = types;
        this.f286742e = java.util.Arrays.hashCode(types);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof i06.r2) {
            if (java.util.Arrays.equals(this.f286741d, ((i06.r2) obj).f286741d)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return kz5.z.d0(this.f286741d, ", ", "[", "]", 0, null, null, 56, null);
    }

    public int hashCode() {
        return this.f286742e;
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}

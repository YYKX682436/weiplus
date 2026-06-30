package f06;

/* loaded from: classes15.dex */
public final class a implements java.lang.reflect.GenericArrayType, java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Type f258434d;

    public a(java.lang.reflect.Type elementType) {
        kotlin.jvm.internal.o.g(elementType, "elementType");
        this.f258434d = elementType;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.GenericArrayType) {
            if (kotlin.jvm.internal.o.b(this.f258434d, ((java.lang.reflect.GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public java.lang.reflect.Type getGenericComponentType() {
        return this.f258434d;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return f06.h0.a(this.f258434d) + "[]";
    }

    public int hashCode() {
        return this.f258434d.hashCode();
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}

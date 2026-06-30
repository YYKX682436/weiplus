package f06;

/* loaded from: classes15.dex */
public final class d0 implements java.lang.reflect.ParameterizedType, java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f258445d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Type f258446e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Type[] f258447f;

    public d0(java.lang.Class rawType, java.lang.reflect.Type type, java.util.List typeArguments) {
        kotlin.jvm.internal.o.g(rawType, "rawType");
        kotlin.jvm.internal.o.g(typeArguments, "typeArguments");
        this.f258445d = rawType;
        this.f258446e = type;
        this.f258447f = (java.lang.reflect.Type[]) typeArguments.toArray(new java.lang.reflect.Type[0]);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.reflect.ParameterizedType) {
            java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) obj;
            if (kotlin.jvm.internal.o.b(this.f258445d, parameterizedType.getRawType()) && kotlin.jvm.internal.o.b(this.f258446e, parameterizedType.getOwnerType())) {
                if (java.util.Arrays.equals(this.f258447f, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type[] getActualTypeArguments() {
        return this.f258447f;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getOwnerType() {
        return this.f258446e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public java.lang.reflect.Type getRawType() {
        return this.f258445d;
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Class cls = this.f258445d;
        java.lang.reflect.Type type = this.f258446e;
        if (type != null) {
            sb6.append(f06.h0.a(type));
            sb6.append("$");
            sb6.append(cls.getSimpleName());
        } else {
            sb6.append(f06.h0.a(cls));
        }
        java.lang.reflect.Type[] typeArr = this.f258447f;
        if (!(typeArr.length == 0)) {
            kz5.z.Z(typeArr, sb6, null, "<", ">", 0, null, f06.c0.f258444d, 50, null);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public int hashCode() {
        int hashCode = this.f258445d.hashCode();
        java.lang.reflect.Type type = this.f258446e;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ java.util.Arrays.hashCode(this.f258447f);
    }

    public java.lang.String toString() {
        return getTypeName();
    }
}

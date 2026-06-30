package u06;

/* loaded from: classes16.dex */
public final class o extends u06.k0 implements e16.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Type f423522a;

    /* renamed from: b, reason: collision with root package name */
    public final u06.k0 f423523b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Collection f423524c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(java.lang.reflect.Type reflectType) {
        u06.k0 i0Var;
        u06.k0 k0Var;
        kotlin.jvm.internal.o.g(reflectType, "reflectType");
        this.f423522a = reflectType;
        if (!(reflectType instanceof java.lang.reflect.GenericArrayType)) {
            if (reflectType instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) reflectType;
                if (cls.isArray()) {
                    java.lang.Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.o.f(componentType, "getComponentType(...)");
                    i0Var = componentType.isPrimitive() ? new u06.i0(componentType) : ((componentType instanceof java.lang.reflect.GenericArrayType) || componentType.isArray()) ? new u06.o(componentType) : componentType instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) componentType) : new u06.z(componentType);
                }
            }
            throw new java.lang.IllegalArgumentException("Not an array type (" + reflectType.getClass() + "): " + reflectType);
        }
        java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) reflectType).getGenericComponentType();
        kotlin.jvm.internal.o.f(genericComponentType, "getGenericComponentType(...)");
        boolean z17 = genericComponentType instanceof java.lang.Class;
        if (z17) {
            java.lang.Class cls2 = (java.lang.Class) genericComponentType;
            if (cls2.isPrimitive()) {
                k0Var = new u06.i0(cls2);
                this.f423523b = k0Var;
                this.f423524c = kz5.p0.f313996d;
            }
        }
        i0Var = ((genericComponentType instanceof java.lang.reflect.GenericArrayType) || (z17 && ((java.lang.Class) genericComponentType).isArray())) ? new u06.o(genericComponentType) : genericComponentType instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) genericComponentType) : new u06.z(genericComponentType);
        k0Var = i0Var;
        this.f423523b = k0Var;
        this.f423524c = kz5.p0.f313996d;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // u06.k0
    public java.lang.reflect.Type c() {
        return this.f423522a;
    }

    @Override // e16.d
    public java.util.Collection getAnnotations() {
        return this.f423524c;
    }
}

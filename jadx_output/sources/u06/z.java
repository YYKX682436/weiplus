package u06;

/* loaded from: classes16.dex */
public final class z extends u06.k0 implements e16.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Type f423535a;

    /* renamed from: b, reason: collision with root package name */
    public final e16.i f423536b;

    public z(java.lang.reflect.Type reflectType) {
        e16.i xVar;
        kotlin.jvm.internal.o.g(reflectType, "reflectType");
        this.f423535a = reflectType;
        if (reflectType instanceof java.lang.Class) {
            xVar = new u06.x((java.lang.Class) reflectType);
        } else if (reflectType instanceof java.lang.reflect.TypeVariable) {
            xVar = new u06.l0((java.lang.reflect.TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof java.lang.reflect.ParameterizedType)) {
                throw new java.lang.IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.o.e(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            xVar = new u06.x((java.lang.Class) rawType);
        }
        this.f423536b = xVar;
    }

    @Override // u06.k0, e16.d
    public e16.a a(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        return null;
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // u06.k0
    public java.lang.reflect.Type c() {
        return this.f423535a;
    }

    public java.util.List d() {
        e16.d oVar;
        java.util.List<java.lang.reflect.Type> c17 = u06.i.c(this.f423535a);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c17, 10));
        for (java.lang.reflect.Type type : c17) {
            kotlin.jvm.internal.o.g(type, "type");
            boolean z17 = type instanceof java.lang.Class;
            if (z17) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isPrimitive()) {
                    oVar = new u06.i0(cls);
                    arrayList.add(oVar);
                }
            }
            oVar = ((type instanceof java.lang.reflect.GenericArrayType) || (z17 && ((java.lang.Class) type).isArray())) ? new u06.o(type) : type instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) type) : new u06.z(type);
            arrayList.add(oVar);
        }
        return arrayList;
    }

    public boolean e() {
        java.lang.reflect.Type type = this.f423535a;
        if (!(type instanceof java.lang.Class)) {
            return false;
        }
        java.lang.reflect.TypeVariable[] typeParameters = ((java.lang.Class) type).getTypeParameters();
        kotlin.jvm.internal.o.f(typeParameters, "getTypeParameters(...)");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // e16.d
    public java.util.Collection getAnnotations() {
        return kz5.p0.f313996d;
    }
}

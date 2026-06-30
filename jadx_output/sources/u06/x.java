package u06;

/* loaded from: classes16.dex */
public final class x extends u06.b0 implements e16.d, e16.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f423533a;

    public x(java.lang.Class klass) {
        kotlin.jvm.internal.o.g(klass, "klass");
        this.f423533a = klass;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.lang.Class cls = this.f423533a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return u06.m.a(declaredAnnotations, fqName);
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    public java.util.Collection c() {
        java.lang.reflect.Field[] declaredFields = this.f423533a.getDeclaredFields();
        kotlin.jvm.internal.o.f(declaredFields, "getDeclaredFields(...)");
        return q26.h0.y(q26.h0.o(q26.h0.j(kz5.z.C(declaredFields), u06.r.f423527d), u06.s.f423528d));
    }

    public n16.c d() {
        n16.c b17 = u06.i.a(this.f423533a).b();
        kotlin.jvm.internal.o.f(b17, "asSingleFqName(...)");
        return b17;
    }

    public java.util.Collection e() {
        java.lang.reflect.Method[] declaredMethods = this.f423533a.getDeclaredMethods();
        kotlin.jvm.internal.o.f(declaredMethods, "getDeclaredMethods(...)");
        return q26.h0.y(q26.h0.o(q26.h0.i(kz5.z.C(declaredMethods), new u06.v(this)), u06.w.f423532d));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof u06.x) {
            if (kotlin.jvm.internal.o.b(this.f423533a, ((u06.x) obj).f423533a)) {
                return true;
            }
        }
        return false;
    }

    public n16.g f() {
        java.lang.Class cls = this.f423533a;
        if (!cls.isAnonymousClass()) {
            return n16.g.k(cls.getSimpleName());
        }
        java.lang.String name = cls.getName();
        return n16.g.k(r26.n0.p0(name, ".", name));
    }

    public java.util.Collection g() {
        java.lang.Class clazz = this.f423533a;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        u06.c cVar = u06.d.f423494a;
        if (cVar == null) {
            try {
                cVar = new u06.c(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                cVar = new u06.c(null, null, null, null);
            }
            u06.d.f423494a = cVar;
        }
        java.lang.reflect.Method method = cVar.f423492d;
        java.lang.Object[] objArr = method != null ? (java.lang.Object[]) method.invoke(clazz, new java.lang.Object[0]) : null;
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(new u06.j0(obj));
        }
        return arrayList;
    }

    @Override // e16.d
    public java.util.Collection getAnnotations() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.lang.Class cls = this.f423533a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? kz5.p0.f313996d : u06.m.b(declaredAnnotations);
    }

    @Override // e16.w
    public java.util.List getTypeParameters() {
        java.lang.reflect.TypeVariable[] typeParameters = this.f423533a.getTypeParameters();
        kotlin.jvm.internal.o.f(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new u06.l0(typeVariable));
        }
        return arrayList;
    }

    public boolean h() {
        return this.f423533a.isAnnotation();
    }

    public int hashCode() {
        return this.f423533a.hashCode();
    }

    public boolean i() {
        return this.f423533a.isEnum();
    }

    public boolean j() {
        java.lang.Class clazz = this.f423533a;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        u06.c cVar = u06.d.f423494a;
        java.lang.Boolean bool = null;
        if (cVar == null) {
            try {
                cVar = new u06.c(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                cVar = new u06.c(null, null, null, null);
            }
            u06.d.f423494a = cVar;
        }
        java.lang.reflect.Method method = cVar.f423491c;
        if (method != null) {
            java.lang.Object invoke = method.invoke(clazz, new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean k() {
        java.lang.Class clazz = this.f423533a;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        u06.c cVar = u06.d.f423494a;
        java.lang.Boolean bool = null;
        if (cVar == null) {
            try {
                cVar = new u06.c(java.lang.Class.class.getMethod("isSealed", new java.lang.Class[0]), java.lang.Class.class.getMethod("getPermittedSubclasses", new java.lang.Class[0]), java.lang.Class.class.getMethod("isRecord", new java.lang.Class[0]), java.lang.Class.class.getMethod("getRecordComponents", new java.lang.Class[0]));
            } catch (java.lang.NoSuchMethodException unused) {
                cVar = new u06.c(null, null, null, null);
            }
            u06.d.f423494a = cVar;
        }
        java.lang.reflect.Method method = cVar.f423489a;
        if (method != null) {
            java.lang.Object invoke = method.invoke(clazz, new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) invoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public java.lang.String toString() {
        return u06.x.class.getName() + ": " + this.f423533a;
    }
}

package u06;

/* loaded from: classes16.dex */
public final class j extends u06.b0 implements e16.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.annotation.Annotation f423510a;

    public j(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.o.g(annotation, "annotation");
        this.f423510a = annotation;
    }

    public java.util.Collection c() {
        java.lang.annotation.Annotation annotation = this.f423510a;
        java.lang.reflect.Method[] declaredMethods = xz5.a.b(xz5.a.a(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.o.f(declaredMethods, "getDeclaredMethods(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            java.lang.Object invoke = method.invoke(annotation, new java.lang.Object[0]);
            kotlin.jvm.internal.o.f(invoke, "invoke(...)");
            n16.g k17 = n16.g.k(method.getName());
            arrayList.add(u06.i.e(invoke.getClass()) ? new u06.c0(k17, (java.lang.Enum) invoke) : invoke instanceof java.lang.annotation.Annotation ? new u06.l(k17, (java.lang.annotation.Annotation) invoke) : invoke instanceof java.lang.Object[] ? new u06.n(k17, (java.lang.Object[]) invoke) : invoke instanceof java.lang.Class ? new u06.y(k17, (java.lang.Class) invoke) : new u06.e0(k17, invoke));
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof u06.j) {
            if (this.f423510a == ((u06.j) obj).f423510a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.f423510a);
    }

    public java.lang.String toString() {
        return u06.j.class.getName() + ": " + this.f423510a;
    }
}

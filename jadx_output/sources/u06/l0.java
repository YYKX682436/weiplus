package u06;

/* loaded from: classes16.dex */
public final class l0 extends u06.b0 implements e16.d, e16.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.TypeVariable f423514a;

    public l0(java.lang.reflect.TypeVariable typeVariable) {
        kotlin.jvm.internal.o.g(typeVariable, "typeVariable");
        this.f423514a = typeVariable;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.lang.reflect.TypeVariable typeVariable = this.f423514a;
        java.lang.reflect.AnnotatedElement annotatedElement = typeVariable instanceof java.lang.reflect.AnnotatedElement ? (java.lang.reflect.AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return u06.m.a(declaredAnnotations, fqName);
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof u06.l0) {
            if (kotlin.jvm.internal.o.b(this.f423514a, ((u06.l0) obj).f423514a)) {
                return true;
            }
        }
        return false;
    }

    @Override // e16.d
    public java.util.Collection getAnnotations() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.lang.reflect.TypeVariable typeVariable = this.f423514a;
        java.lang.reflect.AnnotatedElement annotatedElement = typeVariable instanceof java.lang.reflect.AnnotatedElement ? (java.lang.reflect.AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? kz5.p0.f313996d : u06.m.b(declaredAnnotations);
    }

    public int hashCode() {
        return this.f423514a.hashCode();
    }

    public java.lang.String toString() {
        return u06.l0.class.getName() + ": " + this.f423514a;
    }
}

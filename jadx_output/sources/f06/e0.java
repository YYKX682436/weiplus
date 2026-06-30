package f06;

/* loaded from: classes15.dex */
public final class e0 implements java.lang.reflect.TypeVariable, java.lang.reflect.Type {

    /* renamed from: d, reason: collision with root package name */
    public final f06.x f258448d;

    public e0(f06.x typeParameter) {
        kotlin.jvm.internal.o.g(typeParameter, "typeParameter");
        this.f258448d = typeParameter;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.lang.reflect.TypeVariable) || !kotlin.jvm.internal.o.b(getName(), ((java.lang.reflect.TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.Type[] getBounds() {
        i06.y3 y3Var = (i06.y3) this.f258448d;
        y3Var.getClass();
        f06.v vVar = i06.y3.f286801g[0];
        java.lang.Object invoke = y3Var.f286803e.invoke();
        kotlin.jvm.internal.o.f(invoke, "getValue(...)");
        java.util.List list = (java.util.List) invoke;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f06.h0.b((f06.w) it.next(), true));
        }
        return (java.lang.reflect.Type[]) arrayList.toArray(new java.lang.reflect.Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.reflect.GenericDeclaration getGenericDeclaration() {
        throw new jz5.k("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f258448d));
    }

    @Override // java.lang.reflect.TypeVariable
    public java.lang.String getName() {
        return ((i06.y3) this.f258448d).b();
    }

    @Override // java.lang.reflect.Type
    public java.lang.String getTypeName() {
        return getName();
    }

    public int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public java.lang.String toString() {
        return getName();
    }
}

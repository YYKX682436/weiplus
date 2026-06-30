package u06;

/* loaded from: classes16.dex */
public final class a0 extends u06.f0 implements e16.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Constructor f423487a;

    public a0(java.lang.reflect.Constructor member) {
        kotlin.jvm.internal.o.g(member, "member");
        this.f423487a = member;
    }

    @Override // u06.f0
    public java.lang.reflect.Member c() {
        return this.f423487a;
    }

    @Override // e16.w
    public java.util.List getTypeParameters() {
        java.lang.reflect.TypeVariable[] typeParameters = this.f423487a.getTypeParameters();
        kotlin.jvm.internal.o.f(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new u06.l0(typeVariable));
        }
        return arrayList;
    }
}

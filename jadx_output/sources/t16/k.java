package t16;

/* loaded from: classes15.dex */
public final class k extends t16.g {

    /* renamed from: b, reason: collision with root package name */
    public final n16.b f414616b;

    /* renamed from: c, reason: collision with root package name */
    public final n16.g f414617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n16.b enumClassId, n16.g enumEntryName) {
        super(new jz5.l(enumClassId, enumEntryName));
        kotlin.jvm.internal.o.g(enumClassId, "enumClassId");
        kotlin.jvm.internal.o.g(enumEntryName, "enumEntryName");
        this.f414616b = enumClassId;
        this.f414617c = enumEntryName;
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        kotlin.jvm.internal.o.g(module, "module");
        n16.b bVar = this.f414616b;
        o06.g a17 = o06.l0.a(module, bVar);
        f26.z0 z0Var = null;
        if (a17 != null) {
            int i17 = r16.i.f368658a;
            if (!r16.i.o(a17, o06.h.f341962f)) {
                a17 = null;
            }
            if (a17 != null) {
                z0Var = a17.k();
            }
        }
        if (z0Var != null) {
            return z0Var;
        }
        h26.l lVar = h26.l.G;
        java.lang.String bVar2 = bVar.toString();
        kotlin.jvm.internal.o.f(bVar2, "toString(...)");
        java.lang.String str = this.f414617c.f334169d;
        kotlin.jvm.internal.o.f(str, "toString(...)");
        return h26.m.c(lVar, bVar2, str);
    }

    @Override // t16.g
    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f414616b.j());
        sb6.append('.');
        sb6.append(this.f414617c);
        return sb6.toString();
    }
}

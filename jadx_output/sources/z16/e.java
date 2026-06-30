package z16;

/* loaded from: classes16.dex */
public class e implements z16.g, z16.h {

    /* renamed from: a, reason: collision with root package name */
    public final o06.g f469419a;

    public e(o06.g classDescriptor, z16.e eVar) {
        kotlin.jvm.internal.o.g(classDescriptor, "classDescriptor");
        this.f469419a = classDescriptor;
    }

    public boolean equals(java.lang.Object obj) {
        z16.e eVar = obj instanceof z16.e ? (z16.e) obj : null;
        return kotlin.jvm.internal.o.b(this.f469419a, eVar != null ? eVar.f469419a : null);
    }

    @Override // z16.g
    public f26.o0 getType() {
        f26.z0 k17 = this.f469419a.k();
        kotlin.jvm.internal.o.f(k17, "getDefaultType(...)");
        return k17;
    }

    public int hashCode() {
        return this.f469419a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Class{");
        f26.z0 k17 = this.f469419a.k();
        kotlin.jvm.internal.o.f(k17, "getDefaultType(...)");
        sb6.append(k17);
        sb6.append('}');
        return sb6.toString();
    }
}

package ej1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f253275a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f253276b;

    public a(java.lang.Class clazz, yz5.a aVar) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        this.f253275a = clazz;
        this.f253276b = aVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej1.a)) {
            return false;
        }
        ej1.a aVar = (ej1.a) obj;
        return kotlin.jvm.internal.o.b(this.f253275a, aVar.f253275a) && kotlin.jvm.internal.o.b(this.f253276b, aVar.f253276b);
    }

    public int hashCode() {
        int hashCode = this.f253275a.hashCode() * 31;
        yz5.a aVar = this.f253276b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public java.lang.String toString() {
        return "WAJsApiClassDescriptor(clazz=" + this.f253275a + ", creator=" + this.f253276b + ')';
    }
}

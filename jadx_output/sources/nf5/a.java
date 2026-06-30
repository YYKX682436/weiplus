package nf5;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f336881a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f336882b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f336883c;

    public a(java.lang.String name, java.lang.String light, java.lang.String dark) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(light, "light");
        kotlin.jvm.internal.o.g(dark, "dark");
        this.f336881a = name;
        this.f336882b = light;
        this.f336883c = dark;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf5.a)) {
            return false;
        }
        nf5.a aVar = (nf5.a) obj;
        return kotlin.jvm.internal.o.b(this.f336881a, aVar.f336881a) && kotlin.jvm.internal.o.b(this.f336882b, aVar.f336882b) && kotlin.jvm.internal.o.b(this.f336883c, aVar.f336883c);
    }

    public int hashCode() {
        return (((this.f336881a.hashCode() * 31) + this.f336882b.hashCode()) * 31) + this.f336883c.hashCode();
    }

    public java.lang.String toString() {
        return "WeUIColorToken(name=" + this.f336881a + ", light=" + this.f336882b + ", dark=" + this.f336883c + ')';
    }
}

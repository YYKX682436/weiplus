package m10;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f322617a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f322618b;

    public a(int i17, java.lang.String description) {
        kotlin.jvm.internal.o.g(description, "description");
        this.f322617a = i17;
        this.f322618b = description;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m10.a)) {
            return false;
        }
        m10.a aVar = (m10.a) obj;
        return this.f322617a == aVar.f322617a && kotlin.jvm.internal.o.b(this.f322618b, aVar.f322618b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f322617a) * 31) + this.f322618b.hashCode();
    }

    public java.lang.String toString() {
        return "JsApiVersionInfo(version=" + this.f322617a + ", description=" + this.f322618b + ')';
    }
}
